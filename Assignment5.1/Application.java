import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		Student [] sList = new Student[3];
		//Student aStudent=new Student();
		int count=0;
		
		System.out.printf("Select:\n1. Enter a new student\n2. Print the student list.\n3.Exit the program\n");
		int quitFlag=s.nextInt();
			String fn, ln, grade;
		
			while (quitFlag!=3) {
				if (quitFlag==2) 
				{
					for(int i =0;i<count;i++) 
					{
						System.out.println(sList[i].toString());
					}//end for
					break;
				}//end if
				else if (quitFlag == 3) {
					break;
				}//end else if
				else if(quitFlag==1) {
					s.nextLine();
					System.out.println("First Name:");
					fn=s.nextLine();
					System.out.println("Last Name:");
					ln=s.nextLine();
					System.out.println("GPA:");
					grade=s.nextLine();
					Student aStudent=new Student();
					aStudent.setStudent(ln,fn,grade);
					sList[count]=aStudent;
					String a;
						for (int i=0;i<3;i++)
						{
							System.out.println("Enter an address:");
							a=s.nextLine();
							aStudent.setAddress(a,i);
						}//end for
					}//end else if
				System.out.println("Student "+count);
				
				count++;
				System.out.printf("Select:\n1. Enter a new student\n2. Print the student list.\n3.Exit the program\n");
				quitFlag=s.nextInt();
			}//end while
			
		s.close();	
	
	}//end main

}//end class
