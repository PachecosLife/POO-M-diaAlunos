package médiaAlunos;

public class Principal extends Aluno{

	public static void main(String[] args) {
		
		System.out.println("========== SEJA BEM VINDO ==========");
		
		Aluno a1 = new Aluno();
		System.out.println(a1.toString());
		System.out.println(a1.condicao());

		System.out.println("===================");
		
		Aluno a2 = new Aluno();
		System.out.println(a2.toString());
		System.out.println(a2.condicao());
	}

}
