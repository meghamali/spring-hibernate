package zuzu.db.test;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConnection {

	private static String JDBC_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static String USER_ID = "oracle";
	private static String PASSWORD = "password";

	public static void main(String... args) {

		try {
			System.out.println("connecting...!\n");

			Connection conn = DriverManager.getConnection(JDBC_URL, USER_ID, PASSWORD);

			System.out.println("Connected successfully!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
