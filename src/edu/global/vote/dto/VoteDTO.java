package edu.global.vote.dto;

public class VoteDTO {
    private String vJumin; // 주민번호
    private String vName; // 성명
    private int mNo; // 후보번호
    private String vTime; // 투표시간
    private String vArea; // 투표장소
    private String vConfirm; // 유권자확인

    // 기본 생성자
    public VoteDTO() {
    }

    // 생성자
    public VoteDTO(String vJumin, String vName, int mNo, String vTime, String vArea, String vConfirm) {
        this.vJumin = vJumin;
        this.vName = vName;
        this.mNo = mNo;
        this.vTime = vTime;
        this.vArea = vArea;
        this.vConfirm = vConfirm;
    }

    // 게터와 세터
    public String getVJumin() {
        return vJumin;
    }

    public void setVJumin(String vJumin) {
        this.vJumin = vJumin;
    }

    public String getVName() {
        return vName;
    }

    public void setVName(String vName) {
        this.vName = vName;
    }

    public int getMNo() {
        return mNo;
    }

    public void setMNo(int mNo) {
        this.mNo = mNo;
    }

    public String getVTime() {
        return vTime;
    }

    public void setVTime(String vTime) {
        this.vTime = vTime;
    }

    public String getVArea() {
        return vArea;
    }

    public void setVArea(String vArea) {
        this.vArea = vArea;
    }

    public String getVConfirm() {
        return vConfirm;
    }

    public void setVConfirm(String vConfirm) {
        this.vConfirm = vConfirm;
    }
}
