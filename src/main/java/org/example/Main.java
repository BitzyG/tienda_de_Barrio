package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        ProductsArray productsArray = new ProductsArray(); // Instanciar la clase ProductsArray
        Scanner scanner = new Scanner(System.in);

        String[] productos = {
                "Leche Alpina Semi-Descremada",
                "Yogurt Alpina Fresa",
                "Yogo Yogo",
                "Papas Super Ricas Fritas Pollo",
                "Tajamiel Super Ricas Platano Maduro",
                "Papas Margarita De Todito Natural",
                "Choclitos Margarita",
                "Doritos Margarita",
                "Cheetos Boliquesos Margarita",
                "Papas Yupi Golpe Con Todo Ranchero",
                "Tosti Nacho Queso Yupi",
                "Tocinetas Fred Yupi",
                "Trocipollo Chefrito",
                "Palokitos Chefrito Limon",
                "Mortadela Rica",
                "Jamon Pietran",
                "Salchicha Ranchera",
                "Hamburguesa Colanta",
                "Queso Alpina Campesino",
                "Crema de Leche Alqueria"
        };

        int choice;
        do {
            inventoryManager.displayMenu(); // Mostrar el menú
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume el carácter de nueva línea

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
                    System.out.println("Viendo productos alfabéticamente...");
//                    productsArray.ordenarProductosAlfabeticamente(productos);
                    break;
                case 6:
                    System.out.println("Viendo productos por etiquetas...");
                    break;
                case 7:
                    System.out.print("Ingrese la letra para filtrar los productos: ");
                    char letra = scanner.next().charAt(0);
//                    String[] productos = {
//                            "Leche Alpina Semi-Descremada",
//                            "Yogurt Alpina Fresa",
//                            "Yogo Yogo",
//                            "Papas Super Ricas Fritas Pollo",
//                            "Tajamiel Super Ricas Platano Maduro",
//                            "Papas Margarita De Todito Natural",
//                            "Choclitos Margarita",
//                            "Doritos Margarita",
//                            "Cheetos Boliquesos Margarita",
//                            "Papas Yupi Golpe Con Todo Ranchero",
//                            "Tosti Nacho Queso Yupi",
//                            "Tocinetas Fred Yupi",
//                            "Trocipollo Chefrito",
//                            "Palokitos Chefrito Limon",
//                            "Mortadela Rica",
//                            "Jamon Pietran",
//                            "Salchicha Ranchera",
//                            "Hamburguesa Colanta",
//                            "Queso Alpina Campesino",
//                            "Crema de Leche Alqueria"
//                    };
                    productsArray.mostrarProductosQueEmpiezanCon(letra, productos); // Llamar al método mostrarProductosQueEmpiezanCon
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor intenta de nuevo.");
                    break;
            }
        } while (choice != 8);

        scanner.close();
    }
}

class InventoryManager {
    private Scanner scanner;

    public InventoryManager() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
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
        System.out.println("5. Mostrar productos alfabéticamente     |");
        System.out.println("6. Buscar productos por etiquetas        |");
        System.out.println("7. Mostrar productos por letra           |");
        System.out.println("8. Salir                                 |");
        System.out.println("±----------------------------------------±");
        System.out.print("   Ingresa tu opción:    (1 - 8)  ");
    }
}
