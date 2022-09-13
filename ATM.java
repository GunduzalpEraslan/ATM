import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1000, toplam=0,q=3;
        System.out.println("Kullanıcı adınızı giriniz : ");
        String t=scan.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        String k= scan.nextLine();

        if(t.equals("gündüzalp") && k.equals("inanılmaz")) {
            System.out.println("Bankamıza hoşgeldiniz!\nYapmak istediğiniz işlemi seçiniz : ");
            System.out.println("Para yatırmak için 1,\nPara çekmek için 2,\nBakiye sorgulama için 3,\nÇıkış için 4 basınız.");

            int a = scan.nextInt();
            switch (a){
                case 1:
                    System.out.println("Para miktarı: ");
                    int b = scan.nextInt();
                    i+=b;
                    System.out.println("Bakiyeniz "+i);
                    break;
                case 2:
                    System.out.println("Çekmek istediğiniz tutarı giriniz : ");
                    int h=scan.nextInt();
                    if (h>i){
                        System.out.println("Yetersiz bakiye!");
                        break;}
                    else { i=i-h;
                        System.out.println("Bakiyeniz : "+i);
                    } break;
                case 3:
                    System.out.println("Mevcyt bakiyeniz :"+i); break;
                case 4:
                    System.out.println("İyi günler yine bekleriz...");break;
                    }
            }
        else {
            q--;
            System.out.println("Hatalı kullanıcı ve şifre girdiniz! Tekrar deneyiniz...");
            if (q==0)
                System.out.println("Hesabınız bloke oldu. Bankayla iletişime geçmenizi öneririz.");
        }
    }
}
