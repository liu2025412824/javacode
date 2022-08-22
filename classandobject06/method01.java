public class method01 {
	public static void main(String[] args) {

		Person p1 = new Person();//先创建对象
		p1.speak();//调用方法
		p1.cal01();
		p1.cal02(100);
		int sum=p1.getSum(3,4);
		System.out.println(sum);
	}
}

class Person {
	String name;
	int age;

	public void speak() {
		System.out.println("我是好人");
	}
	public void cal01(){
		int res=0;
		for(int i=0;i<100;i++){
			res +=i;
		}
		System.out.println("cal01方法计算结果为"+res);
	}
	public void cal02(int n){
		int res=0;
		for(int i=0;i<n;i++){
			res +=i;
		}
		System.out.println("cal02方法计算结果为"+res);
	}
	public int getSum(int n1,int n2){
		int res = n1+n2;
		return res;
	}

}