package src;


public class Lista{
    private static final int MAX = 60;
    private Alunos[] alunos ;
    private int ultPosicao = -1;
    //inicializa a lista
    public Lista() {
        alunos = new Alunos[MAX];
    }


    public boolean listaVazia(){
        return (ultPosicao == -1);
    }
    public boolean listaCheia(){
        return (ultPosicao == MAX - 1);
    }

    public void deslocaDireita(int posicao){
        for (int i = ultPosicao + 1; i > posicao; i--){
            alunos[i] = alunos[i - 1];
        }

    }
    public void deslocaEsquerda(int posicao){
        for(int i = posicao; i < (ultPosicao - 1); i++){
            alunos[i] = alunos[i + 1];
        }
    }

    public boolean insereAlunos(Alunos Alunos) {
        // Verifica se lista está cheia
        if (listaCheia()) {
            System.out.println("Lista de alunos cheia!");
            return false;
        }

        // verifica se a posicao é menor ou igual que o ultimo Alunos e se o RGM do ultimo Alunos é menor  que o RGM do Alunos novo
        int posicao = 0;
        while (posicao <= ultPosicao && (alunos[posicao].getRgm()) < (Alunos.getRgm())) {
            posicao++;
        }


        deslocaDireita(posicao);

        // coloca o Alunos na lista de alunos
        alunos[posicao] = Alunos;
        ultPosicao++;
        return true;
    }
    
    public void listaralunos() {
        if (listaVazia()) {
            System.out.println("Nenhum Alunos cadastrado!");
            return;
        }
        // percorre a lista mostrando os alunos
        for (int i = 0; i <= ultPosicao; i++) {
            System.out.println("Alunos: " + alunos[i].getNome() + " | RGM: " + alunos[i].getRgm());
        }
    }
    public boolean remover (int rgm){
        if(listaVazia()){

            System.out.println("Não existem alunos cadastrados!");
            return false;
        }
            
        else{
            int posicao = -1;
            for(int i = 0; i < ultPosicao; i++){
                if(rgm == alunos[i].getRgm()){
                    System.out.println(alunos[i].getRgm());
                    posicao = i;
                    break;
                }
            }
            if (posicao == -1){
                System.out.println("Aluno não identificado! ");
                return false;
            }
            /*
                Primeiro deslocaEsquerda: move todos os elementos após a posição para esquerda

                Depois limpamos alunos[ultPosicao] (que agora está duplicado)

                Finalmente decrementamos ultPosicao
             */
            deslocaEsquerda(posicao);
            ultPosicao--;
            alunos[ultPosicao] = null;
            return true;

        }


    } 

        
    
            
    }


    