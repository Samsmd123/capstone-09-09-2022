package com.mpokketapp.service;


import java.time.LocalDate;
import java.util.List;

import com.mpokketapp.model.Loan;
import com.mpokketapp.model.LoanType;
import com.mpokketapp.model.User;
import com.mpokketapp.model.UserType;

public interface IUserService {
User addUser(User user);
void updateByUser(User user);
void deleteUser(int userId);

List<User> getAll();

List<User> getByUserType(UserType usertype);


}
