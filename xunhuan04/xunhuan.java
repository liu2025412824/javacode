import java.util.Scanner;
public class xunhuan {
	public static void main(String[] args){
		/*
		int i=0;
		for(i=0;i<10;i++){
			System.out.println("���"+i);
		}
		*/


		/*
		Scanner my = new Scanner(System.in);
		char answer= ' ';
		do {
			System.out.println("ʹ������������~");
			System.out.println("��Ǯ��");
			answer = my.next().charAt(0);
			System.out.println("���Ļش���:"+answer);
		}while(answer != 'y');

		System.out.println("���ڻ�Ǯ��");
		*/


		/*
		Scanner myscanner = new Scanner(System.in);
		double totalSum = 0;
		int passNum = 0;
		for(int i=1;i<=3;i++){
			double sum=0;  //һ������ܷ�
			for(int j=1;j<=5;j++){
				System.out.println("�������"+i+"���࣬��"+j+"��ѧ���ĳɼ�");
				double score = myscanner.nextDouble();
				sum = sum + score;
				System.out.println("�ɼ�Ϊ"+score);
				if(score>=60){
					passNum++;
				}
			}
			System.out.println("��"+i+"�����ܳɼ�Ϊ"+sum+" ƽ����Ϊ"+(sum/5));
			totalSum = totalSum + sum;
		}
		System.out.println("��������ܷ�Ϊ"+totalSum+" ƽ����Ϊ"+(totalSum/15));
		System.out.println("��������Ϊ"+passNum+"��");
	  	*/


		/*
		//��ӡ���Ľ�����
		Scanner myscanner = new Scanner(System.in);
		System.out.println("������Ҫ��ӡ�Ĳ���:");
		int leveal = myscanner.nextInt();
		for(int i=1;i<=leveal;i++) {
			for(int k=1;k<=leveal-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				//��ǰ�еĵ�һ��λ����*�����һ��λ��Ҳ��*,���һ��ȫ��*
				if(j==1 || j==2*i-1 || i==leveal){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}	
			}
			System.out.println("");
		}
		*/


		/*
		Scanner myscanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;
		int i=0;
		for(i=1;i<=3;i++){
			System.out.println("����������:");
			name = myscanner.next();
			System.out.println("����������:");
			passwd = myscanner.next();
			//�Ƚ����������������Ƿ���ȷ
			if("����".equals(name) && "666".equals(passwd)){
				System.out.println("��½�ɹ���");
				break;
			}else{
				System.out.println("�û����������������������:");
			}
			chance--;
			System.out.println("�㻹��"+chance+"�ε�¼����");
		}
		*/


		/*
		//��·��
		double money = 100000;
		int count = 0;
		while(money >= 1000 ){
			if(money>50000){
				money=money - money*0.05;
				count++;
			}
			else{
				money=money - 1000;
				count++;
			}
		}
		money=(int)money;
		System.out.println("��ʣ"+money+"Ԫ");
		System.out.println("���Ծ���"+count+"��");
		*/


		/*
		int count=0;
		for(int i=1;i<=100;i++){
			if(i % 5 !=0){
				System.out.print(i+"\t");
				count++;
			}
			if(count == 5){
				System.out.println("");
				count = 0;
			}
		}
		*/



		// for(char c1='a';c1<='z';c1++){
		// 	System.out.print(c1 + " ");
		// }
		// System.out.println("");
		// for(char c2='Z';c2>='A';c2--){
		// 	System.out.print(c2 + " ");
		// }


		// //��1-1/2+1/3-1/4.....1/100�ĺ�
		// double a=1;
		// int i=0;
		// double sum=0;
		// for(i=1;i<=100;i++){
		// 	if(i%2 != 0){
		// 		sum += a/i;
		// 	}
		// 	else{
		// 		sum -= a/i;
		// 	}
		// }
		// System.out.println(sum);



		//��1+(1+2)+(1+2+3)+...+(1+2+3+...+100)�Ľ��
		int sum = 0;
		for(int i=1;i<=100;i++){
			for(int j=1;j<=i;j++){
				sum = sum + j;
			}
		}
		System.out.println("sum="+sum);


	}
}