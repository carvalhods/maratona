import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/** Classe principal da aplicação
 * @author David Carvalho
 */
public class App {
	public static void main(String[] args) {
		List<String> titles = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String title;
		
		while(! (title = in.nextLine()).equals("#")) {
			titles.add(title);
		}
		for (int i=0; i<(titles.size()*2+1); i++) {
			System.out.print("-");
		}
		System.out.println();
		String line = "|";
		for (int i=0; i<24; i++) {
			for (String tit : titles) {
				line += (i < tit.length()) ? tit.charAt(i)+"|" : " |"; 
			}
			System.out.println(line);
			line = "|";
		}
		for (int i=0; i<(titles.size()*2+1); i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
