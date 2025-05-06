/*
 *  @author Jagan
 */

// OOP 4 : Access control, In-build packages, Object class

class Test{
    private int num; // data hiding
    String name;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum(){
        return num;
    }
}

public class AccessControl {
    public static void main(String[] args) {
        Test obj = new Test();

        obj.setNum(10);
        System.out.println(obj.getNum());

    }
}

/*

        # Notes

             => access control
                   -> public, private, protected, no modifier

                   Table:
                                class       Package     subclass    subclassDiffPkg     world
                  * public        +            +            +               +             +
                  * private       +            -            -               -             -
                  * protected     +            +            +               +             -
                  * no modifier   +            +            +               -             -

             => Types of packages
                -> user defined
                -> in-build packages

             => In-build packages
                -> lang, util, i/o, applet, awt, net

 */
