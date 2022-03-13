package Array;
//Write a program to create Student class having rollno, name, marks.Create 10 objects
// Using Array of Objects display information of student who got highest marks
public class Q24Student {
	int rollNo;
	String name;
	int marks;
	Q24Student(int rollNo,String name,int marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		
	}
	
	public String toString() 
	{
		return "Q24Student [rollNo=" + rollNo + ", name=" + name + ", marks="
				+ marks + "]";
	}

}
