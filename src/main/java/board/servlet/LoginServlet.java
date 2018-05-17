package board.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.CateVO;
import board.model.MemVO;
import board.service.BoardService;
import board.service.BoardServiceImp;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String mem_id = request.getParameter("mem_id");
		String mem_pass = request.getParameter("mem_pass");
		
		BoardService service = new BoardServiceImp();
		
		MemVO vo = new MemVO();
		vo.setMem_id(mem_id);
		vo.setMem_pass(mem_pass);
		int res = service.login(vo);
		
		if(res!=0){
			request.getSession().setAttribute("mem_id", mem_id);
			List<CateVO> cateList = service.loadCate();
			request.setAttribute("cateList", cateList);
			request.getRequestDispatcher("/main.jsp").forward(request, response);
			//response.sendRedirect(request.getContextPath() +"/CateList");
		}else{
			response.sendRedirect(request.getContextPath() + "/login.jsp");
		}
		
	}

}
