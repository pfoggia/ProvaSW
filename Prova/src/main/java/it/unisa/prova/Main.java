/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.unisa.prova;

/**
 *
 * @author foggia
 */
public class Main {
    public static void main(String args[]) {
        salute("Fisciano");
        salute("world");
        salute("universe");
    }
    
    private static void salute(String name) {
        System.out.println("Hello, "+name);
    }
}
