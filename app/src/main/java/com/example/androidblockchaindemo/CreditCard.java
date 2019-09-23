package com.example.androidblockchaindemo;

public class CreditCard {
    //First define the fields in the credit card transaction POJO
    private String cardholderName, date, transactionType, businessName, status;

    //Now start setters and getters
    public String getCardholderName() {return cardholderName;}
    public void setCardholderName(String _CarN) {this.cardholderName = _CarN;}
    public String getDate() {return date;}
    public void setDate(String _Date) {this.date = _Date;}
    public String getTransactionType() {return transactionType;}
    public void setTransactionType(String _TraT) {this.transactionType = _TraT;}
    public String getBusinessName() {return businessName;}
    public void setBusinessName(String _BuiN) {this.businessName = _BuiN;}
    public String getStatus() {return status;}
    public void setStatus(String _Status) {this.status = _Status;}
}
