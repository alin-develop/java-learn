import com.beust.jcommander.internal.Lists;
import corejava.*;
import org.testng.annotations.Test;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void typecasting(String[] args) throws IOException {
        TypeCasting obj = new TypeCasting();
        if (obj.equal()) System.out.println("MyDouble is equal to myInt");
        else System.out.println("MyDouble is not equal to myInt");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Animal());
        /* We add cats and dogs, and they are upcast to Animal type implicitly.
        Each Cat is an Animal and each Dog is an Animal.
        They're polymorphic. */
        new AnimalFeeder().feed(animals);
        /* Downcasting */
        Animal downcasting = new Dog();
        ((Dog)downcasting).bark();
        /*To downcast an object safely, we need instanceof operator.
        * Downcasting is necessary to gain access to members specific to subclass.
            Downcasting is done using cast operator.*/


        /*********java.lang.System*********/

        System.setOut(new PrintStream("result.txt"));
        System.err.println("Some error");
        Dog marta = new Dog();
        marta.readName(5);
        marta.toString();
    }
    public static void workingWithConsole(String[] args){
        Console console = System.console();
        String line="";
        if (console != null) line = console.readLine("%s", "Enter your name: ");
        System.out.println(line);
        //System.arraycopy

    }
    @Test
    public static boolean sortingWithLambdas() {
        List<User> users = Lists.newArrayList(
                new User("Sarah", 10),
                new User("Jack", 12)
        );

        users.sort(
                (User u1, User u2) -> u1.getName().compareTo(u2.getName()));
        //users.sort(
        //                Comparator.comparing(User::getName));

        return (users.get(0).equals(new User("Jack", 12)));
    }
    public static void immutableObject(){
        final String name = "baeldung";
        //name = "bael...";
        final List<String> strings = new ArrayList<>();

        strings.add("baeldung");
    }
    public static void workingWithEnums(){
        DaysOfTheWeek.stream().filter(el -> el.getTypeOfDay().equals("WORKDAY")).forEach(System.out::println);
    }
    public static void main(String[] args){


    }
}