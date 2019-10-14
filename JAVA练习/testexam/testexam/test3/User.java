import java.io.Serializable;
public class User implements Serializable{
	private String id;
	private String name;
	private String password;
	private String type;
	public void setId(String id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public void setType(String type){
		this.type=type;
	}
	public String getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public String getPassword(){
		return password;
	}
}