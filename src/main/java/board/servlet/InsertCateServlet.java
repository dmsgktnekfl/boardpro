package board.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import board.model.CateVO;
import board.service.BoardService;
import board.service.BoardServiceImp;

/**
 * Servlet implementation class InsertCateServlet
 */
@WebServlet("/InsertCateServlet")
public class InsertCateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertCateServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String cate_mem_id = session.getAttribute("cate_mem_id")+"";
		String cate_title = request.getParameter("cate_title");
		System.out.println(cate_mem_id + "/" + cate_title);
		
		CateVO vo = new CateVO();
		vo.setCate_mem_id(cate_mem_id);
		vo.setCate_title(cate_title);
		
		BoardService service = new BoardServiceImp();
		int res = service.insertCate(vo);
		if(res != 0){
			List<CateVO> cateList = service.loadCate();
			request.setAttribute("mem_id", cate_mem_id);
			request.setAttribute("cateList", cateList);
			response.sendRedirect("/CateListServlet.jsp");
			
		}
		
	}

}
