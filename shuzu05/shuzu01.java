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
		// System.out.println("������="+totalWeight+" ƽ������Ϊ"+(totalWeight/len));



		// double scores[] = new double[5];
		// Scanner input = new Scanner(System.in);
		// //��ֵ
		// for(int i = 0;i<scores.length;i++){
		// 	System.out.println("�������"+(i+1)+"��Ԫ�ص�ֵ");
		// 	scores[i] = input.nextDouble();
		// }
		// //��ӡ
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



		//���鷭ת--����һ
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

		//���鷭ת--������
		// int arr1[] = {11,22,33,44,55,66,77};
		// int arr2[] = new int[arr1.length];
		// for(int i=arr1.length-1,j=0;i>=0;i--,j++)
		// {
		// 	arr2[j] = arr1[i];
		// 	System.out.print(arr2[j]+" ");
		// }


		// //��������1.0
		// int arr[] = {1,2,3};
		// int arrNew[]= new int[arr.length+1];
		// for(int i=0;i<arr.length;i++){
		// 	arrNew[i] = arr[i];
		// }
		// arrNew[arr.length] = 4;
		// arr = arrNew;

		// System.out.println("======arr���ݺ�======");
		// for(int j=0;j<arr.length;j++){
		// 	System.out.print(arr[j]+" ");
		// }

		// //��������2.0
		// Scanner input = new Scanner(System.in);
		// int arr[] = {1,2,3};
		// while(true){
		// 	int arrNew[]= new int[arr.length+1];
		// 	for(int i=0;i<arr.length;i++){
		// 		arrNew[i] = arr[i];
		// 	}
		// 	System.out.println("������Ҫ��ӵ�Ԫ�أ�");
		// 	int addNum = input.nextInt();
		// 	arrNew[arr.length] = addNum;
		// 	arr = arrNew;

		// 	System.out.println("======arr���ݺ�======");
		// 	for(int j=0;j<arr.length;j++){
		// 		System.out.print(arr[j]+" ");
		// 	}
		// 	System.out.println("�Ƿ�������?<y/n> :");
		// 	char answer = input.next().charAt(0);
		// 	if(answer == 'n'){
		// 		break;
		// 	}
		// }
		// System.out.println("�����ɣ��������");


		//��������Beta(��ʱ��д)



		// //ð������
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
		// //���
		// for(int i=0;i<len;i++){
		// 	System.out.println(arr[i]);
		// }



		// //˳�����
		// String names[] = {"С��","С��","С��","С��"};
		// Scanner input = new Scanner(System.in);
		// int i=0;
		// System.out.println("������Ҫ���ҵ�����:");
		// String findName = input.next();

		// for(i = 0;i<names.length;i++){
		// 	if(findName.equals(names[i])){
		// 		System.out.println("��ϲ���ҵ�"+findName+"�ˣ��±�Ϊ"+i);
		// 		break;
		// 	}
		// }
		// if(i == names.length){
		// 	System.out.println("��Ǹ��û���ҵ�����Ϣ");
		// }


		// //���ַ�����(����������������)
		// int nums[] = {-1,0,3,4,9,12};
		// Scanner input = new Scanner(System.in);
		// System.out.println("������Ҫ���ҵ�����:");
		// int findNum = input.nextInt();

		// int left=0;
		// int right=nums.length-1;
		// int index = 0; //��������������Ƿ��ҵ�
		// while(left <= right){
		// 	int mid = (left+right)/2;
		// 	if(nums[mid] < findNum){
		// 		left = mid+1;
		// 	}else if(nums[mid] > findNum){
		// 		right = mid-1;
		// 	}else{
		// 		System.out.println("�ҵ�"+findNum+"�ˣ��±�Ϊ"+mid);
		// 		index = 1;
		// 		break;
		// 	}
		// }
		// if(index == 0){
		// 	System.out.println("��Ǹ��û���ҵ�������");
		// }



		// //��֪�и��������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ������
		// //�ȶ�λ��������
		// //��λ
		// int arr[] = {10,12,45,90};
		// int insertNum = 23;
		// int index = -1;
		// for(int i=0;i<arr.length;i++){
		// 	if(insertNum <= arr[i]){
		// 		index = i;  //�ҵ�Ҫ�����λ��
		// 		break; 
		// 	}
		// }
		// if(index == -1){
		// 	index = arr.length;  //˵��û���ҵ�λ�ã��嵽���
		// }
		// //����
		// int arrNew[] = new int[arr.length+1];
		// //��arr��Ԫ�ؿ�����arrNew����������indexλ��
		// for(int i=0,j=0;i<arrNew.length;i++){
		// 	if(i != index){   //˵�����԰�arr��Ԫ�ؿ�����arrNew
		// 		arrNew[i]=arr[j];
		// 		j++;
		// 	}else{     //i���λ�þ���Ҫ�������
		// 		arrNew[i]=insertNum;
		// 	}
		// }
		// arr=arrNew;
		// //չʾ
		// for(int i=0;i<arr.length;i++){
		// 	System.out.print(arr[i]+" ");
		// }



		//�������10��1-100���������浽���飬�������ӡ
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