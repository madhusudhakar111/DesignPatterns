package creational.prototype;

public class Employee implements Cloneable {

	String empID;
	Department dept;

	public Employee(String empID, Department dept) {
		super();
		this.empID = empID;
		this.dept = dept;
	}
	
	
	public String getEmpID() {
		return empID;
	}
	public void setEmpID(String empID) {
		this.empID = empID;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	// shallow copy clone method. this is default
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	/*
	 * @Override protected Object clone() throws CloneNotSupportedException {
	 * Employee emp = (Employee) super.clone(); emp.dept = (Department)
	 * dept.clone(); return emp; }
	 */
	
	
}
