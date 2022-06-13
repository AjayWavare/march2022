[200~//NOTE:THESE ARE NOTES NOT A PROGRAM

class Employee implements Comparable<Employee>{//if you want to sort array of non premitive type then that array must implement comparable interface
		private String name;//to commit changes
			private int empid;
				private float salary;
					public Employee() {
								// TODO Auto-generated constructor stub
								// 	}
								// 		public Employee(String name, int empid, float salary) {
								// 				this.name = name;
								// 						this.empid = empid;
								// 								this.salary = salary;
								// 									}
								// 										public String getName() {
								// 												return name;
								// 													}
								// 														public void setName(String name) {
								// 																this.name = name;
								// 																	}
								// 																		public int getEmpid() {
								// 																				return empid;
								// 																					}
								// 																						public void setEmpid(int empid) {
								// 																								this.empid = empid;
								// 																									}
								// 																										public float getSalary() {
								// 																												return salary;
								// 																													}
								// 																														public void setSalary(float salary) {
								// 																																this.salary = salary;
								// 																																	}
								// 																																		
								// 																																			//------------------------------------------------------------------------------------------------------
								// 																																				//	@Override
								// 																																				//	public int compareTo(Employee other) {
								// 																																				//		return this.name.compareTo(other.name);
								// 																																				//	}
								// 																																					
								// 																																						@Override
								// 																																							public int compareTo(Employee other) {
								// 																																									return this.empid - other.empid;
								// 																																										}
								//
								// 																																										//	@Override
								// 																																										//	public int compareTo(Employee other) {
								// 																																										//		return (int) (this.salary - other.salary);
								// 																																										//	}
								// 																																											
								// 																																												@Override
								// 																																													public String toString() {
								// 																																															return String.format("%-15s%-5d%-7.2f", this.name, this.empid, this.salary);//for o/p formating
								// 																																																}
								// 																																																}
								// 																																																class CompareByName implements Comparator<Employee>{
								// 																																																	@Override
								// 																																																		public int compare(Employee e1, Employee e2) {
								// 																																																				return e1.getName().compareTo(e2.getName());
								// 																																																					}
								// 																																																					}
								// 																																																					class CompareByEmpid implements Comparator<Employee>{
								// 																																																						@Override
								// 																																																							public int compare(Employee e1, Employee e2) {
								// 																																																									return e1.getEmpid() - e2.getEmpid();
								// 																																																										}
								// 																																																										}
								// 																																																										class CompareBySalary implements Comparator<Employee>{
								// 																																																											@Override
								// 																																																												public int compare(Employee e1, Employee e2) {
								// 																																																														return (int) (e1.getSalary() - e2.getSalary());
								// 																																																															}
								// 																																																															}
								// 																																																																
								// 																																																																public class Program {
								// 																																																																	private static Scanner sc = new Scanner(System.in);
								// 																																																																		public static Employee[] getEmployees() {//created a static  method for array of object of type Employee with return type arr..
								// 																																																																				Employee[] arr = new Employee[5];
								// 																																																																						arr[0] = new Employee("Umesh", 15, 55000.50f);//if you want to sort array of non premitive type then that array must implement comparable interface
								// 																																																																								arr[1] = new Employee("Gautam", 11, 50000.50f);
								// 																																																																										arr[2] = new Employee("Chetan", 14, 45000.50f);
								// 																																																																												arr[3] = new Employee("Sandeep", 13, 40000.50f);
								// 																																																																														arr[4] = new Employee("Digvijay", 12, 35000.50f);
								// 																																																																																return arr;
								// 																																																																																	}
								// 																																																																																		public static void main(String[]args)
								// 																																																																																			{
								// 																																																																																					Employee []arr=program.getEmployees()//catching method in main method
								// 																																																																																						}
								// 																																																																																							
								// 																																																																																								
								// 																																																																																									
								// 																																																																																									}
								// 																																																																																									//comparto is a method of comparable interface:wq
								/
					/
