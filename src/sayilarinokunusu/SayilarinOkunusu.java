package sayilarinokunusu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SayilarinOkunusu {

    public static void main(String[] args) {
        
        int girilenSayi = 0;
        do {
            System.out.println("0 dan 9999 a kadar bir sayi giriniz");

            try {

                Scanner scanner = new Scanner(System.in);
                girilenSayi = scanner.nextInt();
                if (girilenSayi < 0 || girilenSayi > 9999) {
                    throw new InputMismatchException("Sayi 9999 arasi degil");
                }
                break;

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());

            }

        } while (true);

        int birler = 0, onlar = 0, yuzler = 0, binler = 0;
        birler = girilenSayi % 10;
        onlar = (girilenSayi / 10) % 10;
        yuzler = (girilenSayi / 100) % 10;
        binler = (girilenSayi / 1000);

        String[] okunus1 = {"", "Bir", "İki", "Üç", "Dört", "Beş", "Alti", "Yedi", "Sekiz", "Dokuz"};
        String okunus10[] = {"", "On", "Yirmi", "Otuz", "Kırk", "Elli", "Altmış", "Yetmiş", "Seksen", "Doksan"};
        String okunus100 = "Yüz";
        String okunus1000 = "Bin";

        String cikti = "";
        if (girilenSayi == 0) {

            cikti = "Sıfır";
        }
        if (binler == 1) {
            cikti = okunus1000;
        } else if (binler > 1) {
            cikti = okunus1[binler] + okunus1000;

        }
        if (yuzler == 1) {
            cikti += okunus100;
        } else if (yuzler > 1) {
            cikti += okunus1[yuzler] + okunus100;
        }

        cikti += okunus10[onlar] + okunus1[birler];

        System.out.println(cikti);

    }

}
