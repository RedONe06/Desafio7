package br.ulbra.classe;

import java.util.ArrayList;

/**
 * @author s.lucas
 */
public class Fila {

    public ArrayList<Person> fila = new ArrayList();

    public String insertClient(String name, String cpf, String street,
            String cep, String complement, String neighborhood, String city) {

        Person person = new Person();

        person.setName(name);
        person.setCpf(cpf);
        person.setStreet(street);
        person.setCep(cep);
        person.setComplement(complement);
        person.setNeighborhood(neighborhood);
        person.setCity(city);

        fila.add(person);
        return "Inserido com sucesso!";
    }

    public String nextClient() {
        if (!fila.isEmpty()) {
            return "O próximo cliente a ser atendido é o/a " + fila.get(0).getName();
        } else {
            return "Insira um cliente.";
        }
    }

    public void showFila() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            for (int i = 0; i < fila.size(); i++) {
                System.out.println("[" + (i + 1) + "] " + fila.get(i).getName());
            }
        }
    }

    public String atendClient() {
        if (fila.isEmpty()) {
            return "A fila está vazia";
        } else {
            System.out.println("Atendendo o cliente " + fila.get(0).getName());
            System.out.println("Aguarde...");
            fila.remove(0);
            return "Atendido com sucesso!";
        }
    }

    public void searchClientByName(String name) {
        int c = 0;
        if (!fila.isEmpty()) {
            for (int i = 0; i < fila.size(); i++) {
                if (fila.get(i).getName().equals(name)) {
                    System.out.println("O cliente " + fila.get(i).getName() + " está"
                            + " em " + (i + 1) + "º lugar na fila");
                    c++;
                }
            }//fim for
            if (c == 0) {
                System.out.println("Nenhum cliente encontrado!");
            }
        } else {
            System.out.println("A fila está vazia.");
        }
    }

    public void isEmpty() {
        if (fila.isEmpty()) {
            System.out.println("A fila está vazia");
        } else {
            System.out.println("A fila não está vazia");
        }
    }

    public void filaSize() {
        System.out.println("A fila tem " + fila.size() + " pessoas");
    }
    
    public void verifyAdress(String name){
        int c = 0;
        int indice = (fila.size())+1;
        if (!fila.isEmpty()) {
            for (int i = 0; i < fila.size(); i++) {
                if (fila.get(i).getName().equals(name)) {
                    indice = i;
                    c++;
                }
                System.out.println("CEP: " + fila.get(indice).getCep()
                + "\nRua: " + fila.get(indice).getStreet()
                + "\nBairro: " + fila.get(indice).getNeighborhood()
                + "\nCidade: " + fila.get(indice).getCity()
                + "\nComplemento " + fila.get(indice).getComplement());
            }
            if (c == 0) {
                System.out.println("Nenhum cliente encontrado!");
            }
        } else {
            System.out.println("A fila está vazia.");
        }
    }
    public void modify(int index, String info){
        int ix = index-1;
    }
}
