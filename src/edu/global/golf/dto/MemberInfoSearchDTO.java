package edu.global.golf.dto;

public class MemberInfoSearchDTO {
	private String registMonth; // 수강월
	private int cno; // 회원번호
	private String cname; // 회원이름
	private String className; // 강의명
	private String classArea; // 강의장소
	private int classPrice; // 금액
	private String grade; // 등급

	public MemberInfoSearchDTO() {
	}

	public MemberInfoSearchDTO(String registMonth, int cno, String cname, String className, String classArea,
			int classPrice, String grade) {
		super();
		this.registMonth = registMonth;
		this.cno = cno;
		this.cname = cname;
		this.className = className;
		this.classArea = classArea;
		this.classPrice = classPrice;
		this.grade = grade;
	}

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

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassArea() {
		return classArea;
	}

	public void setClassArea(String classArea) {
		this.classArea = classArea;
	}

	public int getClassPrice() {
		return classPrice;
	}

	public void setClassPrice(int classPrice) {
		this.classPrice = classPrice;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
