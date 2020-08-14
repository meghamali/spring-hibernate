package com.db.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDBServlet
 */
@WebServlet("/TestDBServlet")
public class TestDBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String USER_ID = "oracle";
	private static String PASSWORD = "password";
	private static String DRIVER = "oracle.jdbc.driver.OracleDriver";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			PrintWriter out = response.getWriter();
			out.println("Connecting to DB: " + JDBC_URL);
			
			Class.forName(DRIVER);
			
			Connection conn = DriverManager.getConnection(JDBC_URL, USER_ID, PASSWORD);

			out.println("Success!!!!");
			
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
