public class Constructor01{
	public static void main(String[] args){

		Person p1 = new Person("����",22);
		System.out.println("p1��Ϣ����:");
		System.out.println(p1.name);
		System.out.println(p1.age);

		Person p2 = new Person();
		System.out.println("p2��Ϣ����:");
		System.out.println(p2.name);
		System.out.println(p2.age);
	}
}

class Person{
	String name;
	int age;
	public Person(String Name,int Age){
		System.out.println("������1������~��ɶ����ʼ��");
		name = Name;
		age = Age;
	}
	public Person(){
		System.out.println("������2������~��ɶ����ʼ��");
		age = 18;
	}
}