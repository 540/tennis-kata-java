package com.tenniskata;

public class ExampleTennisGame {
    
    public static void main(String[] args) {
        System.out.println("=== Tennis Game Example ===\n");
        
        // Ejemplo 1: Juego básico
        System.out.println("--- Ejemplo 1: Juego básico ---");
        TennisGame1 game1 = new TennisGame1("Alice", "Bob");
        System.out.println("Inicio: " + game1.getScore());
        
        game1.wonPoint("Alice");
        System.out.println("Alice gana un punto: " + game1.getScore());
        
        game1.wonPoint("Bob");
        System.out.println("Bob gana un punto: " + game1.getScore());
        
        game1.wonPoint("Alice");
        System.out.println("Alice gana otro punto: " + game1.getScore());
        
        game1.wonPoint("Alice");
        System.out.println("Alice gana otro punto: " + game1.getScore());
        
        game1.wonPoint("Alice");
        System.out.println("Alice gana otro punto: " + game1.getScore());
        
        // Ejemplo 2: Deuce y Advantage
        System.out.println("\n--- Ejemplo 2: Deuce y Advantage ---");
        TennisGame1 game2 = new TennisGame1("Maria", "Juan");
        
        // Llegar a 40-40 (Deuce)
        game2.wonPoint("Maria");
        game2.wonPoint("Maria");
        game2.wonPoint("Maria");
        game2.wonPoint("Juan");
        game2.wonPoint("Juan");
        game2.wonPoint("Juan");
        System.out.println("40-40: " + game2.getScore());
        
        game2.wonPoint("Maria");
        System.out.println("Maria gana un punto (Advantage): " + game2.getScore());
        
        game2.wonPoint("Juan");
        System.out.println("Juan empata (Deuce de nuevo): " + game2.getScore());
        
        game2.wonPoint("Juan");
        System.out.println("Juan gana un punto (Advantage): " + game2.getScore());
        
        game2.wonPoint("Juan");
        System.out.println("Juan gana el juego: " + game2.getScore());
        
        // Ejemplo 3: Victoria rápida
        System.out.println("\n--- Ejemplo 3: Victoria rápida ---");
        TennisGame1 game3 = new TennisGame1("Carlos", "Ana");
        
        game3.wonPoint("Carlos");
        System.out.println("15-0: " + game3.getScore());
        
        game3.wonPoint("Carlos");
        System.out.println("30-0: " + game3.getScore());
        
        game3.wonPoint("Carlos");
        System.out.println("40-0: " + game3.getScore());
        
        game3.wonPoint("Carlos");
        System.out.println("Victoria de Carlos: " + game3.getScore());
        
        System.out.println("\n=== Fin de los ejemplos ===");
    }
}

