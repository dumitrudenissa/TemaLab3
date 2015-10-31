/**
 * Created by Acer on 10/31/2015.
 */
public class Ex1b {
    public static void main(String[] args) {

        int n, prod;
        prod = 1;
        n=64;
        while (n != 0) {
            prod = prod * (n%10);
            n = n / 10;
        }
        System.out.println("Produsul cifrelor este:" + prod);

    }

}
