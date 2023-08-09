package edu.global.shop.dto;

public class MemberSalDTO {
	private int custNo;
	private String custName;
	private String custGrade;
	private int sal;

	public MemberSalDTO() {
	}

	public MemberSalDTO(int custNo, String custName, String custGrade, int sal) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.custGrade = custGrade;
		this.sal = sal;
	}

	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustGrade() {
		return custGrade;
	}

	public void setCustGrade(String custGrade) {
		this.custGrade = custGrade;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}
