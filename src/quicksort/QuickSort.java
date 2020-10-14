package quicksort;

public class QuickSort {
	
	public void quickSort(int vet[], int begin, int end) {
		if(begin < end) {
			int partIndex = partition(vet, begin, end);
			
			quickSort(vet, begin, partIndex - 1);
			quickSort(vet, partIndex + 1, end);
		}
	}
	
	public int partition(int vet[], int begin, int end) {
		
		int piv = vet[end];
		int i = begin - 1;
		
		for(int j = begin; j < end; j++) {
			if(vet[j] <= piv) {
				i++;
				
				int swap = vet[i];
				
				vet[i] = vet[j];
				vet[j] = swap;
			}
		}
		
		int swap = vet[i+1];
		vet[i+1] = vet[end];
		vet[end] = swap;
		
		return i+1;
	}
	
}
