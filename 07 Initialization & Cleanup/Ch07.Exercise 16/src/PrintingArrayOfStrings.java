/**
 * Exercise 16: (1) Create an array of String objects and assign a String to each element. Print the array by using a
 * for loop.
 *
 * Created by Petro Khovrashchuk on 16/02/2016.
 */

public class PrintingArrayOfStrings {
    public static void main(String[] args) {
        String [] stringsArray = new String[16];
        stringsArray[0] = "How long how long will I slide";
        stringsArray[1] = "Separate my side I don't";
        stringsArray[2] = "I don't believe it's bad";
        stringsArray[3] = "Slit my throat";
        stringsArray[4] = "It's all I ever\n";
        stringsArray[5] = "I heard your voice through a photograph";
        stringsArray[6] = "I thought it up it brought up the past";
        stringsArray[7] = "Once you know you can never go back";
        stringsArray[8] = "I've got to take it on the otherside\n";
        stringsArray[9] = "Centuries are what it meant to me";
        stringsArray[10] = "A cemetery where I marry the sea";
        stringsArray[11] = "Stranger things could never change my mind";
        stringsArray[12] = "I've got to take it on the otherside";
        stringsArray[13] = "Take it on the otherside";
        stringsArray[14] = "Take it on";
        stringsArray[15] = "Take it on";

        for(int i = 0; i < stringsArray.length; i++)
            System.out.println(stringsArray[i]);
    }
}