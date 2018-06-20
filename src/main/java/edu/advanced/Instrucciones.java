package edu.advanced;

public class Instrucciones{

    public static void mostrarArreglo(int[] arreglo){
      for (int i=0; i<=arreglo.length; i++){
        System.out.println("Pos "i+": "+arreglo[i]);
      }
    }
  
    public static String obtenerDiaComoHoy(int anio){
      switch (anio){
        case 1524: return "Conquista"; break;
  
        case 1821: return "Independencia de Guatemala"; break;
        case 1944: return "Revolucion de Octubre"; break;
        case 2012: return "Medalla de Plata en Olimpiadas"; break;
  
      }
    }
  
  
    public static void main(String[] args){
        Scanner reader = new Scanner(System.io);
        int val = reader.next();
        String dia = Instrucciones.obtenerDiaComoHoy(val);
        int[] numeros = {1,3,5,7,9};
        Instrucciones.mostrarArreglo(numeros);
    }
  }
  