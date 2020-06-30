package palindromeFilteringLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class PalindromeList 
{
	public static void main(String[] args) 
	{
		String strArray[] = {"1001","0101","0110","1111","0000"};
		
		List<String> strList = Arrays.asList(strArray);
			
		List<String> resultList = PalindromeList.getPalidromeList(strList, StringPredicates::isPalindrome);
			
		System.out.println(resultList);		
	}

	private static List<String> getPalidromeList(List<String> strList, Predicate<String> predicate) 
	{
		List<String> finalList = new ArrayList<>();
		for(String str : strList)
		{
			//System.out.println(predicate.test(str));
			if(predicate.test(str))
			{
				finalList.add(str);
			}
		}
		return finalList;
	}
}


