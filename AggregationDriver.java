class University{
	String name;
	int unicode;
	int noOfColleges;
	String type;
	int establishedYear;
	int course;
	College college1;

	University(String name,int unicode,int noOfColleges,String type,int establishedYear,int course)
	{
		this.name = name;
		this.unicode = unicode;
		this.noOfColleges = noOfColleges;
		this.type = type;
		this.establishedYear = establishedYear;
		this.course = course;
	}

	public void displayUniversity()
	{
		System.out.println();
		System.out.println("***University Deatils***");
		System.out.println(" Name "+this.name);
		System.out.println("unicode "+this.unicode);
		System.out.println("noOfColleges "+this.noOfColleges);
		System.out.println("Type "+this.type);
		System.out.println("establishedYear "+this.establishedYear);
		System.out.println("Course "+this.course);
	}
	public void createInstanceOfCollege(String name , int collegeCode ,String address , int noOfDepartment  ,char grade , int staffCount)
	{
		college1 = new College(name,collegeCode,address,noOfDepartment,grade,staffCount);
	}
}

class College{
	String name;
	int collegeCode;
	String address;
	int noOfDepartment;
	char grade;
	int staffCount;
	Department department;

	College(String name,int collegeCode,String address,int noOfDepartment,char grade,int staffCount)
	{
		this.name = name;
		this.collegeCode = collegeCode;
		this.address = address;
		this.noOfDepartment = noOfDepartment;
		this.grade = grade;
		this.staffCount = staffCount;
	}

	public void displayCollege()
	{
		System.out.println();
		System.out.println("***College Deatils***");
		System.out.println("name "+this.name);
		System.out.println("collegeCode "+this.collegeCode);
		System.out.println("Address "+this.address);
		System.out.println("noOfDepartment "+this.noOfDepartment);
		System.out.println("Grade "+this.grade);
		System.out.println("staffCount "+this.staffCount);
	}
	public void createInstanceOfDepartment(String name, String hodName,int classsroom,int noofstaff,int noofsubject)
	{
		department = new Department(name, hodName, classsroom, noofstaff, noofsubject);
	}
}

class Department{
	String name;
	String hodName;
	int classsroom;
	int noofstaff;
	int noofsubject;
	Teacher teacher;

	Department(String name,String hodName,int classsroom,int noofstaff,int noofsubject)
	{
		this.name = name;
		this.hodName = hodName;
		this.classsroom = classsroom;
		this.noofstaff = noofstaff;
		this.noofsubject = noofsubject;
	}
	public void displayDepartment()
	{
		System.out.println();
		System.out.println("***Department Deatils***");
		System.out.println("name "+this.name);
		System.out.println("hodName "+this.hodName);
		System.out.println("classsroom "+this.classsroom);
		System.out.println("noofstaff "+this.noofstaff);
		System.out.println("noofsubject "+this.noofsubject);
	}
	public void createInstanceofTeacher(String name, String subject, int phonenumber, String qualification,double experience)
	{
	teacher = new Teacher(name , subject, phonenumber, qualification,experience);
	}
}
class Teacher
{
	String name;
	String subject;
	int phonenumber;
	String qualification;
	double experience;

	Teacher(String name,String subject,int phonenumber,String qualification,double experience)
	{
		this.name = name;
		this.subject = subject;
		this.phonenumber = phonenumber;
		this.qualification = qualification;
		this.experience = experience;
	}
	public void displayTeacher()
	{
		System.out.println();
		System.out.println("***Teacher Deatils***");
		System.out.println("name "+this.name);
		System.out.println("subject "+this.subject);
		System.out.println("phonenumber "+this.phonenumber);
		System.out.println("qualification "+this.qualification);
		System.out.println("experience "+this.experience);
	}
}
class AggregationDriver
{
	public static void main(String[] args)
	 {
	 	University obj = new University("SPPU",1201,1000,"GOVERMENT",1950,300);
	 	obj.displayUniversity();
	 	obj.createInstanceOfCollege("MORDEN",1234,"pune",10,'A',100);
	 	obj.college1.displayCollege();
	 	obj.college1.createInstanceOfDepartment("AI","ghuge",7,8,50);
	 	obj.college1.department.displayDepartment();
	 	obj.college1.department.createInstanceofTeacher("Anjali","java",9623,"MCA",5.7);
	 	obj.college1.department.teacher.displayTeacher();


	}
}