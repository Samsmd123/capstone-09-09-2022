package com.mpokketapp.model;

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
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Loan {

	@Enumerated(EnumType.STRING)
	private LoanType loanType;

	private int userid;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer loanId;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "userid")
	Set<User> user;

	private Double principalAmount;
	private Double emi;

	public Loan(LoanType loanType, int userid, Double principalAmount, Double emi, Integer duration) {
		super();
		this.loanType = loanType;
		this.userid = userid;
		this.principalAmount = principalAmount;
		this.emi = emi;
		this.duration = duration;
	}

	private Integer duration;

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}

	public Double getPrincipalAmount() {
		return principalAmount;
	}

	public void setPrincipalAmount(Double principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Double getEmi() {
		return emi;
	}

	public void setEmi(Double emi) {
		this.emi = emi;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Loan [loanType=" + loanType + ", userid=" + userid + ", principalAmount=" + principalAmount + ", emi="
				+ emi + ", duration=" + duration + "]";
	}

}
