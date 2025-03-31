package src;


public class Lista{
    private static final int MAX = 60;
    private Alunos[] Alunoss ;
    private int ultPosicao = -1;
    //inicializa a lista
    public Lista() {
        Alunoss = new Alunos[MAX];
    }


    public boolean listaVazia(){
        return (ultPosicao == -1);
    }
    public boolean listaCheia(){
        return (ultPosicao == MAX - 1);
    }

    public void deslocaDireita(int posicao){
        for (int i = ultPosicao + 1; i > posicao; i--){
            Alunoss[i] = Alunoss[i - 1];
        }

    }

    public boolean insereAlunos(Alunos Alunos) {
        // Verifica se lista está cheia
        if (listaCheia()) {
            System.out.println("Lista de Alunoss cheia!");
            return false;
        }

        // verifica se a posicao é menor ou igual que o ultimo Alunos e se o RGM do ultimo Alunos é menor  que o RGM do Alunos novo
        int posicao = 0;
        while (posicao <= ultPosicao && (Alunoss[posicao].getRgm()) < (Alunos.getRgm())) {
            posicao++;
        }


        deslocaDireita(posicao);

        // coloca o Alunos na lista de Alunoss
        Alunoss[posicao] = Alunos;
        ultPosicao++;
        return true;
    }
    public void listarAlunoss() {
        if (listaVazia()) {
            System.out.println("Nenhum Alunos cadastrado.");
            return;
        }
        // percorre a lista mostrando os Alunoss
        for (int i = 0; i <= ultPosicao; i++) {
            System.out.println("Alunos: " + Alunoss[i].getNome() + " | RGM: " + Alunoss[i].getRgm());
        }
    }


    }