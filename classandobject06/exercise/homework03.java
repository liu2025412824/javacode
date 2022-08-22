public class homework03{
	public static void main(String[] args){

		Circle c = new Circle();
		PassObject p = new PassObject();
		p.printAreas(c,5);

	}
}

class Circle{
	double radius;
	// Circle(){

	// }
	// public Circle(double radius){
	// 	this.radius = radius;
	// }                             //这里不用构造器较好

	public double findArea(double radius){
		return Math.PI*radius*radius; 
	}
	public void setRadius(double radius){
		this.radius = radius;
	}
}

class PassObject{
	public void printAreas(Circle c,double times){
		System.out.println("Radius\tArea");
		for(double i =1;i<=times;i++){
			c.setRadius(i);
			System.out.println(i+"\t"+c.findArea(i));
		}
	}
}