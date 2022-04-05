package com.spring.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm{
    public int[] sort(int[] numbers) {
        //logic for bubble sort
        return numbers;
    }
}
