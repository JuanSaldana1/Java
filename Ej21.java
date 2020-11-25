
public class Ej21 {

	public static void main(String[] args) {
		String s1 = "parliament";
		String s2 = "partial men,";
		
		s1=s1.replaceAll("[^\\dA-Za-z]", "");
		s2=s2.replaceAll("[^\\dA-Za-z]", "");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(anagrama(s1,s2));
		//System.out.println(s1.replaceAll("[^\\dA-Za-z]", ""));
		/* Otro Regex*/
		/*System.out.println(s1.replaceAll("[\\W]|_", "")); 
		/* Otro Regex*/
		/*System.out.println(s1.replaceAll("[^a-zA-Z0-9]", "")); */
      
	}
	
	public static boolean anagrama(String s1, String s2) {
		boolean anagrama=true;
		
		if(s1.length()!=s2.length()) {
			return false;
		}
		for(int i=0; i<s1.length(); i++) {
			char michar=s1.charAt(i);
			int estaC=s2.indexOf(michar);
			if(estaC<0) return false;
			s2=s2.substring(0,estaC)+s2.substring(estaC+1);
			System.out.println(s2);
		}
		
		
		return anagrama;
		
	}
}
