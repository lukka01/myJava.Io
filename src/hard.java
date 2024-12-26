import java.util.Scanner;
public class hard {
    public static void main(String[] args) {
        //1
//        System.out.println("Enter the value: ");
        Scanner scan = new Scanner(System.in);
//        int input = scan.nextInt();
//        int sum = 0;
//
//        while (input > 0) {
//            int last = input % 10;
//            sum += last;
//            input /= 10;
//        }
//        System.out.println("The sum is: " + sum);

        //2

        int sum = 0;
        int input = scan.nextInt();
        while (input > 0) {
            int last = input % 10;
            sum = (10 * sum) + last;
            input /= 10;
        }
        System.out.println(sum);


    }
}
