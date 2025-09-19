public class Student {
		
		private String id;
		private String name;
		private String gender;
		private String DOB;
		private String address;
		
		static int counter = 1;
			
		Student() {
				
		}
		
		Student(String id, String name, String gender, String DOB, String address) {
		
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.DOB = DOB;
			this.address = address;
		
		}
		
		Student(String name, String gender, String DOB, String address){
		
			this.name = name;
			this.gender = gender;
			this.DOB = DOB;
			this.address = address;
			this.id = "SP25-BCS-"+counter;
			counter++;
		}
		
		Student(Student s){
		
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.DOB = DOB;
			this.address = address;
		
		}
		
		void setName(String name){
			
			this.name = name;
		}
		
		void setGender(String gender){
			this.gender = gender;
		}
		
		void setDob(String DOB){
			this.DOB = DOB;
		}
		
		void setAddress(){
			this.address = address;
		}
		
		String getId(){
			return id;
		}
		
		String getName(){
			return name;
		}
		
		String getGender(){
			return gender;
		}
		
		String getDob(){
			return DOB;
		}
		
		String getAddress(){
			return address;
		}
		
		@Override
		public String toString(){
			return String.format("Name: %s ID: %s Gender: %s DOB: %s Address: %s", name, id, gender, DOB, address);
		}
		
		
}