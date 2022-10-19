package OPPSconcepts;

import java.awt.geom.Arc2D.Double;
public class Classandobject {

	
	

int EMPid;

String Ename;

String dept;

double salary;

String digenation;

void display()
{
	
	
	
	System.out.println(EMPid);
	System.out.println(Ename);
	System.out.println(dept);
	System.out.println(salary);
	System.out.println(digenation);

}

public static void main(String args[])
{
	

Classandobject emp=new Classandobject();

 emp.EMPid=101;
 
 emp.Ename="geetha";
 
 emp.dept="CSE";
 
 emp.digenation="HOD";
 
 emp.salary=15000.15;
 
 emp.display();



	
 Classandobject emp1=new Classandobject();

 emp1.EMPid=102;
 
 emp1.Ename="abcd";
 
 emp1.dept="ESE";
 
 emp1.digenation="Madam/Sir";
 
 emp1.salary=1530.15;
 
 emp1.display();
		
		
		
		
		
		
		
		
		
		

	}

}
