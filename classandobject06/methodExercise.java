public class methodExercise{
	public static void main(String[] args){

		Person p = new Person();
		p.name = "jack";
		p.age=100;
		Mytools tool =new Mytools();
		Person p2 = tool.copyPerson(p);
		//到此p和p2是Person对象但是两个独立的对象，属性相同
		System.out.println(p.name+" "+p.age);
		System.out.println(p2.name+" "+p2.age);
		//比较对象是否为为同一个对象
		System.out.println(p == p2);
	}
}


class Person{
	String name;
	int age;
}

class Mytools{
	public Person copyPerson(Person p){
		Person p2 = new Person();
		p2.name = p.name;
		p2.age  = p.age;

		return p2;
	}
}