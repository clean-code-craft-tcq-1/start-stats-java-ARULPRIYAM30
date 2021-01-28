package statisticker;
import java.util.Collections;
import java.util.List;
import java.util.function.ToDoubleFunction;
public class Statistics 
{
	
    public static Stats getStatistics(final List<Float> numbers) {
	    
Stats stats = new Stats();
    //implement the computation of statistics here
    if (numbers.isEmpty())
    {
      stats.setAverage(Float.NaN);
      stats.setMin(Float.NaN);
      stats.setMax(Float.NaN);
    }
		else
        {
	Collections.sort(numbers);
      // setting the minimum number to Stats object
      stats.setMin(numbers.get(0));
      // setting the maximum number to Stats object
      stats.setMax(numbers.get(numbers.size() - 1));
			int listLength=numbers.size();
            Float sumofnums=0.0f;
            for(Float i:numbers){
                sumofnums+=i;
            }
	// setting the average number to Stats object
            stats.setAverage((Float)sumofnums/listLength);
        }
        return stats;
    }
}
