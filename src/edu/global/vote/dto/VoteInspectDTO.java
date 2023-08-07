package edu.global.vote.dto;


//투표검수조회
public class VoteInspectDTO {

	private String vName;
	private String birthday;
	private int age;
	private String gender;
	private int voteNumber;
	private String voteTime;
	private String voterInspect;

	public VoteInspectDTO() {
	}

	public VoteInspectDTO(String vName, String birthday, int age, String gender, int voteNumber, String voteTime,
			String voterInspect) {
		super();
		this.vName = vName;
		this.birthday = birthday;
		this.age = age;
		this.gender = gender;
		this.voteNumber = voteNumber;
		this.voteTime = voteTime;
		this.voterInspect = voterInspect;
	}

	public String getvName() {
		return vName;
	}

	public void setvName(String vName) {
		this.vName = vName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getVoteNumber() {
		return voteNumber;
	}

	public void setVoteNumber(int voteNumber) {
		this.voteNumber = voteNumber;
	}

	public String getVoteTime() {
		return voteTime;
	}

	public void setVoteTime(String voteTime) {
		this.voteTime = voteTime;
	}

	public String getVoterInspect() {
		return voterInspect;
	}

	public void setVoterInspect(String voterInspect) {
		this.voterInspect = voterInspect;
	}

}