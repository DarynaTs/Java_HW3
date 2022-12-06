import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int c = scanner.nextInt();
        System.out.println("you entered:" + c);
        System.out.println(sum());
    }
    public static int sum(){
        System.out.println("enter the first number: ");
        int m = scanner.nextInt();

        System.out.println("enter the second number: ");
        int c = scanner.nextInt();
        return m + c;

    }

}
