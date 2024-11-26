import java.util.Scanner;

import java.security.MessageDigest;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un digito:");
        String texto = sc.nextLine();
        String TextoEncriptado = EncriptarSHA1(texto);
        if (texto.length() <=10 ) {

            System.out.println(TextoEncriptado);
        }
        else if (texto.length() > 10){
            System.out.print("El texto no ha podido ser encriptado");
        }

    }

    public static String EncriptarSHA1(String texto) {
            try {
                MessageDigest dig = MessageDigest.getInstance("SHA-1");
                byte[] jash = dig.digest(texto.getBytes());
                StringBuilder hexString = new StringBuilder();
                for (byte b : jash) {
                    hexString.append(String.format("%02x", b));
                }
                return hexString.toString();

            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
                return null;
            }

    }
}