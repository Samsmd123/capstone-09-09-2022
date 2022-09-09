package com.mpokketapp;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mpokketapp.calculator.Calculator;
import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;
import com.mpokketapp.service.ILoanService;
import com.mpokketapp.service.IUserService;

@SpringBootApplication
public class SpringCapstoneprojectMpokketApplication implements CommandLineRunner{

	@Autowired
	ILoanService loanService;
	
	
	@Autowired
	IUserService  userService;
	public static void main(String[] args) {
		SpringApplication.run(SpringCapstoneprojectMpokketApplication.class, args);
	}

	@Autowired
	Calculator calculator ;	


	
	@Override
	public void run(String... args) throws Exception {
		
		double emi =0;
		Double principalAmount=(double)12000;
		Integer duration=2;
		emi=calculator.calEmiEntrepreneur(principalAmount, duration);
		
		double emi1 =0;
		Double principalAmount1=(double)50000;
		Integer duration1=4;
		emi1=calculator.calEmiBorrow(principalAmount1, duration1);
		
	
//Loan bloan = new Loan(LoanType.HOMELOAN,6784,principalAmount,emi,duration);
//		Loan sloan = new Loan(LoanType.STUDENTLOAN,5634,principalAmount1,emi1,duration1);
//Loan eloan = new Loan(LoanType.EDUCATIONLOAN,7891,principalAmount,emi,duration);
//Loan ploan = new Loan(LoanType.PERSONALLOAN,2589,principalAmount,emi,duration);
//		Loan hloan = new Loan(LoanType.HOMELOAN,1478,principalAmount,emi,duration);
//		
//		User user=new User("ALEX",1234,LocalDate.of(2016, 9, 23),UserType.ENTREPRENEUR,"9731198780");
//User suser=new User("Henry",5634,LocalDate.of(2018, 12, 22),UserType.STUDENT,"1234567890");
		
//loanService.addLoan(bloan);
//loanService.addLoan(ploan);
//		userService.addUser(user);
//userService.addUser(suser);

		
//		userService.deleteUser(1234);
		//userService.updateByUser(suser);
		//loanService.updateLoan(bloan);
//loanService.deleteLoan(4);
		//loanService.getAll().forEach(System.out::println);
		//loanService.getByLoanType(LoanType.HOMELOAN).forEach(System.out::println);
		//loanService.getByLoanId(3);
		
		//userService.getByUserType(UserType.STUDENT).forEach(System.out::println);
		
		
		loanService.getUserByUserTypeAndLoanType(LoanType.HOMELOAN,UserType.STUDENT).forEach(System.out::println);
//		loanService.getLoanByUserType(UserType.STUDENT)
//		.stream()
//		.forEach((l)->System.out.println(l.getLoanId()+l.getPrincipalAmount()));
//		System.out.println();
//		
//		System.out.println("get by user");
//		loanService.getLoanIdByUserType(UserType.STUDENT).forEach(System.out::println);
//	}
//	
	}
}


