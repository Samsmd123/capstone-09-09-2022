package com.mpokketapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;

@Repository
public interface ILoanRepository extends JpaRepository<Loan, Integer> {

	
	List<Loan> findAll();
	
	List<Loan> findByLoanType(LoanType loantype);
//	
@Query(value="select * from loan l inner join user u  on l.loan_id=userid where l.loan_type=?1 and u.user_type=?2",nativeQuery=true)
List<Loan> getUserByUserTypeAndLoanType(LoanType loanType,UserType userType);
//	@Query("FROM Loan l INNER JOIN l.user u WHERE u.userType=?1")
//	List<Loan> getLoanIdByUserType(UserType userType);
//	
}
//select loan_type,user_type from loan inner join user on loan.userid=user.userid

//"select * from hotel h inner join item i on i.hotel_id=hotel_id  where i.cuisine=?1"
