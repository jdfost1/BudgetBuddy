package com.budgetBuddy.DAO;
import com.budgetBuddy.entities.*;
public interface LoginDAO{    
    public boolean checkLogin(String userName, String userPassword);
}
