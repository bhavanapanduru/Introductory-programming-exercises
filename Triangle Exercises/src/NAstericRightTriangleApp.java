import java.util.Scanner;

public class NAstericRightTriangleApp {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        NAstericRightTriangle nAstericRightTriangle = new NAstericRightTriangle();
        nAstericRightTriangle.printAstericRightTriangle(N);
    }
}

class NAstericRightTriangle {
    void printAstericRightTriangle (int N) {
        for (int i=1; i<=N; i++) {
            int tempI = i;
            while (tempI-- != 0)
                System.out.print("*");
            System.out.println();
        }
    }
}
