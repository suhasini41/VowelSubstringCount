package package1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VowelSubStrings 
{
	private int vowelSubstringCount(String s) {
		String sub = "";
		List<String> subList = new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u'))
			{
				subList.add(String.valueOf(s.charAt(i)));
				sub = sub + s.charAt(i);
				if(!sub.equals(String.valueOf(s.charAt(i))))
				{
					subList.add(sub);
				}
			}
			else
			{
				sub ="";
			}
		}
		System.out.println(subList);
		int substringsCount = subList.size();
		return substringsCount;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(vowelSubstringCount("codestudio"), 6);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(vowelSubstringCount("xyz"), 0);
	}

}
