package StudentGrade;

public class Student {
	public String name;
	public String ID;
    public String age;
	public String clas;

	public Student(String name, String ID, String age, String clas) {
		this.name = name;//����
		this.ID = ID;//ѧ��
		this.age = age;//����
		this.clas = clas;//�༶
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
