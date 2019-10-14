/**
*Animal������
*/
abstract class Animal{
	String name;//����
	String color;//��ɫ
	String type;//���
	Animal(String n,String c,String t){
		name=n;
		color=c;
		type=t;
	}
	abstract void eat();
	abstract void shut();
}
/**
* ������Ӿ�����Ľӿ�
*/
interface Skill{
	void swim();
}
/**
*������ �̳�Animal�� ʵ��Skill�ӿ�
*/
class Rabbit extends Animal implements Skill{
	Rabbit(String n,String c){
		super(n,c,"������");
	}
	void eat(){
		System.out.println("����:"+name+"��");
	}
	void shut(){
		System.out.println("����:"+name+"��");
	}
	public void swim(){
		System.out.println("����:"+name+"��Ӿ");
	}
}
/**
*������ �̳�Animal�� ʵ��Skill�ӿ�
*/
class Frog extends Animal implements Skill{
	Frog(String n,String c){
		super(n,c,"�ǲ�����");
	}
	void eat(){
		System.out.println("����:"+name+"��");
	}
	void shut(){
		System.out.println("����:"+name+"��");
	}
	public void swim(){
		System.out.println("����:"+name+"��Ӿ");
	}
}
public class Test02{
	public static void main(String args[]){
		//���Ӳ���
		Rabbit r=new Rabbit("С��","��ɫ");
		r.eat();
		r.shut();
		r.swim();
		//���ܲ���
		Frog f=new Frog("С��","��ɫ");
		f.eat();
		f.shut();
		f.swim();
	}
}