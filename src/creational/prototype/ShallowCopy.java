package creational.prototype;

public class ShallowCopy {
		
	 public static void main(String[] args) throws CloneNotSupportedException {
		 
		 Department dept = new Department("1", "Information Technology");
		 Employee emp = new Employee("1" , dept);
		 Employee emp2 = null;
		 
		 emp2 = (Employee) emp.clone();
		 
		 // Shallow copy
		 System.out.println(emp2.dept.getDeptID());  // 1	 
		 emp2.dept.setDeptID("2");		 		 
		 System.out.println(emp2.dept.getDeptID());  // 2
		 System.out.println(emp.dept.getDeptID());  // 2
		 
		// Deep copy
		 
/**		 System.out.println(emp2.dept.getDeptID());  // 1
		 emp2.dept.setDeptID("2");
		 System.out.println(emp2.dept.getDeptID());  // 2
		 System.out.println(emp.dept.getDeptID());  // 1
		 
		 */
		 
	 }
	
}
