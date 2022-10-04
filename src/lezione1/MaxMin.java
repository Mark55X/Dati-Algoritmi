package lezione1;

public class MaxMin {

	public static void main(String[] args) {
		int[] array = {4,8,1,4,20,5,9};
		if(array.length == 0) {
			System.out.print("Nessun elemento");
			return;
		}
		
				
		int maxsLength = array.length % 2 == 0 ? array.length / 2 : array.length + 1;
		int [] maxs = new int[maxsLength];
		int [] mins = new int[array.length / 2];
		int indexMax = 0, indexMin = 0;
		
		
		//ALGORIMTO DI (3n/2) - 2 confronti 
		
		// n/2 confronti
		for(int i = 0;i < array.length; i+=2) {
			if(array[i] > array[i+1]) {
				maxs[indexMax++] = array[i];
			}else {
				mins[indexMin++] = array[i + 1];
			}
		}
		
		// maxsLength -1 confronti
		int max = maxs[0] , min = mins[0];
		for(int i = 1; i < maxs.length; i++) {
			if(maxs[i] > max) {
				max = maxs[i];
			}
		}
		
		// n/2 - 1 confronti
		for(int i = 1; i < mins.length; i++) {
			if(mins[i] > min) {
				max = mins[i];
			}
		}
		
	
		System.out.print(String.format("Massimo: %d e Minimo : %d", max, min));
	}

}
