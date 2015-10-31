/**
 * Created by Acer on 10/31/2015.
 */
public class Ex2 {
    public static void main(String[] args) {
        int n, c, i; //n-numar natural, i-inversul numarului, c-ultima cifra a lui n
        n = 4526;
        i = 0;
        while(n!=0){
            c = n%10;
            i = i * 10 + c;
            n = n/10;
        }
        System.out.print("Inversul numarului este:" + i);}

}
