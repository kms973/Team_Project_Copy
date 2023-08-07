package edu.global.shop.dto;
public class ShopMemberDTO {
    private int custno; // 회원번호
    private String custname; // 회원성명
    private String phone; // 회원전화
    private String address; // 주소
    private String joindate; // 가입일자
    private String grade; // 고객등급
    private String city; // 거주도시

    public ShopMemberDTO() {
    }

    public ShopMemberDTO(int custno, String custname, String phone, String address, String joindate, String grade, String city) {
        this.custno = custno;
        this.custname = custname;
        this.phone = phone;
        this.address = address;
        this.joindate = joindate;
        this.grade = grade;
        this.city = city;
    }

    public int getCustno() {
        return custno;
    }

    public void setCustno(int custno) {
        this.custno = custno;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
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

    public String getJoindate() {
        return joindate;
    }

    public void setJoindate(String joindate) {
        this.joindate = joindate;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
