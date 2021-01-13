package singleton;

public class AppConfi {
	
	private AppConfi() {
		System.out.println("hii");
		
	}

	private static AppConfi obj=new AppConfi();
		
	public static AppConfi get() {
		return obj;
	}
	
	
}
