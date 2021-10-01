import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //set variables
        double c1;
        double c2;
        double r1;
        double r2;

        double p;
        double q;
        String sN;
        double s1;
        double s2;
        String trash;




        //create scanner to read file
        Scanner s = new Scanner(System.in);

        //store the numbers into their variables




        trash = s.next();
        s1 = s.nextInt();
        trash = s.next();
        s2 = s.nextInt();
        trash = s.next();
        c1 = s.nextInt();
        trash = s.next();
        c2 = s.nextInt();

        //close scanner
        s.close();







        //find the roots of the equation through the quadratic equation

        //root #1 (addition)
        r1 = (c1 + (Math.sqrt( (c1*c1)+(4*c2) )))/2;

        //root #2 (subtraction)
        r2 = (c1 - (Math.sqrt( (c1*c1)+(4*c2) )))/2;





        //solve for p
        p = (s2 - (s1*r2))/(r1-r2);

        //solve for q
        q = s1 - p;




        //find the equation S(n) *** to print ***
        sN = "S(n) = (" + p + ")(" + r1 + ")^(n-1) + (" + q + ")(" + r2 + ")(n-1)";





        //print out results
        System.out.println("r1: " + r1);
        System.out.println("r2: " + r2);
        System.out.println("p: " + p);
        System.out.println("q: " + q);
        System.out.println("S(n): " + sN);



        //complete first 10 calculations using above equation and print
        for(int i=1; i<=10; i++)
        {
            System.out.println("S(" + i + ") = " + ((p * (Math.pow(r1,(i-1)))) + (q * (Math.pow(r2,(i-1))))));
        }






    }
}
