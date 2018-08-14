import java.lang.reflect.Array;
import java.util.*;

public class PrimeFactors {
    public static void main ( String args[] ) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        primeFactors = generate(n);

        Iterator itr = primeFactors.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    static ArrayList<Integer> generate (int n) {
        ArrayList primeFactorsList = new ArrayList<Integer>();

        for ( int i = 1; i <= n; i++ ) {
            if( n%i == 0 ) {
                int count = 0;
                for ( int j = 1; j <= i; j++ ) {
                    if ( i%j == 0) {
                        count++;
                    }
                }
                if ( count == 2 ) {
                    primeFactorsList.add(i);
                }
            }
        }

        return primeFactorsList;

    }
}
