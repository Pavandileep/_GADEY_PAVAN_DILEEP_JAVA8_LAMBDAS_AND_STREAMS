package palindromeFilteringLists;

class StringPredicates 
{
	public static boolean isPalindrome(String word)
	{
		//System.out.println(word.equals(new StringBuffer(word).reverse().toString()));
		if(word.equals(new StringBuffer(word).reverse().toString()))
			return true;
		return false;
	}

}
