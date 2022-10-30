package EserciziRandom;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find(new int[]{1,3,5,7,8,9}, 7));
	}
	
	public static boolean find(int[] array, int value) {
		int lowIndex = 0, highIndex = array.length-1;
		
		while(lowIndex != highIndex) {	
			int midIndex = (lowIndex + highIndex)/2;
			
			if(array[midIndex] == value)
				return true;
			else if(array[midIndex] > value) {
				highIndex = midIndex;
			}
			else {
				lowIndex = midIndex + 1;
			}
		}
		
		return false;
	}

}
