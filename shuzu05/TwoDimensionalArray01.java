public class TwoDimensionalArray01 {
	public static void main(String[] args){

		// int arr[][] = new int[4][6];
		// for(int i=0;i<arr.length;i++){
		// 	for(int j=0;j<arr[i].length;j++){
		// 		System.out.print(arr[i][j]+" ");
		// 	}
		// 	System.out.println();
		// }


		// int arr[][] = new int[5][]; //������ά���飬һ����5��һά���飬����һά���黹û���ռ�
		// for(int i=0;i<arr.length;i++){
		// 	//��ÿ��һά���鿪�ռ� new
		// 	//���û�и�һά����new����ôarr[i]����null
		// 	arr[i] = new int[i+1];

		// 	//����һά���飬����һά�����ÿ��Ԫ�ظ�ֵ
		// 	for(int j=0;j<arr[i].length;j++){
		// 		arr[i][j]=j+1;
		// 		System.out.print(arr[i][j]+" ");   //չʾ����
		// 	}
		// 	System.out.println();
		// }


		// //�������
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


		// //�������(����˼ά��) 
		// int line=10;
		// int arr[][] = new int[line][];
		// for(int i=0;i<line;i++){
		// 	arr[i] = new int[i+1];
		// 	for(int j=0;j<arr[i].length;j++){
		// 		arr[i][0]=1;
		// 		arr[i][arr[i].length-1]=1;
		// 		if(i>1 && j>0){
		// 			arr[i][j]=arr[i-1][j-1]+arr[i-1][j];  //���һ��jԽ����
		// 		}
		// 		System.out.print(arr[i][j]+"\t");
		// 	}
		// 	System.out.println();
		// }


		
	}
}