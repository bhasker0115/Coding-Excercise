
public class DuplicateElementInOneArray {
	
	void printDuplicate(int arr[], int size){
		
		 System.out.println("Repeated Elements are :"); 
		for (int i=0; i<size; i++){
			for(int j=i+1;j<size;j++){
				if(arr[i] == arr[j])
					System.out.print(arr[i] + " "); 
			}
		}
	}
	
	
	public static void main(String[] args)  
    { 
		
		DuplicateElementInOneArray repeat = new DuplicateElementInOneArray();
			int arr[] = {4,2,3,4,3,1};
			int arr_size = arr.length;
			repeat.printDuplicate(arr, arr_size);
    }

}
