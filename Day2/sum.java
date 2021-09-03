package Day2;

// Command Line Arguments means that you have to provide input during execution of program.

// e.g java sum 10 20

public class sum
{
      public static void main(String ar[])
      {
            int x,y,s;
 
            x=Integer.parseInt(ar[0]);
            y=Integer.parseInt(ar[1]);
 
            s=x+y;
            System.out.println("sum of " + x + " and " + y +" is " +s);
      }
}