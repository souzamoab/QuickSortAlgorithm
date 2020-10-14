package main;

import java.io.IOException;
import java.util.Arrays;

import file.File;
import quicksort.QuickSort;

public class Main {

	public static void main(String[] args) throws IOException {
		
		QuickSort quickSort = new QuickSort();
		File file = new File();
		
		int[] vet = file.readFile();
		int size = vet.length;
		
		quickSort.quickSort(vet, 0, size - 1);
		file.writeFile(vet);
		
		System.out.println(size);
		System.out.println(Arrays.toString(vet));
		
	}
	
}
