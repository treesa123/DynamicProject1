package Pack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cname2
 */
public class cname2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cname2() {
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
out.println("<td>1</td>");
out.println("<td>2</td>");
out.println("<td>3</td>");
out.println("<td>4</td>");
out.println("</tr>");
out.println("<tr>");
out.println("<td>5</td>");
out.println("<td>6</td>");
out.println("<td>7</td>");
out.println("<td>8</td>");
out.println("</tr>");
out.println("</tbody");
out.println("</table>");
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
