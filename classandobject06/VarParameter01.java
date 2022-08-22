public class VarParameter01{
	public static void main(String[] args){
		
		// int arr[] = {1,11,21};
		// Method m1 = new Method();
		// System.out.println(m1.sum(arr));

		double arr1[] = {93.0,67.5,78.5};
		double arr2[] = {93.0,67.5,78.5,75.5};
		Method m2 = new Method();
		System.out.println(m2.showScore("����",arr1));
		System.out.println(m2.showScore("����",arr2));
	}
}

class Method{
	public int sum(int... nums){
		//System.out.println("���ղ�������Ϊ:"+nums.length);
		int res=0;
		for(int i=0;i<nums.length;i++){
			res += nums[i];
		}
		return res;
	}

	public String showScore(String name,double... score){
		double totalScore = 0;
		for(int i=0;i<score.length;i++){
			totalScore += score[i];
		}
		return (name+" "+score.length+"�ſε��ܳɼ�Ϊ:"+totalScore);
	}
}