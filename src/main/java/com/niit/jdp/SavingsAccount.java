/*
 * Author Name: Mohit Saini
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

/**
 * This class represents a savings account.
 */
public class SavingsAccount {
    private String accountHolderName;
    private long accountNumber;
    private String accountOpeningDate;
    private String accountStatus;
    private double availableBalance;
    private double totalBalance;
    private boolean mobileBankingEnable;
    private double interestRate;
    private String modeOfOperation;
    
    // This is a constructor.
    public SavingsAccount ( ) {
    }
    
    public SavingsAccount ( String accountHolderName , long accountNumber ,
                            String accountOpeningDate , String accountStatus ,
                            double availableBalance , double totalBalance ,
                            boolean mobileBankingEnable , double interestRate ,
                            String modeOfOperation ) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountOpeningDate = accountOpeningDate;
        this.accountStatus = accountStatus;
        this.availableBalance = availableBalance;
        this.totalBalance = totalBalance;
        this.mobileBankingEnable = mobileBankingEnable;
        this.interestRate = interestRate;
        this.modeOfOperation = modeOfOperation;
    }
    
    // This is a method which is used to withdraw, deposit and retrieve balance.
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
    
    public double getAvailableBalance ( ) {
        return availableBalance;
    }
    
    public void setAvailableBalance ( double availableBalance ) {
        this.availableBalance = availableBalance;
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
    
    // This is a method which is used to withdraw, deposit and retrieve balance.
    public double withdraw ( double withdrawAmount ) {
        if ( getAvailableBalance ( ) > withdrawAmount ) availableBalance = availableBalance - withdrawAmount;
        return availableBalance;
    }
    
    double deposit ( double depositAmount ) {
        return getAvailableBalance ( ) + depositAmount;
    }
    
    double retrieveBalance ( ) {
        return getAvailableBalance ( );
    }
    
            // This is a method which is used to display the details of the account.
    public void display ( ) {
        System.out.println ( "HolderName = " + accountHolderName );
        System.out.println ( "AccountNumber = " + accountNumber );
        System.out.println ( "OpeningDate = " + accountOpeningDate );
        System.out.println ( "Status = " + accountStatus );
        System.out.println ( "MobileBankingEnable = " + mobileBankingEnable );
        System.out.println ( "InterestRate = " + interestRate );
        System.out.println ( "ModeOfOperation = " + modeOfOperation );
        System.out.println ( "AvailableBalance = " + availableBalance );
    }
    
    public void getModeOfOperation ( String joint_operation ) {
    
    }
}