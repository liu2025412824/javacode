public class object01 {
	public static void main(String[] args){

		Cat cat1 = new Cat();
		cat1.name = "小白";
		cat1.age = 3;
		cat1.color = "白色";
		cat1.weight=20.2;
		Cat cat2 = new Cat();
		cat2.name = "小花";
		cat2.age = 5;
		cat2.color = "花色";
		cat2.weight=25.7;
		System.out.println("第一只猫的信息:"+cat1.name+" "+cat1.age+" "
			+cat1.color+" "+cat1.weight);
		System.out.println("第二只猫的信息:"+cat2.name+" "+cat2.age+" "
			+cat2.color+" "+cat2.weight);

	}
}

//定义一个猫类Cat
class Cat {
	//属性/成员变量/字段field
	String name;
	int age;
	String color;
	double weight;
}