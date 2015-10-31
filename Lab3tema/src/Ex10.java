/**
 * Created by Acer on 10/31/2015.
 */
public class Ex10 {
    public static void main(String[] args) {
        int n,i, prod;
        prod = 1;
        i = 1;
        n = 3;
        while (i<=n){
            prod = prod * i;
            i = i+1;
        }
        System.out.println("Factorialul este:" + prod);
    }

}
