package com.company;
import java.lang.String;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Bank tarih=new Bank();

        System.out.println("************* DENİZ BANK'A HOŞGELDİNİZ **************");

        System.out.print("-->Giriş Yapmak için 1..\n-->Hesap Oluşturmak için 2..\nİşlem Seçeneği tuşlayınız:");
        int secim1=scan.nextInt();
        if(secim1==1){
           DefaultAccount bank=new DefaultAccount();
           bank.girisBilgileri(bank);
        }
        else if(secim1==2)
        {

                    Scanner console = new Scanner(System.in);
                    int deger, id = 0;
                    Bank bank = new Bank();
                    Boolean condition1 = false; // do kısmının kontrol sartı

                    boolean condition = true; // do while while kısmını kotrol eden sart
                    do {
                        System.out.println(
                                 "--------------------\n"
                                + "Lütfen yapacağınız işlemi seçiniz:\n"
                                + "İşlemler:\n"
                                + "---------------------\n"
                                + "-->Kısa vadeli hesap açmak için 1 ..\n"
                                + "-->Uzun vadeli hesap açmak için 2 ..\n"
                                + "-->Cari hesap açmak için 3 ..\n"+
                                         "--> Özel hesap açmak için 4 ..\n"
                                + "-->Para yatırmak için 5 ..\n"
                                + "-->Para çekmek için 6 ..\n"
                                + "-->Tüm hesapları listelemek için 7 ..\n" +
                                         "-->Sistemin şu anki tarihini görüntülemek için 8 tuşlayınız..");
                        deger = console.nextInt();
                        boolean ayniMi;
                        switch (deger)
                        {
                            case 1: {
                                do {
                                    // herbiri için farklı aralık
                                    ayniMi = false;

                                    System.out.println("Hesap numaranızı giriniz:");
                                    id = console.nextInt();
                                    for (int i = 0; i < bank.accountList.size(); i++) {
                                        if (bank.accountList.get(i).getId() == id) {
                                            System.out.println("Aynı hesap mevcut.Yeniden giriş yapınız");
                                            ayniMi = true;
                                            break;
                                        }
                                    }
                                } while (ayniMi == true);

                                // eğer o hesap yok ise bakiye sordurmamayalım
                                System.out.println("Bakiye giriniz:");
                                int balance = (int) console.nextDouble();
                                if (balance >= 1000) {
                                    ShortTerm account = new ShortTerm(id, balance);
                                    bank.accountList.add(account);
                                    System.out.println(" Kısa vadeli hesabınız oluştulruldu.\n"
                                            + " Hesap no " + id + " Hesap bakiyeniz " + balance);
                                } else {
                                    System.out.println("Kısa vadeli hesap oluşturmak için bakiyeniz yeterli değil!\n");
                                }
                                break;
                            }
                            case 2: {
                                do {
                                    boolean ayniMi1 = false;
                                    System.out.println(" Hesap numaranızı giriniz: ");
                                    id = console.nextInt();
                                    for (int i = 0; i < bank.accountList.size(); i++) {
                                        if (bank.accountList.get(i).getId() == id) {
                                            System.out.println("Aynı hesap mevcut.a");
                                            ayniMi1 = true;
                                            break;
                                        }
                                    }
                                }
                                while (true)
                                {
                                        System.out.println(" Bakiye giriniz: ");
                                        int balance = (int) console.nextDouble();
                                        if (balance >= 1500) {
                                            LongTerm account = new LongTerm(id, balance);

                                            bank.accountList.add(account);
                                            System.out.println(" Uzun vadeli hesabınız oluştulruldu.\n"
                                                    + " Hesap no " + id + " Hesap bakiyeniz " + balance);
                                        } else {
                                            System.out.println(" Uzun vadeli hesap oluşturmak için bakiyeniz yeterli değil!\n ");
                                        }
                                        break;
                                    }

                            }
                            case 3: {
                                do {
                                    ayniMi = false;
                                    System.out.println(" Hesap numaranızı giriniz: ");
                                    id = console.nextInt();
                                    for (int i = 0; i < bank.accountList.size(); i++) {
                                        if (bank.accountList.get(i).getId() == id) {
                                            System.out.println("Aynı hesap mevcut.Yeniden giriş yapınız");
                                            ayniMi = true;
                                            break;
                                        }
                                    }
                                } while (ayniMi == true);
                                System.out.println(" Bakiye giriniz: ");
                                int balance = (int) console.nextDouble();
                                Current account = new Current(id, balance);
                                bank.accountList.add(account);
                                System.out.println(" Cari  hesabınız oluştulruldu.\n"
                                        + " Hesap no " + id + " Hesap bakiyeniz " + balance);
                            }
                            break;
                            case 4:{do {
                                ayniMi = false;
                                System.out.println(" Hesap numaranızı giriniz: ");
                                id = console.nextInt();
                                for (int i = 0; i < bank.accountList.size(); i++) {
                                    if (bank.accountList.get(i).getId() == id) {
                                        System.out.println("Aynı hesap mevcut.Yeniden giriş yapınız");
                                        ayniMi = true;
                                        break;
                                    }
                                }
                            } while (ayniMi == true);
                                System.out.println(" Bakiye giriniz: ");
                                int balance = (int) console.nextDouble();
                                Special account = new Special(id, balance);
                                bank.accountList.add(account);
                                System.out.println(" Özel  hesabınız oluştulruldu.\n"
                                        + " Hesap no " + id + " Hesap bakiyeniz " + balance);} break;
                            case 5: {
                                System.out.println(" Para yatırmak istediğiniz hesap numarasını giriniz:");
                                int a = console.nextInt();
                                System.out.println(" Para yatırmak istediğiniz miktarı giriniz:");
                                int money = console.nextInt();
                                bank.deposit(a,money);

                            }
                            break;
                            case 6: {
                                System.out.println(" Para çekmek istediğiniz hesap numarasını giriniz:");
                                int a = console.nextInt();
                                System.out.println(" Para çekmek istediğiniz miktarı giriniz:");
                                int money = console.nextInt();
                                bank.withdraw(a, money);
                            }
                            break;
                            // tüm hesapları listelemek için gereken kod for döngüsü tüm listeyi tarayarak o listeye kayıtlı id leri ekrana basacak.
                            case 7: {
                                System.out.println("Tüm hesaplarını listesi:");
                                for (int i = 0; i < bank.accountList.size(); i++) {
                                    System.out.println(bank.accountList.get(i).getId());
                                }
                            }
                            break;


                            case 8: {

                                System.out.println("****");
                                        tarih.getDate();
                            }
                            break;
                            default:
                                throw new IllegalStateException("Unexpected value: " + deger);
                        }
                        System.out.print("İşlemi sonlandırmak için 0'a basınız. ");
                        int islem = console.nextInt();
                        if (islem == 0) {
                            System.out.println(" işlem bitti. ");
                            condition1 = false;
                        }
                    }
                    while (condition == true);
        }
    }

}





        /*1. Create_S_ID_balance: Kısa vadeli hesap açar. (hesap no=ID, başlangıç parası =
                balance)
        2. Create_L_ID_balance: Uzun vadeli hesap açar. (hesap no=ID, başlangıç parası =
                balance)
        3. Create_O_ID_balance: Özel hesap açar. (hesap no=ID, başlangıç parası = balance)
        4. Create_C_ID_balance: Cari hesap açar. (hesap no=ID, başlangıç parası = balance)
        5. Increase_ID_cash: ID’ye ait hesaba “cash” kadar para ekler.
        6. Decrease_ID_cash: ID’ye ait hesaptan “cash” kadar para çeker.
        7. Set_dd_mm_yy: Sistemin şu anki tarihini düzenler.
        8. ShowAccount: Tüm hesapların ID’sini ve yaptığı son 5 işlemi gösterir.
        9. ShowIDs: Sistemdeki tüm hesap numaralarını listeler.
        10. Sortition: Özel hesaplar için kura çeker ve sonucu gösterir.*/






