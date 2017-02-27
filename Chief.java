
public class Chief extends Fulltime {
	/**
	 * 
	 * @param name Chief's Name
	 * @param reg  Chief's registration number
	 * @param job  Person's Job
	 * @param year   year of start
	 * @param fweek  first week salary
	 * @param sweek  second week salary
	 * @param tweek  third week salary
	 * @param lweek   last week salary
	 * @param salary   total salary
	 * @param severancepay  severance pay
	 */
		

		public Chief(String name, String reg, String job, int year, int fweek, int sweek, int tweek, int lweek,
				double salary, double severancepay) {
			super(name, reg, job, year, fweek, sweek, tweek, lweek, salary, severancepay);
			// TODO Auto-generated constructor stub
		}

		public double getSalary() {
			double salary = 84 * 20;
			if (getFweek() > 48) {
				setFweek(48);
			}
			if (getSweek() > 48) {
				setSweek(48);
			}
			if (getTweek() > 48) {
				setTweek(48);
			}
			if (getLweek() > 48) {
				setLweek(48);
			}
			salary = salary + (((getFweek() - 40) + (getSweek() - 40) + (getTweek() - 40) + (getLweek() - 40)) * 5);

			return salary + super.getSeverancepay();

		}
}
