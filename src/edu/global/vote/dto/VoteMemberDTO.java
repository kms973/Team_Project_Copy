package edu.global.vote.dto;
public class VoteMemberDTO {
    private int mNo; // 후보번호
    private String mName; // 성명
    private String pCode; // 소속정당
    private String pSchool; // 최종학력
    private String mJumin; // 주민번호
    private String mCity; // 지역구

    // 기본 생성자
    public VoteMemberDTO() {
    }

    // 생성자
    public VoteMemberDTO(int mNo, String mName, String pCode, String pSchool, String mJumin, String mCity) {
        this.mNo = mNo;
        this.mName = mName;
        this.pCode = pCode;
        this.pSchool = pSchool;
        this.mJumin = mJumin;
        this.mCity = mCity;
    }

    // 게터와 세터
    public int getMNo() {
        return mNo;
    }

    public void setMNo(int mNo) {
        this.mNo = mNo;
    }

    public String getMName() {
        return mName;
    }

    public void setMName(String mName) {
        this.mName = mName;
    }

    public String getPCode() {
        return pCode;
    }

    public void setPCode(String pCode) {
        this.pCode = pCode;
    }

    public String getPSchool() {
        return pSchool;
    }

    public void setPSchool(String pSchool) {
        this.pSchool = pSchool;
    }

    public String getMJumin() {
        return mJumin;
    }

    public void setMJumin(String mJumin) {
        this.mJumin = mJumin;
    }

    public String getMCity() {
        return mCity;
    }

    public void setMCity(String mCity) {
        this.mCity = mCity;
    }
}
