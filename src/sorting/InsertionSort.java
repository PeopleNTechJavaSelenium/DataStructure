package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		int [] array = new int []{6,5,1,8,4,7,9,2};
		int temp, cursor;
		for(int i=1; i<array.length; i++){
			cursor = i;
			for(int n=i-1; n>=0; n--){
				if(array[n]>array[cursor]){
				temp = array[n];
				array[n] = array[cursor];
				array[cursor] = temp;
				
			   }//if ends here
				
				cursor--;
			}//inner loop ends
		}//outer loop ends
		
		//Printing array
		for(int j=0; j<array.length; j++){
			System.out.println(array[j]);
		}
		

	}

}
