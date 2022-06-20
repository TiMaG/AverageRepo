import java.util.Scanner;

public class Average {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int [] data = new int[5];
    double mean;
    int sum = 0;

public String toString() {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            data[i] = scan.nextInt();
            sum = sum + data[i];
        }
        mean = sum / data.length;
        return;
    }
}
}

