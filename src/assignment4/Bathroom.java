package assignment4;

public class Bathroom extends Room{
    private boolean shower;

    Bathroom(){
        super("Bathroom");
        boolean shower = false;
    }

    public void switchShower(){
        this.shower = !this.shower;
        if (this.shower) {
            System.out.println("Switched on shower.");
        }else{
            System.out.println("Switched off shower.");
        }
    }
}
