import java.util.Random;
import java.util.Scanner;

//����,������
public class Moragame{
	//����һ����Ҷ���
	Tom t = new Tom();
	//������¼�����Ӯ�Ĵ���
	int isWinCount = 0;

	//����һ����ά���飬�������վ���,Tom��ȭ����Լ����Գ�Ȩ���
	int[][] arr1 = new int[3][3];
	int j=0;

	//����һ��һά���飬����������Ӯ���
	String[] arr2 = new String[3];

	Scanner input = new Scanner(System.in);
	for(int i=0;i<3;i++){   //����3��
		//��ȡ��ҳ�ȭ
		System.out.println("��������Ҫ����ȭ(0-ʯͷ 1-���� 2-��) :");
		int num = input.nextInt();
		t.setTomGuessNum(num);
		int tomGuess = t.getTomGuessNum();
		arr1[i][j+1] = tomGuess;

		//��ȡ���Գ�ȭ
		int comGuess = t.computerNum;
		arr1[i][j+2] = comGuess;

		//����Ҳµ�ȭ��������Ƚ�
		String isWin = t.vsComputer();
		arr2[i] = isWin;
		arr1[i][j] = t.count;

		//��ÿһ�ֵ�����������
		System.out.println("========================================");
		System.ut.println("����\t��ҵĳ�ȭ\t���Եĳ�ȭ\t��Ӯ���");
		System.out.println(t.count+"\t"+tomGuess+"\t\t"+comGuess+"\t\t"+arr2[i]);
		System.out.println("========================================");
		System.out.println("\n\n");
		isWinCount = t.winCount(isWin);
	}
}