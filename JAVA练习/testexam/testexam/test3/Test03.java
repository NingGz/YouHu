import java.io.*;
import java.util.Map;
import java.util.HashMap;
public class Test03{
	public static void ser(Object obj,String filename){
		ObjectOutputStream oos=null;
		try{
			oos=new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeObject(obj);
			System.out.println("���л��ɹ�");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(oos!=null){
					oos.close();
				}
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}
	}
	public static Object reser(String filename){
		ObjectInputStream ois=null;
		try{
			ois=new ObjectInputStream(new FileInputStream(filename));
			System.out.println("�����л��ɹ�");
			return ois.readObject();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(ois!=null){
					ois.close();
				}
			}catch(Exception e1){
				e1.printStackTrace();
			}
		}
		System.out.println("�����л�ʧ��");
		return null;
	}
	public static void main(String args[]){
		Map<String,User> map=new HashMap<String,User>();
		User user1=new User();
		user1.setName("����");
		User user2=new User();
		user2.setName("����");
		User user3=new User();
		user3.setName("����");
		map.put("����",user1);
		map.put("����",user2);
		map.put("����",user3);
		ser(map,"map.txt");
		Map<String,User> map2=(Map<String,User>)reser("map.txt");
		System.out.println(map2.get("����").getName());
		System.out.println(map2.get("����").getName());
		System.out.println(map2.get("����").getName());
	}
}