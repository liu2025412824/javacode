public class ForceConvert {
	public static void main(String[] args) {
		int j = 2000;
		byte b1 = (byte)j;
		System.out.println(b1);
		//ǿת����ֻ���������Ĳ�������Ч,������Ҫʹ��С�����������ȼ�
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);
		//char���Ϳ��Ա���int�ĳ���ֵ�������ܱ���int�ı���ֵ����Ҫǿת
		int m = 100;
		char c3 = (char)m;
		System.out.println(c3);
	}
}