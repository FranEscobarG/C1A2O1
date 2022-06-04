 package com.upchiapas.Actividad1A201;
import com.upchiapas.Actividad1A201.estilos.Pedido;
import com.upchiapas.Actividad1A201.estilos.Pizza;
import com.upchiapas.Actividad1A201.estilos.Tienda;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("PIZZERIA YO SOY CHIAPAS");
            System.out.println("Elija una Opcion: ");
            System.out.println("1. Ordenar");
            System.out.println("2. Salir del Programa");
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    Ordenar();
                    break;
                case 2:
                    System.out.println("Saliendo del Programa...");
                    break;
                default:
                    System.out.println("Error al Teclear, Prueba de Nuevo");
                    System.out.println("*********************************");
            }
        }while (opcion !=2);

    }
    public static void Ordenar(){
        String nombre;
        byte opcion;
        Pedido pedido1;
        Pizza pizza1;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el Nombre al que se hara el Pedido");
        nombre = teclado.nextLine();
        System.out.println("1)Pepperoni");
        System.out.println("2)Cuatro Quesos");
        System.out.println("3)Champiñones");
        opcion = teclado.nextByte();
        Tienda tienda = new Tienda((byte) (opcion-1),nombre);

        pedido1 = tienda.EnviarPedido();
        pizza1 = pedido1.EnviarPizza();
        System.out.println("******************************");
        System.out.println("------- ORDEN DE PEDIDO ------");
        System.out.println("Cliente: " + pedido1.getCliente().getNombrecliente());
        System.out.println("Precio: " + pizza1.getPrecio());
        System.out.println("Tipo de Pizza: " + pizza1.getNombre());
        System.out.println("******************************");
    }
    }
