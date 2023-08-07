package edu.global.golf.dto;



public class TeacherDTO {
    private String teacherCode; // 강사 코드
    private String teacherName; // 강사 이름
    private String className; // 강의 이름
    private int classPrice; // 강의 가격
    private String teacherRegistDate; // 강사 등록 날짜
    
    public TeacherDTO() {
    	
    }

    // 생성자
    public TeacherDTO(String teacherCode, String teacherName, String className, int classPrice, String teacherRegistDate) {
        this.teacherCode = teacherCode;
        this.teacherName = teacherName;
        this.className = className;
        this.classPrice = classPrice;
        this.teacherRegistDate = teacherRegistDate;
    }

    // 게터와 세터
    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassPrice() {
        return classPrice;
    }

    public void setClassPrice(int classPrice) {
        this.classPrice = classPrice;
    }

    public String getTeacherRegistDate() {
        return teacherRegistDate;
    }

    public void setTeacherRegistDate(String teacherRegistDate) {
        this.teacherRegistDate = teacherRegistDate;
    }
}
