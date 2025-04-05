package src;

public class DisciplinasAlunos {
    Alunos alunos;
    String nome_aluno;
    int rgm_aluno;
    Disciplinas disciplina;
    String nome_disciplina;

    public DisciplinasAlunos(Alunos alunos,Disciplinas disciplina){  
        this.alunos = alunos;
        if(disciplina == null){
            this.nome_disciplina = "Nao esta em nenhuma disciplina";
            this.disciplina = null;
        }else{
            this.disciplina = disciplina;
            this.nome_disciplina = disciplina.nome_disciplina;
        }
        this.rgm_aluno = alunos.rgm;
        this.nome_aluno = alunos.nome;
    }

    @Override
    public String toString(){
        return "DisciplinasAlunos [alunos=" + alunos + ", nome_aluno=" + nome_aluno + ", rgm_aluno=" + rgm_aluno
                + ", disciplina=" + disciplina + ", nome_disciplina=" + nome_disciplina + "]";
    }
    
}

