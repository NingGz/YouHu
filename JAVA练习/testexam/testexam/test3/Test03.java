import java.io.*;
import java.util.Map;
import java.util.HashMap;
public class Test03{
	public static void ser(Object obj,String filename){
		ObjectOutputStream oos=null;
		try{
			oos=new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeObject(obj);
			System.out.println("序列化成功");
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
			System.out.println("反序列化成功");
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
		System.out.println("反序列化失败");
		return null;
	}
	public static void main(String args[]){
		Map<String,User> map=new HashMap<String,User>();
		User user1=new User();
		user1.setName("盖伦");
		User user2=new User();
		user2.setName("蛮王");
		User user3=new User();
		user3.setName("赵信");
		map.put("盖伦",user1);
		map.put("蛮王",user2);
		map.put("赵信",user3);
		ser(map,"map.txt");
		Map<String,User> map2=(Map<String,User>)reser("map.txt");
		System.out.println(map2.get("盖伦").getName());
		System.out.println(map2.get("蛮王").getName());
		System.out.println(map2.get("赵信").getName());
	}
}