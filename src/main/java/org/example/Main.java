package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        inventoryManager.runMenu();
    }
}

class InventoryManager {
    private Scanner scanner;

    public InventoryManager() {
        scanner = new Scanner(System.in);
    }

    private void handleUserChoice(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Agregando producto...");
                break;
            case 2:
                System.out.println("Eliminando producto...");
                break;
            case 3:
                System.out.println("Actualizando producto...");
                break;
            case 4:
                System.out.println("Viendo todos los productos...");
                break;
            case 5:
                System.out.println("Viendo productos por categorías...");
                break;
            case 6:
                System.out.println("Viendo productos por etiquetas...");
                break;
            case 7:
                System.out.println("Ordenando productos...");
                break;
            case 8:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida. Por favor intenta de nuevo.");
                break;
        }
    }

    private void displayMenu() {
        System.out.println(
                """
                        |o|                         /////////////\\\\\\
                        |o|                        (((((((((((((   \\\\\\
                        |o|                        ))) ~~      ~~   (((
                        |o|                        ((( (*)     (*)  )))
                        |o|                        )))     <        (((\s
                        |o|                        ((( '\\______/`   )))\s
                        |o|                        )))\\___________/(((\s
                        |o|                        (((   _)  (_    )))\s\s
                        |o|                              /\\__/\\""");
        System.out.println("±----------------------------------------±");
        System.out.println("|   Administrador Mi Tienda de Barrio    |");
        System.out.println("±----------------------------------------±");
        System.out.println("1. Agregar producto                      |");
        System.out.println("2. Eliminar producto                     |");
        System.out.println("3. Actualizar producto                   |");
        System.out.println("4. Ver todos los productos               |");
        System.out.println("5. Buscar productos por categorías       |");
        System.out.println("6. Buscar productos por etiquetas        |");
        System.out.println("7. Ordenar productos                     |");
        System.out.println("8. Salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 5)  ");
    }

    public void runMenu() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleUserChoice(choice);
        } while (choice != 8);
    }
}


//public class Main {
//    public static void main(String[] args) {
//        String productName = "Leche Entera Alpina";
//        float productPrice = 3100.00f;
//        String productDescription = "Bolsa x 1.100 ml";
//        String productCategory = "Lacteo/Huevos y refrigerados";
//        String productTag = "Leches";
//        String productImg = "https://www.eurosupermercados.com/eurosupermercado2020//contenidos/images/ecommerce_productos/7702001041404.jpg";
//
//        System.out.println("productName: " + productName);
//        System.out.println("productPrice: " + productPrice);
//        System.out.println("productDescription: " + productDescription);
//        System.out.println("productCategory: " + productCategory);
//        System.out.println("productTag: " + productTag);
//        System.out.println("productImg: " + productImg);
//    }
//}