/**
 * Exercise 21: (1) Create an enum of the least-valuable six types of paper currency. Loop through the values( ) and
 * print each value and its ordinal( ).
 *
 * Created by Petro Khovrashchuk on 17/02/2016.
 */

public enum TheLeastValuableSixTypesPaperCurrency {
    ONE_UAH, TWO_UAH, FIVE_UAH, TEN_UAH, TWENTY_UAH, FIFTY_UAH;

    public static void main(String[] args) {
        for (TheLeastValuableSixTypesPaperCurrency val : TheLeastValuableSixTypesPaperCurrency.values()) {
            System.out.println(val + " - " + (val.ordinal()+1));
        }
    }
}