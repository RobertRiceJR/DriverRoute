import java.util.Objects;
import java.util.Scanner;

public class day1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount of stores for today");
        int qstores = scan.nextInt();

        for (int i = 0; i < qstores; i++) {
            System.out.println("Please enter the first store number");
            int store1 = scan.nextInt();
            System.out.println("Please enter the cube for " + store1);
            int store1cube = scan.nextInt();
            System.out.println("Please enter the weight for " + store1);
            int store1weight = scan.nextInt();
            System.out.println(store1cube);
            System.out.println(store1weight);
        }


        // using multidimensions arrays

    }
}


