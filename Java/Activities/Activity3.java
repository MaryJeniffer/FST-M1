package activities;

public class Activity3 {
	public static void main(String args[]) {
		double seconds = 1000000000;
		
		double earthSeconds = 31557600;
		double mercurySeconds = 0.2408467;
		double venusSeconds = 0.61519726;
		double marsSeconds = 1.8808158;
		double jupiterSeconds = 11.862615;
		double saturnSeconds = 29.447498;
		double uranusSeconds = 84.016846;
		double neptuneSeconds = 164.79132;
		
		Activity3 obj=new Activity3();
		System.out.println("age on neptune "+obj.ageOnPlanets(seconds, earthSeconds, neptuneSeconds));
		System.out.println("age on earth "+obj.ageOnPlanets(seconds, earthSeconds));
	}
	
	public double ageOnPlanets(double secs, double earthSecs)
	{
		double age = secs / earthSecs;
		return age;
	}
	
	public double ageOnPlanets(double secs, double earthSecs, double planetSecs)
	{
		double age = secs / earthSecs / planetSecs;
		return age;
	}
}

