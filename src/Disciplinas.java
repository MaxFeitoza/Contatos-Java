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

    public Disciplinas adicionarDisciplina(int id,String nome_disciplina, Alunos aluno) {
        Disciplinas novo_no = new Disciplinas(id,nome_disciplina, aluno); // CRIA DISCIPLINA NOVA 'NOVO_NO'
        if (no == null) {
            no = novo_no;  // se o no FOR NULO --> ESTA NO COMECO DA LISTA 
        } else {
            // se o NO nao for nulo (EXISTE OUTRAS DISCIPLINAS)
            Disciplinas atual = no; 
            while (atual.next != null) { //PERCORRE CADA DISCIPLINA APARTIR DO SEU 'NEXT' (que e a proxima disciplina) E SE O NEXT FOR NULL (ESTAMOS NO FINAL DA LISTA) ATUALIZA NEXT PARA A NOVA DISCIPLINA CRIADA (NOVO_NO)
                atual = atual.next;  
            }
            atual.next = novo_no;  
        }
        return novo_no;
    }
}