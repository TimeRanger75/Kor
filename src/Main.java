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

        System.out.printf("A kör kerülete %.3f cm2",k3.KorKerulete());
        System.out.printf("A kör Területe %.3f cm",k3.KorTerulete());


    }
}
