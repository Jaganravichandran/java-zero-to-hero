/*
 *  @author Jagan
*/

// OOP 1 : Introduction -> classes, objects, constructors, keywords

import java.util.Arrays;

// Create a class
class Student{

    // instance variables
    int rollNum;
    String name;
    double mark;

    // creating constructor
    Student(){
        this.rollNum = 0;
        this.name = null;
        this.mark = 0.0;
    }

    // constructor overloading
    Student(int rollNum, String name, double mark){
        this.rollNum = rollNum;
        this.name = name;
        this.mark = mark;
    }
}


public class Introduction {
    public static void main(String[] args) {

        // Q1 : Store 3 roll numbers

        int[] rollNumbers = new int[3]; // [0,0,0]
        // By default, the value is 0 for integer type.

        // Q2 : Store 3 student names

        String[] names = new String[3];
        // By default, the value is null for String type.

        // Q3 : Store data of 3 students {roll number, name, marks}

        int[] rollNum = new int[3];
        String[] name = new String[3];
        double[] mark = new double[3];
        // By default, the value is 0.0 for double type.


        // Q4 : Make a custom data structure to store data of student

        Student s1 = new Student();
        s1.rollNum = 12;
        s1.name = "Vasanth";
        s1.mark = 90.15;

        System.out.println(s1.mark);

        Student s2 = new Student();
        s2.rollNum = 8;
        s2.name = "Jagan";
        s2.mark = 87.73;

        System.out.println(s2.name);

        Student[] s3 = new Student[3];

        System.out.println(Arrays.toString(s3)); // [null, null, null]
        // By default, the value is null if not initialized.

        Student s4 = new Student(14, "Ravi", 95.10);

        System.out.println(s4.name);
    }
}

/*

    # Notes

        => what is class
            -> it is a named group of properties and functions
            -> for example,
                {roll number, name, marks} these 3 properties combined
                into single entity. I can do that via classes.
            -> it is a template of object (or) logical construct.
            -> object is the instance of class (or)
               physical reality (or) it occupies space in memory.

         => How to create objects
            -> with the help of new keyword
            -> for example, Student s1 = new Student()
            -> new keyword dynamically allocates memory
               on run time and return reference to it.
            -> this reference is stored in s1 variable.
            -> Student s1 - happens at compile time.
            -> new Student() - happens at run time.

         => How to access instance variable in object
            -> All the variables inside object are
               known as instance variables.
            -> access instance variables by using dot (.) operator.
            -> for example, student.name
            -> student is reference variable

         => Java constructor
            -> constructor basically defines what happens
               when object will be created.
            -> it is a special type of function, that runs when
               you create an object, it allocates some variables.
            -> when you don't have any constructor in the class,
               then this is known as By default constructor.
            -> creating constructor - student() { _body_ }

         => final keyword
            -> it prevent your content to be modified.
            -> for example, final int INCREASE = 2; (it can't be modified).
            -> make sure the variable name must be capital (for convention)
            -> Since you can't modify it, always initialise
               while declaring it.

 */