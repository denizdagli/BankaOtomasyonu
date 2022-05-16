package com.company;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.ArrayList;
import java.util.Date;


// Bu sınıfta Account türünden bir üye alanı tüm hesapların adresini tutar.+
//• getAccount : mevcut hesapların listesini görüntülemeye yarar.
    //• getDate: sistemin şu anki tarihini görüntülemeye yarar.
    //• deposit(ID, cash): ID’si belirtilen hesaba, belirtilen miktarda para yatırma işlemi yapmaya yarar.
    //• Withdraw(ID, cash): eğer mümkün ise, belirtilen miktarda hesaptan para çekme işlemi yapar.
    //(transaction işleminin başarılı ya da başarısız olması gibi durumlar kullanıcıya bildirilir.)
    //• sortition: Özel hesaplar arasında çekiliş yapmaya yarar. Özel hesaplarda her 2000 tl için bir puan
    //tanımlanmalıdır ve çekilişler bu puanlar üzerinden yapılmalıdır. (Yüksek puana sahip olan hesabın
    //çıkma olasılığı yüksektir.)
    //o kurada çekilen hesap için 10000 TL ödül, hesabına yatırılır.



public class Bank {
    public ArrayList<Account> accountList = new ArrayList<Account>();
    private LocalDate firstDate=LocalDate.of(2022,02,14);
    public LocalDate secondDate=LocalDate.now();
    public long getDaysbetween(){
        long daysbetween=DAYS.between(firstDate,secondDate);
        return daysbetween;

    }
    public  void getDate() {
       // Date tarih =new Date();
        System.out.println("tarih  : "+secondDate);
    }
    // para cekme işlemi için gereken kod satırı
    public void withdraw(int id, int money1){
        for (int i = 0; i<accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                accountList.get(i).withdraw((int) money1);
                System.out.println(id + " Hesaptan para çekildi " +money1);
            }
            else{
                System.out.println("Böyle bir hesap numarası yok.");
            }
        }
    }
    // para yatırma işleminin yapılması için gereken kod  satırı
    public void  deposit(int id,int money){
        for (int i = 0; i<accountList.size(); i++) {
            if (accountList.get(i).getId() == id) {
                accountList.get(i).deposit((int) money);
                System.out.println(id + " Hesaba para yatırıldı " +money );
            }
            else{
                System.out.println(" Böyle bir hesap numarası yok. ");
            }
        }
    }
    // mevcut hesapların listesini için kod bloğu
    public void getAccount(){
        for(int i=0; i<accountList.size(); i++){
            System.out.println( i+"  . ve   " +  accountList.get(i).toString());
        }
    }
}

