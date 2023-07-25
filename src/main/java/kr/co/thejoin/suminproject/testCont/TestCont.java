package kr.co.thejoin.suminproject.testCont;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestCont {
    public TestCont(){
        System.out.println("----TestCont() 객체생성됨");
    }//end

    @Autowired
    TestDAO TestDao;

    @RequestMapping(value="/sumin")
        public ModelAndView sumin(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("sumin");
        mav.addObject("sumin",TestDao.read());
        System.out.println(mav);
            return mav;
        }//sumin end


}//class end
