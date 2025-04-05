package src;

public class Alunos{
    String nome;
    int rgm;
    double nota;
    boolean tem_disciplina = false;
    public Alunos(String nome, int rgm){
        this.nome = nome;
        this.rgm = rgm;
        this.nota = nota;
    }
    public String getNome(){
        return nome;
    }
    public int getRgm(){      
        return rgm;
    }

    public String ShowAlunos(){
       return "Aluno-nome: " + nome + " RGM: "+ rgm + "\n Disciplina: " + " Nota: " + nota;
    }

}


