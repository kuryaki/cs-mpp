package lesson1.lecture.ooexample.employeeinfo;




public class AccountList {
	private final int INITIAL_LENGTH = 4;
	private Account[] acctArray; 
	private int size;
	
	public AccountList() {
		acctArray = new Account[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(Account s){
		if(size == acctArray.length) resize();
		acctArray[size++] = s;
	}
	
	public Account get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return acctArray[i];
	}
	
	public boolean find(Account s){
		for(Account test : acctArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(Account s, int pos){
		if(pos > size) return;
		if(pos >= acctArray.length||size+1 > acctArray.length) {
			resize();
		}
		Account[] temp = new Account[acctArray.length+1];
		System.arraycopy(acctArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(acctArray,pos,temp,pos+1, acctArray.length - pos);
		acctArray = temp;
		++size;
		
	}
	
	public boolean remove(Account s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(acctArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		Account[] temp = new Account[acctArray.length];
		System.arraycopy(acctArray,0,temp,0,index);
		System.arraycopy(acctArray,index+1,temp,index,acctArray.length-(index+1));
		acctArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
		System.out.println("resizing");
		int len = acctArray.length;
		int newlen = 2*len;
		Account[] temp = new Account[newlen];
		System.arraycopy(acctArray,0,temp,0,len);
		acctArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(acctArray[i]+", ");
		}
		sb.append(acctArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
		/*
		MyStringList l = new MyStringList();
		l.add("Bob");
		l.add("Steve");
		l.add("Susan");
		l.add("Mark");
		l.add("Dave");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.remove("Mark");
		l.remove("Bob");
		System.out.println("The list of size "+l.size()+" is "+l);
		l.insert("Richard",3);
		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
		l.insert("Tonya",0);
		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);
		*/		
	}
}
