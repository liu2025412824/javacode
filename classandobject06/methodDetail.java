public class methodDetail{
	public static void main(String[] args){

		A a = new A();
		a.sayok();
		a.sayhi();
	}
}

class A {
	//同一个类中方法的调用：直接调用
	public void print(int n){
		System.out.println("print方法被调用 n=" + n);
	}

	public void sayok(){
		print(10);   //sayok直接调用print即可，不需再创建对象
		System.out.println("继续执行sayok");
	}
	//跨类中的方法A类调用B类方法：需要通过对象名调用
	public void sayhi(){
		B b =new B();   //先创建B类对象，再调用即可
		b.hi();
	}
}

class B {
	public void hi(){
		System.out.println("B类中的hi()被调用");
	}
}