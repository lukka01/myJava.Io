import java.util.Scanner;
public class optional {
    public static void main(String[] args) {
        //Easy

        // 1 task
        int sum = 0;
        int product = 1;

        for (int i = 1; i < 10; i++) {
            sum += i;
            product *= i;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The product is: " + product);

        // 2 Task

        int res = 1;
        for (int i = 0; i < 10 ; i++) {

            if (i % 2 == 1) {
                res *= i;
            } else {
                res += i;
            }
        }
        System.out.println("The result is: " + res);


        // 3 task
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = scan.nextInt();
        System.out.println("Enter the second value: ");
        int b = scan.nextInt();
        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        scan.close();
    }







}
