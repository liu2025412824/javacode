import java.util.Scanner;  //��ʾ��java.util�µ�Scanner�ർ��
public class Input {
	public static void main(String[] args) {
		//��ʾ��������
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("���������֣�");
		String name = myScanner.next();
		System.out.println("���������䣺");
		int age = myScanner.nextInt();
		System.out.println("������нˮ��");
		double salary = myScanner.nextDouble();
		System.out.println("�˵���Ϣ���£�");
		System.out.println("����="+name+" ����="+age+" нˮ="+salary);
	}
}