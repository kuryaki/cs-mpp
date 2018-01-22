package prob1.rulesets;

import java.awt.Component;

import prob1.*;

public class AddressRuleSet implements RuleSet {
	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		AddrWindow addr = (AddrWindow)ob;
		//comment 
		
		 name = addr.getIdValue();
		 street = addr.getStreetValue();
		 city = addr.getCityValue();
		 state = addr.getStateValue();
		 zip = addr.getZipValue();
		
		if(isAnyEmpty())
			throw new RuleException("An address rule has been violated! All fields must be nonempty");
		
		if(!RuleSetFactory.isNumeric(name))
			throw new RuleException("An address rule has been violated! ID field must be numeric");
		if(!RuleSetFactory.isNumeric(zip))
			throw new RuleException("An address rule has been violated! Zip field must be numeric");
		
		if(!RuleSetFactory.isExactLength(zip, 5))
			throw new RuleException("An address rule has been violated! Zip field must be exactly 5 digits");
		if(!RuleSetFactory.isExactLength(state, 2))
			throw new RuleException("An address rule has been violated! State field must be exactly 2 digits");
		
		if(!RuleSetFactory.isAllCapitals(state))
			throw new RuleException("An address rule has been violated! State field must be in the range A-Z");
		
		if(name.equals(zip))
			throw new RuleException("An address rule has been violated! ID field may not equal zip field");
		
	}
	public boolean isAnyEmpty()
	{
		if(name.isEmpty() || state.isEmpty() ||
				street.isEmpty() || city.isEmpty() ||
				zip.isEmpty())
			return true;
		return false;
		
	}

}
