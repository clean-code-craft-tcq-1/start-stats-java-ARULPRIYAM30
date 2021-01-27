package statisticker;

import java.util.List;

public class Statistics 
{
	Stats stats = new Stats();
    public static Stats getStatistics(final List<Float> numbers) {
    //implement the computation of statistics here
    if (numbers.isEmpty())
    {
      stats.setAverage(Float.NaN);
      stats.setMin(Float.NaN);
      stats.setMax(Float.NaN);
    }
		else
        {
			stats.setMin(Collections.min(numbers));
			stats.setMax(Collections.max(numbers));
			int listLength=numbers.size();
            Float sumofnums=0.0f;
            for(Float i:numbers){
                sumofnums+=i;
            }
            stats.setAverage((Float)sumofnums/listLength);
        }
        return stats;
    }
}
