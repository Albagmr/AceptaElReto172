/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aer172;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class AER172 {

    /**
     * @param args the command line arguments
     */
    /*
    Acepta el reto 172:
    -La entrada contiene distintos casos de prueba. 
    -Cada uno de ellos contiene, en una línea, la descripción de la configuración (válida) de una mesa. 
    -La línea comienza con un número positivo que indica el número de asientos (como mucho 1000 sillas). 
    -Tras un espacio, aparece un carácter por cada una de las sillas que hay en la mesa. 
   - El carácter I indica que en esa silla el comensal ha empezado la barrita de su izquierda; 
    una D indica que ha comido de la barrita de la derecha. Por último un . indica que en esa silla aún no se ha sentado nadie 
    (o que, quién lo ha hecho, aún no ha probado el pan). Los invitados a la boda son personas decentes y no se roban el pan los unos a los otros, por lo que si un comensal ya ha empezado una barrita, la persona de al lado no la probará.
    -Ten en cuenta que la mesa es circular, por lo tanto se considera que el último carácter tiene a su derecha el primero.
    -El último caso de prueba, que no deberá ser procesado, contiene una mesa sin sillas.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        numero = sc.nextInt();// pedimos el numero de las veces que vamos a meter datos
        while (numero != 0) {
            /**
             * Insertamos un bucle con las veces que le vamos a introducir todos
             * los datos.
             */
             boolean I= false;
             boolean D= false; //lo inicializamos en false por que al principio no hay nadie en las sillas (hay un punto)
            for (int a = 0; numero < a; a++) {
                String personas = sc.nextLine();//pedimos el numero de personas
                for (int b=0;b< personas.length();b++){
                   if (personas.charAt(b)=='I'){// utilizamos el charAt para la posicion en la que coge el pan; si lo coge por la izquierda es true
                       I=true;
                   }
                   else if (personas.charAt(b)=='D'){
                       D=true;
                   }
                   
                }
            }
            if (I&&D){
                System.out.println("Alguno no come");
            }
            else {
                System.out.println("Todos comen");
            }
        }
    }

}
