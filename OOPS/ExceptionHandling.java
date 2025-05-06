/*
 *  @author Jagan
 */

// OOP 7 : exception handling, object cloning

import java.util.Arrays;

public class ExceptionHandling {

    public static void main(String[] args) {

        int a = 5;
        int b = 0;


        try {
            int c = divide(a, b);
        } catch (Exception e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("this will always execute");
        }

    }

    static int divide(int a, int b) throws ArithmeticException {

        if(b == 0){
            throw new ArithmeticException("Please do not divide by zero");
        }

        return a / b;
    }
}

// Object Cloning
class Person implements Cloneable {
    int age;
    String name;
    int[] arr;

    Person(int age, String name){
        this.age = age;
        this.name = name;
        this.arr = new int[]{3,2,1,5,4};
    }

    Person(Person other){
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }

    public Object clone() throws CloneNotSupportedException {

        // this is shallow copy
        // return super.clone();

        // this is deep copy
        Person personCopy = (Person) super.clone(); // this is actually shallow copy
        personCopy.arr = new int[personCopy.arr.length];

        for(int i = 0; i< personCopy.arr.length; i++){
            personCopy.arr[i] = this.arr[i];
        }
        return personCopy;
    }
}

class ObjectCloning{
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person = new Person(20, "Vasanth");

        // Method 1
        // Person obj2 = new Person(obj);

        // Method 2 (Better)
        Person twin = (Person) person.clone();

        System.out.println(twin.age + " " + twin.name);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 10;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(person.arr));
    }
}

/*

        # Notes

            => Exception
                -> types of exception
                    * checked
                    * unchecked
                -> throws is used to declare an exception

 */
