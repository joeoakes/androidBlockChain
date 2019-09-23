package com.example.androidblockchaindemo;

public class PizzaOrder {
    //First define the fields in the Pizza Order POJO
    private String orderID, name, pizzaSize, meats, veggies, orderMethod, paymentMethod, extraToppings, cost;

    //Now start setters and getters
    public String getOrderIDID() {return orderID;}
    public void setOrderID(String _OrdID) {this.orderID = _OrdID;}
    public String getName() {return name;}
    public void setName(String _Nam) {this.name = _Nam;}
    public String getPizzaSize() {return pizzaSize;}
    public void setPizzaSize(String _PizzSiz) {this.pizzaSize = _PizzSiz;}
    public String getMeats() {return meats;}
    public void setMeats(String _Meats) {this.meats = _Meats; }
    public String getVeggies() {return veggies;}
    public void setVeggies(String _Veg) {this.veggies = _Veg;}
    public String getExtraToppings(){return extraToppings;}
    public void setExtraToppings(String _exTop){this.extraToppings = _exTop;}
    public String getOrderMethod() {return orderMethod;}
    public void setOrderMethod(String _Metd) {this.orderMethod = _Metd;}
    public String getPaymentMethod() {return paymentMethod;}
    public void setPaymentMethod(String _Pay) {this.paymentMethod = _Pay;}
    public String getCost() {return cost;}
    public void setCost(String _cost) {this.cost = _cost;}
}
