import java.util.*;

public class NAstericVerticalLineApp {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        NAstericVertical nAstericVertical = new NAstericVertical();
        nAstericVertical.printNAstericvertically(N);
    }
}

class NAstericVertical {
    void printNAstericvertically (int N) {
        while( N-- != 0 ) {
            System.out.println("*");
        }
    }
}
