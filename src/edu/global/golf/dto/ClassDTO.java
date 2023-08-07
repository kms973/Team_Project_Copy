package edu.global.golf.dto;



public class ClassDTO {
    private String registMonth; // 수강월
    private int cno; // 회원번호
    private String classArea; // 강의장소
    private int tuition; // 금액
    private String teacherCode; // 강사번호

    public ClassDTO() {
    	
    }
    // 생성자
    public ClassDTO(String registMonth, int cno, String classArea, int tuition, String teacherCode) {
        this.registMonth = registMonth;
        this.cno = cno;
        this.classArea = classArea;
        this.tuition = tuition;
        this.teacherCode = teacherCode;
    }

    // 게터와 세터
    public String getRegistMonth() {
        return registMonth;
    }

    public void setRegistMonth(String registMonth) {
        this.registMonth = registMonth;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getClassArea() {
        return classArea;
    }

    public void setClassArea(String classArea) {
        this.classArea = classArea;
    }

    public int getTuition() {
        return tuition;
    }

    public void setTuition(int tuition) {
        this.tuition = tuition;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }
}
