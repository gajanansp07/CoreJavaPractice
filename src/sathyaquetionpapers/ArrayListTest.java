package sathyaquetionpapers;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Employee> emp = new ArrayList<Employee>();
		
		int[] ids = {101,102,104,103,105};
		String[] names= {"Ganesh", "Mahesh", "Sonu", "Raju","Somnath"};
		double[] salarys = {20000.00,1200000,30000,50000,55000.00};
		
		for(int i=0;i<ids.length;i++) {
			Employee e = new Employee();
			e.empId = ids[i];
			e.empName = names[i];
			e.empSalary = salarys[i];
			emp.add(e);
		}
		System.out.println("Employees : ");
		for(Employee e : emp) {
			System.out.println(e.empId+" , "+e.empName+" , "+e.empSalary);
		}

	}

}
