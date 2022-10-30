package tailaph26495.lab8;



public final class XPoly {

	public static double sum(double...x) {
		double tong = 0;
		for(double list : x) {
			tong +=list;
		}
		
		return tong;
	}
	
	public static double min(double...x) {
		double min = x[0];
		for(double list : x) {
			min = Math.min(list, min);
		}
		
		return min;
	}
	
	public static double max(double...x) {
		double max = x[0];
		for(double list : x) {
			max = Math.max(list, max);
		}
		
		return max;
	}
	
	public static String toUpperFirstChar(String name) {
		String[] arrName = name.split(" ");
	
		for(int i = 0; i < arrName.length; i++) {
			arrName[i] =  String.valueOf(arrName[i].charAt(0)).toUpperCase() + arrName[i].substring(1);
			
		}
		return String.join(" ", arrName);
	
	
		
		
		
	}
	
	
	
	
}
