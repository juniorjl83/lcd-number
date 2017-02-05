package com.psl;

public class Utility {

  public boolean validarSalida(String input) {

    if ( "0,0".equals(input) ){
      return true;
    }
    return false;
  }

  public boolean validarInput(String[] temp) {
    try{
      if ( temp.length == 2 ){
        Integer.valueOf(temp[0]);
        Integer.valueOf(temp[1]);
        return true;
      }else{
        return false;
      }
    }catch (NumberFormatException e){
      return false;
    }
  }

  public boolean validarValorSize(String value) {
    int intValue = Integer.valueOf(value);
    
    if( intValue< 11 && intValue > 0){
      return true;
    }
    return false;
  }
  
  public int[] returnArrayNumbers (String numbers){
    
    int[] num = new int[numbers.length()];
    for (int i = 0; i < numbers.length(); i++)
    {
        num[i] = numbers.charAt(i) - '0';
    }
    return num;
  }
  
  public boolean contains(int[] arr, int key)
  {
      for(int i = 0 ; i < arr.length ; i++)
      {
          if(key == arr[i])
          {
              return true;
          }
      }
      return false;
  }

  public boolean validarDigitos(String digitos) {
    if (digitos.length() > 8){
      return false;
    }else{
      return true;
    }
      
  }
}
