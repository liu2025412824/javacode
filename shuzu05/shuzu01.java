import java.util.Scanner;
public class shuzu01 {
	public static void main(String[] args) {

		// double[] hens = {3,5,2.5,3.1,4.2,4};
		// double totalWeight = 0;
		// int len = hens.length;
		// for(int i=0;i<len;i++)
		// {
		// 	System.out.println(hens[i]);
		// 	totalWeight += hens[i];
		// }
		// System.out.println("总体重="+totalWeight+" 平均体重为"+(totalWeight/len));



		// double scores[] = new double[5];
		// Scanner input = new Scanner(System.in);
		// //赋值
		// for(int i = 0;i<scores.length;i++){
		// 	System.out.println("请输入第"+(i+1)+"个元素的值");
		// 	scores[i] = input.nextDouble();
		// }
		// //打印
		// for(int j=0;j<5;j++){
		// 	System.out.println(scores[j]);
		// }


		// int[] arr1 = {10,20,30};
		// int[] arr2 = new int[arr1.length];
		// for(int i=0;i<arr1.length;i++)
		// {
		// 	arr2[i] = arr1[i];
		// 	System.out.println(arr2[i]);
		// }



		//数组翻转--方法一
		// int[] arr = {11,22,33,44,55,66,77};
		// int tmp = 0;
		// for(int i=0;i<(arr.length)/2;i++){
		// 	tmp = arr[i];
		// 	arr[i] = arr[(arr.length)-i-1];
		// 	arr[(arr.length)-i-1] = tmp;
		// }
		// for(int j=0;j<arr.length;j++){
		// 	System.out.print(arr[j]+" ");
		// }

		//数组翻转--方法二
		// int arr1[] = {11,22,33,44,55,66,77};
		// int arr2[] = new int[arr1.length];
		// for(int i=arr1.length-1,j=0;i>=0;i--,j++)
		// {
		// 	arr2[j] = arr1[i];
		// 	System.out.print(arr2[j]+" ");
		// }


		// //数组扩容1.0
		// int arr[] = {1,2,3};
		// int arrNew[]= new int[arr.length+1];
		// for(int i=0;i<arr.length;i++){
		// 	arrNew[i] = arr[i];
		// }
		// arrNew[arr.length] = 4;
		// arr = arrNew;

		// System.out.println("======arr扩容后======");
		// for(int j=0;j<arr.length;j++){
		// 	System.out.print(arr[j]+" ");
		// }

		// //数组扩容2.0
		// Scanner input = new Scanner(System.in);
		// int arr[] = {1,2,3};
		// while(true){
		// 	int arrNew[]= new int[arr.length+1];
		// 	for(int i=0;i<arr.length;i++){
		// 		arrNew[i] = arr[i];
		// 	}
		// 	System.out.println("请输入要添加的元素：");
		// 	int addNum = input.nextInt();
		// 	arrNew[arr.length] = addNum;
		// 	arr = arrNew;

		// 	System.out.println("======arr扩容后======");
		// 	for(int j=0;j<arr.length;j++){
		// 		System.out.print(arr[j]+" ");
		// 	}
		// 	System.out.println("是否继续添加?<y/n> :");
		// 	char answer = input.next().charAt(0);
		// 	if(answer == 'n'){
		// 		break;
		// 	}
		// }
		// System.out.println("添加完成，程序结束");


		//数组缩减Beta(暂时不写)



		// //冒泡排序
		// int arr[] = {23,12,5,46,37};
		// int len=arr.length;
		// int tmp = 0;
		// for(int i=0;i<len-1;i++){
		// 	for(int j=0;j<len-1-i;j++){
		// 		if(arr[j] > arr[j+1]){
		// 			tmp = arr[j];
		// 			arr[j] = arr[j+1];
		// 			arr[j+1] = tmp;
		// 		}
		// 	}
		// }
		// //输出
		// for(int i=0;i<len;i++){
		// 	System.out.println(arr[i]);
		// }



		// //顺序查找
		// String names[] = {"小白","小金","小紫","小青"};
		// Scanner input = new Scanner(System.in);
		// int i=0;
		// System.out.println("请输入要查找的名字:");
		// String findName = input.next();

		// for(i = 0;i<names.length;i++){
		// 	if(findName.equals(names[i])){
		// 		System.out.println("恭喜你找到"+findName+"了，下标为"+i);
		// 		break;
		// 	}
		// }
		// if(i == names.length){
		// 	System.out.println("抱歉，没有找到该信息");
		// }


		// //二分法查找(有序升序整型数组)
		// int nums[] = {-1,0,3,4,9,12};
		// Scanner input = new Scanner(System.in);
		// System.out.println("请输入要查找的数字:");
		// int findNum = input.nextInt();

		// int left=0;
		// int right=nums.length-1;
		// int index = 0; //索引，用来辨别是否找到
		// while(left <= right){
		// 	int mid = (left+right)/2;
		// 	if(nums[mid] < findNum){
		// 		left = mid+1;
		// 	}else if(nums[mid] > findNum){
		// 		right = mid-1;
		// 	}else{
		// 		System.out.println("找到"+findNum+"了，下标为"+mid);
		// 		index = 1;
		// 		break;
		// 	}
		// }
		// if(index == 0){
		// 	System.out.println("抱歉，没有找到该数字");
		// }



		// //已知有个升序数组，要求插入一个元素，该数组顺序依然是升序
		// //先定位，再扩容
		// //定位
		// int arr[] = {10,12,45,90};
		// int insertNum = 23;
		// int index = -1;
		// for(int i=0;i<arr.length;i++){
		// 	if(insertNum <= arr[i]){
		// 		index = i;  //找到要插入的位置
		// 		break; 
		// 	}
		// }
		// if(index == -1){
		// 	index = arr.length;  //说明没有找到位置，插到最后
		// }
		// //扩容
		// int arrNew[] = new int[arr.length+1];
		// //将arr的元素拷贝到arrNew，并且跳过index位置
		// for(int i=0,j=0;i<arrNew.length;i++){
		// 	if(i != index){   //说明可以把arr的元素拷贝到arrNew
		// 		arrNew[i]=arr[j];
		// 		j++;
		// 	}else{     //i这个位置就是要插入的数
		// 		arrNew[i]=insertNum;
		// 	}
		// }
		// arr=arrNew;
		// //展示
		// for(int i=0;i<arr.length;i++){
		// 	System.out.print(arr[i]+" ");
		// }



		//随机生成10个1-100的整数保存到数组，并倒叙打印
		int arr[] = new int[10];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100)+1;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}






	}
}