public class recursion {
	public static void main(String[] args){

		T t1 = new T();
		//t1.test(4);

		//�ݹ�
		//int n=5;
		//int res = t1.factorial(n);
		//System.out.println(n+"�Ľ׳�Ϊ:"+res);

		//쳲�����
		// int n=7;
		// int res = t1.fibonacci(n);
		// if(res != -1){
		// 	System.out.println("쳲��������е�"+n+"������Ϊ"+res);
		// }


		//���ӳ���
		/*(��һ�����ӣ�����ÿ�춼�����е�һ�벢�ٶ��һ����
		��ʮ���ʱ�����ٳ�ʱ��ֻ��һ�����ӣ�������м�������)*/
		int day = 1;
		int peachNum = t1.peach(day);
		if(peachNum != -1){
			System.out.println("��"+day+"����"+peachNum+"������");
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

	//�ݹ鷽��
	public int factorial(int n){
		if(n == 1){
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}

	//쳲��������з���
	public int fibonacci(int n){
		if(n >= 1){
			if(n==1 || n==2){
				return 1;
			}else{
				return fibonacci(n-1) + fibonacci(n-2);
			}
		}else{
			System.out.println("��������ڵ���1������");
			return -1;
		}

	}


	//���ӳ�����
	public int peach(int day) {
		if(day == 10){  //��10�죬ֻ��һ����
			return 1;
		}else if(day>=1 && day<=9){
			return (peach(day+1)+1)*2;
		}else{
			System.out.println("day��1-10");
			return -1;
		}
	}


}
