package sathyaquetionpapers;

import java.util.LinkedList;

public class ArrayListEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <EmployeeLL> emp = new LinkedList <EmployeeLL>();
		int ids[] = {101,102,103,104,105,106};
		String[] names = {"Mahesh","Amar","Herin","Sathya","Vinayak","Ganesh"};
		double[] salarys = {120000,40000,30000,50000,35000,65000};
		int[] deptnos = {20,10,20,20,30,10};
		String[] locations = {"Hyderabad","Chennai","Banglore","Hyderabad","pune","Banglore"};
		
		for(int i=0; i<ids.length;i++)
		{
			EmployeeLL e = new EmployeeLL();
			e.seteId(ids[i]);
			e.seteName(names[i]);
			e.seteSalary(salarys[i]);
			e.seteDeptNo(deptnos[i]);
			e.setElocation(locations[i]);
			emp.add(e);
		}System.out.println("Employee List : ");
		for(EmployeeLL em:emp) 
			System.out.println(em.geteId()+" "+em.geteName()+" "+em.geteSalary()+" "+em.geteDeptNo()+" "+em.getElocation());
		
}
}