import java.util.Scanner;

public class IsoscelesTriangleApp {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle();
        isoscelesTriangle.printCenteredTriangle(n);
    }
}

class IsoscelesTriangle {
    void printCenteredTriangle(int n) {
        int i = 0;
        while ( i < n ) {
            for ( int spaceCount = i; spaceCount < n-1; spaceCount++) {
                System.out.print(" ");
            }
            for ( int astericCount = 1; astericCount <= 2*i+1; astericCount++ ) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}
