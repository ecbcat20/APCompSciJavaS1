package arrayList;

public class Student {
	
	public String name;
	public int id;
	
	public Student() {
		
	}
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	int getID() {
		return id;
	}
	
	String getName() {
		return name;
	}

}
