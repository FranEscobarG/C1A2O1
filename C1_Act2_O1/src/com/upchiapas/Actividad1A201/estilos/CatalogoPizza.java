package com.upchiapas.Actividad1A201.estilos;

import java.util.LinkedList;

public class CatalogoPizza {
    Pizza pizza1 = new Pizza("Pepperoni",180);
    Pizza pizza2 = new Pizza("Cuatro Quesos",200);
    Pizza pizza3 = new Pizza("Champiñones",150);
    Pizza[] pizzas = {pizza1,pizza2,pizza3};


public CatalogoPizza(){

    }

    public Pizza EnviarPizza(byte i){
        return pizzas[i];
    }
}
