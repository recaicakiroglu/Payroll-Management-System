
public class Worker extends Fulltime{
	/**
	 * 
	 * @param name Worker's Name
	 * @param reg  Worker's registration number
	 * @param job  Person's Job
	 * @param year   year of start
	 * @param fweek  first week salary
	 * @param sweek  second week salary
	 * @param tweek  third week salary
	 * @param lweek   last week salary
	 * @param salary   total salary
	 * @param severancepay  severance pay
	 */
		

		public Worker(String name, String reg, String job, int year, int fweek, int sweek, int tweek, int lweek,
				double salary, double severancepay) {
			super(name, reg, job, year, fweek, sweek, tweek, lweek, salary, severancepay);
			// TODO Auto-generated constructor stub
		}

		public double getSalary() {
			double salary = 73 * 20;
			if (getFweek() > 50) {
				setFweek(50);
			}
			if (getSweek() > 50) {
				setSweek(50);
			}
			if (getTweek() > 50) {
				setTweek(50);
			}
			if (getLweek() > 50) {
				setLweek(50);
			}
			salary = salary + (((getFweek() - 40) + (getSweek() - 40) + (getTweek() - 40) + (getLweek() - 40)) * 4);

			return salary + super.getSeverancepay();

		}
}
