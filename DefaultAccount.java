package com.company;

import java.util.Scanner;

public class DefaultAccount extends Account {


    private int ID = 1111, PASWORD = 1234;
    public int balance = 110;
    int girilenID;
    int girilenPassword;
    public int a;
    public int money1;
//    public DefaultAccount bank;


    public DefaultAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public DefaultAccount() {

    }

    public int getGirilenPassword() {
        return girilenPassword;
    }

    public void setGirilenPassword(int girilenPassword) {
        this.girilenPassword = girilenPassword;
    }

    public int getGirilenID() {
        return girilenID;
    }

    public void setGirilenID(int girilenID) {
        this.girilenID = girilenID;
    }


    Scanner scan = new Scanner(System.in);


    public void girisBilgileri(DefaultAccount bank) {
        System.out.print("Hesap ID giriniz:");
        girilenID = scan.nextInt();
        System.out.print("Şifrenizi giriniz:");
        girilenPassword = scan.nextInt();
        if (girilenID == ID || girilenPassword == PASWORD) {
            System.out.println("Girilen Bilgiler:" + girilenID + "," + girilenPassword);
            System.out.println("Mevcut bakiye:" + balance);
            Boolean condition1 = false; // do kısmının kontrol sartı
            boolean condition = true; // do while while kısmını kotrol eden sart
            do {
                System.out.println("Yapmak istediğiniz işlemi seçiniz:");
                islemSecenekleri();
                int secenekNo = scan.nextInt();
                if (secenekNo == 1) {
                    System.out.println(" Para yatırmak istediğiniz miktarı giriniz:");
                    int money = (int) scan.nextInt();
                    bank.deposit(a, money);
                    System.out.println("Para yatırıldı, mevcut bakiye:" + (int) (balance + money));
                    System.out.println("*******");
                    System.out.print("İşlemi sonlandırmak için 0'a basınız. ");
                    int islem = scan.nextInt();
                    if (islem == 0) {
                        System.out.println(" işlem bitti. ");
                        condition1 = false;
                    }


                } else if (secenekNo == 2) {
                    // withdraw();
                    System.out.println(" Çekmek istediğiniz miktarı giriniz:");
                    money1 = scan.nextInt();

                    bakiyeKontrol(bank);

                    System.out.println("*******");
                    System.out.print("İşlemi sonlandırmak için 0'a basınız. ");
                    int islem = scan.nextInt();
                    if (islem == 0) {
                        System.out.println(" işlem bitti. ");
                        condition1 = false;
                    }
                }
            } while (condition == true);
        } else {
            System.out.println("Giriş bilgileri hatalı...");
        }
    }
    public void bakiyeKontrol(DefaultAccount bank) {
        if (money1 >= balance) {
            System.out.println("işlem gerçekleştirlemez, hesabınızda yeterli bakiye yok");
        } else {
            bank.withdraw(money1);
            System.out.println("Para çekildi, mevcut bakiye:" + (int) (balance - money1));
        }
    }
    private int setBalance() {
        return balance;
    }
    public void deposit(int a, int money) {
    }
    @Override
    public int deposit(int money) {
        balance = (int) (getBalance() + money);
        return (int) balance;
    }
    @Override
    public int withdraw(int money1) {

        return (int) (balance - money1);
    }

    @Override
    public int benefit() {
        return 0;
    }

    @Override
    public void islemSecenekleri() {
        System.out.println("Para Yatırma ->1\n" +
                "Para çekme ->2");
    }
}