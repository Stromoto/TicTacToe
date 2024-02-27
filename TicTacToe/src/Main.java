
import java.util.Scanner;
public class Main {

    public static void input(char[][] array, char player) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int j = 0;
        System.out.println();
       do { System.out.print("Choose a row for player " + player + ": ");
        i = sc.nextInt() - 1;
        System.out.println();
        System.out.print("Choose a column for player " + player + ": ");
        j = sc.nextInt() - 1;
        if (i >= 3 || j >= 3) {
            System.out.println("ERROR: NUMBER BEYOND BOARD!");
        } else {
            if (array[i][j] == 'X' || array[i][j] == 'O') {
                System.out.println("this space is already filled!");
            } else {
                array[i][j] = player;
                break;
            }
        }
    } while (true);
    }
    public static void draw(char[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(" | " +array[i][j]);
            }
        }
    }
    public static boolean check(char[][] array, char player) {
        int i = 0;
        int j = 0;
        boolean flag = false;
        int check1 = array[0][0];
        int check2 = array[1][1];
        int check3 = array[2][2];
        for (j = 0; j < array.length; j++) {
            if (array[0][j] == player && array[1][j] == player && array[2][j] == player && array[0][j] != ' ') {
                flag = true;
            }
        }
        for (i = 0; i < array.length; i++) {
            if (array[i][0] == player && array[i][1] == player && array[i][2] == player) {
                flag = true;
            }
        }
        if (check1 == check2 && check2 == check3 && check1 == player) {
            flag = true;
        } else {
            check1 = array[0][2];
            check2 = array[1][1];
            check3 = array[2][0];
            if (check1 == check2 && check2 == check3 && check1 == player) {
                flag = true;
            }
        }
        return flag;



    }

}
