package board.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import board.model.CateVO;
import board.model.MemVO;

public class BoardDaoTest {

	@Test
	public void loginTest() {
		
		/***Given***/
		BoardDao dao = new BoardDaoImp();
		MemVO vo = new MemVO();
		vo.setMem_id("a");
		vo.setMem_pass("1234");

		/***When***/
		int res = dao.login(vo);

		/***Then***/
		assertEquals(1, res);

	}
	
	@Test
	public void loadCateTest() {
		
		/***Given***/
		BoardDao dao = new BoardDaoImp();
		List<CateVO> res =null;

		/***When***/
		res = dao.loadCate();

		/***Then***/
		assertNotNull(res);
		System.out.println(res.get(0).toString());

	}
	
	@Test
	public void cateActTest() {
		
		/***Given***/
		BoardDao dao = new BoardDaoImp();
		CateVO vo = new CateVO();
		vo.setCate_seq(1);
		vo.setCate_act_yn("N");
		int res = 0;
		
		/***When***/
		res = dao.cateAct(vo);
		
		/***Then***/
		assertEquals(1, res);
		
	}
	
	@Test
	public void insertCateTest() {
		
		/***Given***/
		BoardDao dao = new BoardDaoImp();
		CateVO vo = new CateVO();
		vo.setCate_mem_id("a");
		vo.setCate_title("daoTest2게시판");
		int res = 0;
		
		/***When***/
		res = dao.insertCate(vo);
		
		/***Then***/
		assertEquals(1, res);
		
	}

}
