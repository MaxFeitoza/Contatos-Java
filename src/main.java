package src;
import java.util.Scanner;

import org.xml.sax.SAXException;
    public class main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Lista lista = new Lista();
            boolean continua = true;
            ListaDisciplina lista_encadeada = new ListaDisciplina();
            Disciplinas estrutura_dados = lista_encadeada.adicionarDisciplina(1,"Estrutura de dados I",null); // CRIA DISCIPLINA USANDO O METODO DA DISCIPLINA ENCADEADA
            Disciplinas banco_dados = lista_encadeada.adicionarDisciplina(2,"Banco de dados",null);  // CRIA DISCIPLINA USANDO O METODO DA DISCIPLINA ENCADEADA 
            Disciplinas poo = lista_encadeada.adicionarDisciplina(3,"Programacao orientada objeto",null);  // CRIA DISCIPLINA USANDO O METODO DA DISCIPLINA ENCADEADA 
            Disciplinas algoritmos = lista_encadeada.adicionarDisciplina(4,"Tecnicas de desenvolvimento de algoritmos",null);  // CRIA DISCIPLINA USANDO O METODO DA DISCIPLINA ENCADEADA
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
                        boolean sair_caso_5 = false;
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
                                while (sair_caso_5==false) {
                                System.out.println("1-"+estrutura_dados.nome_disciplina);
                                System.out.println("2-"+banco_dados.nome_disciplina);
                                System.out.println("3-"+poo.nome_disciplina);
                                System.out.println("4-"+algoritmos.nome_disciplina);
                                System.out.println("Outros-Sair");
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
                                        sair_caso_5 = true;
                                        break;
                                    }
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
    
