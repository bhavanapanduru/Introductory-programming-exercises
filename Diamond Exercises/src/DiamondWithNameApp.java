import java.util.Scanner;

public class DiamondWithNameApp {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        DiamondWithName diamondWithName = new DiamondWithName();
        diamondWithName.printDiamondWithName(n);
    }
}

class DiamondWithName {
    void printDiamondWithName(int n) {
        int i = 0;
        while ( i < n-1 ) {
            for ( int spaceCount = i; spaceCount < n-1; spaceCount++) {
                System.out.print(" ");
            }
            for ( int astericCount = 1; astericCount <= 2*i+1; astericCount++ ) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }

        System.out.println("Bhavana");

        i = n-2;
        while ( i >= 0 ) {
            for ( int spaceCount = i; spaceCount < n-1; spaceCount++) {
                System.out.print(" ");
            }
            for ( int astericCount = 1; astericCount <= 2*i+1; astericCount++ ) {
                System.out.print("*");
            }
            System.out.println();
            i--;
        }
    }
}
