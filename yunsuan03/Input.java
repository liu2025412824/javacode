import java.util.Scanner;  //表示把java.util下的Scanner类导入
public class Input {
	public static void main(String[] args) {
		//演示接受输入
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("请输入名字：");
		String name = myScanner.next();
		System.out.println("请输入年龄：");
		int age = myScanner.nextInt();
		System.out.println("请输入薪水：");
		double salary = myScanner.nextDouble();
		System.out.println("人的信息如下：");
		System.out.println("名字="+name+" 年龄="+age+" 薪水="+salary);
	}
}