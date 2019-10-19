import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char turn = 'O';
        int win = 2;

        String[][] grid = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        while(win == 2) {

            for(String[] i: grid)
                System.out.println(Arrays.toString(i));

            System.out.print("Where do you want to go " + turn + "? ");
            String ask = scan.next();

            if(ask.equals("O") || ask.equals("X"))
                continue;

            for (int i = 0; i < grid.length; i++) {
                for (int x = 0; x < grid[i].length; x++) {
                    if (grid[i][x].equals(ask) && turn == 'O') {
                        grid[i][x] = "O";
                        turn = 'X';
                    } else if (grid[i][x].equals(ask) && turn == 'X') {
                        grid[i][x] = "X";
                        turn = 'O';
                    }
                    win =
                            grid[0][0].equals("O")
                                    && grid[0][1].equals("O")
                                    && grid[0][2].equals("O") ? 0 : // 1 2 3
                                    grid[0][0].equals("O")
                                            && grid[1][0].equals("O")
                                            && grid[2][0].equals("O") ? 0 : // 1 4 7
                                            grid[0][0].equals("O")
                                                    && grid[1][1].equals("O")
                                                    && grid[2][2].equals("O") ? 0 : // 1 5 9
                                                    grid[2][0].equals("O")
                                                            && grid[2][1].equals("O")
                                                            && grid[2][2].equals("O") ? 0 : // 7 8 9
                                                            grid[1][0].equals("O")
                                                                    && grid[1][1].equals("O")
                                                                    && grid[1][2].equals("O") ? 0 : // 4 5 6
                                                                    grid[0][1].equals("O")
                                                                            && grid[1][1].equals("O")
                                                                            && grid[2][1].equals("O") ? 0 : // 2 5 8
                                                                            grid[0][2].equals("O")
                                                                                    && grid[1][2].equals("O")
                                                                                    && grid[2][2].equals("O") ? 0 : // 3 6 9
                                                                                    grid[0][2].equals("O")
                                                                                            && grid[1][1].equals("O")
                                                                                            && grid[2][0].equals("O") ? 0 : // 3 5 7
                                                                                            grid[0][0].equals("X")
                                                                                                    && grid[0][1].equals("X")
                                                                                                    && grid[0][2].equals("X") ? 1 : // 1 2 3
                                                                                                    grid[0][0].equals("X")
                                                                                                            && grid[1][0].equals("X")
                                                                                                            && grid[2][0].equals("X") ? 1 : // 1 4 7
                                                                                                            grid[0][0].equals("X")
                                                                                                                    && grid[1][1].equals("X")
                                                                                                                    && grid[2][2].equals("X") ? 1 : // 1 5 9
                                                                                                                    grid[2][0].equals("X")
                                                                                                                            && grid[2][1].equals("X")
                                                                                                                            && grid[2][2].equals("X") ? 1 : // 7 8 9
                                                                                                                            grid[1][0].equals("X")
                                                                                                                                    && grid[1][1].equals("X")
                                                                                                                                    && grid[1][2].equals("X") ? 1 : // 4 5 6
                                                                                                                                    grid[0][1].equals("X")
                                                                                                                                            && grid[1][1].equals("X")
                                                                                                                                            && grid[2][1].equals("X") ? 1 : // 2 5 8
                                                                                                                                            grid[0][2].equals("X")
                                                                                                                                                    && grid[1][2].equals("X")
                                                                                                                                                    && grid[2][2].equals("X") ? 1 : // 3 6 9
                                                                                                                                                    grid[0][2].equals("X")
                                                                                                                                                            && grid[1][1].equals("X")
                                                                                                                                                            && grid[2][0].equals("X") ? 1 : // 3 5 7
                                                                                                                                                            !grid[0][0].equals("1") &&
                                                                                                                                                                    !grid[0][1].equals("2") &&
                                                                                                                                                                    !grid[0][2].equals("3") &&
                                                                                                                                                                    !grid[1][0].equals("4") &&
                                                                                                                                                                    !grid[1][1].equals("5") &&
                                                                                                                                                                    !grid[1][2].equals("6") &&
                                                                                                                                                                    !grid[2][0].equals("7") &&
                                                                                                                                                                    !grid[2][1].equals("8") &&
                                                                                                                                                                    !grid[2][2].equals("9") ? 3 : 2;
                }
            }
        }
        if (win == 0)
            System.out.println("Well done noughts!");
        else if (win == 1)
            System.out.println("Well done crosses!");
        else
            System.out.println("It's a draw!");
    }
}
