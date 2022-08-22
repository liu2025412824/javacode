import java.util.Scanner;
public class xunhuan {
	public static void main(String[] args){
		/*
		int i=0;
		for(i=0;i<10;i++){
			System.out.println("你好"+i);
		}
		*/


		/*
		Scanner my = new Scanner(System.in);
		char answer= ' ';
		do {
			System.out.println("使出闪电五连鞭~");
			System.out.println("还钱吗？");
			answer = my.next().charAt(0);
			System.out.println("他的回答是:"+answer);
		}while(answer != 'y');

		System.out.println("终于还钱了");
		*/


		/*
		Scanner myscanner = new Scanner(System.in);
		double totalSum = 0;
		int passNum = 0;
		for(int i=1;i<=3;i++){
			double sum=0;  //一个班的总分
			for(int j=1;j<=5;j++){
				System.out.println("请输入第"+i+"个班，第"+j+"个学生的成绩");
				double score = myscanner.nextDouble();
				sum = sum + score;
				System.out.println("成绩为"+score);
				if(score>=60){
					passNum++;
				}
			}
			System.out.println("第"+i+"个班总成绩为"+sum+" 平均分为"+(sum/5));
			totalSum = totalSum + sum;
		}
		System.out.println("三个班的总分为"+totalSum+" 平均分为"+(totalSum/15));
		System.out.println("及格人数为"+passNum+"人");
	  	*/


		/*
		//打印空心金字塔
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入要打印的层数:");
		int leveal = myscanner.nextInt();
		for(int i=1;i<=leveal;i++) {
			for(int k=1;k<=leveal-i;k++){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				//当前行的第一个位置是*，最后一个位置也是*,最后一行全是*
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
			System.out.println("请输入名字:");
			name = myscanner.next();
			System.out.println("请输入密码:");
			passwd = myscanner.next();
			//比较输入的密码和名字是否正确
			if("丁真".equals(name) && "666".equals(passwd)){
				System.out.println("登陆成功！");
				break;
			}else{
				System.out.println("用户名或密码错误，请重新输入:");
			}
			chance--;
			System.out.println("你还有"+chance+"次登录机会");
		}
		*/


		/*
		//过路费
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
		System.out.println("还剩"+money+"元");
		System.out.println("可以经过"+count+"次");
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


		// //求1-1/2+1/3-1/4.....1/100的和
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



		//求1+(1+2)+(1+2+3)+...+(1+2+3+...+100)的结果
		int sum = 0;
		for(int i=1;i<=100;i++){
			for(int j=1;j<=i;j++){
				sum = sum + j;
			}
		}
		System.out.println("sum="+sum);


	}
}