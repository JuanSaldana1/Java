package StringTokenizer;
public class StringTokenizer {

	public static void main(String[] args) {
		String str = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
		String strReverse;
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(str);
		
		while (st.hasMoreTokens()) {
			sb.insert(0, st.nextToken());
			if(st.hasMoreTokens()) {
				sb.insert(0, " ");
			}
		}
		strReverse = sb.toString();
		System.out.println(strReverse);
	}
}
