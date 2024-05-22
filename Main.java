import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa el nùmero màximo para el programa.");
        int max = in.nextInt();

        ConsoleBasesFizzBuzz tilin = new ConsoleBasesFizzBuzz();

        tilin.print(1, max);
        //ConsoleBasesFizzBuzz.print(1, max);
    }
}
