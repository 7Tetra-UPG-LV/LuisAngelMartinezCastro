import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la opción 0 o 1: ");
        int num = sc.nextInt();
        if(num == 1){
            System.out.println("Ingrese su nombre completo: ");
            String nombre = sc.next();
            System.out.println("El registro ha sido un exito.");
        }
        else if (num == 0){
        }
    }
}