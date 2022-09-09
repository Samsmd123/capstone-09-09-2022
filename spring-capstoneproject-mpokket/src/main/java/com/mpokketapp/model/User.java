package com.mpokketapp.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class User {
	private String userName;
	@Id
	
	private Integer userid;
	private LocalDate dob;
	@Enumerated(EnumType.STRING)
	private UserType userType;
	private String mobileNo;


	
	 
	  public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public User(String userName, Integer userid, LocalDate dob, UserType userType, String mobileNo) {
		super();
		this.userName = userName;
		this.userid = userid;
		this.dob = dob;
		this.userType = userType;
		this.mobileNo = mobileNo;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public Integer getUserid() {
		return userid;
	}


	public void setUserid(Integer userid) {
		this.userid = userid;
	}


	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}
	

	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + userid + ", dob=" + dob + ", userType=" + userType
				+ ", mobileNo=" + mobileNo + "]";
	}


	

}
