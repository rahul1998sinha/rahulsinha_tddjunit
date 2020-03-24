package com.epam.tdd_junit;

public class SampleClass {
	public String checker(String string) {
		{
			if(string.length()==0)
				return "";
			else if(string.length()==1)
			{
				if(string.charAt(0)=='A')
					return "";
				else
					return string;
			}
			else
			{
				char firstChar = string.charAt(0);
				char secondChar = string.charAt(1);
				if(firstChar=='A' && secondChar=='A')
					return string.substring(2);
				else if(firstChar=='A')
					return ""+secondChar+string.substring(2);
				else if(secondChar == 'A')
					return ""+firstChar+string.substring(2);
				else
					return string;
			}
		}
	}

}
