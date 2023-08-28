package ObjectCreation;

public class Student {
	    private String name;
	    private long id;
	    private String address;
		public Student(String name, long id, String address) {
			super();
			this.name = name;
			this.id = id;
			this.address = address;
		}
		public String getName() {
			return name;
		}
		public long getId() {
			return id;
		}
		public String getAddress() {
			return address;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void setId(long id) {
			this.id = id;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
		}
		
		
	    
	    
	}

	
