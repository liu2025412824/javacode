public class propertiesDetails {
	public static void main(String[] args){

		Person p1 = new Person();
		System.out.println(p1.age+" "+p1.name+" "+p1.sal+" "+p1.isPass);
	} 
}
 
class Person{
	//�ĸ�����
	int age;   //Ĭ��ֵ0
	String name; //Ĭ��ֵnull
	double sal;  //Ĭ��ֵ0.0
	boolean isPass;  //Ĭ��ֵfalse
}