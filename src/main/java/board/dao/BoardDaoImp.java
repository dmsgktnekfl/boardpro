package board.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import board.model.CateVO;
import board.model.MemVO;

public class BoardDaoImp implements BoardDao {
	
	
	
	private SqlSessionFactory sqlSessionFactory;
	
	public BoardDaoImp() {
		String resource = "db/mybatis/mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int login(MemVO vo){
		int member = 0;
		SqlSession session = sqlSessionFactory.openSession();
		member = session.selectOne("member.login", vo);
		session.close();
		return member;
		
	}

	@Override
	public List<CateVO> loadCate() {
		List<CateVO> cateList = null;
		SqlSession session = sqlSessionFactory.openSession();
		cateList = session.selectList("board.loadCate");
		session.close();
		return cateList;
	}

	@Override
	public int cateAct(CateVO vo) {
		int res = 0;
		SqlSession session = sqlSessionFactory.openSession();
		res = session.update("board.cateAct", vo);
		session.commit();
		session.close();
		
		return res;
	}

	@Override
	public int insertCate(CateVO vo) {
		int res = 0;
		SqlSession session = sqlSessionFactory.openSession();
		res = session.insert("board.insertCate", vo);
		session.commit();
		session.close();
		
		return res;
	}

}
