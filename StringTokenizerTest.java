import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		 String str="Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
		 String strReverse="";
		 
		 StringTokenizer st=new StringTokenizer(str);
		 while(st.hasMoreTokens()) {
			 strReverse=st.nextToken()+	strReverse;
			 if(st.hasMoreTokens())
			 {strReverse=" "+	strReverse; }
		 }
		 System.out.println(strReverse);
		 
		 String str2="Monday%Tuesday%Wednesday%Thursday%Friday%Saturday%Sunday";
		 String strReverse2="";
		 StringTokenizer st2=new StringTokenizer(str2,"%");
		 while(st2.hasMoreTokens()) {
			 strReverse2=st2.nextToken()+	strReverse2;
			 if(st2.hasMoreTokens())
			 {strReverse2=" "+	strReverse2; }
		 }
		 System.out.println(strReverse2);
	}

}
