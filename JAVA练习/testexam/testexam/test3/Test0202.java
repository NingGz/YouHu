class MyException extends Exception{
	String msg;
	MyException(String msg){
		super(msg);
	}
}
class Triangle{
	int x,y,z;
	Triangle(int x,int y,int z) throws Exception{
		this.x=x;
		this.y=y;
		this.z=z;
		if((x+y)<=z||(x+z)<=y||(y+z)<=x){
			throw new MyException("���ܹ���������");
		}
	}
	public void showMess(){
		System.out.println("���������߳��ֱ�Ϊ:"+x+" "+y+" "+z);
	}
	public double getArea(){
		double p=1/2.0*(x+y+z);
		return Math.pow(p*(p-x)*(p-y)*(p-z),0.5);
	}
}
public class Test0202{
	public static void main(String args[]){
		try{
			Triangle t=new Triangle(3,4,5);
			t.showMess();
			System.out.println("���Ϊ:"+t.getArea());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}