package duplicateZero;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] input = {1,0,2,3,0,4,5,0};
		
		System.out.println("Input: " + Arrays.toString(input));
		
		DuplicateAllZeroesRightOneFunction solution = new DuplicateAllZeroesRightOneFunction();
		
		solution.duplicateZeros(input);
		
		System.out.println("Solution: " + Arrays.toString(input));
	}
}
