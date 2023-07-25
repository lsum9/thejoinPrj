package kr.co.thejoin.suminproject.notice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

@Setter
@Getter
@NoArgsConstructor
public class NoticeDTO {
    private int notice_pk;
    private String notice_sub;
    private String notice_con;
    private String notice_reg_dt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String notice_op_dt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private String  notice_ed_dt;
    private int notice_vw;
    private String notice_typ;

}//class end
