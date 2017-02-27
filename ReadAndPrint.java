import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Locale;
/**
 * 
 * @author Recai
 *
 */
public class ReadAndPrint {
	/**
	 * 
	 * @param people Arraylist
	 * @throws IOException exception if there is no file exists
	 */
	public  void Print(ArrayList<Personnel> people) throws IOException{
		for (int i = 0; i < people.size(); i++) {
			File file2 = new File(people.get(i).getReg()+".txt");
			FileWriter fw = new FileWriter(file2.getAbsoluteFile());
			PrintWriter pw = new PrintWriter(fw);
			String[] name = people.get(i).getName().split(" ");
			String lastname = name[name.length-1];
			String temp[] = new String[name.length-1];
			for (int j = 0; j < name.length-1; j++) {
				temp[j]=name[j];
			}
			String firstname = String.join(" ", temp);
			pw.println("Name : " + firstname);
			pw.println();
			pw.println("Surname : " + lastname);
			pw.println();
			pw.println("Registration Number : " + people.get(i).getReg());
			pw.println();
			pw.println("Position : " + people.get(i).getJob());
			pw.println();
			pw.println("Year of Start : " + people.get(i).getYear());
			pw.println();
			String s = String.format(Locale.US, "%.2f", people.get(i).getSalary());
			pw.printf("Total Salary : %s TL",s);
			pw.close();
		}
	}
	/**
	 * 
	 * @param STR parameter string for selecting which file pass through function
	 * @return returns all text file in one string
	 * @throws IOException exception if there is no file exists
	 */
	@SuppressWarnings("resource")
	public  String ReadFile(String STR) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(
			    new InputStreamReader(
			        new FileInputStream(STR),
			        "UTF-8"));
		
		String line;
		StringBuffer stringBuffer = new StringBuffer();
		while ((line = bufferedReader.readLine()) != null) {
			stringBuffer.append(line);
			stringBuffer.append("\n");
		}
		String text = stringBuffer.toString();
		return text;
	}
	
	
	
	
	
	
	
	
	
	
}
