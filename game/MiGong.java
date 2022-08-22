public class MiGong {
	public static void main(String[] args){

		//1.先创建迷宫
		//2.先规定map数组的元素值：0表示可以走，1表示障碍物
		int map[][] = new int[8][7];
		//3.将最上面一行和最下面一行全部设置为1
		for(int i=0;i<7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4.将最右面和最左面的一列全部设置为1
		for(int i=1;i<8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;//测试回溯

		//输出当前地图
		System.out.println("======当前地图情况======");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

		//使用findWay给老鼠找路
		T t1 = new T();
		t1.findWay(map,1,1);
		System.out.println("\n======找路情况如下======");
		for(int i=0;i<map.length;i++){
			for(int j=0;j<map[i].length;j++){
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}

	}
}

class T{
	//使用递归回溯的思想来解决老鼠出迷宫
	//1.findWay方法就是专门来找出迷宫的路径
	//2.如果找到，就返回true,否则返回false
	//3.map就是二维数组，即表示迷宫
	//4. i,j就是老鼠的位置，初始化的位置为(1,1)
	//5.因为我们是递归的找路，所以我们先规定map数组各个值的含义
	//   0表示可以走，1表示障碍物 2表示可以走 3表示走过，但是走不通是死路
	//6. 当map[6][5]=2就说明找到通路,就可以结束，否则就继续找
	//7. 先确定老鼠找路的策略 下->右->上->左
	public boolean findWay(int map[][],int i,int j){
		if(map[6][5] == 2){  //说明已经找到通路
			return true;
		}else{
			if(map[i][j] == 0){ //当前这个位置0，说明可以走
				//我们假定走得通
				map[i][j]=2;
				if(findWay(map,i+1,j)){ //先走下
					return true;
				}else if(findWay(map,i,j+1)){
					return true;
				}else if(findWay(map,i-1,j)){
					return true;
				}else if(findWay(map,i,j-1)){
					return true;
				}else{
					map[i][j] = 3;
					return false;
				}
			}else{  //map[i][j]= 1,2,3
				return false;
			}
		}
	}

}