/*
 *  @author Jagan
 */

// OOP 5 : Abstract classes, Interfaces, Annotations

// Abstract
abstract class Parent{

    int age;

    Parent(int age){
        this.age = age;
    }

    abstract void career();
}

class Son extends Parent{

    Son(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }
}

class Daughter extends Parent{

    Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }
}

// Interface
class Car implements Engine, MediaPlayer{

    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void startMusic() {
        System.out.println("I start music like a normal car");
    }

    @Override
    public void stopMusic() {
        System.out.println("I stop music like a normal car");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Son son = new Son(25);
        son.career();

        Daughter daughter = new Daughter(23);
        daughter.career();

        // you can't create an obj of abstract class
        // Parent dad = new Parent();


        // Interface
        Car audi = new Car();
        audi.start();

        audi.startMusic();
    }
}


/*

        # Notes

               => Abstract
                    -> Inorder to declare abstract classes or methods
                       use "abstract" keyword.
                    -> any class that contains one or more abstract methods
                       must also be declared as abstract.
                    -> Every child class has to override every abstract methods
                       in parent class.
                    -> use case - methods in the parent class needs to be
                                  overridden then just make those abstract.
                    -> you cannot create an object of abstract class.
                    -> you cannot create abstract constructor
                    -> Still multiple inheritance is not supported that's where
                       interface comes in.

               => Interface
                    -> it is basically contains abstract methods.
                    -> variables are by default static and final
                    -> we can extend multiple class as much as we want by using
                       "implements" keyword.
                    -> you cannot use interface in performance critical code because
                       it is happening at run time.
                    -> Extending interface using extends keyword
                    -> static interface methods should always have a body,
                       call via the interface name.


 */
