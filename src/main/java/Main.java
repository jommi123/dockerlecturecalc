import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cal cal = new Cal();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers for calculations: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(cal.addMe(a, b));
        System.out.println(cal.subMe(a, b));
    }
}
