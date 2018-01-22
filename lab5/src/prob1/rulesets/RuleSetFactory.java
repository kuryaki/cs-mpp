package prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import prob1.*;

public class RuleSetFactory {
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(AddrWindow.class, new AddressRuleSet());
		map.put(ProfileWindow.class, new CustomerProfileRuleSet());
	}
	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> cl = c.getClass();
		if(!map.containsKey(cl)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
	public static boolean isNumeric(String str)
	{
		if(str.isEmpty())
			return false;
		for(int i=0;i<str.length();i++)
		{
			
			if(!Character.isDigit(str.charAt(i)))
			{
				return false;
			}
		}
		return true;
		
	}
	public static boolean isExactLength(String str, int len)
	{
		if(str.length() == len)
			return true;
		return false;
	}
	public static boolean isAllLetters(String str)
	{
		if(str.isEmpty())
			return false;
		for(int i=0;i<str.length();i++)
		{
			
			if(!Character.isLetter(str.charAt(i)))
			{
				return false;
			}
		}
		return true;
		
	}
	//A-Z
	public static boolean isAllCapitals(String str)
	{
		if(str.isEmpty())
			return false;
		for(int i=0;i<str.length();i++)
		{
			
			if(!Character.isUpperCase(str.charAt(i)))
			{
				return false;
			}
		}
		return true;
		
	}
	
}
