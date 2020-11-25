
public class CB136594 {

	public static void main(String[] args) {
		System.out.println(xyzThere("ab.xyz"));

	}
	
	public static boolean xyzThere(String str) {
		 //Solo vale cuando hay una aparición de xyz
		 /* if(str.contains(".xyz") || !str.contains("xyz")) return false;
		  else if(str.contains("xyz")) return true;
		  
		  return true; */
		  
		  for (int i=0;i<str.length()-2;i++){
		    
		    String subs=str.substring(i,i+3);
		    if(subs.equals("xyz") && i==0) {return true;}
		    else if (subs.equals("xyz") && (str.charAt(i-1)!='.')) {return true;}
		    
		    
		  }
		  
		  return false;
		}


}
