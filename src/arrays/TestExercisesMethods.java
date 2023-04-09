package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestExercisesMethods {

	public static void main(String[] args) {
		int[] numbers = { 1, 3, 4, 8, 9 };
		RemoveElementsExercisesMethods.removeElement(numbers, 3);
		System.out.println();
		
		int[] numbers1 = {1, 1, 1, 2, 5, 6, 6, 8};
		RemoveElementsExercisesMethods.removeAllDuplicatesElements(numbers1);
		System.out.println();

		List<Integer> numbers2 = new ArrayList<>(Arrays.asList(8, 10, 44, 66));
		RemoveElementsExercisesMethods.removeElementList(numbers2, 3);
	}
}
