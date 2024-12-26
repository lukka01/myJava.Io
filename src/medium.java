import java.util.Scanner;
public class medium {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the first value: ");
        int a = scan.nextInt();
        System.out.println("Enter the second value: ");
        int b = scan.nextInt();
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);

       // 2

        System.out.println("Enter the initial value: ");
        int num = scan.nextInt();
        int value = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the value : ");
            int res = scan.nextInt();
            value += res;
        }

        System.out.println("the result is : " + (value/num) );
        scan.close();


        // factorial

        int input = scan.nextInt();


    }


}
