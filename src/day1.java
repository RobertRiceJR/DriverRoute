import java.util.Objects;
import java.util.Scanner;

public class day1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the store number" );
        int store1 = scan.nextInt();
        System.out.println("Please enter the cube for " + store1 );
        int store1cube = scan.nextInt();
        System.out.println("Please enter the weight for " + store1);
        int store1weight = scan.nextInt();
        System.out.println("Is there another store to enter, yes or no?");
        String yesno = scan.next();
        if(yesno == "yes"){
            System.out.println("Please enter the store number");
        }if(yesno == "no"){
            System.out.println("Complete!");
        }

            }
        }


