public class DoubleDetail {
	public static void main(String[] args) {
		double num1 = 2.7;
		double num2 = 8.1/3;
		System.out.println(num1);
		System.out.println(num2);
		if(num1 != num2) {
			System.out.println("num1��num2�����");
		}
		System.out.println(Math.abs(num1 - num2));
		if(Math.abs(num1 - num2) < 0.00001) {
			System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���");
		} 
	}
}