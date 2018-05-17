package board.service;

import java.sql.SQLException;
import java.util.List;

import board.model.CateVO;
import board.model.MemVO;

public interface BoardService {
	/**
	* Method : join
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "B.S.K"
	* 변경이력 :
	* @param vo
	* @return
	* @throws SQLException
	* Method 설명 : 로그인 service 메서드
	*/
	public int login(MemVO vo);
	
	/**
	* Method : loadCate
	* 최초작성일 : 2018. 5. 15.
	* 작성자 : "B.S.K"
	* 변경이력 :
	* @return
	* Method 설명 : 게시판카테고리 읽어오기
	*/
	public List<CateVO> loadCate();
	
	/**
	* Method : cateAct
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "B.S.K"
	* 변경이력 :
	* @return
	* Method 설명 : 카테고리 활성/비활성
	*/
	public int cateAct(CateVO vo);
	
	/**
	* Method : InsertCate
	* 최초작성일 : 2018. 5. 16.
	* 작성자 : "B.S.K"
	* 변경이력 :
	* @param vo
	* @return
	* Method 설명 : 새로운 카테고리 생성
	*/
	public int insertCate(CateVO vo);
}
