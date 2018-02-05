package prob2;

import java.time.LocalDate;

public class CheckoutRecordEntry {
	
	LocalDate checkoutDate;
	LocalDate dueDate;
	LendingItem lendingItem;
	ItemType lendingItemType;
	

	public CheckoutRecordEntry(LendingItem lendingItem, LocalDate checkoutDate, LocalDate dueDate, ItemType itemType) {
		super();
		this.checkoutDate = checkoutDate;
		this.dueDate = dueDate;
		this.lendingItem = lendingItem;
		this.lendingItemType = itemType;
	}

	public LocalDate getCheckoutDate() {
		return checkoutDate;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public LendingItem getLendingItem() {
		return lendingItem;
	}

	public ItemType getLendingItemType() {
		return lendingItemType;
	}
	
	
}
