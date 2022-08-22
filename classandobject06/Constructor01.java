public class Constructor01{
	public static void main(String[] args){

		Person p1 = new Person("张三",22);
		System.out.println("p1信息如下:");
		System.out.println(p1.name);
		System.out.println(p1.age);

		Person p2 = new Person();
		System.out.println("p2信息如下:");
		System.out.println(p2.name);
		System.out.println(p2.age);
	}
}

class Person{
	String name;
	int age;
	public Person(String Name,int Age){
		System.out.println("构造器1被调用~完成对象初始化");
		name = Name;
		age = Age;
	}
	public Person(){
		System.out.println("构造器2被调用~完成对象初始化");
		age = 18;
	}
}