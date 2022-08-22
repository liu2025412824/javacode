public class recursion {
	public static void main(String[] args){

		T t1 = new T();
		//t1.test(4);

		//递归
		//int n=5;
		//int res = t1.factorial(n);
		//System.out.println(n+"的阶乘为:"+res);

		//斐波那契
		// int n=7;
		// int res = t1.fibonacci(n);
		// if(res != -1){
		// 	System.out.println("斐波那契数列第"+n+"个数字为"+res);
		// }


		//猴子吃桃
		/*(有一堆桃子，猴子每天都吃其中的一半并再多吃一个，
		第十天的时候想再吃时，只有一个桃子，问最初有几个桃子)*/
		int day = 1;
		int peachNum = t1.peach(day);
		if(peachNum != -1){
			System.out.println("第"+day+"天有"+peachNum+"个桃子");
		}



	}
}

class T {
	public void test(int n){
		if(n>2){
			test(n-1);
		}
		System.out.println("n="+n);
	}

	//递归方法
	public int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}

	//斐波那契数列方法
	public int fibonacci(int n){
		if(n >= 1){
			if(n==1 || n==2){
				return 1;
			}else{
				return fibonacci(n-1) + fibonacci(n-2);
			}
		}else{
			System.out.println("请输入大于等于1的数字");
			return -1;
		}

	}


	//猴子吃问题
	public int peach(int day) {
		if(day == 10){  //第10天，只有一个桃
			return 1;
		}else if(day>=1 && day<=9){
			return (peach(day+1)+1)*2;
		}else{
			System.out.println("day在1-10");
			return -1;
		}
	}


}
