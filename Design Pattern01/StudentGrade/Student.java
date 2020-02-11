package StudentGrade;

public class Student {
	public String name;
	public String ID;
    public String age;
	public String clas;

	public Student(String name, String ID, String age, String clas) {
		this.name = name;//姓名
		this.ID = ID;//学号
		this.age = age;//年龄
		this.clas = clas;//班级
	}
	
	public void See() {
		System.out.println(name + ID + age + clas);
	}
    
	public String getName() {
		return name;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getClas() {
		return clas;
	}
}
