package org.enflky;
import java.util.Scanner;

public class HesapMak {
    public static void main(String[] args) {
        Scanner hesapmakinesigiris = new Scanner(System.in);
        boolean secilmedurum = true;
        double ilksayi = 0;
        double ikincisayi = 0;
        String islem_tipi = "";
        System.out.println("Hesap makinesi için ilk sayıyı giriniz");
        while (secilmedurum) {
            if (hesapmakinesigiris.hasNextDouble()) {
                secilmedurum = false;
                ilksayi = hesapmakinesigiris.nextDouble();
                System.out.println("Şeçilen Sayı: " + ilksayi);
            } else if (hesapmakinesigiris.hasNext()) {
                System.out.println("Lütfen Sadece sayı şeçiniz....");
                hesapmakinesigiris.next();
                //--secilmedurum;
            }
        }
        boolean islemtursecilmedurumu = true;
        System.out.println("Lütfen Bir işlem türü belirleyiniz....");
        while (islemtursecilmedurumu) {
            switch (hesapmakinesigiris.next().charAt(0)) {
                case '*':
                    islem_tipi = "*";
                    System.out.println("Şuanki Şeçilen İşlem İşareti: " + islem_tipi);
                    islemtursecilmedurumu = false;
                    break;
                case '/':
                    islem_tipi = "/";
                    System.out.println("Şuanki Şeçilen İşlem İşareti: " + islem_tipi);
                    islemtursecilmedurumu = false;
                    break;
                case '-':
                    islem_tipi = "-";
                    System.out.println("Şuanki Şeçilen İşlem İşareti: " + islem_tipi);
                    islemtursecilmedurumu = false;
                    break;
                case '+':
                    islem_tipi = "+";
                    System.out.println("Şuanki Şeçilen İşlem İşareti: " + islem_tipi);
                    islemtursecilmedurumu = false;
                    break;
                default:
                    System.out.println("Lütfen sadece: '+','-','*' veya '/' giriniz...  ");
                   // hesapmakinesigiris.next();
            }
        }
        System.out.println("Şimdi lütfen şuanki işleminizde hangi sayıyı kullanmak istediğinizi belirtiniz....");
        boolean ikincisecilmedurumu = true;
        while (ikincisecilmedurumu) {
                if (hesapmakinesigiris.hasNextDouble()) {
                    ikincisecilmedurumu = false;
                    ikincisayi = hesapmakinesigiris.nextDouble();
                    System.out.println("Şeçilen Sayı: " + ikincisayi);
                } else if (hesapmakinesigiris.hasNext()) {
                    System.out.println("Lütfen Sadece sayı şeçiniz veya sıfır girmeyiniz....");
                    hesapmakinesigiris.next();
                    //--ikincisecilmedurumu;
                }
        }
        System.out.println("Şuanda işleminiz hesaplanıyor....");
        double sonuc = 1;
        if (islem_tipi.equals("/") && ikincisayi == 0) {
            System.out.println("Tanımsız Cevap çünkü ikinci sayı 0 ve bölme işleminde bir sayı sıfıra bölünmez..");
        }
        else {
            switch (islem_tipi) {
                case "*": sonuc = ilksayi * ikincisayi; break;
                case "/": sonuc = ilksayi / ikincisayi; break;
                case "+": sonuc = ilksayi +ikincisayi; break;
                case "-": sonuc = ilksayi -ikincisayi; break;
                default:
                    System.out.println("Hata oluştu!?");
            }
        }
        System.out.println(sonuc);
        hesapmakinesigiris.close();
    }
}

