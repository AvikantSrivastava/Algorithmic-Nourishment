class sort {

    public void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element);
            System.out.print("\t");
        }
        System.out.print("\n");
    }

    public static void merge(int []arr , int left , int middle , int right){
        int n1 = middle - left + 1;
        int n2 = right - middle ;

        int L[] = new int [n1]; 
        int R[] = new int [n2];

        for(int i = 0 ; i < n1 ; ++i){
            L[i] = arr[left + i] ;
        }

        for(int j = 0 ; j < n2 ; ++j){
            R[j] = arr[middle + 1 + j] ;
        }

        int i = 0 , j = 0 , k = left ;

        while(i < n1 && j < n2){
            if( R[j] < L[i]){
                arr[k] = R[j] ;
                j++ ;
            }

            else{
                arr[k] = L[i];
                i++ ;
            }
            k++ ;
        }

        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        }

    }

    public void mergesort(int[] arr, int left, int right) {
        if (right > left) {
            int middle = (left + right) / 2;
            mergesort(arr, left, middle);
            mergesort(arr, middle + 1, right) ;

            merge(arr, left, middle, right);
        }
    }

}

public class MergeSort {

    public static void main(String[] args) {
        sort obj = new sort();
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        // int[] array = { 67 ,24};

        // int[] array = { 1,2,3,4,6,7,8,9};

        // int[] array = { 4,3,7,9,2,6};

        System.out.println("Before sort ");
        obj.printArray(array);
        // int len = array.length ;
        obj.mergesort(array, 0, array.length -1 ) ;

        System.out.println("\nAfter sort");
        obj.printArray(array);
      
    }
}