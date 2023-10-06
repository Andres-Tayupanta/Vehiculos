import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setPuertas(10);
        auto1.setColor("Blanco");
        Motor motor1= auto1.getMotor();
        int puertas1 = auto1.getPuertas();
        auto1.imprimirColorPuertas(1);

        Auto auto2 = new Auto (4,"ROJO",3);
        auto2.imprimirColorPuertas();


        System.out.println("------------------------------------");
        Scanner sc =new Scanner(System.in);
        System.out.println("INGRESE NUMERO DE RUEDAS: ");
        int numRuedas= sc.nextInt();
        System.out.println("INGRESE EL COLOR DEL VEHICULO: ");
        String color = sc.next();
        System.out.println("INGRESE EL NUMERO PUERTAS DEL VEHICULO: ");
        int  puertas = sc.nextInt ();
    }



}