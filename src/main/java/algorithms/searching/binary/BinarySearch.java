package algorithms.searching.binary;

public class BinarySearch {

    int binarySearchSorted(int arr[],int item){

          int l = 0,r = arr.length - 1;

          while (l <= r) {

              int m = l+(r-l)/2;

              if (arr[m] == item)
                  return m;

              if (arr[m] < item)
                  l = m + 1;
                else
                  r = m - 1;
          }
       return -1;
    }




}
