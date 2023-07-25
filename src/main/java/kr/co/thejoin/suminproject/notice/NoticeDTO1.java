package kr.co.thejoin.suminproject.notice;

public class NoticeDTO1 {
    private int notice_pk;
    private String notice_sub;
    private String notice_con;
    private String notice_reg_dt;
    private String notice_op_dt;
    private String  notice_ed_dt;
    private int notice_vw;
    private String notice_typ;

    public NoticeDTO1(){};

    public NoticeDTO1(int notice_pk, String notice_sub, String notice_con, String notice_reg_dt, String notice_op_dt, String notice_ed_dt, int notice_vw, String notice_typ) {
        this.notice_pk = notice_pk;
        this.notice_sub = notice_sub;
        this.notice_con = notice_con;
        this.notice_reg_dt = notice_reg_dt;
        this.notice_op_dt = notice_op_dt;
        this.notice_ed_dt = notice_ed_dt;
        this.notice_vw = notice_vw;
        this.notice_typ = notice_typ;
    }

    public int getNotice_pk() {
        return notice_pk;
    }

    public String getNotice_sub() {
        return notice_sub;
    }

    public String getNotice_con() {
        return notice_con;
    }

    public String getNotice_reg_dt() {
        return notice_reg_dt;
    }

    public String getNotice_op_dt() {
        return notice_op_dt;
    }

    public String getNotice_ed_dt() {
        return notice_ed_dt;
    }

    public int getNotice_vw() {
        return notice_vw;
    }

    public String getNotice_typ() {
        return notice_typ;
    }

    public void setNotice_pk(int notice_pk) {
        this.notice_pk = notice_pk;
    }

    public void setNotice_sub(String notice_sub) {
        this.notice_sub = notice_sub;
    }

    public void setNotice_con(String notice_con) {
        this.notice_con = notice_con;
    }

    public void setNotice_reg_dt(String notice_reg_dt) {
        this.notice_reg_dt = notice_reg_dt;
    }

    public void setNotice_op_dt(String notice_op_dt) {
        this.notice_op_dt = notice_op_dt;
    }

    public void setNotice_ed_dt(String notice_ed_dt) {
        this.notice_ed_dt = notice_ed_dt;
    }

    public void setNotice_vw(int notice_vw) {
        this.notice_vw = notice_vw;
    }

    public void setNotice_typ(String notice_typ) {
        this.notice_typ = notice_typ;
    }

    @Override
    public String toString() {
        return "NoticeDTO1{" +
                "notice_pk=" + notice_pk +
                ", notice_sub='" + notice_sub + '\'' +
                ", notice_con='" + notice_con + '\'' +
                ", notice_reg_dt='" + notice_reg_dt + '\'' +
                ", notice_op_dt='" + notice_op_dt + '\'' +
                ", notice_ed_dt='" + notice_ed_dt + '\'' +
                ", notice_vw=" + notice_vw +
                ", notice_typ='" + notice_typ + '\'' +
                '}';
    }
}//class end
