/**
 * 
 * @author Recai
 *
 */
public class Personnel {
	/**
	 *  superclass Personnel
	 *  constructor getter and setters are included here
	 *  common variables stored
	 */
private String name;
private String reg;
private String job;
private int year;
private int fweek;
private int sweek;
private int tweek;
private int lweek;
private double salary;
private double Severancepay;
public Personnel(String name, String reg, String job, int year, int fweek, int sweek, int tweek, int lweek,
		double salary, double severancepay) {
	super();
	this.name = name;
	this.reg = reg;
	this.job = job;
	this.year = year;
	this.fweek = fweek;
	this.sweek = sweek;
	this.tweek = tweek;
	this.lweek = lweek;
	this.salary = salary;
	Severancepay = severancepay;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getReg() {
	return reg;
}
public void setReg(String reg) {
	this.reg = reg;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public int getFweek() {
	return fweek;
}
public void setFweek(int fweek) {
	this.fweek = fweek;
}
public int getSweek() {
	return sweek;
}
public void setSweek(int sweek) {
	this.sweek = sweek;
}
public int getTweek() {
	return tweek;
}
public void setTweek(int tweek) {
	this.tweek = tweek;
}
public int getLweek() {
	return lweek;
}
public void setLweek(int lweek) {
	this.lweek = lweek;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public double getSeverancepay() {
	Severancepay= (2016 - year) * 20 * 0.8;
	return Severancepay;
}
public void setSeverancepay(double severancepay) {
	Severancepay = severancepay;
}



}