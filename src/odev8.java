import java.util.Scanner;

public class odev8 {
    public static void main(String[] args) {
        int a, b, c, d, e, f, g, h;

        Scanner input = new Scanner(System.in);

        System.out.println("Hesap Makinesi\n");

        System.out.print("Lutfen ilk sayiyi girin : ");
        a = input.nextInt();

        System.out.print("Lutfen ikinci sayiyi girin : ");
        b = input.nextInt();

        System.out.print("Toplama + : 1 \n Cikarma - : 2 \n Carpma x : 3 \n Bolme \\ : 4\n ");
        System.out.print("Lutfen Yaptirmak Istediginiz Islemi Secin: ");
        c = input.nextInt();

        switch (c) {
            case 1:
                d = a + b;
                System.out.println("Cevap = " + d);
                break;
            case 2:
                d = a - b;
                System.out.println("Cevap = " + d);
                break;
            case 3:
                d = a * b;
                System.out.println("Cevap = " + d);
                break;
            case 4:
                if (a != 0) {
                    d = a / b;
                    System.out.println("Cevap = " + d);
                } else
                System.out.println("Hic Bir Sayi 0'a Bolunemez!!!");
                break;
            default:
                System.out.println("Lutfen Yaptirmak Istediginiz Islemi Dogru Secin !!!");
                break;
        }
    }
}
