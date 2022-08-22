import java.util.Scanner;
public class fenzhi {
	public static void main(String[] args) {
		//入门分支
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("请输入年龄");
		// int age = myscanner.nextInt();
		// if(age>=18) {
		// 	System.out.println("你的年龄大于十八，要对自己的行为负责，送入监狱");
		// }
		// else {
		// 	System.out.println("暂时放你一马，再犯直接判死刑");
		// }


		//判断歌手是否进决赛
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("请输入该歌手的的成绩：");
		// double score = myscanner.nextDouble();
		// if(score > 8.0){
		// 	System.out.println("请输入性别:");
		// 	char gender = myscanner.next().charAt(0);
		// 	if(gender == '男'){
		// 		System.out.println("进入男子组");
		// 	}
		// 	else if(gender == '女'){
		// 		System.out.println("进入女子组");
		// 	}
		// 	else{
		// 		System.out.println("性别异常，不予参赛资格");
		// 	}
		// }
		// else{
		// 	System.out.println("抱歉，你被淘汰了");
		// }


		/*
		//打印票价
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = myscanner.nextInt();
		//判断月份是否合法
		if(month>=1 && month <=12){
				System.out.println("请输入购票人年龄:");
				int age = myscanner.nextInt();
				//旺季
				if(month>=4 && month<=10){
					if(age>0) {
						if(age>=18 && age<=60){
							System.out.println("成人票 60");
						}
						else if(age <18){
							System.out.println("儿童票 30");
						}
						else{
							System.out.println("老人票 20");
						}
					}
					else{
						System.out.println("年龄非法,请重新输入");
					}
				}
				//淡季
				else{
					if(age>0) {
						if(age>=18 && age<=60){
							System.out.println("成人票 60");
						}
						else{
							System.out.println("其他 20");
						}
					}
					else{
						System.out.println("年龄非法,请重新输入");
					}
				}
		}
		else{
			System.out.println("非法月份，请重新输入！");
		}
		*/
	

		/*
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入一个字符(a-g)：");
		char c1 = myscanner.next().charAt(0);
		switch(c1){
			case 'a':
				System.out.println("星期一");
				break;
			case 'b':
				System.out.println("星期一");
				break;
			case 'c':
				System.out.println("星期一");
				break;
			default:
				System.out.println("输入非法，请重新输入:");
		}*/


		//对于学生成绩大于60分的，输出合格，低于60分的，输出不合格
		//输入成绩不能大于100，提示(成绩/60)
		Scanner myscanner = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = myscanner.nextDouble();
		if(score>=0 && score<=100) {
			switch((int)score/60) {
				case 1:
					System.out.println("合格");
					break;
				case 0:
					System.out.println("不合格");
					break;
				//default:
					//System.out.println("输入非法,请重新输入");
			}
		}
		else{
			System.out.println("输入非法，请输入0-100之前的数");
		}




	}
}