package kz.epam.chess;

import java.text.DecimalFormat;

class HorseLikeToMoveItMoveIt {

    private int[][] deskSize;
    private int path = 0;

    HorseLikeToMoveItMoveIt(int sizeOfDesk) {
        deskSize = new int[sizeOfDesk][sizeOfDesk];
        for (int i = 0; i < sizeOfDesk; i++) {
            for (int j = 0; j < sizeOfDesk; j++) {
                    deskSize[i][j] = 0;
            }
        }
    }

    void solve() {
        if (findPath(0, 0, 0, deskSize.length)) {
            print();
        } else {
            System.out.println("YOU SHALL NOT PATH");
        }
    }

    private boolean findPath(int row, int column, int index, int N) {
        if (deskSize[row][column] != 0) {
                return false;
        }

        deskSize[row][column] = path++;
        if (index == N * N - 1) {
            return true;
        }

        if (canMove(row + 2, column + 1, N) && findPath(row + 2, column + 1, index + 1, N)) {
            return true;
        }

        if (canMove(row + 1, column + 2, N) && findPath(row + 1, column + 2, index + 1, N)) {
            return true;
        }

        if (canMove(row - 1, column + 2, N) && findPath(row - 1, column + 2, index + 1, N)) {
            return true;
        }

        if (canMove(row - 2, column + 1, N) && findPath(row - 2, column + 1, index + 1, N)) {
            return true;
        }

        if (canMove(row - 2, column - 1, N) && findPath(row - 2, column - 1, index + 1, N)) {
            return true;
        }

        if (canMove(row - 1, column - 2, N) && findPath(row - 1, column - 2, index + 1, N)) {
            return true;
        }

        if (canMove(row + 1, column - 2, N) && findPath(row + 1, column - 2, index + 1, N)) {
            return true;
        }

        if (canMove(row + 2, column - 1, N) && findPath(row + 2, column - 1, index + 1, N)) {
            return true;
        }

        deskSize[row][column] = 0;
        path--;
        return false;
    }

    private boolean canMove(int row, int col, int N) {
        if (row >= 0 && col >= 0 && row < N && col < N) {
            return true;
        }
        return false;
    }

    private void print() {
        DecimalFormat twoNumbers = new DecimalFormat("00");
        for (int i = 0; i < deskSize.length; i++) {
            for (int j = 0; j < deskSize.length; j++) {
                System.out.print(" " + twoNumbers.format(deskSize[i][j]));
            }
            System.out.println();
        }
    }
}