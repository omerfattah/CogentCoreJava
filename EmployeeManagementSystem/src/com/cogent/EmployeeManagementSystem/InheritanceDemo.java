package com.cogent.EmployeeManagementSystem;
import com.cogent.EmployeeManagementSystem.model.Employee;
import com.cogent.EmployeeManagementSystem.model.Manager;
import com.cogent.EmployeeManagementSystem.model.ProjectManager;
public class InheritanceDemo {

	public final int a;
	int b;
	public InheritanceDemo() {
		this.a = 0;
		// TODO Auto-generated constructor stub
	}
	
	
	public  static final void main(String[] args) {
		final int b=100;

		System.out.println("hello from omer"+b);
		
		
		
		// TODO Auto-generated method stub
		/*
		Employee manager=new Manager();
		//All functionalities from employee+overridden methods
		System.out.println("emp id "+manager.getEmpSalary());
		
		ProjectManager pmanager=new ProjectManager();
		
		float salary = manager.calculateSalary();
		
		System.out.println(salary);
		
		System.out.println(manager.calculateSalary());
		
		Manager manager2=(Manager) manager;
		System.out.println(manager2.getProjectAllow());
		
		ProjectManager pm=new ProjectManager();
		//E+M+PM
		Manager pm=new ProjectManager();
		//E+M
		Employee pm=new ProjectManager();
		//E
		*/
	}

}
