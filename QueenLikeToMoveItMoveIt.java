package kz.epam.chess;

public class QueenLikeToMoveItMoveIt {

    private final int path = 0;

    private boolean isConsistent(int[] deskSize, int numerate) {
        for (int i = 0; i < numerate; i++) {
            if (deskSize[i] == deskSize[numerate]) {
                return false;
            }
            if ((deskSize[i] - deskSize[numerate]) == (numerate - i)) {
                return false;
            }
            if ((deskSize[numerate] - deskSize[i]) == (numerate - i)) {
                return false;
            }
        }
        return true;
    }

    private void printQueens(int[] deskSize) {
        int numerate = deskSize.length;
        for (int i = 0; i < numerate; i++) {
            for (int j = 0; j < numerate; j++) {
                if (deskSize[i] == j) {
                    System.out.print("Q ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    void enumerate(int numerate) {
        int[] deskSize = new int[numerate];
        enumerate(deskSize, path);
    }

    private void enumerate(int[] deskSize, int newNumerate) {
        int numerate = deskSize.length;
        if (newNumerate == numerate) {
            printQueens(deskSize);
        } else {
            for (int i = 0; i < numerate; i++) {
                deskSize[newNumerate] = i;
                if (isConsistent(deskSize, newNumerate)) enumerate(deskSize, newNumerate + 1);
            }
        }
    }
}