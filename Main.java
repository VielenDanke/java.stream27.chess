package kz.epam.chess;

public class Main {

    private final int sizeOfDesk = 8;

    public static void main(String args[]) {

            Main forSize = new Main();
            HorseLikeToMoveItMoveIt newHorse = new HorseLikeToMoveItMoveIt(forSize.sizeOfDesk);
            newHorse.solve();

            CalculatingSeed countSeed = new CalculatingSeed();
            System.out.println("\n");
            countSeed.increaseNumber();

            QueenLikeToMoveItMoveIt newQueen = new QueenLikeToMoveItMoveIt();
            newQueen.enumerate(forSize.sizeOfDesk);
    }
}
