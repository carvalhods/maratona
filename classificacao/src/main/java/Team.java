/**
 * Classe que define a estrutura de um time
 * @author David Carvalho
 */
class Team implements Comparable<Team> {
	private String nome;
	private Integer pontos;
	private Integer vitorias;
	private Integer saldo;
	private Integer gols;
	
	/**
	 * Construtor
	 * @param nome - Nome do time.
	 * @param pontos - Nº de pontos conquistados.
	 * @param vitorias - Nº de vitórias.
	 * @param saldo - Saldo de gols.
	 * @param gols - Gols marcados.
	 */
	public Team(String nome, int pontos, int vitorias, int saldo, int gols) {
		this.nome = nome;
		this.pontos = pontos;
		this.vitorias = vitorias;
		this.saldo = saldo;
		this.gols = gols;
	}

	public Team() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public Integer getVitorias() {
		return vitorias;
	}

	public void setVitorias(Integer vitorias) {
		this.vitorias = vitorias;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	public Integer getGols() {
		return gols;
	}

	public void setGols(Integer gols) {
		this.gols = gols;
	}

	/**
	 * Determina os critérios de classificação dos times:
	 * <ul>
	 * <li>1º critério: Maior nº de pontos</li>
	 * <li>2º critério: Maior nº de vitórias</li>
	 * <li>3º critério: Maior saldo de gols</li>
	 * <li>4º critério: Maior nº de gols marcados</li>
	 * <li>5º critério: Ordem alfabética dos nomes</li>
	 * </ul>
	 * @see java.lang.Comparable#compareTo(Object)
	 */
	@Override
	public int compareTo(Team team) {
		int comparaPontos = this.pontos.compareTo(team.pontos);
		int comparaVit = this.vitorias.compareTo(team.vitorias);
		int comparaSaldo = this.saldo.compareTo(team.saldo);
		int comparaGols = this.gols.compareTo(team.gols);
		int comparaNome = this.nome.compareToIgnoreCase(team.nome);
		
		if (comparaPontos == 0) {
			if (comparaVit == 0 ) {
				if (comparaSaldo == 0) {
					if (comparaGols == 0) {
						return comparaNome;
					}
					return comparaGols * (-1);
				}
				return comparaSaldo * (-1);
			}
			return comparaVit * (-1);
		}
		return comparaPontos * (-1);
	}

}
