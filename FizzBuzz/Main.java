import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el número máximo para el programa.");
        int max = in.nextInt();

        ConsoleBasesFizzBuzz fizzBuzz = new ConsoleBasesFizzBuzz();
        fizzBuzz.print(1, max);
        in.close();
    }
}
