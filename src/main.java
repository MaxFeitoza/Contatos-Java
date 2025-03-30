package src;
import  java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.println("CONTATOS - JAVA");

        Alunos alunotest = new Alunos();

        alunotest.nome = "Juazeirinho do norte";
        alunotest.rgm = 54354634;
        alunotest.disciplinas = new Disciplinas();
        alunotest.disciplinas.nota = 7.0f;
        alunotest.disciplinas.disciplina = "Ciencia da computacao";


        System.out.println(alunotest.ShowAlunos());
    }
}
