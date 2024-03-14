package org.example;

public class ProductsArray {
    public void mostrarProductosQueEmpiezanCon(char letra, String[] productos) {
        boolean productosEncontrados = false; // Variable para rastrear si se encontraron productos que comienzan con la letra especificada

        for (String producto : productos) {
            if (producto.toLowerCase().startsWith(String.valueOf(letra).toLowerCase())) {
                if (!productosEncontrados) {
                    System.out.println("Productos que empiezan con la letra '" + letra + "':");
                    productosEncontrados = true; // Se encontró al menos un producto que comienza con la letra
                }
                System.out.println(producto);
            }

        }

        if (!productosEncontrados) {
            System.out.println("No se encontraron productos que empiecen con '" + letra + "'");
        }
        System.out.println();
    }


}
