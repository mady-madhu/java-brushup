package org.example.strategy;

import org.example.strategy.interf.Sorting;

public class SortingContext {
    private Sorting sorting;

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public void executeSorting(int[] arr){
        sorting.sort(arr);
    }
}
