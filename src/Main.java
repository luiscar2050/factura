package edu.misena.factura.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andrés");

        Factura factura = new Factura(1, "Factura Ejemplo", new Date(), cliente);

        Scanner s = new Scanner(System.in);
        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
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
