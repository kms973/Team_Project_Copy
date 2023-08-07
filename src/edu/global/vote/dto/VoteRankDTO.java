package edu.global.vote.dto;

//후보자등수
public class VoteRankDTO {

	private int mno;
	private String mName;
	private int count;

	public VoteRankDTO() {
	}

	public VoteRankDTO(int mno, String mName, int count) {
		super();
		this.mno = mno;
		this.mName = mName;
		this.count = count;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

}