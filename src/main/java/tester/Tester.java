package tester;

/**
 * Created by jatingarg on 9/7/16.
 *
 * First
 *
 * Secondly
 *
 *
 * for reference
 * https://www.google.at/search?q=java+class+loader+diagram&rlz=1C1CHBF_enIN721IN721&espv=2&biw=1366&bih=662&tbm=isch&imgil=x3_J04jrHySYYM%253A%253Bv9TA297M3Jt8WM%253Bhttps%25253A%25252F%25252Fsites.google.com%25252Fsite%25252Fsureshdevang%25252Fjava-classloader-hierarchy&source=iu&pf=m&fir=x3_J04jrHySYYM%253A%252Cv9TA297M3Jt8WM%252C_&usg=__ydSaZEYCfvQV4OGdxYM_HEdl2NY%3D&ved=0ahUKEwjFr5C5n9jRAhUJXSwKHW2KBjgQyjcISA&ei=DPSFWMX5H4m6sQHtlJrAAw#imgrc=CPK83_phyT6GcM%3A
 * http://stackoverflow.com/questions/2420389/static-initialization-blocks/2420404#2420404
 *
 *

 *
 *
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
        System.out.println(value+"In instance initializer"+tester);
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
