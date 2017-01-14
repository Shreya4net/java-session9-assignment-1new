package session9;



import java.util.*;  

public class Hdtv {

	
		public int size;
		public String brand;
	 
		public Hdtv(int size, String brand) {
			this.size = size;
			this.brand = brand;
		}
	 
		public int getSize() {
			return size;
		}
	 
		public void setSize(int size) {
			this.size = size;
		}
	 
		public String getBrand() {
			return brand;
		}
	 
		public void setBrand(String brand) {
			this.brand = brand;
		}
	}
	 
	class SizeComparator implements Comparator<Hdtv> {
	
		public int compare(Hdtv t1, Hdtv t2) {
			int t1Size = t1.getSize();
			int t2Size = t2.getSize();
	 
			if (t1Size > t2Size) {
				return 1;
			} else if (t1Size < t2Size) {
				return -1;
			} else {
				return 0;
			}
		}
		
	}	
		

		
	


		
	

	





	
	


   
     
	




  
	
	   
	
	    
	     
  


