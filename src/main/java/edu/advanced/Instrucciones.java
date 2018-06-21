package edu.advanced;

import java.util.Scanner;

public class Instrucciones {

    public static void mostrarArreglo(int[] arreglo) {
      for (int i=0; i < arreglo.length; i++){
        System.out.println("Pos " + i + ": " + arreglo[i]);
      }
    }
  
    public static String obtenerEvento(int anio) {
      String s = "";
      switch (anio){
        case 1524: 
          s = "Conquista"; 
          break;  
        case 1821: 
          s = "Independencia de Guatemala"; 
          break;
        case 1944: 
          s = "Revolucion de Octubre"; 
          break;
        case 2012: 
          s = "Medalla de Plata en Olimpiadas"; 
          break;  
      }
      return s;
    }
  
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Ingrese año: ");
        int anio = reader.nextInt();
        String mensaje = Instrucciones.obtenerEvento(anio);
        System.out.println(mensaje);

        int[] numeros = {1,3,5,7,9};
        Instrucciones.mostrarArreglo(numeros);
        reader.close();
    }

  }
  