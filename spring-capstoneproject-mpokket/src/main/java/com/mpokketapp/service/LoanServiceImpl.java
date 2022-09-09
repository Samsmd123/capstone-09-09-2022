package com.mpokketapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.UserType;
import com.mpokketapp.repository.ILoanRepository;

@Service
public class LoanServiceImpl implements ILoanService{

	@Autowired
	ILoanRepository loanRepository;
	

	@Override
	public void deleteLoan(int loanId) {
		loanRepository.deleteById(loanId);
		
	}
	
	@Override
	public List<Loan> getAll() {
		
		return loanRepository.findAll();
	}

	@Override
	public Loan addLoan(Loan loan) {
		return loanRepository.save(loan);
		
	}

	@Override
	public void updateLoan(Loan loan) {
		loanRepository.save(loan);
		
		
	}

	
	@Override
	public Loan  getByLoanId(int loanId) {
		return loanRepository.findById(loanId).get();
	}

	

	@Override
	public List<Loan> getByEmi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> getByDuration() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> getByLoanType(LoanType loanType) {
		
		return  loanRepository.findByLoanType(loanType);
	}

@Override
	public List<Loan> getUserByUserTypeAndLoanType(LoanType loanType, UserType userType) {
		
		return loanRepository.getUserByUserTypeAndLoanType(loanType, userType);
	}

//	@Override
//	public List<Loan> getLoanIdByUserType(UserType userType) {
//		
//		return loanRepository.getLoanIdByUserType( userType);
//	}

	//Optional<Investment> investOpt = investmentRepository.findById(planId);
//	if(investOpt.isEmpty())
//		throw new PlanNotFoundException("");
//	return investOpt.get();
	
//	return investmentRepository.findById(planId).orElseThrow(()->{
//		throw new PlanNotFoundException("Invalid Id");
//		
//	});	

}
