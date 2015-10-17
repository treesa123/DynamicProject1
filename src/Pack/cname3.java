package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cname3
 */
public class cname3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cname3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<title> Title name </title> ");
		out.println("<body>");
		out.println("<table name ='tname'>");

		out.println("<tbody>");
		out.println("<tr>");
		
		out.println("<td>");
		out.println("<input type='text' value='u1' />");
		out.println("</td>");

		out.println("<td>");
		out.println("<input type='text' value='u2' />");
		out.println("</td>");

		out.println("<td>");
		out.println("<input type='text' value='u3' />");
		out.println("</td>");

		out.println("<td>");
		out.println("<input type='text' value='u4' />");
		out.println("</td>");
		
		out.println("</tr>");
				
out.println("<tr>");
		
		out.println("<td>");
		out.println("<input type='text' value='u5' />");
		out.println("</td>");

		out.println("<td>");
		out.println("<input type='text' value='u6' />");
		out.println("</td>");

		out.println("<td>");
		out.println("<input type='text' value='u7' />");
		out.println("</td>");

		out.println("<td>");
		out.println("<input type='text' value='u8' />");
		out.println("</td>");
		
		out.println("</tr>");
		
		out.println("</table>");
		out.println("<a href= www.gmail.com> email </a>");

		out.println("</body>");
		

		out.println("</html>");
		
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
