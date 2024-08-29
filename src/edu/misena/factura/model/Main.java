package edu.misena.factura.model;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("777-7");
        cliente.setNombre("Luis");

        Factura factura = new Factura(1, "Factura Ejemplo", new Date(), cliente);

        Scanner s = new Scanner(System.in);
        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            double client;
            producto = new Producto("Portatil", 2);
            System.out.print("Ingrese nombre del producto nº " + (i + 1) + ": ");
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextDouble());

            System.out.print("Ingrese la cantidad: ");
            int cantidad = s.nextInt();
            factura.addItemFactura(new ItemFactura(producto, cantidad));

            System.out.println();
            s.nextLine();
        }

        System.out.println(factura);
    }
}