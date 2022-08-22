public class StringToBasic {
	public static void main(String[] args) {
		int n1 = 1234;
		String s1 = n1 + "";
		System.out.println(s1);
		int num1 = Integer.parseInt(s1);
		double num2 = Double.parseDouble(s1);
		System.out.println(num1);
		System.out.println(num2); 
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
	}
}