package com.company;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
public abstract class Account {
    private int id;
    private int balance;
    protected Account(){
        id=0;
        balance=0;
    }
    protected Account(int id,int amount){
        this.id=id;
        balance=amount;
    }
    public void setBalance(int amount){
        balance=amount;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getBalance(){
        return balance;
    }
    public int getId(){
        return id;
    }
    // Abstract methodlar

    public abstract int deposit(int money);
    public abstract int withdraw(int money1);
    public abstract int benefit();
    public void islemSecenekleri(){
        System.out.println("Para Yatırma ->1\n" +
                "Para çekme ->2\n" +
                "Kar görüntüleme ->3");

    }
}
