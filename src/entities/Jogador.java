package entities;

public class Jogador {
	private String nome;
	private double altura;
	private double peso;
	private String numeroDaCamisa;
	private Posicao posicao;
	
	
	public Jogador(String nome, double altura, double peso, int numeroDaCamisa, int posicao ) {
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.numeroDaCamisa = String.valueOf(numeroDaCamisa);
		this.posicao = escolherPosicao(posicao);
	}
	public Posicao escolherPosicao(int posicao) {
		return switch (posicao) {
        case 1 -> Posicao.GOLEIRO;
        case 2 -> Posicao.ZAGUEIRO;
        case 3 -> Posicao.LATERAL;
        case 4 -> Posicao.MEIO_CAMPO;
        case 5 -> Posicao.ATACANTE;
        case 6 -> Posicao.PONTA;
        case 7 -> Posicao.CENTROAVANTE;
        case 8 -> Posicao.VOLANTE;
        case 9 -> Posicao.MEIA_ARMADOR;
        case 10 -> Posicao.MEIA_ATACANTE;
        default -> {
            System.out.println("Opção inválida.");
            yield null;
        }
    };
		    }
	
	public String getNumeroDaCamisa() {
		return numeroDaCamisa;
	}

	public String getNome() {
		return nome;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public double getAltura() {
		return altura;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return nome +
				"\nNúmero da Camisa: " + numeroDaCamisa +
				"\nPosicao: " + posicao +
				"\nAltura: " + altura +
				"\nPeso: " + peso;
	}
	
}
