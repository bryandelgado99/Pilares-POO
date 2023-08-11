package Pilares_POO;
import java.util.Scanner;

public class Encapsulamiento {
    Scanner entrada = new Scanner(System.in);
    public int CI;
    public int password;
    private String Name;
    private int bounty;
    public int cash_out;
    public int cash_int;

    //Constructor
    public Encapsulamiento(int CI, int password, String name, int bounty, int cash_out, int cash_int) {
        this.CI = CI;
        this.password = password;
        Name = name;
        this.bounty = bounty;
        this.cash_out = cash_out;
        this.cash_int = cash_int;
    }

    //Setter y getter

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getBounty() {
        return bounty;
    }

    public void setBounty(int bounty) {
        this.bounty = bounty;
    }

    public int getCash_out() {
        return cash_out;
    }

    public void setCash_out(int cash_out) {
        this.cash_out = cash_out;
    }

    public int getCash_int() {
        return cash_int;
    }

    public void setCash_int(int cash_int) {
        this.cash_int = cash_int;
    }

    //Métodos de banco
    public void ATM(){
        System.out.println("\n=================Bienvenido Usuario al ATM-JAVA!====================");
        System.out.println("--- Menu de Acciones -------------------------");
        System.out.println("1. Consultar Monto");
        System.out.println("2. Retirar Dinero");
        System.out.println("3. Depositar Dinero");
        System.out.println("4. Salir");

        System.out.println("\nSeleccione una opcion: ");
        int opt = entrada.nextInt();

        switch (opt){
            case 1 -> {
                System.out.println("=====> Consulta de Monto");
                System.out.println("Su cantidad ahorrada es: " + this.bounty);
            }
            case 2 -> {
                System.out.println("======> Retiro de dinero");
                System.out.println("Por favor ingrese su cantidad a retirar: ");
                int retiro = entrada.nextInt();

               if (retiro <= bounty){
                   System.out.println("Retiro exitoso!!");
                   bounty = bounty - cash_out;
                   System.out.println("Monto total actual: " + bounty);
               }else{
                   System.out.println("No se puedo realizar la transaccion por falta de fondos");
               }
            }

            case 3 -> {
                System.out.println("======> Deposito de dinero");
                System.out.println("Por favor ingrese su cantidad a depositar: ");
                int deposito = entrada.nextInt();

                bounty = bounty + deposito;
                System.out.println("Monto actual disponible: " + bounty);
            }

            case 4 -> {
                System.exit(1);
            }
        }
    }
}
