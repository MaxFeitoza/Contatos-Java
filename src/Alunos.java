package src;

public class Alunos{
    String nome;
    int rgm;
    Disciplinas disciplina;

    public Alunos(String nome, int rgm){
        this.nome = nome;
        this.rgm = rgm;
        
    }
    public String getNome(){
        return nome;
    }
    public int getRgm(){      
        return rgm;
    }

    public String ShowAlunos(){
       return "Aluno-nome: " + nome + " RGM: "+ rgm + "\n Disciplina: "  + disciplina.nome_disciplina + " Nota: " + disciplina.nota;
    }
}


