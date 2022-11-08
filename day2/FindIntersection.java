package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
				
		int values1[] = {3,2,11,4,6,7};
		int values2[] = {1,2,8,4,9,7};
		int i,j;
		
		System.out.println("Intersection of two Arrays");
		
		for(i=0; i<values1.length; i++) {
		for(j=0; j<values2.length; j++) {
			
			if(values1[i]==values2[j]) {
			System.out.println(values1[i]);	
			}
		}
			
			
		}
	}

}
