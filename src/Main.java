import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);
    private static int minus_b, two_a;
    private static double delta;

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to this program which will calculate a quadratic equation\n");
        System.out.print("Enter a: ");
        int a = scan.nextInt();
        System.out.print("Enter b: ");
        int b = scan.nextInt();
        System.out.print("Enter c: ");
        int c = scan.nextInt();

        System.out.println("\nΔ = b²-4ac");
        System.out.println("Δ = ("+ b + ")²-4(" + a + ")(" + c + ")");
        
        int b_square = b * b;
        int a_c = a * c;
        int four_a_c = 4 * a_c;
        delta = b_square - four_a_c;

        System.out.println("Δ = "+ b_square + "-4(" + a_c + ")");
        System.out.println("Δ = "+ b_square + "-(" + four_a_c + ")");
        System.out.println("Δ = " + delta);

        if(delta >= 0){
            delta = Math.sqrt(delta);
            System.out.format("√Δ = %.2f" , delta);
        }else{
            System.out.println("\nPas de racine");
        }

        if(delta > 0) {

            minus_b = -1 * b;
            double minus_b_plus_delta = minus_b + delta;
            two_a = 2 * a;
            double x_prime = minus_b_plus_delta / two_a;

            System.out.println("\n\nx' = -b+√Δ / 2a");
            System.out.println("x' = -(" + b + ")+" + delta + " / 2(" + a +")");
            System.out.println("x' = " + minus_b + "+" + delta + " / 2(" + a +")");
            System.out.println("x' = " + minus_b_plus_delta + " / " + two_a);
            System.out.println("x' = " + x_prime + "\n");

            double minus_b_minus_delta = minus_b - delta;
            double x_second = minus_b_minus_delta / two_a;

            System.out.println("x\" = -b-√Δ / 2a");
            System.out.println("x\" = -(" + b + ")-" + delta + " / 2(" + a +")");
            System.out.println("x\" = " + minus_b + "-" + delta + " / 2(" + a +")");
            System.out.println("x\" = " + minus_b_minus_delta + " / " + two_a);
            System.out.println("x\" = " + x_second);
        }else if(delta == 0){
            System.out.println("x' = x\" = -b/2a");
            System.out.println("x' = x\" = -(" + b + ") / 2(" + a + ")");
            System.out.println("x' = x\" = " + minus_b + " / " + two_a);
            System.out.println("x' = x\" = " + minus_b / two_a);

        }
    }
}
