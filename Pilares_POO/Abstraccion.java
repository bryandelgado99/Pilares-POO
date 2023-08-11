package Pilares_POO;

public class Abstraccion {
    //Para la abstraccion vamos a emplear un modelo de vehiculos
    //Atributos
    private String tipo_vehiculo;
    private String modelo;
    private int year;
    private String placa;
    private int cilindraje;
    private int price;

    //Constructor
    public Abstraccion(String tipo_vehiculo, String modelo, int year, String placa, int cilindraje, int price) {
        this.tipo_vehiculo = tipo_vehiculo;
        this.modelo = modelo;
        this.year = year;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.price = price;
    }

    //Metodos

    public String getTipo_vehiculo() {
        return tipo_vehiculo;
    }

    public void setTipo_vehiculo(String tipo_vehiculo) {
        this.tipo_vehiculo = tipo_vehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Imprimir_datos(){
        System.out.println("El tipo de vehiculo es: "+this.tipo_vehiculo);
        System.out.println("Su modelo es: " + this.modelo);
        System.out.println("Su añp de salida es: "+this.year);
        System.out.println("Su placa es: "+this.placa);
        System.out.println("El cilindraje que posee es: "+this.cilindraje);
        System.out.println("Su precio final es: $"+this.price);
    }
}
