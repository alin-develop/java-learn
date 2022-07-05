package corejava;

public class TypeCasting {
    /* a primitive variable contains its value,
     *  and conversion of a primitive variable means irreversible changes in its value: */
    double myDouble = 1.1;
    int myInt = (int) myDouble;

    public boolean equal(){
        return myDouble==myInt;
    }

    /*Reference variables are different;
    the reference variable only refers to an object
    but doesn’t contain the object itself.*/
}
