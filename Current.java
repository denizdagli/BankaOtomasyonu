package com.company;

public class Current extends Account {
    public Current(){
        super();
    }
    public Current(int id,int amount){
        super(id,amount);
    }
    @Override
    public int deposit(int money){
        double balance=getBalance()+money;
        return (int) getBalance();
    }
    @Override
    public int withdraw(int money1){
        double balance=getBalance()-money1;
        return (int) balance;
    }
    @Override
    public int benefit(){
        return 0;
    }
    public String toString(){
        String k ="Cari hesap ve hesabın bakiyesi:"+ getBalance()+"Kar miktarı"+benefit();
        return k;
    }
}

