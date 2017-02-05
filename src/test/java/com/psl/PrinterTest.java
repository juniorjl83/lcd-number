package com.psl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PrinterTest {

  private Printer printer = new Printer();
  
  @Before
  public void init() {
    printer = new Printer();
  }

  @Test
  public void testReturnSegmentA() {
    int[] numbers = {9,8,7};
    int size = 2;
    String stringAssert = " --   --   --  ";
    String valueReturned = printer.returnSegmentHorizontal(numbers, size, "a");
    assertTrue(stringAssert.equals(valueReturned));
    
    int[] numbers1 = {4,5,1};
    size = 3;
    //     --     
    stringAssert = "       ---        ";
    valueReturned = printer.returnSegmentHorizontal(numbers1, size, "a");
    assertTrue(stringAssert.equals(valueReturned));
  }
  
  @Test
  public void testReturnSegmentFB() {
    int[] numbers = {9,8,7};
    int size = 2;
    String stringAssert = "|  | |  |    | \n|  | |  |    | ";
    String valueReturned = printer.returnSegmentVertical(numbers, size, "fb");
    assertTrue(stringAssert.equals(valueReturned));
    
  }
  
  @Test
  public void testReturnSegmentG() {
    int[] numbers = {9,8,7};
    int size = 2;
    String stringAssert = " --   --       ";
    String valueReturned = printer.returnSegmentHorizontal(numbers, size, "g");
    assertTrue(stringAssert.equals(valueReturned));
    
  }
  
  @Test
  public void testReturnSegmentEC() {
    int[] numbers = {9,8,7};
    int size = 2;
    String stringAssert = "   | |  |    | \n   | |  |    | ";
    String valueReturned = printer.returnSegmentVertical(numbers, size, "ec");
    assertTrue(stringAssert.equals(valueReturned));
    
  }
  
  @Test
  public void testReturnSegmentD() {
    int[] numbers = {9,8,7};
    int size = 2;
    String stringAssert = " --   --       ";
    String valueReturned = printer.returnSegmentHorizontal(numbers, size, "d");
    assertTrue(stringAssert.equals(valueReturned));
    
  }

}
