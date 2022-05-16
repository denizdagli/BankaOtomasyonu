package com.company;
public class LongTerm extends Account {
    Bank e1;
    public LongTerm(){
        super();
    }
    public LongTerm(int id,int  amount){
        super(id,amount);
    }
    @Override
    public int deposit(int money){
        return (int) (getBalance()+ money);
    }
    @Override
    public int withdraw(int money1){
        if(getBalance()-money1<=1500){
            System.out.println("Limitiniz 1500 tl den az olamaz");
        }
        else{
            double balance=getBalance()-money1;
            return (int) balance;
        }
        return 0;
    }
    @Override
    public int benefit(){
        return (int) (e1.getDaysbetween()*0.24/365*getBalance()/100);
    }
    public String toString(){
        String k ="Uzun vadeli hesap ve hesap bakiyesi:"+ getBalance()+"Kar miktar�"+benefit();
        return k;
    }
}


/*public class LongTerm extends Account{
    public LongTerm(int ID, int balance) {
        super(ID, balance);*/

    //bu tür hesap yıllık %24 faiz verir
    // ve en az 1500 TL hesapta bakiye olmasi gerekiyor

