package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		
		int [] array = {10,8,11,3,9,2,6,4,1};
		
		int temp;
		for(int cursor=array.length-1;cursor>=0;cursor--){
		 for(int i=0; i<array.length-1; i++){
			if(array[i]>array[i+1]){
				temp=array[i];
				array[i]=array[i+1];
				array[i+1]=temp;
			}
		  }
		}
		for(int n=0; n<array.length; n++){
		System.out.println(array[n]);
		}
		
	}

}
