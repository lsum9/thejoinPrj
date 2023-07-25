package kr.co.thejoin.suminproject.testCont;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class TestDAO {

    @Autowired
    SqlSession sqlSession;

    public TestDAO(){
        System.out.println("----TestDAO() 객체생성");
    }//TestDAO() end

    public String read(){
        return sqlSession.selectOne("suminMap.read");
    }//read() end

}//class end
