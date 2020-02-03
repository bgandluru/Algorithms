package algorithms.searching.linear;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestLinearSearch {

    @Test
    public void testLinearSearch () {
        int arr[] = { 23,25,26,23,10,3,6,3,41,61,78};
        LinearSearch ls = new LinearSearch();

        assertTrue(ls.linearSearch(arr,61) != -1);
        assertTrue(ls.linearSearch(arr,611) == -1);

    }

}
