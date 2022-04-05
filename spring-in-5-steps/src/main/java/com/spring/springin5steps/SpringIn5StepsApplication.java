package com.spring.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		//what are the beans?
		//what are dependencies of a bean?
		// where to search for beans?

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//application context
		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12, 4, 6}, 3);
		//com.spring.springin5steps.BubbleSortAlgorithm@1c20c684
		//com.spring.springin5steps.QuickSortAlgorithm@1c20c684
		System.out.println(result);
		//com.spring.springin5steps.BubbleSortAlgorithm@305f031
		//3

	}

}
