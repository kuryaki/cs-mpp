package prob2;

import java.util.ArrayList;
import java.util.List;

public class CheckoutRecord {
	
	List<CheckoutRecordEntry> checkoutEntryList = new ArrayList<CheckoutRecordEntry>();
	
	public void addCheckoutEntry(CheckoutRecordEntry entry) {
		this.checkoutEntryList.add(entry);
	}

	public List<CheckoutRecordEntry> getCheckoutEntryList() {
		return checkoutEntryList;
	};
	
}
