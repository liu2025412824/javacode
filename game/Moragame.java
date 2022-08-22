import java.util.Random;
import java.util.Scanner;

//主类,测试类
public class Moragame{
	//创建一个玩家对象
	Tom t = new Tom();
	//用来记录最后输赢的次数
	int isWinCount = 0;

	//创建一个二维数组，用来接收局数,Tom出拳情况以及电脑除权情况
	int[][] arr1 = new int[3][3];
	int j=0;

	//创建一个一维数组，用来接收输赢情况
	String[] arr2 = new String[3];

	Scanner input = new Scanner(System.in);
	for(int i=0;i<3;i++){   //比赛3次
		//获取玩家出拳
		System.out.println("请输入你要出的拳(0-石头 1-剪刀 2-布) :");
		int num = input.nextInt();
		t.setTomGuessNum(num);
		int tomGuess = t.getTomGuessNum();
		arr1[i][j+1] = tomGuess;

		//获取电脑出拳
		int comGuess = t.computerNum;
		arr1[i][j+2] = comGuess;

		//将玩家猜的拳与电脑做比较
		String isWin = t.vsComputer();
		arr2[i] = isWin;
		arr1[i][j] = t.count;

		//对每一局的情况进行输出
		System.out.println("========================================");
		System.ut.println("局数\t玩家的出拳\t电脑的出拳\t输赢情况");
		System.out.println(t.count+"\t"+tomGuess+"\t\t"+comGuess+"\t\t"+arr2[i]);
		System.out.println("========================================");
		System.out.println("\n\n");
		isWinCount = t.winCount(isWin);
	}
}