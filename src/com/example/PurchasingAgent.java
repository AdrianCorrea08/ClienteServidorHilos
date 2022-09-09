/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example;

/**
 *
 * @author ingenierodesarrollo3
 */
//clase PurchasingAgent
public class PurchasingAgent {
    
    //método purchase
    public void purchase(){
        //instanciamos el store
        Store store = Store.getInstance();
        
        if (store.getShirtCount() > 0 && store.authorizeCreditCard("1234", 15.00)) {
            Shirt shirt = store.takeShirt(); 
            System.out.println("The shirt is ours!"); 
            System.out.println(shirt);
        } else {
            System.out.println("No shirt for you");
        }
    }
    
    //Creacion del metodo
    public PurchasingAgent() { 
        System.out.println("Creating a purchasing agent");
        Thread t = Thread.currentThread();
        System.out.println("Thread:" + t.getName() + "," + t.getId());
    } // cierre del metodo

} // cierre de la clase