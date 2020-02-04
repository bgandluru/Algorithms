package algorithms.searching.linear;

public class LinearSearch {

   public int linearSearch(int arr[],int element) {
        for(int i=0;i<arr.length;i++){
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public int sentinalLinearSearch (int arr[],int l,int element) {

         int lastElement = arr[l-1];
         arr[l-1] = element;
         int i = 0;
         while(arr[i] != element)
             i++;

         arr[l-1] = lastElement;

         if (i < l-1 || element == arr[l-1]) {
             System.out.println("Element found at location :: "+i);
             return i;
         } else {
             System.out.println("Element not found");
         }

       return  -1;
    }


}
