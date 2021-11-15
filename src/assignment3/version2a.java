package assignment3;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;


public class version2a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Random seed the generator (y/n)? ");
        String input = scanner.next();


        while (input.equals("y")){
            int rdm = 1; //Random(max, factor, increment, actualrandom);
            System.out.println(rdm);
            System.out.print("Another random number (y/n)? ");
            input = scanner.next();
        }
    }

    public static int Random(int max, int factor, int increment, int actualrandom){
        actualrandom = ((factor * actualrandom) + increment) % max;
        return actualrandom;
    }

    public static int Random(int pActualrandom, boolean init){
        int max = 1000;
        int factor = 623;
        int increment = 525;
        int start = 157;
        if (init == true){
            //begin init
            int actualrandom = ((factor*start)+increment) % max;
            // end init
            return actualrandom;
        }else{
            return -1; //Random(max, factor, increment, start, pActualrandom);
        }
    }
    public int RandomSeed(){
        return 0;
    }
}
