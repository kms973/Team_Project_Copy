package edu.global.golf.dto;


public class MemberDTO {
    private int cNo; // 회원번호
    private String cName; // 회원이름
    private String phone; // 전화번호
    private String address; // 주소
    private String grade; // 회원등급
    
    public MemberDTO() {
    	
    }

    // 생성자
    public MemberDTO(int cNo, String cName, String phone, String address, String grade) {
        this.cNo = cNo;
        this.cName = cName;
        this.phone = phone;
        this.address = address;
        this.grade = grade;
    }

    // 게터와 세터
    public int getCNo() {
        return cNo;
    }

    public void setCNo(int cNo) {
        this.cNo = cNo;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
