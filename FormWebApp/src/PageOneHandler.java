import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class PageOneHandler extends HttpServlet  {
	
	private static final long serialVersionUID = 1L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("name");
		String course = request.getParameter("course");
					
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("course", course);
		
		
		response.sendRedirect("finalPage.jsp");
		
	}
	
	public void destroy() {}
}
