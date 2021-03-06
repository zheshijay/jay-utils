package algo.linkedlist;


/*
 * 
The count-and-say sequence is the sequence of integers beginning as follows:
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth sequence.

	public String countAndSay(int n) {
 * 
 */
public class CountAndSay {































	public String countAndSay(int n) {
		StringBuilder curr=new StringBuilder("1");
		StringBuilder prev;
		int count;
		char say;
		for (int i=1;i<n;i++){
			prev=curr;
			curr=new StringBuilder();       
			count=1;
			say=prev.charAt(0);

			for (int j=1,len=prev.length();j<len;j++){
				if (prev.charAt(j)!=say){
					curr.append(count).append(say);
					count=1;
					say=prev.charAt(j);
				}
				else count++;
			}


			curr.append(count).append(say);
			System.out.println("curr is: " + curr);
		}	       	        
		return curr.toString();

	}












	//1, 11, 21, 1211, 111221,



	public String myGetCountAndSay(int n){

		StringBuilder pre = new StringBuilder();
		StringBuilder cur = new StringBuilder("1");

		int count=0;
		char say = '1';
		System.out.println("init say: " + say);
		for(int i=1; i<n; i++){
			System.out.println("---------------- i: " + i);

			pre = cur;
			cur = new StringBuilder();
			say = pre.charAt(0);

			int j = 0;
			while(j<pre.length()){
				if(pre.charAt(j)==say) count++;
				else{
					System.out.println("count: " + count + " - say: " + say);
					cur = cur.append(count).append(say);
					count =1;
					say = pre.charAt(j);
				}
				j++;
			}

			System.out.println("===>count: " + count + " - say: " + say);
			cur = cur.append(count).append(say);
			count =0;

			System.out.println("-->cur is: " + cur);
		}
		return cur.toString();
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	//begin: 10:40  ~ 10:50
	public String countAndSay2(int n){
		
		StringBuilder pre = new StringBuilder();
		StringBuilder cur = new StringBuilder();
		
		//scan previous result, get 'count' and 'say', append to result
		
		cur.append('1');
		for(int i=0; i<n; i++){
		    
			pre=cur;   //we going to create a new cur, save cur to pre for the scan
			
			int count=0;
			char say = pre.charAt(0);
			cur = new StringBuilder();
			
			int j=0;
			while(j<pre.length()){
				if(say == pre.charAt(j)){
					count++;
				}else{
					cur.append(count).append(say);
					count=1;
					say=pre.charAt(j);
				}
				j++;
			}
			 cur.append(count).append(say);
		}
		return cur.toString();
	}


	/*
	 * 
1, 11, 21, 1211, 111221, ...

1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
	 * 
	 */



	public static void main(String args[]){
		CountAndSay test = new CountAndSay();

		String res = test.countAndSay2(3);
		System.out.println(res);

	}

}


