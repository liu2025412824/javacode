public class ForceConvert {
	public static void main(String[] args) {
		int j = 2000;
		byte b1 = (byte)j;
		System.out.println(b1);
		//强转符号只针对于最近的操作数有效,往往需要使用小括号提升优先级
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);
		//char类型可以保存int的常量值，但不能保存int的变量值，需要强转
		int m = 100;
		char c3 = (char)m;
		System.out.println(c3);
	}
}