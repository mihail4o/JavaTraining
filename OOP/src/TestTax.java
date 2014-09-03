public class TestTax {
	

	public static void main(String[] args) {
		
		NJTax t = new NJTax();
		
		t.grossIncome = 80000;
		t.numberOfDependents = 2;
		t.state = "NJ";
		
		double yourTax = t.calcTax();
		double celsius = WeatherReport.convertToCelsius(100.7);
		System.out.println("Celsius :" + celsius);
		
		System.out.println("Your tax is " + yourTax);

	}

}
