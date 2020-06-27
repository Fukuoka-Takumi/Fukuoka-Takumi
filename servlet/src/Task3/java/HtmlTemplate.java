package Task3.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HtmlTemplate
 */
@WebServlet("/HtmlTemplate")
public class HtmlTemplate extends HttpServlet {
	public static void header(PrintWriter out) {
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset = 'UTF-8'>");
		out.println("<title>ServletTask</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>↓占いの結果↓<p>");
		out.println("</body>");
		out.println("</html>");
	}
	public static String amida;
	public static void footer(PrintWriter out) {
		out.println("<html>");
		out.println("<body>");
		Random rnd = new Random();
		String[] oracle = new String[] {"大吉","中吉","小吉","末吉","凶","大凶"};
		for(int i = 0; i <= oracle.length; i++) {
			amida = oracle[rnd.nextInt(6)];
		}
		out.println("<h1>");
		out.println(amida);
		out.println("<h1>");
		out.println("</body>");
		out.println("</html>");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
