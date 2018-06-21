package edu.advanced;

public class DebugTest {

    public static void main(String[] args) {
        int number = 0;
        System.out.println("Hola mundo");
        String numeroTexto = "101";
        number = Integer.parseInt(numeroTexto);
        System.out.println("Number: " + number);

        int total = 0;
        for (int i =0; i < 1000; i++) {
            total += i;
            System.out.println(i);
            System.out.println("Total: " + total);
        }
    }
}
