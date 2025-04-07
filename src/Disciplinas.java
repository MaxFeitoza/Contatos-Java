package src;

class Disciplinas {
    int id;
    String nome_disciplina; 
    int rgm;  
    Disciplinas next; 

    public Disciplinas(int id,String nome_disciplina, Alunos aluno) {
        this.nome_disciplina = nome_disciplina;
        this.id = id;
        if(aluno!=null){
            this.rgm = aluno.rgm;
        } 
        this.next = null; 
    }
}

class ListaDisciplina {
    Disciplinas no;  


    public ListaDisciplina() {
        no = null;
    }

    public void adicionarDisciplina(int id,String nome_disciplina, Alunos aluno) {
        Disciplinas novo_no = new Disciplinas(id,nome_disciplina, aluno);
        if (no == null) {
            no = novo_no; 
        } else {
            Disciplinas atual = no;
            while (atual.next != null) {
                atual = atual.next;  
            }
            atual.next = novo_no;  
        }
    }
}