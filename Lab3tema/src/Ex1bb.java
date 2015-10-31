/**
 * Created by Acer on 10/31/2015.
 */
public class Ex1bb {
    public static void main(String[] args) {

        int n, nr;
        nr = 0;
        n=64321;
        while (n != 0) {
            nr++;
            n = n / 10;
        }
        System.out.println("Numarul cifrelor este:" + nr);

    }

}
