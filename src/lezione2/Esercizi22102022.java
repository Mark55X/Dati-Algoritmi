package lezione2;

public class Esercizi22102022 {
	public static void main(String[] args) {

		// n = 5, range da 0 a n-1: da 0 a 4.
		System.out.println(trovaNumeroMancante(new int[] { 0, 2, 1, 4 }));
		System.out.println(generaNumeroIntero(new int[] { 0, 2, 1, 4 }));
		
		// Numero di uno = 11
		int[][] matrix = {new int[] {1,1,1,1,0},
						  new int[] {1,1,1,1,0},
						  new int[] {1,1,1,0,0},
						  new int[] {1,0,0,0,0},
						  new int[] {0,0,0,0,0},
//						  new int[] {1,1,1,0,0}
						  };

		System.out.println(find1Matrix(matrix));
	}

	public static int trovaNumeroMancante(int[] array) {
		if(array == null && array.length == 0) throw new IllegalArgumentException();	
		 
		int sum = 0;
		int sumOfArray = 0;
		for(int i= 0; i < array.length; i++) {
			sum += i;
			sumOfArray += array[i];
		}
		
		sum += array.length;
		return sum - sumOfArray;
	}
	
	public static int generaNumeroIntero(int[] array) {
		if(array == null && array.length == 0) throw new IllegalArgumentException();	
		int sum = 0;
		for(int i= 0; i < array.length; i++) {
			sum += Math.abs(array[i]);
		}
		
		return sum * 2;
	}
	
	public static int find1Matrix(int[][] matrix) {		
		if(matrix[0].length == 0) return 0;
		int sum = 0;
		for(int i = 0, j = matrix.length - 1 ; i < matrix.length && j >= 0 ; ) {
			if(matrix[i][j] == 0) {
				j--;
			}
			else {
				sum += (j + 1);
				i++;
			}
		}
		return sum;
	}
	
}
