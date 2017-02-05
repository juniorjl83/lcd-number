package com.psl;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UtilityTest 
{
    private Utility utility;
    
    @Before
    public void init() {
      utility = new Utility();
    }
    
    @Test
    public void testValidarSalida(){
      String input = "0,0";
      assertTrue(utility.validarSalida(input));
    }
    
    @Test
    public void testValidarInput(){
      String[] temp = {"1","256"};
      assertTrue(utility.validarInput(temp));
    }
    
    @Test
    public void testValidarInputNotInteger(){
      String[] temp = {"1","A"};
      assertFalse(utility.validarInput(temp));
      String[] temp1 = {"A","123"};
      assertFalse(utility.validarInput(temp1));
      String[] temp2 = {"A","A"};
      assertFalse(utility.validarInput(temp2));
    }
    
    @Test
    public void testValidarInputTamano(){
      String[] temp = {"1"};
      assertFalse(utility.validarInput(temp));
    }
    
    @Test
    public void testValidarSize(){
      String value = "8";
      assertTrue(utility.validarValorSize(value));
    }
    
    @Test
    public void testValidarSizeError(){
      String value = "-1";
      assertFalse(utility.validarValorSize(value));
      
      value = "11";
      assertFalse(utility.validarValorSize(value));
    }
    
    @Test
    public void testvalidarDigitos(){
      String value = "123456789";
      assertFalse(utility.validarDigitos(value));
      
      value = "11235";
      assertTrue(utility.validarDigitos(value));
    }
    
    @Test
    public void testReturnArrayNumbers(){
      String stringNumbers = "340";
      int[] numbers = utility.returnArrayNumbers(stringNumbers);
      assertTrue(3 == numbers[0]);
      assertTrue(4 == numbers[1]);
      assertTrue(0 == numbers[2]);
    }
    
    @Test
    public void testContains(){
      int[] arr = {0,  2,3,  5,6,7,8,9};
      int key = 5;
      assertTrue(utility.contains(arr, key));
    }
    
    @Test
    public void testNotContains(){
      int[] arr = {0,  2,3,  5,6,7,8,9};
      int key = 1;
      assertFalse(utility.contains(arr, key));
    }
}
