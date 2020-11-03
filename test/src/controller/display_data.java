package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.RegisterDAO;
import vo.RegisterVO;

/**
 * Servlet implementation class display_data
 */
@WebServlet("/display_data")
public class display_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public display_data() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RegisterDAO d = new RegisterDAO();
		
		int key = Integer.parseInt(request.getParameter("key"));
		
		if(key==0)
		{
			int id = Integer.parseInt(request.getParameter("id"));
			RegisterVO v = new RegisterVO();
			v.setId(id);
			
			d.delete(v);
		}
		
		if(key==2)
		{
			int id = Integer.parseInt(request.getParameter("id"));
			String fn = request.getParameter("fn");
			String ln = request.getParameter("ln");
			
			RegisterVO v = new RegisterVO();
			v.setFn(fn);
			v.setId(id);
			v.setLn(ln);
			
			d.update(v);
		}
		
		List ls = d.search();
		HttpSession hs = request.getSession();
		hs.setAttribute("data",ls);
		
		response.sendRedirect("display.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
