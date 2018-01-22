package prob1.rulesets;

import java.awt.Component;

import prob1.*;

public class CustomerProfileRuleSet implements RuleSet {
	private String ID;
	private String FName;
	private String LName;
	private String FRest;
	private String FMovie;

	@Override
	public void applyRules(Component ob) throws RuleException {
		ProfileWindow custProf = (ProfileWindow)ob;
		//check data
		ID = custProf.getIdValue();
		FName = custProf.getFirstNameValue();
		LName = custProf.getLastNameValue();
		FMovie = custProf.getFavoriteMovieValue();
		FRest = custProf.getFavoriteRestaurantValue();
		if(isAnyEmpty())
			throw new RuleException("An custProfile rule has been violated! All fields must be nonempty");
		
		if(!RuleSetFactory.isNumeric(ID))
			throw new RuleException("An custProfile rule has been violated! ID field must be numeric");
		
		if(FMovie.equals(FRest))
			throw new RuleException("An custProfile rule has been violated! Favorite restaurant field may not equal Favorite Movie field");
		
		if(!RuleSetFactory.isAllLetters(FName))
			throw new RuleException("An custProfile rule has been violated! First Name field must be all letters");

		if(!RuleSetFactory.isAllLetters(LName))
			throw new RuleException("An custProfile rule has been violated! Last Name field must be all letters");

		
	}
	public boolean isAnyEmpty()
	{
		if(ID.isEmpty() || FName.isEmpty() ||
				LName.isEmpty() || FMovie.isEmpty() ||
				FRest.isEmpty())
			return true;
		return false;
		
	}

}
