package src;

class Disciplinas{
    String nome_disciplina;
    float nota;
    Disciplinas prox;


    void disciplinas(String nome_disciplina, float nota){
        this.nome_disciplina = nome_disciplina;
        this.nota = nota;
        this.prox = null;


    }
}