/**
 * Exercise 22: (2) Write a switch statement for the enum in the previous example. For each case, output a description
 * of that particular currency.
 *
 * Created by Petro Khovrashchuk on 17/02/2016.
 */

public enum TheLeastValuableSixTypesPaperCurrency {
    ONE_UAH, TWO_UAH, FIVE_UAH, TEN_UAH, TWENTY_UAH, FIFTY_UAH;

    String describe() {
        switch (this) {
            case ONE_UAH : return "Vladimir the Great";
            case TWO_UAH : return "Yaroslav the Wise";
            case FIVE_UAH: return "Bohdan Khmelnytsky";
            case TEN_UAH: return "Ivan Mazepa";
            case TWENTY_UAH: return "Ivan Franko";
            case FIFTY_UAH: return "Mykhailo Hrushevsky";
        }
        return "NULL";
    }

    public static void main(String[] args) {
        for (TheLeastValuableSixTypesPaperCurrency val : TheLeastValuableSixTypesPaperCurrency.values()) {
            System.out.print(val + " - " + (val.ordinal()+1) + " : " + val.describe() + "\n");
        }
    }
}