package main;

import java.util.Arrays;
import java.util.List;

public class SquareArray {
	
	//centrale locatie size
	private int size = 5;
	private int[][] array2d = new int[size][size];
	private int solutionSize = findNumberOfSolutions();
	private int[] solutions = new int[solutionSize];
	private int numberOfSolutions;
	
	//methode uit StackOverflow
	public void permutingArray(List<Integer> arrayList, int element) {
		for (int i = element; i < arrayList.size(); i++) {
			java.util.Collections.swap(arrayList, i, element);
			permutingArray(arrayList, element + 1);
			java.util.Collections.swap(arrayList, element, i);
		}
		if (element == arrayList.size() - 1) {
			System.out.println(Arrays.toString(arrayList.toArray()));
		}
	}
	
	//2 methodes verkregen uit StackOverflow en aangepast
	private int findNumberOfSolutions() {
		return getFact(size) / (getFact(0));
	}

	private int getFact(int n) {
		int f = 1;

		for (int i = n; i >= 1; i--) {
			f *= i;
		}

		return f;
	}
}
