// Java program to demonstrate string methods
// Various string methods are showcased in this example.
class StringMethods{
	public static void main(String args[]){
		String sm="These are string methods.";
		String sf="     These are string methods.    ";
		
		System.out.println("Length of string: "+(sm.length()));
		System.out.println("Uppercase: "+(sf.toUpperCase()));
		System.out.println("Lowercase: "+(sm.toLowerCase()));

		System.out.println("Trimmed: "+(sf.trim()));
		System.out.println("Equals: "+(sm.equals(sf)));
		System.out.println("Ignore case: "+(sm.equalsIgnoreCase(sf)));
		
		System.out.println("== Compare: "+(sm.equals(sf)));
		System.out.println("Sub string: "+(sm.substring(3,14)));
		System.out.println("Starts with: "+(sf.startsWith("s")));
		
		System.out.println("Ends with: "+(sf.endsWith("s")));
		System.out.println("Char find: "+(sm.charAt(12)));
		System.out.println("Index find: "+(sm.indexOf("r")));
		
		System.out.println("Last index: "+(sm.lastIndexOf("t")));
		System.out.println("Replace: "+(sf.replace("t","r")));
		System.out.println("Contains: "+(sm.contains("str")));
		
		String s="These are string methods.";
		String[] subject=s.split(",");
		for(String sub:subject){
			System.out.println(sub);
		}
	}
}