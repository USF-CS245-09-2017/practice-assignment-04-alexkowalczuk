public class SelectionSort implements SortingAlgorithm{

	public void sort(int [] a){  
        for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a.length; j++){  
                if (a[j] < a[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
        }  
    }  
	
}