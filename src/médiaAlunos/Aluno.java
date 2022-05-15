package médiaAlunos;

import javax.swing.JOptionPane;

public class Aluno {
			
	String nome = JOptionPane.showInputDialog("Digite seu primeiro nome");
	String nasc = JOptionPane.showInputDialog("Olá " + nome + ". Digite o ANO em que nasceu");
	String nota1 = JOptionPane.showInputDialog("Digite a 1° Nota");
	String nota2 = JOptionPane.showInputDialog("Digite a 2° Nota");
	int anoNasc = Integer.parseInt(nasc);
	double n1 = Double.parseDouble(nota1);
	double n2 = Double.parseDouble(nota2);
	double media = (n1 + n2) / 2;
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String condicao () {
		if (media > 5) {
			return ("Aluno APROVADO, PARABÉNS");
		}else {
			return ("Aluno REPROVADO");
		}
	}

	@Override
	public String toString() {
		return "NOME = " + nome + "\nANO DE NASCIMENTO = " + nasc + "\n1° BIMESTRE = " + nota1 + "\n2° BIMESTRE = " 
	+ nota2 + "\nMÉDIA = " + media;
	}

	
	
	
	

}
