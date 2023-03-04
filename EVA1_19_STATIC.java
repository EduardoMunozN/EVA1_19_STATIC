/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva1_19_static;

/**
 *
 * @author eduar
 */
public class EVA1_19_STATIC{

    public static void main(String[] args) {
        //static = algo que podemos usar sin crear instancias de una clase
        //solo se crea una instancia de lo estático
        //solo hay una en todo el programa
        System.out.println("PI: "+Math.PI);
        System.out.println("Número Aleatorio: " +Math.random());
        Utilerias utileria = new Utilerias();
        utileria.Saludo();
        Utilerias.otroSaludo();
        Saludo2();//SI NO ES ESTÁTCIO, Y NO SE HA CREADO UN OBJETO, EL MÉTODO NO EXISTE
        
    }
    public void Saludo2(){
        System.out.println("HOLA");
    }
}
class Utilerias{
    //ESTE MÉTODO EXISTE HASTA QUE SE CREA UN OBJETO DE LA CLASE, SOLO SE USA A TRAVÉS DE UN OBJETO
    public void Saludo(){
        System.out.println("Hola!");
    }
    //otroSaludo (); este método existe en el momento que el programa inicia su ejecución
    //no necesita que se cree un objeto de la clase para poderlo utilizar
    //se usa a través de la clase
    public static void otroSaludo(){
        System.out.println("Otro saludo (static)");
    }
}
