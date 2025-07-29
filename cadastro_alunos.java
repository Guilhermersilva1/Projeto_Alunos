import java.util.Scanner;

public class cadastro_alunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5];
        double[] notas = new double[5]; 
        int totaldealunos = 0;

        System.out.println("Bem-vindo, cadastre até 5 alunos:");
        System.out.println();

        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Digite o nome do " + (i + 1) + "º aluno:");
            nomes[i] = scanner.nextLine();
            
            System.out.println("Digite a nota do " + (i + 1) + "º aluno:");
            notas[i] = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.println();

            totaldealunos++;

            System.out.println("Deseja cadastrar outro aluno? (s/n)");
            char opcao = scanner.next().charAt(0);
            scanner.nextLine(); 

            if(opcao == 'n' || opcao == 'N') {
                break;  
            }   
        }

        System.out.println(" Alunos Aprovados ");

        for(int i = 0; i < totaldealunos; i++){
            System.out.println("Aluno: " + nomes[i]);
            System.out.println("Nota: " + notas[i]);

            if(notas[i] >= 7.0) {
                System.out.println("Aprovado");
            }
            else {
                System.out.println("Reprovado");
            }

            System.out.println();
        }
       
        scanner.close();
    }
}

