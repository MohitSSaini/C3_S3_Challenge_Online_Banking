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
    
    public SavingsAccount ( String accountHolderName , long accountNumber , String accountOpeningDate ,
                            String accountStatus , double accountBalance , double totalBalance ,
                            boolean mobileBankingEnable , double interestRate , String modeOfOperation ) {
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
    
    public String getAccountHolderName ( ) {
        return accountHolderName;
    }
    
    public void setAccountHolderName ( String accountHolderName ) {
        this.accountHolderName = accountHolderName;
    }
    
    public long getAccountNumber ( ) {
        return accountNumber;
    }
    
    public void setAccountNumber ( long accountNumber ) {
        this.accountNumber = accountNumber;
    }
    
    public String getAccountOpeningDate ( ) {
        return accountOpeningDate;
    }
    
    public void setAccountOpeningDate ( String accountOpeningDate ) {
        this.accountOpeningDate = accountOpeningDate;
    }
    
    public String getAccountStatus ( ) {
        return accountStatus;
    }
    
    public void setAccountStatus ( String accountStatus ) {
        this.accountStatus = accountStatus;
    }
    
    public double getAccountBalance ( ) {
        return accountBalance;
    }
    
    public void setAccountBalance ( double accountBalance ) {
        this.accountBalance = accountBalance;
    }
    
    public double getTotalBalance ( ) {
        return totalBalance;
    }
    
    public void setTotalBalance ( double totalBalance ) {
        this.totalBalance = totalBalance;
    }
    
    public boolean isMobileBankingEnable ( ) {
        return mobileBankingEnable;
    }
    
    public void setMobileBankingEnable ( boolean mobileBankingEnable ) {
        this.mobileBankingEnable = mobileBankingEnable;
    }
    
    public double getInterestRate ( ) {
        return interestRate;
    }
    
    public void setInterestRate ( double interestRate ) {
        this.interestRate = interestRate;
    }
    
    public String getModeOfOperation ( ) {
        return modeOfOperation;
    }
    
    public void setModeOfOperation ( String modeOfOperation ) {
        this.modeOfOperation = modeOfOperation;
    }
}