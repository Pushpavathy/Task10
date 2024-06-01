package task10;
class Tea
{
	public void prepareTea()
	{
		System.out.println(" This method has basic tea prepared with Hotwater and tea leaves");
	}
	public void addMilk()
	{
		System.out.println("Adding Milk to basic tea");
		
	}
	public void addSugar()
	{
		System.out.println("Adding Sugar to basic tea");
	}
}
class BlackTea extends Tea
{
	 public void prepareTea() {
		System.out.println("This method will prepare black tea by mixing hotwater, tea leaves, sugar with in 5 mins");
	}
}
class GreenTea extends Tea
{
	public void prepareTea() {
		System.out.println("This method will prepare Green tea by mixing hotwater, tea leaves within 2 mins");
	}
}
class HerbalTea extends Tea
{
	public void prepareTea() {
		System.out.println("This method will prepare Herbal tea by mixing hotwater, tea leaves, herbs within 10 mins");
	}
}
public class Question5 {

	public static void main(String[] args) {
		BlackTea blackT = new BlackTea();
		blackT.prepareTea();
		GreenTea greenT = new GreenTea();
		greenT.prepareTea();
		HerbalTea herbT = new HerbalTea();
		herbT.prepareTea();
	}

}
