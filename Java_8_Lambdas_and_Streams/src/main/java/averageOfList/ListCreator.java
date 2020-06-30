package averageOfList;

import java.util.*;

public class ListCreator 
{
	public static void main(String[] args) 
	{
		List <Integer>list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int numberOfElements = sc.nextInt();
		
		int i;
		
		for(i = 0;i < numberOfElements;i++)
		{
			list.add(sc.nextInt());
		}
		
		System.out.println(list);
		
		GetAverageOfList average = new GetAverageOfList();
		System.out.println(average.getAverageOfListIntegers(list));
		
		sc.close();		
	}
}