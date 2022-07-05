package corejava;

import java.io.IOException;

public class Dog extends Animal {
    public String getSound() {
        return sound;
    }

    String sound = "bark";

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    String name;
    void sound(){
        System.out.println(sound);
    }
    public void bark(){
        System.out.println(sound);
    }
    public String readName(int length) throws IOException {
        byte[] name = new byte[length];
        System.in.read(name, 0, length); // by default, from the console
        this.name = String.valueOf(name);
        return new String(name);
    }
}
