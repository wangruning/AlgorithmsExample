package com.example.algorthms.classic.sort.simple;

import com.example.algorthms.classic.sort.simple.SelectionSort;
import com.example.algorthms.util.Printer;
import org.junit.Test;

public class SelectionSortTest {

  @Test
  public void sort() {
    int[] array = {
        52, 48, 13, 57, 94, 25, 85, 4, 52, 45, 245, 184, 264, 215
    };
    SelectionSort.sort(array);
    Printer.Array.print(array);
  }
}