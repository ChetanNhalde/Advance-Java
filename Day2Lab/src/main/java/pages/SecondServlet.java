package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@SuppressWarnings("serial")
public class SecondServlet extends HttpServlet {
//	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("in init" + Thread.currentThread().getName());
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("In destroy");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("in toGet" + Thread.currentThread().getName());
		//1.Set response content type
		response.setContentType("text/html");
		//2.Get the print writer to send buffered char response to client
		try(PrintWriter pw = response.getWriter()) {
			//3. Generate the dynamic response 
			pw.print("<h5> Welcome to Servlet" + getClass() + "  " + LocalDateTime.now() + "</h5>");
		}
	}

}
