package assignment4;

public class Kitchen extends Room{
    private boolean stove;

    Kitchen(){
        super("Kitchen");
        this.stove = false;
    }

    public void switchStove(){
        this.stove = !this.stove;
        if (this.stove) {
            System.out.println("Switched on stove.");
        }else{
            System.out.println("Switched off stove.");
        }
    }
}
