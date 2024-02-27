public class Tictactoe {
    public static void main(String[] args) {


        char[][] tic = new char[3][3];
        char player = 'X';
        Main.draw(tic);
        for (int i = 1; i <= 9; i++) {
            if (i == 10) {
                System.out.println("TIE!");
            }
            Main.input(tic, player);
            Main.draw(tic);
            System.out.println();
            boolean check = Main.check(tic, player);
            if (!check) {
                if (player == 'X') {
                    player = 'O';
                } else {
                    player = 'X';
                    continue;
                }
            } else {
                System.out.println(player + " has won!");
                break;
            }




        }
    }
}
