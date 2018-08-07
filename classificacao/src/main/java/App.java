import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 * Classe principal da aplicação
 * @author David Carvalho
 */
public class App {
	public static void main(String[] args) {		
		Vector<Team> teams = new Vector<Team>();
		Scanner in = new Scanner(System.in);
		int amountTeams;

		while ((amountTeams = in.nextInt()) != 0) {
			in.nextLine();
			for (int i=1; i<=amountTeams; i++) {
				Team team = new Team();
				team.setNome(in.next());
				team.setPontos(in.nextInt());
				team.setVitorias(in.nextInt());
				team.setSaldo(in.nextInt());
				team.setGols(in.nextInt());
				teams.add(team);
				in.nextLine();
			}
			Collections.sort(teams);
			for (int i=0; i<teams.size(); i++) {
				System.out.println((i+1) + " " + teams.get(i).getNome());
			}
			System.out.println();
			teams.clear();
		}
	}
}
