package com.example.androidblockchaindemo;

public class BankingRecord {
    //First define the fields in the banking record POJO
    private String accountNumber, accountType, transactionType, transactionAmount, balance;

    //Now start setters and getters
    public String getAccountNumber() {return accountNumber;}
    public void setAccountNumber(String _ActN) {this.accountNumber = _ActN;}
    public String getAccountType() {return accountType;}
    public void setAccountType(String _ActT) {this.accountType = _ActT;}
    public String getTransactionType() {return transactionType;}
    public void setTransactionType(String _TraT) {this.transactionType = _TraT;}
    public String getTransactionAmount() {return transactionAmount;}
    public void setTransactionAmount(String _TraA) {this.transactionAmount = _TraA;}
    public String getBalance() {return balance;}
    public void setBalance(String _Bal) {this.balance = _Bal;}
}
