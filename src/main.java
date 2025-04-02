package src;
import java.util.Scanner;
    public class main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Lista lista = new Lista();
            

            while(true){
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
                        Alunos aluno = new Alunos(nome, rgm);
                        lista.insereAlunos(aluno);
                        System.out.println("Aluno Cadastrado com sucesso!");
                        break;
                    case 2:
                        lista.listaralunos();
                        break;
                    case 3:
                        System.out.println("Digite o RGM do aluno que deseja remover: ");
                        int RGM = input.nextInt();
                        lista.remover(RGM);
                        System.out.println("aluno removido");
                        System.out.println("Lista atual: ");
                        lista.listaralunos();
                        break;
                      
                }
            }
                } 
    }               
    
