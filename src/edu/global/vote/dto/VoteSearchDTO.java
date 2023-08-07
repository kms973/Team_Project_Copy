package edu.global.vote.dto;

//후보조회
public class VoteSearchDTO {

	private int mno;
	private String mName;
	private String pName;
	private String pSchool;
	private String mJumin;
	private String mCity;
	private String tel;

	public VoteSearchDTO() {
	}

	public VoteSearchDTO(int mno, String mName, String pName, String pSchool, String mJumin, String mCity, String tel) {
		super();
		this.mno = mno;
		this.mName = mName;
		this.pName = pName;
		this.pSchool = pSchool;
		this.mJumin = mJumin;
		this.mCity = mCity;
		this.tel = tel;
	}

	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpSchool() {
		return pSchool;
	}

	public void setpSchool(String pSchool) {
		this.pSchool = pSchool;
	}

	public String getmJumin() {
		return mJumin;
	}

	public void setmJumin(String mJumin) {
		this.mJumin = mJumin;
	}

	public String getmCity() {
		return mCity;
	}

	public void setmCity(String mCity) {
		this.mCity = mCity;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}