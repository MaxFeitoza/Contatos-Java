package src;

class Disciplinas<T>{
    String nome_disciplina;
    float nota;
    private ListaEncadeada<T> inicio;


    void disciplinas(String nome_disciplina, float nota){
        this.nome_disciplina = nome_disciplina;
        this.nota = nota;
        this.inicio = null;
    }

    void AdicionaDisciplina(T elemento){
        ListaEncadeada<T> No = new ListaEncadeada<T>(elemento);  //Criacao do No
        this.inicio = No; //Apontando o "inicio" para o "No"
        
    }

    public String getNome_disciplina() {
        return nome_disciplina;
    }


    public void setNome_disciplina(String nome_disciplina) {
        this.nome_disciplina = nome_disciplina;
    }

    @Override
    public String toString() {
        return "Disciplinas [nome_disciplina=" + nome_disciplina + ", nota=" + nota + ", inicio=" + inicio + "]";
    }
}