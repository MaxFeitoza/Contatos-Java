package src;

public class Alunos{
    String nome;
    int rgm;
    boolean tem_disciplina = false;
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


}


