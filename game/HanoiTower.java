public class HanoiTower{
	public static void main(String[] args){

		Tower t = new Tower();
		t.move(3,'A','B','C');
	}
}

class Tower{
	//num��ʾ�ƶ��ĸ���,abc�ֱ��ʾA,B,C��
	public void move(int num,char a,char b,char c){
		//���ֻ��1���̣�num=1
		if(num == 1){
			System.out.println(a+"->"+c);
		}else{
			//����ж�����ӣ����Կ�����������������������������(num-1)
			//(1)���ƶ������������ӵ�b,����c
			move(num-1,a,c,b);
			//(2)�����������������ƶ���c
			System.out.println(a+"->"+c);
			//(3)�ٰ�b���ϵ������̣��ƶ���c,����a
			move(num-1,b,a,c);
		}
	}
}