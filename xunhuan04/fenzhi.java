import java.util.Scanner;
public class fenzhi {
	public static void main(String[] args) {
		//���ŷ�֧
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("����������");
		// int age = myscanner.nextInt();
		// if(age>=18) {
		// 	System.out.println("����������ʮ�ˣ�Ҫ���Լ�����Ϊ�����������");
		// }
		// else {
		// 	System.out.println("��ʱ����һ���ٷ�ֱ��������");
		// }


		//�жϸ����Ƿ������
		// Scanner myscanner = new Scanner(System.in);
		// System.out.println("������ø��ֵĵĳɼ���");
		// double score = myscanner.nextDouble();
		// if(score > 8.0){
		// 	System.out.println("�������Ա�:");
		// 	char gender = myscanner.next().charAt(0);
		// 	if(gender == '��'){
		// 		System.out.println("����������");
		// 	}
		// 	else if(gender == 'Ů'){
		// 		System.out.println("����Ů����");
		// 	}
		// 	else{
		// 		System.out.println("�Ա��쳣����������ʸ�");
		// 	}
		// }
		// else{
		// 	System.out.println("��Ǹ���㱻��̭��");
		// }


		/*
		//��ӡƱ��
		Scanner myscanner = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = myscanner.nextInt();
		//�ж��·��Ƿ�Ϸ�
		if(month>=1 && month <=12){
				System.out.println("�����빺Ʊ������:");
				int age = myscanner.nextInt();
				//����
				if(month>=4 && month<=10){
					if(age>0) {
						if(age>=18 && age<=60){
							System.out.println("����Ʊ 60");
						}
						else if(age <18){
							System.out.println("��ͯƱ 30");
						}
						else{
							System.out.println("����Ʊ 20");
						}
					}
					else{
						System.out.println("����Ƿ�,����������");
					}
				}
				//����
				else{
					if(age>0) {
						if(age>=18 && age<=60){
							System.out.println("����Ʊ 60");
						}
						else{
							System.out.println("���� 20");
						}
					}
					else{
						System.out.println("����Ƿ�,����������");
					}
				}
		}
		else{
			System.out.println("�Ƿ��·ݣ����������룡");
		}
		*/
	

		/*
		Scanner myscanner = new Scanner(System.in);
		System.out.println("������һ���ַ�(a-g)��");
		char c1 = myscanner.next().charAt(0);
		switch(c1){
			case 'a':
				System.out.println("����һ");
				break;
			case 'b':
				System.out.println("����һ");
				break;
			case 'c':
				System.out.println("����һ");
				break;
			default:
				System.out.println("����Ƿ�������������:");
		}*/


		//����ѧ���ɼ�����60�ֵģ�����ϸ񣬵���60�ֵģ�������ϸ�
		//����ɼ����ܴ���100����ʾ(�ɼ�/60)
		Scanner myscanner = new Scanner(System.in);
		System.out.println("������ɼ���");
		double score = myscanner.nextDouble();
		if(score>=0 && score<=100) {
			switch((int)score/60) {
				case 1:
					System.out.println("�ϸ�");
					break;
				case 0:
					System.out.println("���ϸ�");
					break;
				//default:
					//System.out.println("����Ƿ�,����������");
			}
		}
		else{
			System.out.println("����Ƿ���������0-100֮ǰ����");
		}




	}
}