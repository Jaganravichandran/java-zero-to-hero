/*
 *  @author Jagan
 */

// OOP 6 : Generics, custom ArrayList, Lambda expressions

import java.util.ArrayList;
import java.util.Arrays;

// Custom ArrayList
class CustomArrayList<T> {

    private Object[] data = {};
    private static final int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value


    public CustomArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public CustomArrayList(int initialCapacity){
        this.data = new Object[initialCapacity];
    }

    public void add(T item){
        if(this.isFull()){
            this.resize();
        }
        this.data[size++] = item;
    }

    public void set(int index, T item){
        this.data[index] = item;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T) (this.data[index]);
    }

    @SuppressWarnings("unchecked")
    public T remove(){
        return (T) (this.data[--size]);
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    private boolean isFull(){
        return size == this.data.length;
    }

    private void resize(){
        int n = this.data.length;
        Object[] temp = new Object[n * 2];

        for(int i = 0; i<n; i++){
            temp[i] = this.data[i];
        }
        this.data = temp;
    }

    @Override
    public String toString(){
        return Arrays.toString(data);
    }
}

public class Generics {

    public static void main(String[] args) {
        CustomArrayList<Integer> list = new CustomArrayList<>();

        for(int i = 0; i< 10; i++){
            list.add(2 * i);
        }

        System.out.println(list);
    }
}

// Lambda Function (Arrow function)
class LambdaFunction{

   private int operate(int a, int b, Operation op){
       return op.operation(a, b);
   }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0; i<5; i++){
            arr.add(i + 1);
        }

        arr.forEach((item) -> {
            System.out.println(2 * item + " ");
        });

        Operation sum = (a, b) -> a + b;
        Operation prod = (a, b) -> a * b;
        Operation sub = (a, b) -> a -b;

        LambdaFunction obj = new LambdaFunction();
        System.out.println(obj.operate(5, 3, sum));
        System.out.println(obj.operate(5, 3, prod));
        System.out.println(obj.operate(5, 3, sub));
    }
}

interface Operation {
    int operation(int a, int b);
}


/*

        # Notes

             => Generics
                -> it were introduced by java lang to provide tighter type
                   checks at compile time
                -> it only contains class, interface, method.

 */
