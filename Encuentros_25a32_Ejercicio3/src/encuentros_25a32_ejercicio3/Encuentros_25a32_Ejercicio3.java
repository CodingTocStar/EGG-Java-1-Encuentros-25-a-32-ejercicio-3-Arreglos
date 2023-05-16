/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.arreglo por parámetro y lo ordena de mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */
package encuentros_25a32_ejercicio3;

import Servicios.ArregloService;

/*
        RESUMEN

¿Que hice?

No es necesaria la clase de entidades.
En servicios creo los metodos que voy a usar.
    Los metodos reciben un argumento que va a ser un array, no importa su dimension.

Traigo al main la clase de servicios con la que voy a llamar a mis metodos.

En el main creo las variables arreglos con sus nombres que son los que voy a pasar por parametros.

 */
public class Encuentros_25a32_Ejercicio3 {

    /*
     En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
    mostrar A y B.
     */
    public static void main(String[] args) {
        ArregloService nuevoArreglo = new ArregloService();
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        //1) Inicializo A
         nuevoArreglo.inicializarA(arregloA);
         
         
        //2) Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
        System.out.println("El arreglo A es:");
        nuevoArreglo.mostrar(arregloA);

        
        //3) Método mostrar recibe un arreglo por parámetro y lo muestra por
        //pantalla.arreglo por parámetro y lo ordena de mayor a menor.
        nuevoArreglo.ordenar(arregloA);
        System.out.println("El arreglo A ordenado de mayor a menor");
        nuevoArreglo.mostrar(arregloA);
        
        
        
        //4) Método inicializarB copia los primeros 10 números del arreglo A en el
        //arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
        nuevoArreglo.inicializarB(arregloA, arregloB);
        
        
        //En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
        //mostrar A y B.
        System.out.println("Mostrando A");
        nuevoArreglo.mostrar(arregloA);
        System.out.println("Mostrando B");
        nuevoArreglo.mostrar(arregloB);
        
        
    }
}
