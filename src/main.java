package src;
import java.util.Scanner;
    public class main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Lista lista = new Lista();
            boolean continua = true;

            while(continua){
                System.out.println("Menu");
                System.out.println("1 - Cadastrar Aluno");
                System.out.println("2 - Listar Alunos");
                System.out.println("3 - Excluir Aluno");
                System.out.println("4 - Procurar Aluno");
                System.out.println("5 - Sair");
                System.out.println("digite a opção desejada: ");
                int opcao = input.nextInt();

                switch(opcao){
                    case 1:
                        System.out.println("Digite o nome do aluno: ");
                        String nome = input.next();
                        input.nextLine();

                        System.out.println("Digite o rgm  do aluno: : ");
                        int rgm = input.nextInt();
                        input.nextLine();
                        
                        boolean inserido = lista.insereAlunos(rgm,nome);
                        if (inserido){
                            lista.insereAlunos(rgm,nome);;
                            System.out.println("Aluno Cadastrado com sucesso!");
                            limpartela.limpatela();
                        }
                        break;
                    case 2:
                        limpartela.limpatela();
                        System.out.println("-------------------------------");
                        lista.listaralunos();
                        System.out.println("-------------------------------");
                        break;

                    case 3:
                    if (lista.listaVazia()){
                        limpartela.limpatela();
                        System.out.println("Não existem alunos cadastrados!");
                        break;
                    }
                        System.out.println("Digite o RGM do aluno que deseja remover: ");
                        int RGM = input.nextInt();
                        lista.remover(RGM);
                        System.out.println("aluno removido!");
                        break;
                    
                    case 4:
                        if (lista.listaVazia()){
                            limpartela.limpatela();
                            System.out.println("Não existem alunos cadastrados!");
                            break;
                        }
                        else{
                            String data;
                            System.out.println("Digite o RGM do aluno que deseja encontrar: ");
                            Scanner entrada = new Scanner(System.in);
                            int rgm_aluno = entrada.nextInt();
                            limpartela.limpatela();
                            System.out.println(lista.procurar(rgm_aluno));
                            break;
                        }
                    case 5:
                        limpartela.limpatela();
                        continua = false;
                      
                }

            }
                } 
    }               
    
