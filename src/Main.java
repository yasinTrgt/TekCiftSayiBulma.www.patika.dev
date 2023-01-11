import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int k,bolunen=0;
        double ortalama=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayi giriniz : ");
        k = sc.nextInt();
        for (int i=0; i<=k;i++){
            if((i % 3 == 0 )&&(i % 4==0)){
                ortalama +=i;
                bolunen++;


            }

        }
        System.out.print("3 ve 4'e Bölünen Sayıların Ortalaması: "+ (ortalama/bolunen));


    }
}