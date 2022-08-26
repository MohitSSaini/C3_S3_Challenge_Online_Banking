/*
 * Author Name: Mohit Saini
 * Date: 25-08-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.niit.jdp;

/**
 * It creates an instance of the SavingsAccount class and calls its methods
 */
public class SavingAccountImpl {
    public static void main ( String[] args ) {
        SavingsAccount savingsAccount = new SavingsAccount ( );
        savingsAccount.setAccountHolderName ( "Mohit" );
        savingsAccount.setAccountNumber ( 50100296028610L );
        savingsAccount.setAvailableBalance ( 15700.75 );
        savingsAccount.setAccountStatus ( "Active" );
        savingsAccount.setInterestRate ( 7.5 );
        savingsAccount.setMobileBankingEnable ( true );
        savingsAccount.setModeOfOperation ( "Joint operation" );
        savingsAccount.setTotalBalance ( savingsAccount.getAvailableBalance ( ) );
        savingsAccount.setAccountOpeningDate ( "19/05/1995" );
        savingsAccount.deposit ( 10000 );
        savingsAccount.withdraw ( 50000 );
        double balance = savingsAccount.retrieveBalance ( );
        savingsAccount.display ( );
    }
}
