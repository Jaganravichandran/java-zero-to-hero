/*
 *  @author Jagan
 */

// OOP 2 : Packages, static, in-build methods, singleton class

class Human{
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}


class StaticBlock{
    static int a = 5;
    static  int b;


    // it will only run once, when the first obj is created
    // i.e. when the class is loaded for the first time.
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }
}

class Singleton{

    private Singleton(){

    }

    static Singleton instance;

    static Singleton getInstance(){
        // check whether one obj is created or not
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}


public class Packages {

    static class InnerClass{
        String name;

        public  InnerClass(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Human human1 = new Human(20, "Jagan", 10000, false);
        Human human2 = new Human(25, "Vasanth", 25000, false);

        System.out.println(human1.name);
        System.out.println(human2.salary);
        System.out.println(Human.population);

        // Access non-static method inside static
        Packages obj = new Packages();
        obj.greeting();

        StaticBlock object = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


        // Access inner static class in static method
        InnerClass test = new InnerClass("Vasanth");
        System.out.println(test.name);

        // Singleton class
        Singleton obj1 = Singleton.getInstance();

        Singleton obj2 = Singleton.getInstance();

        Singleton obj3 = Singleton.getInstance();

        // All 3 ref variables are pointing to just one object.
    }


    void  greeting(){
        System.out.println("Hello World");
    }
}



/*

     # Notes

        => What is packages
            -> packages are just containers / boxes for classes
            -> it is used to keep class names in compartmentalized.
            -> In simple term, package is just a folder
            -> Packages are stored in hierarchical manner.

        => What is static
            -> if the property is not specific to object (i.e. object independent)
               it is known as static variables / methods.
            -> Inorder to access static variable, you just use class name.
            -> for example, Human.population
            -> we know that something is not static, belongs to an object.

        => initialisation of static variables
           -> you can initialise static variable like this
                    static int a = 10;
           -> you can also initialise static variable inside static
              block execute exactly once when the class is loaded.
           -> for example, static { ... }

 */
