/*Email Id verification
 * minimum length of 5 and maximum length of 35
 * starts with alphabet 
 * before @ symbol we cannot use '.'
 * only allowed special character is '_' it can be any number of times but before the @ symbol only 
 * between @ and '.' any alphabet
 */
public class Modified {

	public static void userMethod(String s) {
		if(s.length()>=5&&s.length()<=35){
			String str=s;
			int mark=0;
			int invalid=0;
			String[] domain={".com",".in",".co.in",".org",".ed",".ac.in"};
			if(s.contains("@")&&s.contains(".")){
				mark=s.indexOf("@");
				String s1=str.substring(0,mark);
				String s2=str.substring(mark);
				boolean b=s1.contains(".");
			    int mark2=s.indexOf(".");
			    //for @.com
				if(Math.abs(mark-mark2)==1){
					invalid=1;
				}
				if(b){
					invalid=1;
				}
				for(int i=0;i<s1.length();i++){
					int asci=(int)str.charAt(i);
					if(Character.isAlphabetic(s1.charAt(0))||asci==95||(asci>=97&&asci<=122)||(asci>=65&&asci<=90)||Character.isDigit(s1.charAt(i))){
					}else{
						invalid=1;
					}
				}
				if(s2.contains("_")){
					invalid=1;
				}
				char[] ch=s2.toCharArray();
				for(char g:ch){
					int c=0;
					if(g=='.'){
						c++;
					}if(c>1){
						invalid=1;
					}else{
						int index=s2.indexOf(".");
						int dom=0;
						String temp=s2.substring(index);
						for(String k:domain){
							if(k.equals(temp)){
								dom=1;
								break;
							}
						}if(dom==0){
							invalid=1;
						}
					}
				}
				if(invalid==1){
					System.out.println("Invalid Email ID");
				}else{
					System.out.println("Valid Email ID");
				}
			}else{
				System.out.println("Invalid Email Id");
			}
		}else{
			System.out.println("Invalid Email ID");
		}
		
	}
	public static void main(String[] args) {
		userMethod("vebkh_k@jdfkuh.com");
	}
}