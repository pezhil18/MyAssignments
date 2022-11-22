package week3.day1;

public class Automation extends MultipleLangauge implements Language, TestTool{

	public static void main(String[] args) {
		
		Automation Auto = new Automation();
		Auto.python();
		Auto.ruby();
		Auto.Java();
		Auto.Selenium();
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby");
	}

	public void Selenium() {

		System.out.println("Selenium");
		
	}

	public void Java() {

		System.out.println("Java");
		
	}

}
