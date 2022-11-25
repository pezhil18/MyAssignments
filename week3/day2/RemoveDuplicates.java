package week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String replaceString = "";
		
		String[] split = text.split(" ");
			
		for (int j =0; j<split.length; j++) {
			
		if (split[j].contains("java")){
				
				count = count+1;
				
				if (count > 1) {
					
					replaceString = text.replace(split[j], "");
					
				}
				
			}
			
			
		}
		
		
		System.out.println(replaceString);		


		
	}
	

}
