package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SquareArray {

	// centrale locatie size
	private int size;
	public int[][] array2d;
	private List<Integer> solutions = new ArrayList<>(1_000_000_000);
	private int numberOfSolutions;

	public SquareArray(int size) {
		this.size = size;
		array2d = new int[size][size];
		initializeArray2d();
	}

	// methode uit StackOverflow
	public void permutingArray(List<Integer> arrayList, int element) {
		for (int i = element; i < arrayList.size(); i++) {
			java.util.Collections.swap(arrayList, i, element);
			permutingArray(arrayList, element + 1);
			java.util.Collections.swap(arrayList, element, i);
		}
		if (element == arrayList.size() - 1) {
			addSolution(arrayList);
			System.out.println("Solution List Size: " + numberOfSolutions);
		}
	}

	// voegt som toe aan solution list
	private void addSolution(List<Integer> list) {
		int solution = 0;

		for (int i = 0; i < list.size(); i++) {
			int j = list.get(i);
			int value = array2d[i][j];
			solution += value;
		}

		solutions.add(solution);
		manageNumberOfSolutions();
	}

	public int findLargestSolution() {
		return Collections.max(solutions);
	}

	// als list > 1 miljard: bereken grootste, lijst leegmaken, grootste in
	// lijst plaatsen en verder rekenen
	private void manageNumberOfSolutions() {
		if (numberOfSolutions >= 1_000_000_000) {

			numberOfSolutions = 0;
			int maxValue = findLargestSolution();
			solutions.clear();
			solutions.add(maxValue);

		} else {
			numberOfSolutions++;
		}
	}

	// geeft lijst terug waar waarden gelijk zijn aan hun index
	public List<Integer> getFilledList() {
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < size; i++) {
			list.add(i);
		}

		return list;
	}

	// voorbeeldoplossing met array size = 5
	// onderaan geplaatst want onbelangrijk in programma zelf
	private void initializeArray2d() {
		if (size == 5) {
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
}
