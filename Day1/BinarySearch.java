public class BinarySearch {
    public int binarySearch(int arr[] , int key ){
        int high = arr.length-1 ;
        int low = 0 ;
        
        while(high > low){
            int mid = (high + low) / 2 ;

            if (arr[mid] == key ){
                return mid ;
            }

            else if(arr[mid] < key){
                low = mid ;
            }

            else if(arr[mid] > key){
                high = mid + 1 ;
            }
        }
        return -1 ;

        
    }


    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int x = 10; 
        int result = ob.binarySearch(arr, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
    
}