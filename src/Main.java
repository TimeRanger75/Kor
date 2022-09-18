import Kor.Kor;
import Kor.Kor.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Kor k1=new Kor(20,-10,5);
        Kor k2=new Kor(15);
        Kor k3=new Kor();

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);

        System.out.printf("\nA kör kerülete %.3f cm2",k3.KorKerulete());
        System.out.printf("\nA kör Területe %.3f cm",k3.KorTerulete());

        System.out.println("\nAdjon meg egy számot a kör kicsinyítéséhez vagy nagyításához: ");
        int valasz=sc.nextInt();
        if (k3.NagyitvKicsinyit(valasz)<0){
            System.out.println("A sugár értéke érvénytelen");
        }
        else{
            System.out.printf("\nA kör sugara %s cm-re nőtt/csökkent",k3.NagyitvKicsinyit(valasz));
        }

        Kor korok[]=new Kor[10];
        for (int i = 0; i < korok.length; i++) {
            korok[i]=new Kor();
        }

        for (Kor k:korok) {
            System.out.println(k);
        }

    }
}
