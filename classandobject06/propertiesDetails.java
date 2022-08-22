public class propertiesDetails {
	public static void main(String[] args){

		Person p1 = new Person();
		System.out.println(p1.age+" "+p1.name+" "+p1.sal+" "+p1.isPass);
	} 
}
 
class Person{
	//四个属性
	int age;   //默认值0
	String name; //默认值null
	double sal;  //默认值0.0
	boolean isPass;  //默认值false
}