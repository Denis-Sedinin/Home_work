import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * Created by Denis Sedinin on 23.11.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String s = br.readLine();
//        int i = Integer.parseInt(s);
        Base <Integer> arr = new Base<>();
        Random rnd = new Random();
        int r = rnd.nextInt(100);

        arr.setSize(r);
        System.out.println("\n"+"Array size: "+"\n"+arr.getSize());
        System.out.println("------------------");
        System.out.println("Array lenght: ");
        arr.lenght();
        System.out.println("\r");
        System.out.println("----------------");
        System.out.println("Array max: ");
        arr.max();
        System.out.println("------------------");
        System.out.println("Array min: ");
        arr.min();
        System.out.println("------------------");
        System.out.println("Array avg: ");
        arr.avg();
        System.out.println("------------------");
        System.out.println("Array extension: ");
        arr.lenghtExt();
        System.out.println("\r");
        System.out.println("------------------");
        System.out.println("Array narrowing: ");
        arr.lenghtNar();
        System.out.println("\r");
        System.out.println("------------------");
        //br.close();

    }
}
