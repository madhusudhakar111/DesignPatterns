package creational.prototype;

public class Department implements Cloneable {
	
	private String deptID;
	private String deptName;
			
	public Department(String deptID, String deptName) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
	}
	
	
	public String getDeptID() {
		return deptID;
	}
	public void setDeptID(String deptID) {
		this.deptID = deptID;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	// shallow copy clone method. this is default
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	

}
