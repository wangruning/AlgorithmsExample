package com.example.algorthms.classic.sort.quick;

import com.example.algorthms.classic.sort.simple.QuickSort;
import com.example.algorthms.util.Printer;
import org.junit.Test;

public class QuickSortTest {

  @Test
  public void sort() {
    int[] array = {
        52, 48, 13, 57, 94, 25, 85, 4, 52, 45, 245, 184, 264, 215
    };
    QuickSort.sort(array);
    Printer.Array.print(array);
  }
}