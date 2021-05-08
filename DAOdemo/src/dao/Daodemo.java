package dao;

public class Daodemo {
  public static void main(String[]args )
  {
	  Employeedao empdao=new EmployeedaoImp();
	  //for printing all employee
	  for(Employee employee:empdao.getallEmployee())
	  {
		  System.out.println("Employee id:"+employee.getEmpid()+", Emplyee name:"+employee.getEmpname());
	  }
	  //for update
	  Employee emp=empdao.getallEmployee().get(0);
	  emp.setEmpname("Yukesh");
	  empdao.updateEmployee(emp);
	  //to get Employee
	  empdao.getEmployee(1);
	  System.out.println("Employee id:"+emp.getEmpid()+", Employee name:"+emp.getEmpname());
  }
}
