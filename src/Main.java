import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int a=inp.nextInt();
        System.out.println("4'ün kuvveti olan sayılar: ");
        for (int i = 1; i <a ; i*=4) {
            System.out.print(" "+i);
        }
        System.out.println(" ");
        System.out.println("5'in kuvveti olan sayılar: ");
        for (int i = 1; i <a ; i*=5) {
            System.out.print(" "+i);
        }
    }
}
