package kr.co.thejoin.suminproject.notice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class NoticeCont {
    public NoticeCont(){
        System.out.println("----NoticeCont() 객체생성됨");
    }//end

    @Autowired
    NoticeDAO noticeDao;

    @RequestMapping("/noticeMain")
    public String noticeMain(){
        return "/noticeMain";
    }//noticeMain() end

    @RequestMapping("/userNotice")
    public ModelAndView userNotice(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("userNotice");
        return mav;
    }//userNotice() end

    @RequestMapping("/adminNotice")
    public ModelAndView adminNotice(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("adminNotice");
        mav.addObject("list", noticeDao.list());
        System.out.println("리스트내용: "+ noticeDao.list());
        return mav;
    }//adminNotice() end

    @RequestMapping("/noticeWrite")
    public ModelAndView noticeWrite(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("noticeWrite");
        mav.addObject("localDate", LocalDate.now());
        mav.addObject("endDate", LocalDate.now().plusYears(100));
        return mav;
    }//noticeWrite() end

    @RequestMapping("/noticeDetail")
    public ModelAndView noticeDetail(@PathVariable int noticeNo){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("noticeDetail");
        return mav;
    }//noticeDetail() end

    @RequestMapping("/noticeWriteProc")
    public String noticeWriteProc(@ModelAttribute NoticeDTO1 dto){
        System.out.println("시작일"+ dto.getNotice_op_dt());
        int cnt = noticeDao.write(dto);
        if(cnt==1){
            System.out.println("글등록성공");
            return "/adminNotice";
        }else{
            System.out.println("글등록실패");
            return "redirect:/noticeWrite";
        }//if end
    }//noticeWriteProc() end

}//class end
