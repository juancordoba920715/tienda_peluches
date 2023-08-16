package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado=new Scanner(System.in);
        Integer opcion;
        String nombrePeluche="";
        Double precioUnitario=0.0;
        Double iva=0.19;
        Integer ingreso=0;
        Double precioMasIva=0.0;



        do {
            System.out.println("Bienvenido a la tienda LOS SENTIMIENTOS");
            System.out.println("Estas son las opciones:");

            System.out.println("1. Desea Ingresar el nombre del peluche?");
            System.out.println("2. Desea Ingresar el valor unitario? ");
            System.out.println("3. Ver precio con iva");
            System.out.println("4. Mostrar descripcion de venta del producto");
            System.out.println("5. Editar valor unitario");
            System.out.println("6. SALIR");
            System.out.print("que opcion deseas:");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    nombrePeluche = teclado.nextLine();
                    break;
                case 2,5:
                    System.out.println("Ingrese el valor unitario");
                    precioUnitario = teclado.nextDouble();
                    break;
                case 3:
                    precioMasIva = precioUnitario + precioUnitario * iva;
                    System.out.println("El precio con iva es: "+precioMasIva);

                    break;
                case 4:
                    System.out.println("El nombre del peluche es: "+nombrePeluche);
                    System.out.println("El precio unitario es: "+precioUnitario);
                    System.out.println("El precio con iva es: "+precioMasIva);
                    break;
                case 6:

                   break;
            }

        }while (opcion!=6);
    }
}