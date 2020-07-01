package Task4.java;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Task3.java.HtmlTemplate;

/**
 * Servlet implementation class Task4
 */
@WebServlet("/Task4")
public class Task4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Task4() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset = UTF-8");
		PrintWriter out = response.getWriter();
		HtmlTemplate.header(out);
		out.println("<p>↓占い結果↓</p>");
		HtmlTemplate.footer(out);
		String amida = null;
			Random rnd = new Random();
			String[] oracle = new String[] {"大吉","中吉","小吉","末吉","凶","大凶"};
			for(int i = 0; i <= oracle.length; i++) {
				amida = oracle[rnd.nextInt(6)];
			}
			out.println("<h1>");
			out.println(amida);
			out.println("<h1>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
