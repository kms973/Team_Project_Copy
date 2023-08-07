package edu.global.golf.dto;

public class TeacherSalDTO {

	private int teacherCode;
	private String className;
	private String teacherName;
	private String sal;

	public TeacherSalDTO() {
	}

	public int getTeacherCode() {
		return teacherCode;
	}

	public void setTeacherCode(int teacherCode) {
		this.teacherCode = teacherCode;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getSal() {
		return sal;
	}

	public void setSal(String sal) {
		this.sal = sal;
	}

	public TeacherSalDTO(int teacherCode, String className, String teacherName, String sal) {
		super();
		this.teacherCode = teacherCode;
		this.className = className;
		this.teacherName = teacherName;
		this.sal = sal;
	}

}
