package com.company;
import  java.util.Scanner;
public class ShortTerm extends Account {
    Bank e2;
    public ShortTerm(){
        super();
    }
    public ShortTerm(int id,int amount){
        super(id,amount);
    }
    @Override
    public int deposit(int money){
        return (int) (getBalance()+ money);
    }
    @Override
    public int withdraw(int money1){
        if(getBalance()-money1<=1000){
            System.out.println("Limitiniz 1000 tl' den az olamaz");
        }
        else{
            int balance= (int) (getBalance()-money1);
            return balance;
        }
        return 0;
    }
    @Override
    public int benefit(){
        return (int) (e2.getDaysbetween()*0.17/365*getBalance()/100);
    }
    public String toString(){
        String k ="Kısa vadeli hesap ve hesap bakiyesi:"+ getBalance()+"Kar miktarı"+benefit();
        return k;
    }

}





//public Create_S_ID_balance(int ID, int balance){



    // bu tür hesap yıllık %17
    // faiz verir ve en az 1000 TL hesapta bakiye olması gerekiyor

