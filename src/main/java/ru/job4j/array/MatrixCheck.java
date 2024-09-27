package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board[column].length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '},
        };
        for (int index = 0; index < board.length; index++) {
            boolean result = monoHorizontal(board, index);
            System.out.println("Строка " + index + " заполнена 'X': " + result);
        }
        System.out.println();

        char[][] board2 = {
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
                {' ', ' ', 'X'},
        };

        for (int index = 0; index < board2.length; index++) {
            boolean result = monoVertical(board2, index);
            System.out.println("Столб " + index + " заполнена 'X': " + result);
        }
    }
}
