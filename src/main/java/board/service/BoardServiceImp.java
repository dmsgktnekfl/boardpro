package board.service;

import java.util.List;

import board.dao.BoardDao;
import board.dao.BoardDaoImp;
import board.model.CateVO;
import board.model.MemVO;

public class BoardServiceImp implements BoardService {
	
	private BoardDao dao;
	
	

	public BoardServiceImp() {
		dao= new BoardDaoImp();
	}

	@Override
	public int login(MemVO vo) {
		int member = 0;
		member = dao.login(vo);
		
		return member;
	}

	@Override
	public List<CateVO> loadCate() {
		List<CateVO> list = dao.loadCate();
		return list;
	}

	@Override
	public int cateAct(CateVO vo) {
		int res = dao.cateAct(vo);
		return res;
	}

	@Override
	public int insertCate(CateVO vo) {
		int res = dao.insertCate(vo);
		return res;
	}
	
	

}
