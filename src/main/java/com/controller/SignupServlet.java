package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.UserDao;
import com.util.Validator;

public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		// validation
		boolean isError = false;

		if (Validator.isBlank(firstName)) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter FirstName");
		} else if (Validator.isAlpha(firstName) == false) {
			isError = true;
			request.setAttribute("firstNameError", "Please Enter Valid FirstName");
		}

		if (Validator.isBlank(lastName)) {
			isError = true;
			request.setAttribute("lastNameError", "Please Enter LastName");
		} else if (Validator.isAlpha(lastName) == false) {
			isError = true;
			request.setAttribute("lastNameError", "Please Enter Valid LastName");
		}

		// model -> bean , dao
		UserBean userBean = new UserBean();
		userBean.setFirstName(firstName);
		userBean.setLastName(lastName);
		userBean.setEmail(email);
		userBean.setPassword(password);

		if (isError == true) {
			// go back
			request.setAttribute("firstNameValue", firstName);
			request.setAttribute("lastNameValue", lastName);
			request.getRequestDispatcher("Signup.jsp").forward(request, response);
		} else {
			// object
			UserDao userDao = new UserDao();
			userDao.addUser(userBean);// db connection pstmt query insert

			response.sendRedirect("Login.jsp");
		}

	}

}
