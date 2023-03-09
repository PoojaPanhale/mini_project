package jdbc;

public class Employee {
private int id;
private String ename;
private float salary;
private int age;
public Employee()
{
	}
public Employee(int id, String ename, float salary, int age) {
	super();
	this.id = id;
	this.ename = ename;
	this.salary = salary;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + ", age=" + age + "]";
}

}
