package lesson5.lecture.factorymethods2.rulesets;

import java.awt.Component;
import java.util.HashMap;

import lesson5.lecture.factorymethods2.RuleSet;
import lesson5.lecture.factorymethods2.windows.AddressWindow;
import lesson5.lecture.factorymethods2.windows.CustomerProfileWindow;

final public class RuleSetFactory {
	private RuleSetFactory(){}
	static HashMap<Class<? extends Component>, RuleSet> map = new HashMap<>();
	static {
		map.put(AddressWindow.class, new AddressRuleSet());
		map.put(CustomerProfileWindow.class, new CustomerProfileRuleSet());
	}
	public static RuleSet getRuleSet(Component c) {
		Class<? extends Component> cl = c.getClass();
		if(!map.containsKey(cl)) {
			throw new IllegalArgumentException("No RuleSet found for this Component");
		}
		return map.get(cl);
	}
}
