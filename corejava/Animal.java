package corejava;

public class Animal {
    public int getPaws() {
        return paws;
    }

    /*Casting from a subclass to a superclass is called upcasting. */
    int paws = 4;
    String sound = "sound";
    void sound(){
        System.out.println(sound);
    }
}
