package médiaAlunos;

public class Principal extends Aluno{

	public static void main(String[] args) {
		
		 	// CLASSE PRINCIPAL QUE EXECUTA O OBJETO ALUNO 
		System.out.println("========== SEJA BEM VINDO ==========");
		
		//PRIMEIRO ALUNO
		Aluno a1 = new Aluno();
		System.out.println(a1.toString());
		System.out.println(a1.condicao());

		System.out.println("===================");
		
		//SEGUNDO ALUNO
		Aluno a2 = new Aluno();
		System.out.println(a2.toString());
		System.out.println(a2.condicao());
	}

}
