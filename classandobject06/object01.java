public class object01 {
	public static void main(String[] args){

		Cat cat1 = new Cat();
		cat1.name = "С��";
		cat1.age = 3;
		cat1.color = "��ɫ";
		cat1.weight=20.2;
		Cat cat2 = new Cat();
		cat2.name = "С��";
		cat2.age = 5;
		cat2.color = "��ɫ";
		cat2.weight=25.7;
		System.out.println("��һֻè����Ϣ:"+cat1.name+" "+cat1.age+" "
			+cat1.color+" "+cat1.weight);
		System.out.println("�ڶ�ֻè����Ϣ:"+cat2.name+" "+cat2.age+" "
			+cat2.color+" "+cat2.weight);

	}
}

//����һ��è��Cat
class Cat {
	//����/��Ա����/�ֶ�field
	String name;
	int age;
	String color;
	double weight;
}