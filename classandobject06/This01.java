public class This01{
	public static void main(String[] args){

		// Dog d1 = new Dog("张三",22);
		// d1.info();

		// T t1 = new T();
		// t1.f1();

		//this练习
		Person p1 = new Person("张三",20);
		Person p2 = new Person("李四",20);
		System.out.println(p1.compareTo(p2));
	}
}

class Dog{
	String name;
	int age;
	public Dog(String name,int age){
		this.name = name;
		this.age = age;
	}
	public void info(){
		System.out.println(name+" "+age);
	}
}

class T{
	String name ="mack";
	int num = 77;
	public T(){
		//这里去访问T(String name,int age)构造器
		this("jack",22);
		System.out.println("T()构造器");
	}
	public T(String name,int age){
		System.out.println("T(String name,int age)构造器");
	}

	public void f1(){
		String name ="smith"; //捣乱一下
		System.out.println("name="+name+" num="+num);
		System.out.println("name="+this.name+" num="+this.num);
	}
}

class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name =name;
		this.age =age;
	}
	public boolean compareTo(Person p){
		if(this.name.equals(p.name) && this.age == p.age){
			return true;
		}else{
			return false;
		}
	}
}