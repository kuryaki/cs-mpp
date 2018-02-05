package prob2;

import java.util.*;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNums = new ArrayList<>();
		
		for(LibraryMember member :  members) {
			member.getCheckoutRecord().getCheckoutEntryList().forEach(entry -> {
				if(entry.getLendingItem().equals(item)) {
					phoneNums.add(member.getPhone());
				}
			});
		}

		return phoneNums;
	}
}
