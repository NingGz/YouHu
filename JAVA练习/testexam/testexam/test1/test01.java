import java.util.Scanner;
public class test01{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		StringBuffer s=new StringBuffer(s1);
		String s2=s.reverse().toString();
		if(s1.equals(s2)){
			System.out.println("是回文");
		}else{
			System.out.println("不是回文");
		}
	}
}