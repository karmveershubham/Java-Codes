

import java.util.Scanner;

class EmployeeDetails
{
String eName,eId;
String eDesg;
void getDetails()
{
System.out.println("Employee name.: "+eName);
System.out.println("Employee Id.: "+eId);
System.out.println("Employee Designation.: "+eDesg);
}
}

class EmployeeContact
{
long ePhoneNo;
String eMailId;
void getContact()
{
System.out.println("Employee Phone No.: "+ePhoneNo);
System.out.println("Employee Mail Id.: "+eMailId);
}
}

class EmployeeAddress
{
String eHNo,eStreetName,eCity,eDist,eState,eCountry;
int ePinCode;
void getAddress()
{
System.out.println("Employee House no.: "+eHNo);
System.out.println("Employee Street Name.: "+eStreetName);
System.out.println("Employee City.: "+eCity);
System.out.println("Employee Pincode.: "+ePinCode);
System.out.println("Employee District.: "+eDist);
System.out.println("Employee State.: "+eState);
System.out.println("Employee Country.: "+eCountry);
}
}

class EmployeeSalary
{
int eBasSal;
void getEmployeeSalary()
{
System.out.println("Employee Basic Salary.: "+eBasSal);
}
}

class EmployeeMainClass
{
public static void main(String args[])
{
EmployeeDetails ed = new EmployeeDetails();
EmployeeContact ec = new EmployeeContact();
EmployeeAddress ea = new EmployeeAddress();
EmployeeSalary  es  =new EmployeeSalary();

Scanner s = new Scanner(System.in); 
System.out.println("Enter Employee's Name.: ");
ed.eName = s.nextLine();
System.out.println("Enter Employee's ID.: ");
ed.eId= s.nextLine();
System.out.println("Enter Employee's Designation.: ");
ed.eDesg= s.nextLine();
System.out.println("\nEmployee's Details:\n ");
ed.getDetails();

System.out.println("\nEnter Employee's Phone No.: ");
ec.ePhoneNo=Long.parseLong(s.nextLine());
System.out.println("Enter Employee's EmailId.: ");
ec.eMailId=s.nextLine();
System.out.println("\nEmployee's Contact Details.:\n");
ec.getContact();

System.out.println("\nEnter Employee's House No.: ");
ea.eHNo=s.nextLine();
System.out.println("Enter Employee's street Name.: ");
ea.eStreetName=s.nextLine();
System.out.println("Enter Employee's City.: ");
ea.eCity=s.nextLine();
System.out.println("Enter Employee's District.: ");
ea.eDist=s.nextLine();
System.out.println("Enter Employee's State.: ");
ea.eState=s.nextLine();
System.out.println("Enter Employee's Country.: ");
ea.eCountry=s.nextLine();
System.out.println("Enter Employee's PIN code.: ");
ea.ePinCode=s.nextInt();
System.out.println("\nEmployee's Address Details.:\n");
ea.getAddress();

System.out.println("\nEnter Employee's Base Salary.: ");
es.eBasSal=s.nextInt();
es.getEmployeeSalary();

s.close();
}
}
































