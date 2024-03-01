/* String Buffer is the peer class of the String, while String creates string of "Fixed Lengths", StringBuffer creates String of "Flexible Lengths" which can be modified in
 * terms of both length and content.
 */
package strings;

public class BufferMethod {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Object language");
		System.out.println("Original String = " +str);
		System.out.println("Number of letters = " +str.length());
		for(int i = 0; i<str.length(); i++) {
			int p = i + 1;
			System.out.println("Character at position " +p + " is " + str.charAt(i));
		}
		
		String str1 = new String(str.toString());
		int position = str1.indexOf("Language");
		str.insert(position, "oriented");
		System.out.println("Modified String = " +str);
		str.setCharAt(6, '-');
        System.out.println("String Now = " +str);
        str.append("Improves Security");
        System.out.println("Append String = " +str);
  	}

}
