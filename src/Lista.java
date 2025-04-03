package src;

import javax.print.DocFlavor.STRING;

public class Lista{
    private static final int MAX = 60;
    public Alunos[] alunos ;
    public int tamanho_lista = -1;
    //inicializa a lista
    public Lista() {
        alunos = new Alunos[MAX];
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
    
    public void listaralunos() {
        if (listaVazia()) {
            System.out.println("Nenhum Alunos cadastrado!");
        }
        // percorre a lista mostrando os alunos
        for (int i = 0; i <= tamanho_lista; i++) {
            System.out.println("Alunos: " + alunos[i].getNome() + " | RGM: " + alunos[i].getRgm());
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
            if(rgm == alunos[index].getRgm()){
                return "ALUNO ENCONTRADO\n"+"Nome aluno: "+ alunos[index].getNome() + " Rgm: "+alunos[index].getRgm();
            }
        }
        return "Aluno com esse rgm ("+Integer.toString(rgm) +") nao existe!";
    }     
}


