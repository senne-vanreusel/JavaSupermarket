package fact.it.supermarket.model;

import java.util.ArrayList;

//Senne Van Reusel r0903904
public class Customer extends Person{
    private int cardNumber;
    private int yearOfBirth;
    private ArrayList<String> shoppingList = new ArrayList<>();

    public Customer(String firstName, String surName) {
        super(firstName, surName);
        this.cardNumber=-1;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public ArrayList<String> getShoppingList() {
        return shoppingList;
    }

    public boolean addToShoppingList(String productName){
        if(getNumberOnShoppingList()>=5){
            return false;
        }
        shoppingList.add(productName);
        return true;
    }

    public int getNumberOnShoppingList(){
        return this.shoppingList.size();
    }

    public String toString() {
        return "Customer " +
                 super.toString() +
                " with card number " + getCardNumber();
    }
}
