public class method02 {
	public static void main(String[] args) {

		int arr[][] = {{0,0,1},{1,1,2},{2,2,4}};
		Mytools m1 = new Mytools();
		m1.printArr(arr);

		Mytools m2 = new Mytools();
		if(m2.isOdd(7)){
			System.out.println("是一个奇数");
		}else{
			System.out.println("是一个偶数");
		}

		Mytools m3 = new Mytools();
		m3.print(5,5,'#');



	}
}

class Mytools {
	public void printArr(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public boolean isOdd(int num){
		// if(num %2 != 0){
		// 	return true;
		// }else{
		// 	return false;
		// }
		
		//return num%2 !=0 ? true : false;

		return num%2 !=0;
	}

	public void print(int row,int col,char c){
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(c+" ");
			}
			System.out.println();
		}
	}




}