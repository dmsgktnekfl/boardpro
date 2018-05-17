package board.servlet;

import java.io.IOException;
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
 * Servlet implementation class CateListServlet
 */
@WebServlet("/CateList")
public class CateListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private BoardService service;   
    public CateListServlet() {
        super();
        service = new BoardServiceImp();
    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mem_id = request.getParameter("mem_id");
		List<CateVO> cateList = service.loadCate();
		request.setAttribute("cateList", cateList);
		request.getRequestDispatcher("/main.jsp").forward(request, response);

	}



}
