package lezione1;

public class MaxMin {

	public static void main(String[] args) {
		
		int[] array = {4,-6,1,4,5,5000};
		if(array.length == 0) {
			System.out.print("Nessun elemento");
			return;
		}
								
		int [] maxs = new int[array.length / 2 + 1];
		int [] mins = new int[array.length / 2];
		int indexMax = 0, indexMin = 0;
				
		//ALGORIMTO DI (3n/2) - 1 confronti 
		
		// n/2 confronti
		for(int i = 0;i < array.length - 1; i+=2) {
			if(array[i] > array[i+1]) {
				maxs[indexMax++] = array[i];
				mins[indexMin++] = array[i+1];
			}else {
				mins[indexMin++] = array[i];
				maxs[indexMax++] = array[i + 1];
			}
		}
		
		//Aggiunta Utile se numero di elementi dell'array dispari, se no inutile
		maxs[maxs.length - 1] = array[array.length -1 ]; 
		
		// n/2 confronti
		int max = maxs[0] , min = mins[0];
		for(int i = 1; i < maxs.length; i++) {
			if(maxs[i] > max) {
				max = maxs[i];
			}
		}
		
		// n/2 - 1 confronti
		for(int i = 1; i < mins.length; i++) {
			if(mins[i] < min) {
				min = mins[i];
			}
		}
		
	
		System.out.print(String.format("Massimo: %d e Minimo : %d", max, min));
	}

}
