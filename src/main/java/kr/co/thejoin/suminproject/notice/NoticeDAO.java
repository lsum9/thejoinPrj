package kr.co.thejoin.suminproject.notice;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NoticeDAO {

    @Autowired
    SqlSession sqlSession;
    
    public NoticeDAO(){
        System.out.println("----NoticeDAO() 객체생성됨");
    }//end

    public int write(NoticeDTO1 dto){
        return sqlSession.insert("notice.write", dto);
    }//write() end

    public List<NoticeDTO1> list(){
        List<NoticeDTO1> list = sqlSession.selectList("notice.list");
        System.out.println("list: "+ list);
        return sqlSession.selectList("notice.list");
    }//list() end
}//class end
