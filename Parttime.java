
public class Parttime extends Employee{

	/**
	 * 
 * @param name Parttime's Name
 * @param reg  Parttime's registration number
 * @param job  Person's Job
 * @param year   year of start
 * @param fweek  first week salary
 * @param sweek  second week salary
 * @param tweek  third week salary
 * @param lweek   last week salary
 * @param salary   total salary
 * @param severancepay  severance pay
	 */
	
public Parttime(String name, String reg, String job, int year, int fweek, int sweek, int tweek, int lweek,
			double salary, double severancepay) {
		super(name, reg, job, year, fweek, sweek, tweek, lweek, salary, severancepay);
		// TODO Auto-generated constructor stub
	}

public double getSalary(){
	if (getFweek() < 10) {
		setFweek(0);
	}
	if (getSweek() < 10) {
		setSweek(0);
	}
	if (getTweek() < 10) {
		setTweek(0);
	}
	if (getLweek() < 10) {
		setLweek(0);
	}
	if (getFweek() > 20) {
		setFweek(20);
	}
	if (getSweek() > 20) {
		setSweek(20);
	}
	if (getTweek() > 20) {
		setTweek(20);
	}
	if (getLweek() > 20) {
		setLweek(20);
	}
	int hour = getFweek()+getSweek()+getTweek()+getLweek();
	double salary = 12*hour;
	
	return salary;
}
	
}
