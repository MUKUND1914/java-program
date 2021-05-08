package dao;

public class Employee 
{
  int Empid;
  String Empname;
  Employee(int Empid,String Empname)
  {
	  this.Empid=Empid;
	  this.Empname=Empname;
  }
public int getEmpid() {
	return Empid;
}
public void setEmpid(int empid) {
	Empid = empid;
}
public String getEmpname() {
	return Empname;
}
public void setEmpname(String empname) {
	Empname = empname;
}

  
}
