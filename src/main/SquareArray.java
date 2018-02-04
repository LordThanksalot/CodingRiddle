package main;

import java.util.Arrays;
import java.util.List;

public class SquareArray {

	// centrale locatie size
	private int size = 5;
	private int[][] array2d = new int[size][size];
	private int solutionSize = findNumberOfSolutions();
	private int[] solutions = new int[solutionSize];
	private int numberOfSolutions;

	// methode uit StackOverflow
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

	// 2 methodes verkregen uit StackOverflow en aangepast
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

	// voorbeeldoplossing met array size = 5
	{
		array2d[0][0] = 7;
		array2d[0][1] = 53;
		array2d[0][2] = 183;
		array2d[0][3] = 439;
		array2d[0][4] = 863;
		array2d[1][0] = 497;
		array2d[1][1] = 383;
		array2d[1][2] = 563;
		array2d[1][3] = 79;
		array2d[1][4] = 973;
		array2d[2][0] = 287;
		array2d[2][1] = 63;
		array2d[2][2] = 343;
		array2d[2][3] = 169;
		array2d[2][4] = 583;
		array2d[3][0] = 627;
		array2d[3][1] = 343;
		array2d[3][2] = 773;
		array2d[3][3] = 959;
		array2d[3][4] = 943;
		array2d[4][0] = 767;
		array2d[4][1] = 473;
		array2d[4][2] = 103;
		array2d[4][3] = 699;
		array2d[4][4] = 303;
	}
}
