import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;

public abstract class AbstractListADT<E> implements ListADT<E>{
    protected E[] mylist;
    protected int numItems;
    protected int increment = 2; // default increment
    protected int capacity;

    protected void initialization(){
        numItems = 0;
        mylist = (E[]) new Object[capacity]; // Create new Array with Default Capacity
    }

    public AbstractListADT(){
        // initialize variables
        capacity = 10;  // Default Capacity
        initialization();
    }


    public AbstractListADT(int capacity){
        this.capacity = capacity;
        initialization();
    }

    public AbstractListADT(int capacity, int increment){
        this.capacity = capacity;
        this.increment = increment;
        initialization();
    };





}
