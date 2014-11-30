package sorting;

public class SelectionSort {

	public static void main(String[] args) {

        int [] array = {17,10,3,5,9,1,11,4};
        
        int temp;
        for(int i=0; i<array.length; i++){
        	for(int j=i+1; j<array.length; j++){
        		if(array[i]>array[j]){
        			temp=array[j];
        			array[j]=array[i];
        			array[i]=temp;
        		}
        	}
        }
       for(int n=0; n<array.length;n++){
    	   System.out.println(array[n]);
       }
        

	}

}
