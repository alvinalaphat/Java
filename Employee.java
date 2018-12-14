public class Employee {
	String name;
	String number;
	String hireDate;

	public Employee(String empName, String empNum, String hire) {
		name = empName;
		number = empNum;
		hireDate = hire;
	}

	public Employee() {
		name = "";
		number = "";
		hireDate = "";
	}

	public String getName() {
		return name;
	}

	public String getNumber() {
		return number;
	}
	public String getHireDate() {
		return hireDate;
	}

	public void setName(String empName) {
		name = empName;
	}

	public void setNumber(String empNumber) {
		number = empNumber;
	}

	public void setHireDate(String hire) {
		hireDate = hire;
	}
}
