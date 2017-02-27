import java.io.IOException;
import java.util.ArrayList;
/**
 * 
 * @author Recai
 *
 */
public class Main {
	/** 
	 *  the operation in here is adding and calling other functions or methods
	 * @param args args[0] and args[1] for inputs
	 * @throws IOException exception if there is no file exists
	 */
	public static void main(String[] args) throws IOException {
		ReadAndPrint readObj = new ReadAndPrint();
		ArrayList<Personnel> list = new ArrayList<Personnel>();
		String Person = readObj.ReadFile(args[0]);
		String Reg = readObj.ReadFile(args[1]);
		
		for (int i = 0; i < Person.length(); i++) {
			char c = Person.charAt(i);
			if(Character.isLetter(c)){
				
				Person=Person.substring(i);
				break;
			}
		}
		for (int i = 0; i < Reg.length(); i++) {
			char c = Reg.charAt(i);
			if(Character.isLetter(c)){
			
				Reg=Reg.substring(i);
				break;
			}
		}
		String lines[] = Person.split("\n");
		String Reglines[] = Reg.split("\n");

		for (int i = 0; i < lines.length; i++) {
			String words[] = lines[i].split("\t");
			int year = Integer.parseInt(words[3]);
		
			if (words[2].equals("WORKER")) {
				Worker worker = new Worker(words[0], words[1], words[2], year, 0, 0, 0, 0, 0, 0);
				list.add(worker);
			}
			if (words[2].equals("SECURITY")) {
				Security sec = new Security(words[0], words[1], words[2], year, 0, 0, 0, 0, 0, 0);
				list.add(sec);
			}
			if (words[2].equals("OFFICER")) {
				Officer off = new Officer(words[0], words[1], words[2], year, 0, 0, 0, 0, 0, 0);
				list.add(off);
			}
			if (words[2].equals("MANAGER")) {
				Manager mng = new Manager(words[0], words[1], words[2], year, 0, 0, 0, 0, 0, 0);
				list.add(mng);
			}
			if (words[2].equals("CHIEF")) {
				Chief chief = new Chief(words[0], words[1], words[2], year, 0, 0, 0, 0, 0, 0);
				list.add(chief);
			}
			if (words[2].equals("PARTTIME_EMPLOYEE")) {
				Parttime parttime = new Parttime(words[0], words[1], words[2], year, 0, 0, 0, 0, 0, 0);
				list.add(parttime);
			}
		}
		for (int i = 0; i < Reglines.length; i++) {
			for (int j = 0; j < list.size(); j++) {
				String regs[] = Reglines[i].split("\t");
				int fweek = Integer.parseInt(regs[1]);
				int sweek = Integer.parseInt(regs[2]);
				int tweek = Integer.parseInt(regs[3]);
				int lweek = Integer.parseInt(regs[4]);
				if (regs[0].equals(list.get(j).getReg())) {
					list.get(j).setFweek(fweek);
					list.get(j).setSweek(sweek);
					list.get(j).setTweek(tweek);
					list.get(j).setLweek(lweek);

				}
			}
		}
		readObj.Print(list);

	}

}
