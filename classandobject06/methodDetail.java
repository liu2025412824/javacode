public class methodDetail{
	public static void main(String[] args){

		A a = new A();
		a.sayok();
		a.sayhi();
	}
}

class A {
	//ͬһ�����з����ĵ��ã�ֱ�ӵ���
	public void print(int n){
		System.out.println("print���������� n=" + n);
	}

	public void sayok(){
		print(10);   //sayokֱ�ӵ���print���ɣ������ٴ�������
		System.out.println("����ִ��sayok");
	}
	//�����еķ���A�����B�෽������Ҫͨ������������
	public void sayhi(){
		B b =new B();   //�ȴ���B������ٵ��ü���
		b.hi();
	}
}

class B {
	public void hi(){
		System.out.println("B���е�hi()������");
	}
}