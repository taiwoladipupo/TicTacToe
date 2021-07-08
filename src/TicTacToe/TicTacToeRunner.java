package TicTacToe;

import TicTacToe.TicTacToeClass;

import java.util.Scanner;

public class TicTacToeRunner extends TicTacToeClass
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        char p = 'X';
        TicTacToeClass ttt = new TicTacToeClass();
        int r, c;

        do {

            System.out.println(ttt);

            do {

                System.out.print("'" + p + "', choose your location (row, column): ");

                try {

                    r = keyboard.nextInt();

                    c = keyboard.nextInt();

                    if (!ttt.isValid(r, c))

                        System.out.println("That is not a valid location. Try again.");

                    else if (ttt.playerAt(r, c) != ' ')

                        System.out.println("That location is already full. Try again.");

                    else

                        break;

                }

                catch (Exception e) {

                    System.out.println("Bad Integer Entered. Try Again.");

                }

            } while (true);

            ttt.playMove(p, r, c);

            if (p == 'X')

                p = 'O';

            else

                p = 'X';

        } while (!ttt.isWinner('X') && !ttt.isWinner('O') && !ttt.isFull());

        System.out.println(ttt);

        if (ttt.isWinner('X'))

            System.out.print("X is the winner!");

        else if (ttt.isWinner('O'))

            System.out.print("O is the winner!");

        else

            System.out.print("The game is a tie.");
    }
}