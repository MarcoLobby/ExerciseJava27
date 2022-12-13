package it.DevelHope.ExerciseJava27;

public class Start {
    public static void main(String[] args) {

        int a = 1;
        int b = 3;
        int c = a*b;
        int d = c;

        int x = 5;
        int y = 6;

        boolean t = false;
        boolean f = true;

        boolean A = (d / c + 2) >= b || !(c + b - c / a == 3); /* Since the value of the first condition is 'true' and the value of the second is 'false'
                                                                  the result of A will be true */


        boolean B = (x * x - y * y / 2 != 12) || !t && f;      /* Since the value of the first condition is 'false' and the value of the second is 'true'
                                                                  the result of B will be true */

        System.out.println("The result of A is: " + A);
        System.out.println("The result of B is: " + B);
    }
}
