public class OverLoad01{
	public static void main(String[] args){

		// Mycalculator mc = new Mycalculator();
		// System.out.println(mc.calculate(1,3));
		// System.out.println(mc.calculate(1,3.1));

		// Methods m1 =new Methods();
		// m1.m(10);
		// m1.m(10,3);
		// m1.m("hello,world");

		Methods m2 = new Methods();
		System.out.println(m2.max(10,88));
		System.out.println(m2.max(32.4,34.6));
		System.out.println(m2.max(32.4,34.6,43.2));

	}
}

// class Mycalculator{
// 	public int calculate(int n1,int n2){
// 		return n1+n2;
// 	}
// 	public double calculate(int n1,double n2){
// 		return n1+n2;
// 	}
// 	public double calculate(double n1,int n2){
// 		return n1+n2;
// 	}
// 	public int calculate(int n1,int n2,int n3){
// 		return n1+n2+n3;
// 	}
// }

class Methods{
	public void m(int n1){
		System.out.println(n1*n1);
	}
	public void m(int n1,int n2){
		System.out.println(n1*n2);
	}
	public void m(String str){
		System.out.println(str);
	}

	public int max(int n1,int n2){
		return n1>n2 ? n1 : n2; 
	}
	public double max(double n1,double n2){
		return n1>n2 ? n1 : n2;
	}
	public double max(double n1,double n2,double n3){
		double max1 = n1>n2 ? n1 : n2;
		double max2 = max1>n3 ? max1 :n3;
		return max2;
	}
}