package Pilares_POO;

public class Polimorfismo extends Abstraccion {
    public String name;
    public int valor_venta;
    public double kilometraje;

    public Polimorfismo(String tipo_vehiculo, String modelo, int year, String placa, int cilindraje, int price,
                    String name, int valor_venta, double kilometraje) {
        super(tipo_vehiculo, modelo, year, placa, cilindraje, price);
        this.name = name;
        this.valor_venta = valor_venta;
        this.kilometraje = kilometraje;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValor_venta() {
        return valor_venta;
    }

    public void setValor_venta(int valor_venta) {
        this.valor_venta = valor_venta;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void imprimir_Datos(){
        System.out.println("El tipo de vehiculo es: "+getTipo_vehiculo());
        System.out.println("Su modelo es: " + getModelo());
        System.out.println("Su añp de salida es: "+ getYear());
        System.out.println("Su placa es: "+ getPlaca());
        System.out.println("El cilindraje que posee es: "+ getCilindraje());
        System.out.println("Su precio final es: $"+ getPrice());
        System.out.println("El nombre del dueño es: " + this.name);
        System.out.println("El valor de venta es de: $" + this.valor_venta);
        System.out.println("El kilometraje recorrido es: " + this.kilometraje);
    }

}

