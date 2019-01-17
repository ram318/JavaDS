public class One {

	public static void main(String[] args) {

		int[] inputOriginal={23,34,54,43,12,8,6,45,89,112,145,165,123};
		int[] input = inputOriginal.clone();
		System.out.print("Before Sort\t\t");

		Utility.displayArray(input);
		System.out.println("--------------------------");
		System.out.print("Selection Sort\t\t");
		SelectionSort(input);
		Utility.displayArray(input);


		input = inputOriginal.clone();
		System.out.print("Bubble Sort\t\t");
		BubbleSort(input);
		Utility.displayArray(input);


		input = inputOriginal.clone();
		System.out.print("Insertion Sort\t\t");
		InsertionSort(input);
		Utility.displayArray(input);



		input = inputOriginal.clone();
		System.out.print("Quick Sort\t\t");
		QuickSort(input,0,input.length-1);
		Utility.displayArray(input);
		
		
		input = inputOriginal.clone();
		System.out.print("Merge Sort\t\t");
		MergeSort(input);
		Utility.displayArray(input);
		
		
	}


	public static void SelectionSort(int[] input){

	}

	public static void BubbleSort(int[] input){
        for(int i=0;i<input.length;i++){
            for(int j=input.length-1;j>i;j--){
                if(input[j]<input[j-1]){
                    Utility.swapInArray(input,j,j-1);
                }
            }
        }
	}

	public static void InsertionSort(int[] input){

	}

	public static void QuickSort(int[] input, int min, int max){

	}


	public static void MergeSort(int[] input){

	}

	public static void merge(int[] listToSplit, int[] firstHalf, int[] secondHalf){

	}
	
	public static void split(int[] listToSplit, int[] firstHalf, int[] secondHalf){
		
	}

}