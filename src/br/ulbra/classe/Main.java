package br.ulbra.classe;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Fila fila = new Fila();

        int option = 0;

        while (option != 10) {
            System.out.println(showMenu());
            option = input.nextInt();

            switch (option) {
                case 1:
                    input.nextLine();
                    
                    System.out.println("Insira o nome do cliente:");
                    String name = input.nextLine();
                    System.out.println("Insira o cpf do cliente:");
                    String cpf = input.nextLine();
                    System.out.println("Insira a rua do cliente:");
                    String street = input.nextLine();
                    System.out.println("Insira o complemento do cliente:");
                    String complement = input.nextLine();
                    System.out.println("Insira o cep do cliente:");
                    String cep = input.nextLine();
                    System.out.println("Insira o bairro do cliente:");
                    String neighborhood = input.nextLine();
                    System.out.println("Insira a cidade do cliente:");
                    String city = input.nextLine();

                    System.out.println(fila.insertClient(name, cpf, street, cep,
                            complement, neighborhood, city));
                    break;
                case 2:
                    System.out.println(fila.nextClient());
                    break;
                case 3:
                    fila.showFila();
                    break;
                case 4:
                    System.out.println(fila.atendClient());
                    break;
                case 5:
                    input.nextLine();
                    System.out.println("Digite o nome que deseja procurar:");
                    fila.searchClientByName(input.nextLine());
                    break;
                case 6:
                    fila.isEmpty();
                    break;
                case 7:
                    fila.filaSize();
                    break;
                case 8:
                    input.nextLine();
                    System.out.println("Digite o nome que deseja procurar:");
                    fila.verifyAdress(input.nextLine());
                    break;
                case 9:
                    break;
                case 10:
                    System.out.println("Saindo, adeus!");
                    System.out.println("(>‿◠)");
                    break;
                default:
                    System.out.println("Número inválido.");
                    System.out.println("Insira outro número:");
                    option = input.nextInt();
            }
        }
    }

    public static String showMenu() {
        String menu = "-----------------------------------"
                + "\n|              MENU               |"
                + "\n-----------------------------------"
                + "\n| 1 - Inserir novo cliente        |"
                + "\n| 2 - Próximo a ser atendido      |"
                + "\n| 3 - Mostrar a fila              |"
                + "\n| 4 - Atender a primeira pessoa   |"
                + "\n| 5 - Buscar cliente pelo nome    |"
                + "\n| 6 - Mostrar se está vazia       |"
                + "\n| 7 - Mostrar tamanho da fila     |"
                + "\n| 8 - Verificar endereço          |"
                + "\n| 9 - Modificar item              |"
                + "\n| 10 - Sair                       |"
                + "\n----------------------------------"
                + "\nInsira a sua opção: ";
        return menu;
    }
    
}
