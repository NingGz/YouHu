import java.io.*;
public class Test0302{
	public static void innerFile(String s,String filename){
		try{
			FileOutputStream fis=new FileOutputStream(filename);
			fis.write(s.getBytes());
			fis.close();
			System.out.println("写入文件成功");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static int readFileAI(String filename){
		try{
			FileInputStream fis=new FileInputStream(filename);
			int len;
			int sum=0;
			while((len=fis.read())!=-1){
				if((char)len=='a'||(char)len=='i'){
					sum++;
				}
			}
			fis.close();
			System.out.println("读取文件成功");
			return sum;
		}catch(Exception e){
			e.printStackTrace();
		}
		return 0;
	}
	public static void main(String args[]){
		String s="Each year one vicious habit rooted out,in time minght make the worst man good throughou.";
		innerFile(s,"test.txt");
		System.out.println(readFileAI("test.txt"));
		
	}
}