import org.example.strategy.SortingContext;
import org.example.strategy.impl.MergeSort;
import org.example.strategy.impl.SelectionSort;

public class StrategyTest {

    public static void main(String[] args) {
        //create the context
        SortingContext context = new SortingContext();

        //add the strategy
        context.setSorting(new MergeSort());
        context.executeSorting(new int[]{1,2,3,4});

        //change the strategy
        context.setSorting(new SelectionSort());
        context.executeSorting(new int[]{1,2,3,4});
    }
}
