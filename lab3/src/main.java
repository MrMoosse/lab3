import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        /* ćw 1 enum-y */

        Scanner in = new Scanner(System.in);
        int i;

        while (true) {
            i = in.nextInt();

            if (i == 0) {
                System.out.println(enums.KONIEC);
                break;
            }

            switch (i) {
                case 1:
                    System.out.println(enuml.JEDEN);
                    break;
                case 2:
                    System.out.println(enuml.DWA);
                    break;
                case 3:
                    System.out.println(enuml.TRZY);
                    break;
                case 4:
                    System.out.println(enuml.CZTERY);
                    break;
                case 5:
                    System.out.println(enuml.PIĘĆ);
                    break;
                case 6:
                    System.out.println(enuml.SZEŚĆ);
                    break;
                default:
                    System.out.println(enums.KONTYNUJEMY);
            }



        }


    }
}