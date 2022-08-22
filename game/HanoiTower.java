public class HanoiTower{
	public static void main(String[] args){

		Tower t = new Tower();
		t.move(3,'A','B','C');
	}
}

class Tower{
	//num表示移动的个数,abc分别表示A,B,C塔
	public void move(int num,char a,char b,char c){
		//如果只有1个盘，num=1
		if(num == 1){
			System.out.println(a+"->"+c);
		}else{
			//如果有多个盘子，可以看成两个，最下面的最上面的所有盘(num-1)
			//(1)先移动上面所有盘子到b,借助c
			move(num-1,a,c,b);
			//(2)把最下面的这个盘子移动到c
			System.out.println(a+"->"+c);
			//(3)再把b塔上的所有盘，移动到c,借助a
			move(num-1,b,a,c);
		}
	}
}