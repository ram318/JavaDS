
public class Utility {
    
    public static void displayArray(int[] input){
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}

	public static void swapInArray(int[] input, int pos1, int pos2){

		int temp = input[pos1];
		input[pos1] = input[pos2];
		input[pos2] = temp;

	}
    
}
