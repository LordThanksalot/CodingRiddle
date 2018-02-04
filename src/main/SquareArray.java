package main;

import java.util.Arrays;

public class SquareArray {
	
	//centrale locatie size
	private int size = 5;
	private int[][] array2d = new int[size][size];
	private int[] solutions = new int[Integer.MAX_VALUE];
	private int numberOfSolutions;
	
	//methode uit StackOverflow
	public void permutingArray(java.util.List<Integer> arrayList, int element) {
		for (int i = element; i < arrayList.size(); i++) {
			java.util.Collections.swap(arrayList, i, element);
			permutingArray(arrayList, element + 1);
			java.util.Collections.swap(arrayList, element, i);
		}
		if (element == arrayList.size() - 1) {
			System.out.println(Arrays.toString(arrayList.toArray()));
		}
	}
}
