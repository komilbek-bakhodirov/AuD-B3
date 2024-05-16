package p1.sort;

/**
 * Optimizes the {@link HybridSort} by trying to find the k-value with the lowest number of read and write operations.
 */
public class HybridOptimizer {

    /**
     * Optimizes the {@link HybridSort} by trying to find the k-value with the lowest number of read and write operations.
     * The method will try out all k-values starting from 0 and return the k-value with the lowest number of read and write operations.
     * It will stop once it found the first local minimum or reaches the maximum possible k-value for the size of the given array.
     *
     * @param hybridSort the {@link HybridSort} to optimize.
     * @param array the array to sort.
     * @return the k-value with the lowest number of read and write operations.
     * @param <T> the type of the elements to be sorted.
     */
    public static <T> int optimize(HybridSort<T> hybridSort, T[] array) {
        int bestK = 0;
        int minOperations = Integer.MAX_VALUE;

        for (int currentK = 0; currentK <= array.length; currentK++) {
            hybridSort.setK(currentK);

            SortList<T> sortList = new ArraySortList<>(array);
            hybridSort.sort(sortList);

            int operations = sortList.getReadCount() + sortList.getWriteCount();

            // Debug
            System.out.println("k = " + currentK + ", operations = " + operations);

            if (operations < minOperations) {
                minOperations = operations;
                bestK = currentK;
            } else if (operations > minOperations) {
                break; // Found a local minimum
            }
        }

        return bestK;
    }
}
