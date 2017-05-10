public class Solution
{
	public String longestPalindrome(String s)
	{
		if (s.length()<2)
		{
			return s;
		}
		int lo=0,len=0;
		for (int i = 0; i < s.length(); i++)
		{
			//最大回文字符串是奇数,odd
			for(int m=i,n=i;m>=0&&n<s.length()&&s.charAt(m)==s.charAt(n);m--,n++)
			{
				if(n-m+1>len)
				{
					lo=m;
					len=n-m+1;
				}
			}
			//最大回文字符串是偶数,even
			for(int m=i,n=i+1;m>=0&&n<s.length()&&s.charAt(m)==s.charAt(n);m--,n++)
			{
				if(n-m+1>len)
				{
					lo=m;
					len=n-m+1;
				}
			}
		}
		return s.substring(lo, lo+len);
	}
}