package dao;
import java.util.*;
public interface Employeedao {
	public List<Employee> getallEmployee();
    public Employee getEmployee(int Empid);
    public void updateEmployee(Employee employee);
    public void deleteEmployee(Employee employee);
	
}
