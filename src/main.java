package src;
import java.util.Scanner;
    public class main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Lista lista = new Lista();
            boolean continua = true;
            
            Disciplinas estrutura_dados = new Disciplinas(1,"Estrutura de dados I",null);
            Disciplinas banco_dados = new Disciplinas(2,"Banco de dados",null);
            Disciplinas poo = new Disciplinas(3,"Programacao orientada objeto",null);
            Disciplinas algoritmos = new Disciplinas(4,"Tecnicas de desenvolvimento de algoritmos",null);
            while(continua){
                System.out.println("Menu");
                System.out.println("1 - Cadastrar Aluno");
                System.out.println("2 - Listar Alunos");
                System.out.println("3 - Excluir Aluno");
                System.out.println("4 - Procurar Aluno");
                System.out.println("5 - Adicionar aluno a uma disciplina");
                System.out.println("6 - Sair");
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
                        if (lista.listaVazia()){
                            limpartela.limpatela();
                            System.out.println("Não existem alunos cadastrados!");
                        }else{
                            System.out.println("-------------------------------");
                            lista.listaralunos();
                            System.out.println("-------------------------------");
                            System.out.println("Digite o rgm do aluno que deseja cadastrar a uma disciplina: ");
                            Scanner entrada = new Scanner(System.in);
                            int rgm_aluno = entrada.nextInt();
                            Alunos aluno = lista.getAlunos(rgm_aluno);
                            if(aluno == null){
                                limpartela.limpatela();
                                System.out.println("Nenhum aluno com esse rgm foi encontrado!");
                            }else{
                                limpartela.limpatela();
                                System.out.println("Aluno encontrado!\nDigite o numero da disciplina que voce deseja adiconar esse aluno\nDisciplinas disponiveis:\n");
                                System.out.println("1-"+estrutura_dados.nome_disciplina);
                                System.out.println("2-"+banco_dados.nome_disciplina);
                                System.out.println("3-"+poo.nome_disciplina);
                                System.out.println("4-"+algoritmos.nome_disciplina+"\n");
                                int escolha_usuario = entrada.nextInt();
                                switch(escolha_usuario) {
                                    case 1:
                                        lista.CriandoRelacionamentoAlunoDisciplina(estrutura_dados, aluno);
                                        break;
                                    case 2:
                                        lista.CriandoRelacionamentoAlunoDisciplina(banco_dados, aluno);
                                        break;
                                    case 3:
                                        lista.CriandoRelacionamentoAlunoDisciplina(poo, aluno);
                                        break;
                                    case 4:
                                        lista.CriandoRelacionamentoAlunoDisciplina(algoritmos, aluno);
                                        break;
                                    default:
                                        limpartela.limpatela();
                                        System.out.println("Nao existe essa disciplina!");
                                        break;
                                }
                            }
                        }
                    break;

                    case 6:
                        limpartela.limpatela();
                        continua = false;
                        break;
                      
                }

            }
                } 
    }               
    
