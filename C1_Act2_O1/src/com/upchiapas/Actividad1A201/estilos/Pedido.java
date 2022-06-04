package com.upchiapas.Actividad1A201.estilos;

public class Pedido {
    Cliente cliente;
    CatalogoPizza pizas = new CatalogoPizza();
    byte opcion;
    Pizza pizza1;

    public Pedido(Cliente cliente, byte opcion) {
        this.cliente = cliente;
        this.opcion = opcion;
    }

    public Pizza EnviarPizza(){
        Pizza pizza1 = pizas.EnviarPizza((byte) ((byte)opcion));
        return pizza1;
    }
    public Cliente getCliente(){
        return cliente;
    }
}
