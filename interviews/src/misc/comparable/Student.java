
/**
 * We generally use Collections.sort() method to sort a simple array list like array list of String or Integer.
 * However if the array list is of custom object, in this case we have two options of sorting- Comparable and
 *  Comparator Interfaces. 
 */

package misc.comparable;

//@SuppressWarnings("rawtypes")
public class Student implements Comparable<Student> {
	private String studentName;
	private int rollNo;
	private int studentAge;

	public Student(String studentName, int rollNo, int studentAge) {
		super();
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.studentAge = studentAge;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;

	}

	@Override
	public int compareTo(Student compareStu) {
		/*
		 * int compareage=((Student)compareStu).getStudentAge(); return
		 * this.studentAge-compareage;
		 */
		if (this.getRollNo() > compareStu.getRollNo()) {
			return 1;
		} else
			return -1;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", rollNo=" + rollNo + ", studentAge=" + studentAge + "]";
	}

}
