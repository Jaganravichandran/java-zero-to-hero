/*
 *  @author Jagan
 */

// OOP 3 : Principles -> Inheritance, Polymorphism, Encapsulation, Abstraction

// Inheritance
class Calculator{
    int a;
    int b;

    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int add(){
        return this.a + this.b;
    }

    int sub(){
        return  this.a - this.b;
    }
}

class AdvanceCalculator extends Calculator{

    AdvanceCalculator(int a, int b){
        super(a, b);
    }

    int multiply(){
        return this.a * this.b;
    }

    double divide(){
        return (double) this.a / this.b; // Type-casting
    }

}

class ScientificCalculator extends AdvanceCalculator{

    ScientificCalculator(int a, int b){
        super(a, b);
    }

    int power(int a, int b) {
        int result = 1;
        for(int i = 0; i< b; i++){
            result = result * a;
        }
        return result;
    }

    int square(int a){
        int result = 1;
        for(int i = 0; i<2; i++){
            result = result * a;
        }
        return result;
    }

    int modulo(){
        return  this.a % this.b;
    }
}

// Polymorphism
class Shapes{
    void area(){
        System.out.println("Shapes");
    }
}

class Circle extends Shapes{
    void area(){
        System.out.println("circle");
    }
}

class Triangle extends Shapes{
    void area(){
        System.out.println("triangle");
    }
}

public class Principles {
    public static void main(String[] args) {

        // Inheritance
        AdvanceCalculator obj = new AdvanceCalculator(15, 10);

        /*

            System.out.println(obj.multiply());

            System.out.println(obj.add());

            System.out.println(obj.sub());

            System.out.println(obj.divide());

         */


        // it is always the type of reference variable, not the
        // type of object that determines what member can be accessed.

        Calculator obj2 = new AdvanceCalculator(10, 5);
        // obj2.multiply();  you can't access


        // Multi-level inheritance
        ScientificCalculator calc = new ScientificCalculator(10, 20);

        /*

        System.out.println(calc.add());

        System.out.println(calc.modulo());

        System.out.println(calc.square(6));

        System.out.println(calc.power(2, 10));

         */


        // Polymorphism
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Shapes triangle = new Triangle();
        // Parent obj = new child();
        // here, which method will be called depends on child()

        shape.area();
        circle.area();
        triangle.area();
    }
}

/*

      # Notes

        => what is inheritance
            -> child class is inheriting properties from
               parent class
            -> To inherit a class, you simply incorporate the definition
               of one class into another by using extends keyword.
            -> for example,
                    class Parent{ ... }
                    class child extends Parent { ... }
            -> "super" keyword call the parent class constructor,
               it is used to initialise value present in parent class.
            -> for example,
                    AdvanceCalculator(int a, int b){
                        super(a, b);
                    }
            -> Parent class cannot access properties from child class.
            -> class Object is the root of the class hierarchy, Every
               class has Object as a superclass.

          => Types of inheritance
                -> Single inheritance
                    * one class extends another class
                    * for example,
                            AdvanceCalculator extends Calculator
                -> Multi-level inheritance
                    * Calculator -> AdvanceCalculator -> ScientificCalculator
                -> Multiple inheritance
                    * one class extending more than one class.
                    * for example,
                        A -> C
                        B -> C
                    * Java does not support multiple inheritance (ambiguity).
                 -> Hierarchical inheritance
                    * One class is inherited by many classes.
                 -> Hybrid inheritance
                    * it is combination of single and multiple inheritance.
                    * Java does not support hybrid inheritance

           => what is polymorphism (Greek word)
                -> Poly means many or multiple
                -> morphe means form or shape or ways to represent.

           => Types of polymorphism
                -> Compile time / Static polymorphism
                    * achieved via method overloading
                    * it means same name but types, arguments
                      return types, order of the type should be different.
                    * for example, multiple constructors
                 -> Run time / Dynamic polymorphism
                    * achieved via method overriding.
                    * if you want to check whether the method is override or not,
                      use @override (annotation).
                    * if the type is of parent class and the object is of child class
                    * for example,
                        Parent obj = new Child();
                     here, which method will be called depends on child class.
                     this is known as "Upcasting".

            => How overriding works
                  -> Dynamic method dispatch - it is a mechanism by which
                     to call the overridden method. it is resolved at run time
                     rather at compile time.

            => what is encapsulation
                  -> it is wrapping up the implementation of the data members & methods
                     in the class.

            => what is abstraction
                  -> it is basically hiding unnecessary details and showing only
                     valuable information.

 */
