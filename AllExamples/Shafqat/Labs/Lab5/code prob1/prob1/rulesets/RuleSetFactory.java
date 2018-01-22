package lesson5.labs.prob1.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lesson5.labsolns.prob1.gui.BookWindow;
import lesson5.labsolns.prob1.gui.CDWindow;


final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	
}
