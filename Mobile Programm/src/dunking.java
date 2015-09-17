
public class dunking {
		private String name;
		private int age; // in year
		private double weight; //in pounds
		
	        // 오버라이딩
		public String toString() {
			return ("Name: " + name + " Age: " + age + " years"
					+ "\nWeight: " + weight + " pounds");
		}
		
		public dunking(String initialName, int initialAge, double initialWeight, String name) {
			 // 구현하시오.
			this.name = name;
		}
	        // 오버로딩
		public dunking(String initialName) {
			name = initialName;
			age = 0;
			weight = 0;
		}
		
		public dunking( int initialAge) {
			name = "No name yet.";
			weight = 0;
			if (initialAge < 0) {
				System.out.println("Error: Negative age.");
				System.exit(0);
			} else
				age = initialAge;
		}
		public dunking() {
			name = "No name yet.";
			age = 0;
			weight = 0;
		}
		public void set(String newName, int newAge, double newWeight) {
			 // 구현 하시오.
		}
		
		public void setAge( int newAge) {
	               // 구현하시오.
		}
		
		public void setWeight( double newWeight) {
		      // 구현하시오.
	       }
		
		public String getName() {
			// 구현하시오.
			return null;
		}
		
		public int getAge() {
			// 구현하시오.
			return 0;
		}
		
		public double getWeight() {
			// 구현하시오.
			return age;
		}
	}

