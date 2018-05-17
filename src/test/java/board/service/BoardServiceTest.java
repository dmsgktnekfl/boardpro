package board.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import board.dao.BoardDao;
import board.dao.BoardDaoImp;
import board.model.CateVO;
import board.model.MemVO;

public class BoardServiceTest {

	@Test
	public void loginTest() {
		/***Given***/
		BoardService service = new BoardServiceImp();
				
		MemVO vo = new MemVO();
		vo.setMem_id("a");
		vo.setMem_pass("1234");

		/***When***/
		int res = service.login(vo);

		/***Then***/
		assertEquals(1, res);
	}
	
	@Test
	public void loadCateTest() {
		
		/***Given***/
		BoardService service = new BoardServiceImp();
		List<CateVO> res =null;

		/***When***/
		res = service.loadCate();

		/***Then***/
		assertNotNull(res);
		System.out.println(res.get(0).toString());

	}
	
	@Test
	public void cateActTest() {
		
		/***Given***/
		BoardService service = new BoardServiceImp();
		CateVO vo = new CateVO();
		vo.setCate_seq(1);
		vo.setCate_act_yn("N");
		int res = 0;
		
		/***When***/
		res = service.cateAct(vo);
		
		/***Then***/
		assertEquals(1, res);
		
	}

	@Test
	public void insertCateTest() {
		
		/***Given***/
		BoardService service = new BoardServiceImp();
		CateVO vo = new CateVO();
		vo.setCate_mem_id("a");
		vo.setCate_title("serviceTest게시판");
		int res = 0;
		
		/***When***/
		res = service.insertCate(vo);
		
		/***Then***/
		assertEquals(1, res);
		
	}

}
