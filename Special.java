package com.company;

public class Special extends  Account
{
    Bank e3;
    public Special(){
        super();
    }
    public Special(int id,int amount){
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
        return (int) (e3.getDaysbetween()*0.12/365*getBalance()/100);
    }
    public String toString(){
        String k ="Kısa vadeli hesap ve hesap bakiyesi:"+ getBalance()+"Kar miktarı"+benefit();
        return k;
    }
    // bu tür hesap yıllık %12 faiz verir ve en az hesap açtığındakı kadar para hesapta
    //bakiye olması gerekiyor.
}
