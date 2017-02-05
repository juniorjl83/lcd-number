package com.psl;

import org.apache.commons.lang3.StringUtils;

public class Printer {

  // identifico 7 segmentos
  //  -----------
  //  |    a    |
  //  |f       b|
  //  |         |
  //  -----------
  //  |    g    |
  //  |e       c|
  //  |    d    |
  //  -----------

  private int[] a = {0, 2, 3, 5, 6, 7, 8, 9};
  private int[] b = {0, 2, 3, 4, 7, 8, 9};
  private int[] c = {0, 3, 4, 5, 6, 7, 8, 9};
  private int[] d = {0, 2, 3, 5, 6, 8, 9};
  private int[] e = {0, 1, 2, 6, 8};
  private int[] f = {0, 1, 4, 5, 6, 8, 9};
  private int[] g = {2, 3, 4, 5, 6, 8, 9};
  private String horChar = "-";
  private String blankChar = " ";
  private Utility utility = new Utility();
  private String verChar = "|";

  public String returnSegmentHorizontal(int[] numbers, int size, String id) {
    StringBuilder sb = new StringBuilder("");
    int[] seg; 
    if ( "a".equals(id) ){
      seg = a;
    }else if ("g".equals(id)){
      seg = g;
    }else{
      seg = d;
    }

    for (int i = 0; i < numbers.length; i++) {
      if (utility.contains(seg, numbers[i])) {
        sb.append(" ");
        sb.append(StringUtils.repeat(horChar, size));
        sb.append(" ");
      } else {
        sb.append(StringUtils.repeat(blankChar, size + 2));
      }
      sb.append(" ");
    }
    return sb.toString();
  }

  public String returnSegmentVertical(int[] numbers, int size, String id) {
    StringBuilder sb = new StringBuilder("");
    int[] seg1; 
    int[] seg2; 
    if ( "fb".equals(id) ){
      seg1 = f;
      seg2 = b;
    }else{
      seg1 = e;
      seg2 = c;
    }
    
    for (int j = 0; j < 2; j++) {
      for (int i = 0; i < numbers.length; i++) {
        if (utility.contains(seg1, numbers[i]) && utility.contains(seg2, numbers[i])){
          sb.append(verChar);
          sb.append(StringUtils.repeat(blankChar, size));
          sb.append(verChar);
        }else if (utility.contains(seg1, numbers[i])){
          sb.append(verChar);
          sb.append(StringUtils.repeat(blankChar, size + 1));
        }else if (utility.contains(seg2, numbers[i])){
          sb.append(StringUtils.repeat(blankChar, size + 1));
          sb.append(verChar);
        }else{
          sb.append(StringUtils.repeat(blankChar, size + 2));
        }
        sb.append(" ");
      }
      if ( j == 0 ){
        sb.append("\n");
      }
    }
    return sb.toString();
  }
}
