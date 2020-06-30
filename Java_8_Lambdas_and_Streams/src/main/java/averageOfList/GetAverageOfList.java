package averageOfList;

import java.util.*;

public class GetAverageOfList 
{
	public double getAverageOfListIntegers(List<Integer> list)
	{
		double average = 0.0f;		
		
		IntSummaryStatistics summaryStats = list.stream()
			      .mapToInt((a) -> a)
			      .summaryStatistics();
		
		average = (double) summaryStats.getAverage();
		
		return average;
	}

}
