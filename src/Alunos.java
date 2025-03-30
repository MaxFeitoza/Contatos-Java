package src;

public class Alunos {
    String nome;
    int rgm;
    Disciplinas disciplinas;

    public String ShowAlunos(){
       return "Aluno-nome: " + nome + " RGM: "+ rgm + "\n Disciplina: "  + disciplinas.disciplina + " Nota: " + disciplinas.nota;
    }
}
