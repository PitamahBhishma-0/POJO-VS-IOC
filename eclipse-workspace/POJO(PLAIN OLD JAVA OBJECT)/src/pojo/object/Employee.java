package pojo.object;

public class Employee {
           private String ename;
           private int Salary;
           private int eid;
           Employee(){
           }
           
           Employee(String name,int salary,int eid){
        	   this.eid=eid;
        	   this.ename=name;
        	   this.Salary=salary;
           }

		public String getEname() {
			return ename;
		}

		public void setEname(String ename) {
			this.ename = ename;
		}

		public int getSalary() {
			return Salary;
		}

		public void setSalary(int salary) {
			Salary = salary;
		}

		public int getEid() {
			return eid;
		}

		public void setEid(int eid) {
			this.eid = eid;
		}

		@Override
		public String toString() {
			return "Employee [ename=" + ename + ", Salary=" + Salary + ", eid=" + eid + "]";
		}

}
