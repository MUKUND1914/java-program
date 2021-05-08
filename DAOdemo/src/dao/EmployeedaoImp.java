package dao;

import java.util.*;

public class EmployeedaoImp implements Employeedao {
    List<Employee> Emp;
    public EmployeedaoImp()
    {
    	 Emp=new ArrayList<Employee>();
    	Employee e1=new  Employee(1,"mukund");
    	Employee e2=new  Employee(2,"ukesh");
    	Emp.add(e1);
    	Emp.add(e2);
    }
	
	
	@Override
	public List<Employee> getallEmployee() {
		// TODO Auto-generated method stub
		return Emp;
	}

	@Override
	public Employee getEmployee(int Empid) {
		// TODO Auto-generated method stub
		return Emp.get(Empid);
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
       Emp.get(employee.getEmpid()).setEmpname(employee.getEmpname());
       System.out.println("Employee id :"+employee.getEmpid()+", updated");
	}

	@Override
	public void deleteEmployee(Employee employee) {
		// TODO Auto-generated method stub
        Emp.remove(employee.getEmpid());
        System.out.println("Employee id:"+employee.getEmpid() +", is deleted");
	}


	

	
}
