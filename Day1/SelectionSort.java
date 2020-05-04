class Solution {
    static void swap(int[] array, int firstIndex, int secondIndex) {
      int temp = array[firstIndex];
      array[firstIndex] = array[secondIndex];
      array[secondIndex] = temp;
      return;
    }
    
    static int indexOfMinimum(int[] array, int startIndex) {
      int minValue = array[startIndex];
      int minIndex = startIndex;
  
      for(int i = minIndex + 1; i < array.length; i++) {
        if(array[i] < minValue) {
          minIndex = i;
          minValue = array[i];
        }
      } 
      return minIndex;
    }; 
  
    public static void selectionSort(int[] array) {
      // Write this method
      int n = array.length ;
      for(int i = 1 ; i < n ; i++){
        int minIndex = indexOfMinimum(array , i) ;
        if( array[i-1]> array[minIndex]){
          swap(array , i-1 , minIndex);
        }
  
      }
         return; 
    }
  }

  