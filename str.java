import java.util.*;
class Test{
	static int ccount=0;
	static int con(String str){
		int count = 0;
		for(int i=0;i<str.length();i++){
			char c = str.charAt(i);
			int as = (int) c;
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
				count++;
			}
			else if(as>=97 && as<=122 || as>=65 && as<=90){ccount++;}
			 
		}
		return count;
	}
	public static void main(String [] args){
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String str =  sc.nextLine();
		String rev = new StringBuilder(str).reverse().toString();
		int count = con(str);
		System.out.println(rev + ",the given string contains "+count+" vowels & "+ccount+" consonants");
		

	}
}