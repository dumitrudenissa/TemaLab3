/**
 * Created by Acer on 10/31/2015.
 */
public class Ex1a {
    public static void main(String[] args) {

        int n, suma;
        suma = 0;
        n=64321;
        while (n != 0) {
            suma = suma + n % 10;
            n = n / 10;
        }
        System.out.println("Suma cifrelor este:" + suma);

    }

}
