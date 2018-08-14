import java.util.Scanner;

public class DiamondApp {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Diamond diamond = new Diamond();
        diamond.printCenteredDiamond(n);
    }
}

class Diamond {
    void printCenteredDiamond(int n) {
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
