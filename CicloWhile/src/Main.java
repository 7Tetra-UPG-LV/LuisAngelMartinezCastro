import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese número de ticket: ");
        int numc = sc.nextInt();
        while (numc <= 20) {
            System.out.println("Ticket facturado.");
            return;
        }
        {
            System.out.println("La factura de este ticket no esta disponible.");
        }
    }
}