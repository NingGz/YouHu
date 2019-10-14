/**
*Animal抽象类
*/
abstract class Animal{
	String name;//名称
	String color;//颜色
	String type;//类别
	Animal(String n,String c,String t){
		name=n;
		color=c;
		type=t;
	}
	abstract void eat();
	abstract void shut();
}
/**
* 含有游泳方法的接口
*/
interface Skill{
	void swim();
}
/**
*兔子类 继承Animal类 实现Skill接口
*/
class Rabbit extends Animal implements Skill{
	Rabbit(String n,String c){
		super(n,c,"哺乳类");
	}
	void eat(){
		System.out.println("兔子:"+name+"吃");
	}
	void shut(){
		System.out.println("兔子:"+name+"叫");
	}
	public void swim(){
		System.out.println("兔子:"+name+"游泳");
	}
}
/**
*青蛙类 继承Animal类 实现Skill接口
*/
class Frog extends Animal implements Skill{
	Frog(String n,String c){
		super(n,c,"非哺乳类");
	}
	void eat(){
		System.out.println("青蛙:"+name+"吃");
	}
	void shut(){
		System.out.println("青蛙:"+name+"叫");
	}
	public void swim(){
		System.out.println("青蛙:"+name+"游泳");
	}
}
public class Test02{
	public static void main(String args[]){
		//兔子测试
		Rabbit r=new Rabbit("小白","黑色");
		r.eat();
		r.shut();
		r.swim();
		//青蛙测试
		Frog f=new Frog("小绿","白色");
		f.eat();
		f.shut();
		f.swim();
	}
}