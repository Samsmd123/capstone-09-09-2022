package com.mpokketapp.service;

import java.util.List;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.UserType;


public interface ILoanService {
	Loan addLoan(Loan loan);
	void updateLoan(Loan loan);
	void deleteLoan(int loanId);
	Loan getByLoanId(int loanId);
	
	List<Loan> getAll();
	List<Loan> getByLoanType(LoanType loanType);
	

	List<Loan> getByEmi();
	List<Loan> getByDuration();
	 
List<Loan> getUserByUserTypeAndLoanType(LoanType loanType,UserType userType);
	
	//List<Loan> getLoanIdByUserType(UserType userType);
	
	
	
	
}
 