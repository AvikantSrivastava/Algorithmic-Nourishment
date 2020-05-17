class sort {

    public static void printArray(int[] array){
        for (int element: array) {
            System.out.print(element);
            System.out.print("\t");
            }
        System.out.print("\n");
    }
    
    public static void insertionsort(int[] array){
        int n = array.length ;
        for(int i = 1 ; i < n ; i++){
            // i is the index till the elment is sorted
            int key = array[i];
            
            int j = i - 1 ;

            while( j >= 0 && key < array[j]){
                array[j+1] = array[j] ;
                j--;
            }

            array[j+1] = key ;

        }
        
    }
  
  }

  class InsertionSort{
      public static void main(String[] args){
          sort obj = new sort() ;
          int[] array = { 9,8,7,6,5,4,3,2,1}; 
        //   int[] array = { 1,2,3,4,6,7,8,9}; 

        //   int[] array = { 4,3,7,9,2,6}; 


        System.out.println("Before sort ");

        obj.printArray(array);

        obj.insertionsort(array);

        System.out.println("\nAfter sort");
        obj.printArray(array);
        
      }
  }