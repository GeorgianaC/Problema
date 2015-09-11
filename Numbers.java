package number;

		public class Numbers {
			
			private int number;
			
			public Numbers(int number) {
				
				this.number = number;
			}
			
			public String div() {
		    	String s = "";
		    			
				for (int i = 1; i <= 100; i++) {				
					if (i%15 == 0) {					
							s += "FizzBuzz\n";
					} else if(i%5 == 0) {						
							 s += "Buzz\n";
					} else if(i%3 == 0)						
							 s += "Fizz\n";				
					else { 
							 s += i + "\n";							
						}
				}
					return s;
		    }
}

