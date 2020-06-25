package CC;

public class recur {
	
	public static String reverseString(String args) {
		String reversed = reverse(args, 0, args.length()-1);
		return reversed;
	}
	
	private static String reverse(String args, int first, int last) {
		String newS = "";
		
		if(first >= last) 
			return args;
		else if(first == 0) {
			newS = args.charAt(last) + args.substring(first+1, last) + args.charAt(first);
			return reverse(newS, first+1, last-1);
		}
		else {
			newS = args.substring(0,first) + args.charAt(last) + args.substring(first+1,last) 
			+ args.charAt(first) + args.substring(last+1,args.length());
			return reverse(newS, first+1, last-1);
		}
	}
	
	

	public static void main(String[] args) {
		System.out.println(reverseString("수박수박수박"));//박수박수박수

	}

}
