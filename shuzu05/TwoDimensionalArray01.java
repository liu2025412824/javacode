public class TwoDimensionalArray01 {
	public static void main(String[] args){

		// int arr[][] = new int[4][6];
		// for(int i=0;i<arr.length;i++){
		// 	for(int j=0;j<arr[i].length;j++){
		// 		System.out.print(arr[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }


		// int arr[][] = new int[5][]; //创建二维数组，一个有5个一维数组，但是一维数组还没开空间
		// for(int i=0;i<arr.length;i++){
		// 	//给每个一维数组开空间 new
		// 	//如果没有给一维数组new，那么arr[i]就是null
		// 	arr[i] = new int[i+1];

		// 	//遍历一维数组，并给一维数组的每个元素赋值
		// 	for(int j=0;j<arr[i].length;j++){
		// 		arr[i][j]=j+1;
		// 		System.out.print(arr[i][j]+" ");   //展示数组
		// 	}
		// 	System.out.println();
		// }


		// //杨辉三角
		// int line=10;
		// int arr[][] = new int[line][];
		// for(int i=0;i<line;i++){
		// 	arr[i] = new int[i+1];
		// 	for(int j=0;j<arr[i].length;j++){
		// 		if(j==0 || j==arr[i].length-1){
		// 			arr[i][j]=1;
		// 		}
		// 		else{
		// 			arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
		// 		}
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// }


		// //杨辉三角(错误思维！) 
		// int line=10;
		// int arr[][] = new int[line][];
		// for(int i=0;i<line;i++){
		// 	arr[i] = new int[i+1];
		// 	for(int j=0;j<arr[i].length;j++){
		// 		arr[i][0]=1;
		// 		arr[i][arr[i].length-1]=1;
		// 		if(i>1 && j>0){
		// 			arr[i][j]=arr[i-1][j-1]+arr[i-1][j];  //最后一个j越界了
		// 		}
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// }


		
	}
}