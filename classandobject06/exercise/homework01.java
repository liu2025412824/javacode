public class homework01{
	public static void main(String[] args){

		A a1 = new A();
		double[] arr = {3.14,1.5,0.732,-0.6,23.5};
		Double res = a1.max(arr);
		if(res != null){
			System.out.println("arr的最大值为:"+res);
		}else{
			System.out.println("arr输入有误,数组不能为 null 或 {}");
		}
	}
}

class A{
	public Double max(double[] arr){
		if(arr != null && arr.length > 0){
			double max = arr[0];
			for(int i=1;i<arr.length;i++){
				if(max < arr[i]){
					max =arr[i];
				}
			}
			return max;
		}else{
			return null;
		}
	}

}