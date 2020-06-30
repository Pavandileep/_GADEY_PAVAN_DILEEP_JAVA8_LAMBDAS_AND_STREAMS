package stringStartsWithLetterA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartsWithLetterA 
{
	public static void main(String[] args) 
	{
		String []strArray = {"app","banana","act","mango","awake"};
		List<String> strList = Arrays.asList(strArray);
		
		List<String> filterList = filterListStartWithLetterA(strList);
		System.out.println(filterList);
		
	}
	
	public static List<String> filterListStartWithLetterA(List<String> list)
	{
		return list.stream()
				  .filter(s -> s.startsWith("a"))
				  .filter(s -> s.length() == 3)
				  .collect(Collectors.toList());
		
	}
}
