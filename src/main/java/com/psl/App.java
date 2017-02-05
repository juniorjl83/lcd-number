package com.psl;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
      boolean exit = false;
      Scanner scanner = null;
      Utility utility = new Utility();
      Printer printer = new Printer();
      boolean process;
      scanner = new Scanner(System.in);
      
      while (!exit){
        process = true;
        String input = scanner.nextLine();
        if (utility.validarSalida(input)){
          System.out.println("Programa terminado.");
          System.exit(0);
        }
          
        String[] temp = input.split(",");
        
        if (!utility.validarInput(temp)){
          System.out.println("El formato de entrada debe ser 1n,*n o 0,0 para salir.");
          process = false;
        }else if (!utility.validarValorSize(temp[0])){
          System.out.println("El tamaño debe ser mayor a cero y menor que 11.");
          process = false;
        }else if (!utility.validarDigitos(temp[1])){
          System.out.println("La cantidad de dígitos a imprimir debe ser menor a 9.");
          process = false;
        }
        
        if (process){
          int[] numbers = utility.returnArrayNumbers(temp[1]);
          int size = Integer.valueOf(temp[0]);
          
          System.out.println(printer.returnSegmentHorizontal(numbers, size, "a"));
          System.out.println(printer.returnSegmentVertical(numbers, size, "fb"));
          System.out.println(printer.returnSegmentHorizontal(numbers, size, "g"));
          System.out.println(printer.returnSegmentVertical(numbers, size, "ec"));
          System.out.println(printer.returnSegmentHorizontal(numbers, size, "d"));
        }
      }
      
      if ( scanner != null ){
        scanner.close();
      }
    }
}

