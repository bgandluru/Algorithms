package algorithms.searching.binary;

import algorithms.searching.linear.LinearSearch;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestBinarySearch {


    @Test
   public void testBinarySearch() {

        int arr[] = { 3,3,6,12,23,27,34,35,43,56,76,87,98};
        BinarySearch bs = new BinarySearch();

        assertTrue(bs.binarySearchSorted(arr,76) != -1);
        assertTrue(bs.binarySearchSorted(arr,100) == -1);

    }

}
