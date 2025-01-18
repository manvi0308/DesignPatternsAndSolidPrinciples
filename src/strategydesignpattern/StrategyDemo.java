package strategydesignpattern;
class SortingContext{
	// reference to the strategy object
	private SortingStrategy sortingStrategy;
	
	public SortingContext(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}
	 
	// setter to change the reference of sortingStrategy Object
	public void setSortingStrategy(SortingStrategy sortingStrategy) {
		this.sortingStrategy = sortingStrategy;
	}
	
	public void performSort(int[] array) {
		sortingStrategy.sort(array);
	}
	

}

// strategy interface common to all variants of the algorithms
interface SortingStrategy{
	void sort(int[] array);
	
}

class BubbleSortStrategy implements SortingStrategy{
	@Override
    public void sort(int[] array) {
        // Implement Bubble Sort algorithm
        System.out.println("Sorting using Bubble Sort");
        // Actual Bubble Sort Logic here
    }
}

class QuickSortStrategy implements SortingStrategy{
	@Override
    public void sort(int[] array) {
        // Implement Bubble Sort algorithm
        System.out.println("Sorting using Quick Sort");
        // Actual Bubble Sort Logic here
    }
}

class MergeSortStrategy implements SortingStrategy{
	@Override
    public void sort(int[] array) {
        // Implement Bubble Sort algorithm
        System.out.println("Sorting using Merge Sort");
        // Actual Bubble Sort Logic here
    }
}
public class StrategyDemo {
	public static void main(String[] args) {
		 int[] arr1 = {1, 4, 7, 2, 5, 8};

		 
	 SortingContext sortingContext = new SortingContext(new BubbleSortStrategy());
	 sortingContext.performSort(arr1);
	 
	  sortingContext.setSortingStrategy(new QuickSortStrategy());
	  sortingContext.performSort(arr1);
	  
	 sortingContext.setSortingStrategy(new MergeSortStrategy());
	  sortingContext.performSort(arr1);

	 
	 
	}
}
