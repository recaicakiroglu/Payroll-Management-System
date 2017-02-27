
public class Employee extends Personnel {
/**
 * employee has 2 subclasses:full time and part time 
 * 
 * also full time has 2 subclasses chief and worker
 * 
 * 
 * @param name Employee's Name
 * @param reg  Employee's registration number
 * @param job  Person's Job
 * @param year   year of start
 * @param fweek  first week salary
 * @param sweek  second week salary
 * @param tweek  third week salary
 * @param lweek   last week salary
 * @param salary   total salary
 * @param severancepay  severance pay
 */
	public Employee(String name, String reg, String job, int year, int fweek, int sweek, int tweek, int lweek,
			double salary, double severancepay) {
		super(name, reg, job, year, fweek, sweek, tweek, lweek, salary, severancepay);
		// TODO Auto-generated constructor stub
	}



}



