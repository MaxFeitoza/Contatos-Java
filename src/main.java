package src;

public class main {
    public static void main(String[] args) {
        System.out.println("CONTATOS - JAVA");

        Alunos alunotest = new Alunos("Juazeirinho do norte", 5446340);
    
        alunotest.disciplina = new Disciplinas();
        alunotest.disciplina.nome_disciplina = "Ciencia da computacao";
        alunotest.disciplina.nota = 7.0f;

        System.out.println(alunotest.ShowAlunos());
    }
}
