/*
 * Author Name: Mohit Saini
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

public class SavingsAccount {
    private String accountHolderName;
    private long accountNumber;
    private String accountOpeningDate;
    private String accountStatus;
    private double accountBalance;
    private double totalBalance;
    private boolean mobileBankingEnable;
    private double interestRate;
    private String modeOfOperation;
    
    public SavingsAccount ( ) {
    
    }
    
    public SavingsAccount ( String accountHolderName , long accountNumber , String accountOpeningDate , String accountStatus , double accountBalance , double totalBalance , boolean mobileBankingEnable , double interestRate , String modeOfOperation ) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.accountStatus = accountStatus;
        this.accountBalance = accountBalance;
        this.totalBalance = totalBalance;
        this.mobileBankingEnable = mobileBankingEnable;
        this.interestRate = interestRate;
        this.modeOfOperation = modeOfOperation;
    }
}