public class methodExercise{
	public static void main(String[] args){

		Person p = new Person();
		p.name = "jack";
		p.age=100;
		Mytools tool =new Mytools();
		Person p2 = tool.copyPerson(p);
		//����p��p2��Person���������������Ķ���������ͬ
		System.out.println(p.name+" "+p.age);
		System.out.println(p2.name+" "+p2.age);
		//�Ƚ϶����Ƿ�ΪΪͬһ������
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