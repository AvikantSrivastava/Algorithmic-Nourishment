public class BinarySearchRecursive {
    public int binarySearch(int arr[] , int key , int low , int high){
        int mid = (low + high) / 2 ;

        if(arr[mid] == key)
            return mid ;
        else if (key > mid)
            return binarySearch(arr , key , mid , high ) ;

         else if (key < mid)
            return binarySearch(arr , key , low , mid) ;
        else
            return -1 ;
    }


    public static void main(String args[]) 
    { 
        BinarySearchRecursive ob = new BinarySearchRecursive(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int x = 10; 
        int result = ob.binarySearch(arr, x , 0 , arr.length -1 ); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
    
}