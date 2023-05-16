/*
 Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:

 */
package Servicios;

import java.util.Arrays;

/**
 *
 * @author MiriamNahuel
 */
public class ArregloService {
    
    /*
    1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
    números aleatorios.
    */
public void inicializarA(double[] arreglo) {
    for (int i = 0; i < arreglo.length; i++) {
        arreglo[i] = Math.random() * 10;
    }
}


    /*
    2) Método mostrar recibe un arreglo por parámetro y lo muestra por
    pantalla.
    */
   public void mostrar(double[] arreglo){
    for (int i = 0; i < arreglo.length; i++) {
        if (i != 0) {
            System.out.print(", ");
        }
        System.out.print(arreglo[i]);
    }
    System.out.println();  // Para un salto de línea después de imprimir todo el arreglo
}

    /*
    3) Método ordenar recibe un arreglo por parámetro y lo ordena de
    mayor a menor.
    */
    
    public void ordenar(double[] arreglo) {
    Arrays.sort(arreglo); // ordena en forma ascendente

    // invierte el arreglo para tenerlo en orden descendente
    for(int i = 0; i < arreglo.length / 2; i++) {
        double temporal = arreglo[i];
        arreglo[i] = arreglo[arreglo.length - i - 1];
        arreglo[arreglo.length - i - 1] = temporal;
    }
}

    
    /*4) Método inicializarB copia los primeros 10 números del arreglo A en el
    arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
    En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
    mostrar A y B.
    */
    
   public void inicializarB(double[] A, double[] B) {
    for (int i = 0; i < 10; i++) {
        B[i] = A[i]; //agarra lo que esta en A y lo pone en lo que esta en B
    }
    Arrays.fill(B, B.length-10, B.length, 0.5);
}

//----------------------------------------------------------------------------------------------------    
}
