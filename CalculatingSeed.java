package kz.epam.chess;

import java.math.BigDecimal;

class CalculatingSeed {

    void increaseNumber() {

        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i <= 63; i++) {
            sum = sum.add(BigDecimal.valueOf(Math.pow(2, i)));
        }
        System.out.println(sum);
    }
}
