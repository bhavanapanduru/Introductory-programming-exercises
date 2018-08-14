import java.util.*;

public class NAstericHorizontalLineApp {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        NAstericHorizontal nAstericHorizonal = new NAstericHorizontal();
        nAstericHorizonal.printNAstericHoriazontally(N);
    }
}

class NAstericHorizontal {
    void printNAstericHoriazontally (int N) {
        while( N-- != 0 ) {
            System.out.print("*");
        }
    }
}
