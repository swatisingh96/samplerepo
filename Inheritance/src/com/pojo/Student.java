package com.pojo;

public class Student implements Serializarion {
		private int rollNo, total;
		public Student() {
			rollNo=0;
			total=0;
			
		}
		public Student(int rollNo, int total) {
			super();
			this.rollNo = rollNo;
			this.total = total;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public int getTotal() {
			return total;
		}
		public void setTotal(int total) {
			this.total = total;
		}
		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", total=" + total + "]";
		}
		
}
