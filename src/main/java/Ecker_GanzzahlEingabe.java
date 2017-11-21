import java.util.Scanner;

public class Ecker_GanzzahlEingabe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input;
        int numberSum;
        int numberSumEquals = 0;

        System.out.print("Zahl: ");
        input = scanner.nextInt();

        while (input != 0){
           numberSum = input % 10;
           input = input /10;
           numberSumEquals = numberSumEquals +numberSum;
        }

        System.out.printf("Ziffernsumme: %d", numberSumEquals);
    }
}
