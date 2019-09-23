package com.example.androidblockchaindemo;

public class AmazonItem {
    //First define the fields in the Amazon POJO
    private String orderID, customerName, itemName, cost, itemStatus, paymentMethod;

    //Now start setters and getters
    public String getOrderID() {return orderID;}
    public void setOrderID(String _OrdID) {this.orderID = _OrdID;}
    public String getCustomerName() {return customerName;}
    public void setCustomerName(String _CusN) {this.customerName = _CusN;}
    public String getItemName() {return itemName;}
    public void setItemName(String _itmN) {this.itemName = _itmN;}
    public String getCost() {return cost;}
    public void setCost(String _cost) {this.cost = _cost;}
    public String getItemStatus() {return itemStatus;}
    public void setItemStatus(String _itmS) {this.itemStatus = _itmS; }
    public String getPaymentMethod() {return paymentMethod;}
    public void setPaymentMethod(String _Pay) {this.paymentMethod = _Pay;}
}
