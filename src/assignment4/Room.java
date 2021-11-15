package assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    private final String name;
    private boolean lighting;
    private ArrayList<Room> neighbours;

    Room(String pName){
        this.name = pName;
        this.lighting = false;
    }

    public String getName(){
        return this.name;
    }

    public void options(){
        Scanner scanner = new Scanner(System.in);
        short numberOptions = 3;
        System.out.println("You are in the " + this.name);
        System.out.println("What do you want to do?\n");

        System.out.println("1) Switch light\n2) Leave room\n3)Enter neighbouring room");

        switch (this.name){
            case "Kitchen":
                System.out.println("4) Switch stove");
                numberOptions = 4;
                break;
            case "Bathroom":
                numberOptions = 4;
                System.out.println("4) Switch shower");
                break;
            default:
                break;
        }
        int input = scanner.nextInt();
        while (input < 1 || input > numberOptions){
            System.out.println("You have to type in a correct number!");
            input = scanner.nextInt();
        }
        switch (input){
            case 1:
                this.switchLight();
                break;
            case 2:
                this.
        }

    }

    public Room enter(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which room?\n");
        for (int i = 0; i < neighbours.size(); i++){
            System.out.println(i + ") " + neighbours.get(i).getName());
        }
        int input = scanner.nextInt();
        while (input < 1 || input > this.neighbours.size()){
            System.out.println("You have to type in a correct number!");
            input = scanner.nextInt();
        }
        scanner.close();
        return this.neighbours.get(input-1);
    }

    public void switchLight(){
        this.lighting = !this.lighting;
        if (this.lighting) {
            System.out.println("Switched on light.");
        }else{
            System.out.println("Switched off light.");
        }
    }
}
