
public class Student 
{
	private String firstName;
	private String lastName;
	private String GPA;
	
	private Address aList;
	
	public Student()
	{
		firstName="";
		lastName="";
		GPA="";
		aList=new Address();
	}
	
	public Student(String ln, String fn, String grade)
	{
		firstName=fn;
		lastName=ln;
		GPA=grade;
		aList=new Address();
	}
	
	public void setStudent(String ln, String fn, String grade) {
		firstName=fn;
		lastName=ln;
		GPA=grade;
		
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getGPA()
	{
		return GPA;
	}
	
	public void setAddress(String address, int index)
	{
		aList.setAddress(address,index);
	}
	
	public String toString()
	{
		return lastName + " " + firstName + " " + GPA + aList.toString();
	}

}
