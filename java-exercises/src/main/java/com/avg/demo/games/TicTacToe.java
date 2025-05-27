package com.avg.demo.games;


import java.util.Scanner;

/**
 * Pseudocode: Tic Tac Toe in Java 6
 * MAIN FUNCTION:
 * 1. Initialize a 3x3 char array as the game board
 * 2. Fill all cells with ' ' (space)
 * 3. Set currentPlayer = 'X'
 *
 * 4. LOOP:
 *     a. Display the board
 *     b. Prompt currentPlayer for a move (row and column 1–3)
 *     c. IF move is valid (empty cell and within bounds):
 *         i. Place currentPlayer's mark in the cell
 *         ii. Check if currentPlayer has won
 *             - If yes → Display board and announce winner → END
 *         iii. Check if the board is full
 *             - If yes → Display board and announce draw → END
 *         iv. Switch currentPlayer ('X' ↔ 'O')
 *     d. ELSE:
 *         - Display "Invalid move. Try again."
 *
 * END OF MAIN FUNCTION
 */
public class TicTacToe {
    private static char[][] board = new char[3][3];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        printBoard();
        while (true) {
            playerMove();
            printBoard();
            if (checkWin()) {
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (isBoardFull()) {
                System.out.println("The game is a tie!");
                break;
            }
            switchPlayer();
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-') {
                board[row][col] = currentPlayer;
                break;
            } else {
                System.out.println("This move is not valid");
            }
        }
    }

    private static boolean checkWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer &&
                 board[i][1] == currentPlayer &&
                 board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer &&
                 board[1][i] == currentPlayer &&
                 board[2][i] == currentPlayer)) {
                return true;
            }
        }

        // Check diagonals
        if ((board[0][0] == currentPlayer &&
             board[1][1] == currentPlayer &&
             board[2][2] == currentPlayer) ||
            (board[0][2] == currentPlayer &&
             board[1][1] == currentPlayer &&
             board[2][0] == currentPlayer)) {
            return true;
        }

        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
}
