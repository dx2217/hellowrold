package web;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TwoServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String v_session = (String) session.getAttribute("session");
		System.out.println("session:"+v_session);
		ServletContext context = request.getServletContext();
		String v_context = (String)context.getAttribute("context");
		System.out.println("context£º"+v_context);
	}

}
