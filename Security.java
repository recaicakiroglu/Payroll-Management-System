
public class Security extends Personnel{

	/**
 * 
 * @param name Security's Name
 * @param reg  Security's registration number
 * @param job  Person's Job
 * @param year   year of start
 * @param fweek  first week salary
 * @param sweek  second week salary
 * @param tweek  third week salary
 * @param lweek   last week salary
 * @param salary   total salary
 * @param severancepay  severance pay
	 */

public Security(String name, String reg, String job, int year, int fweek, int sweek, int tweek, int lweek,
			double salary, double severancepay) {
		super(name, reg, job, year, fweek, sweek, tweek, lweek, salary, severancepay);
		// TODO Auto-generated constructor stub
	}

public double getSalary()
{
	double salary = 9*24;
	if (getFweek() > 54) {
		setFweek(54);
	}
	if (getSweek() > 54) {
		setSweek(54);
	}
	if (getTweek() > 54) {
		setTweek(54);
	}
	if (getLweek() > 54) {
		setLweek(54);
	}
	int hour = getFweek()+getSweek()+getTweek()+getLweek();
	salary = salary + 6.5*hour;
	return salary + super.getSeverancepay();
}





}
