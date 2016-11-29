package tester;

/**
 * Created by jatingarg on 9/7/16.
 */
public class Tester {

    private static Tester tester=new Tester();
    private Integer value=10;

    static
    {
        System.out.println("In static initializer block"+tester);
        System.out.print("In static initializer block,value is"+tester.value);
        tester=null;
    }

    {
        System.out.println("In instance initializer"+tester);
    }
    
    public Tester()
    {
        System.out.println("Value of tester in constructor is"+tester);
       // tester= new Tester();
    }



    public static void main(String args[])
    {
        System.out.println("In main "+tester);
    }
}
