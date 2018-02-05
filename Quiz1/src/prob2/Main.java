package prob2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Main {

	@SuppressWarnings({ "serial", "unused" })
	public static void main(String[] args) {
		List<String> billMsgs = new ArrayList<String>() {
			{
				add("Number of hard-copy mailers sent yesterday: 10000");
				add("Number of overdue clients: 20");
				add("No updates");
				add("Number of new job applicants: 2");
			}
		};
		List<String> salesMsgs = new ArrayList<String>() {
			{
				add("Yesterday's revenue: $20,000");
				add("No updates");
				add("New leads generated from QuickLeads software yesterday: 10000");
				add("Number of new job applicants: 21");
			}
		};
		List<String>marketingMsgs = new ArrayList<String>() {
			{
				add("Number of viewings of yesterday's informercial: 20,000");
				add("Number of internal marketing meetings this week: 40");
				add("Public addresses scheduled this week: see email dated 9:45 AM today");
				add("Number of new job applicants: 12");
			}
		};
		BillingDept bill = new BillingDept();
		
		MarketingDept mark = new MarketingDept();	
		SalesDept sal = new SalesDept();
		HashMap<Object, List<String>> h = new HashMap<Object, List<String>>() {
			{
				put(bill, billMsgs);
				put(mark, marketingMsgs);
				put(sal, salesMsgs);
			}
		};
		
		//uncomment when you are ready
		
		loadQueue(h, bill);
		loadQueue(h, mark);
		loadQueue(h, sal);
		Admin a = new Admin(new Department[]{bill,mark,sal});
		System.out.println(a.hourlyCompanyMessage());
		System.out.println(a.hourlyCompanyMessage());
	}
	
	private static void loadQueue(HashMap<Object, List<String>> h, Department d) {		
		StringQueue queue = d.getQueue();
		queue.addAll(h.get(d));
		
	}

}
