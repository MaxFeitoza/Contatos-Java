package src;

import javax.print.DocFlavor.STRING;

public class Lista{
    private static final int MAX = 60;
    public Alunos[] alunos ;
    public Disciplinas[] disciplinas;
    public DisciplinasAlunos[] disciplinas_alunos;
    public int tamanho_lista = -1;
    private int tamanho_relacionamento = 0;
    //inicializa a lista
    public Lista() {
        alunos = new Alunos[MAX];
        disciplinas = new Disciplinas[3];
        disciplinas_alunos = new DisciplinasAlunos[MAX];
    }


    public boolean listaVazia(){
        return tamanho_lista == -1;
    }
    public boolean listaCheia(){
        return tamanho_lista == MAX - 1;
    }

    public void deslocaDireita(int posicao){
        for (int i = tamanho_lista + 1; i > posicao; i--){
            alunos[i] = alunos[i - 1];
        }

    }
    public void deslocaEsquerda(int posicao){
        for(int i = posicao; i < tamanho_lista; i++){
            alunos[i] = alunos[i + 1];
        }
    }

    public boolean insereAlunos(int rgm , String nome) {
        for (int i = 0; i <= tamanho_lista; i++) {
            if (rgm == alunos[i].getRgm()) {
                limpartela.limpatela();
                System.out.println("RGM JA EXISTE");
                return false;
            }
        }

        // Verifica se lista está cheia
        if (listaCheia()) {
            limpartela.limpatela();
            System.out.println("Lista de alunos cheia!");
            return false;
        }
        Alunos Aluno = new Alunos(nome, rgm);
        for (int i = 0; i <= tamanho_lista; i++) {
            if (Aluno.getRgm() == alunos[i].getRgm()) {
                return false;
            }
        }
        
        int posicao = 0;
        // verifica se a posicao é menor ou igual que o ultimo Alunos e se o RGM do ultimo Alunos é menor  que o RGM do Alunos novo
        while (posicao <= tamanho_lista && (alunos[posicao].getRgm()) < (Aluno.getRgm())) {
            posicao++;
        }


        deslocaDireita(posicao);

        // coloca o Alunos na lista de alunos
        alunos[posicao] = Aluno;
        tamanho_lista++;
        return true;
    }
    
    public void getDisciplinasAlunos(int rgm_aluno){
        for (int i = 0; i < tamanho_relacionamento; i++) {
            if (disciplinas_alunos[i] != null && disciplinas_alunos[i].rgm_aluno == rgm_aluno) {
                System.out.println(disciplinas_alunos[i].nome_disciplina);
            }
        }
    }


    public void listaralunos() {
        if (listaVazia()) {
            System.out.println("Nenhum Alunos cadastrado!");
        }
        // percorre a lista mostrando os alunos
        for (int i = 0; i <= tamanho_lista; i++) {
            if(alunos[i].tem_disciplina == false){
                System.out.println("Alunos: " + alunos[i].getNome() + " | RGM: " + alunos[i].getRgm());
            }else{
                System.out.println("Alunos: " + alunos[i].getNome() + " | RGM: " + alunos[i].getRgm()+" | Disciplinas: ");
                getDisciplinasAlunos(alunos[i].getRgm());
                System.out.println("-------------------------------");

                }
            }
    }
    public void remover(int rgm) {
        if(listaVazia()) {
            System.out.println("Não existem alunos cadastrados!");
            return;  
        }
        
        int posicao = -1;
        for(int i = 0; i <= tamanho_lista; i++) {
            if(rgm == alunos[i].getRgm()) {
                posicao = i;
                break;
            }
        }
        
        if(posicao == -1) {
            System.out.println("Aluno com RGM " + rgm + " não encontrado!");
            return;
        }
        
        
        
        
        deslocaEsquerda(posicao);
        alunos[tamanho_lista] = null;
        tamanho_lista--;
        limpartela.limpatela();
        System.out.println("Aluno com RGM " + rgm + " removido com sucesso!");
    }
    public String procurar(int rgm){
        int index;
        for(index = 0; index < 60; index += 1){
            if (alunos[index] != null){
                if(rgm == alunos[index].getRgm()){
                    return "ALUNO ENCONTRADO\n"+"Nome aluno: "+ alunos[index].getNome() + "| Rgm: "+alunos[index].getRgm();
                }
            }
        }
        return "Aluno com esse rgm ("+Integer.toString(rgm) +") nao existe!";
    } 
    
    public Alunos getAlunos(int rgm){
        for(int i = 0; i <= tamanho_lista; i++) {
            if(rgm == alunos[i].getRgm()) {
                return alunos[i];
            }
        }
        return null;
    }

    public void CriandoRelacionamentoAlunoDisciplina(Disciplinas disciplina,Alunos aluno){
        DisciplinasAlunos novo_relacionamento = new DisciplinasAlunos(aluno, disciplina);
        disciplinas_alunos[tamanho_relacionamento] = novo_relacionamento;
        tamanho_relacionamento++;
        aluno.tem_disciplina = true;
        limpartela.limpatela();
        System.out.println("O aluno <"+aluno.nome+"> Com o rgm <"+aluno.rgm+"> Foi adicionado a disciplina <"+disciplina.nome_disciplina+"> com sucesso!");

    }    
}
 




