package board.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.CateVO;
import board.service.BoardService;
import board.service.BoardServiceImp;

/**
 * Servlet implementation class CateActServlet
 */
@WebServlet("/CateActServlet")
public class CateActServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CateActServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 활성 비활성 교차
		request.setCharacterEncoding("UTF-8");
		String cate_seq = request.getParameter("cate_seq");
		String cate_act_yn = request.getParameter("cate_act_yn");
		CateVO vo = new CateVO();
		
		if(cate_act_yn.equals("Y")){cate_act_yn="N";}else{cate_act_yn="Y";}
		
		vo.setCate_seq(Integer.valueOf(cate_seq));
		vo.setCate_act_yn(cate_act_yn);
		System.out.println(vo.toString());
		BoardService service = new BoardServiceImp();
		int res = service.cateAct(vo);
		
		if(res != 0){
			List<CateVO> cateList = service.loadCate();
			request.setAttribute("cateList", cateList);
			request.getRequestDispatcher("/main.jsp").forward(request, response);
		}
		
	}

}
