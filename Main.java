import Pilares_POO.*;
import java.util.Scanner;
public class Main {
    static Scanner escaner = new Scanner(System.in);
    public static int option;
    public static void main(String[] args){

        System.out.println("\n============== Bienvenido al Selector de Ejemplos de los Pilares de POO ============");
        System.out.println("\nUsuario, por favor, seleccione el ejemplo de pilar de POO que desee obtener y visualizar.");
        System.out.println("\n1. Pilares_POO.Abstraccion");
        System.out.println("2. Encapsulacion");
        System.out.println("3. Herencia");
        System.out.println("4. Polimorfismo");

        Menu();
    }

    public static void Menu(){
        System.out.println("\nSeleecione el numero de la opcion: ");
        option = escaner.nextInt();

            switch (option) {
                case 1 -> {
                    System.out.println("\n---------Ejemplo de Abstraccion---------");
                    Abstraccion vehiculo1 = new Abstraccion("Auto","Mazda X-5",2014,"PBX2345",
                            2, 15000);

                    vehiculo1.Imprimir_datos();
                }
                case 2 -> {
                    System.out.println("\n---------Ejemplo de Encapsulamiento---------");
                    Encapsulamiento user = new Encapsulamiento(175078787, 1999, "Pepe Rojas", 5000,
                            500, 6000);

                    user.ATM();
                }

                case 3 -> {
                    System.out.println("\n---------Ejemplo de Herencia---------");
                    System.out.println("Para tratar el tema de herencias, vamos a usar la clase del ejemplo de Abstraccion.");
                    Herencia vehiculo = new Herencia("Auto","Mazda X-5",2014,"PBX2345",
                            2, 15000, "Bryan Raul", 12500, 123.450);

                    vehiculo.imprimir_Datos();
                }

                case 4 -> {
                    System.out.println("\n---------Ejemplo de Polimorfismo---------");
                    System.out.println("Como polimorfirsmo usaremos el mismo ejemplo de la clase de Herencia");
                    Herencia vehiculo = new Herencia("Auto","Mazda X-5",2014,"PBX2345",
                            2, 15000, "Bryan Raul", 12500, 123.450);

                    vehiculo.imprimir_Datos();
                }

            default -> System.out.println("\nNo se encuentra la opcion en el programa! Reinicie por favor");
        }
    }
}