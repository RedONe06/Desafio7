package br.ulbra.classe;
/**
 * @author andriele
 */
public class Person {
    
    private String name;
    private String cpf;
    private String cep;
    private String street;
    private String complement;
    private String city;
    private String neighborhood;

    public Person(String name, String cpf, String cep, String street, String 
            complement, String city, String neighborhood) {
        this.name = name;
        this.cpf = cpf;
        this.cep = cep;
        this.street = street;
        this.complement = complement;
        this.city = city;
        this.neighborhood = neighborhood;
    }
    public Person(){};

    public String getName() {
        return name;
    }
    public String getCpf() {
        return cpf;
    }
    public String getStreet() {
        return street;
    }
    public String getComplement() {
        return complement;
    }
    public String getCity() {
        return city;
    }
    public String getNeighborhood() {
        return neighborhood;
    }
    public String getCep() {
        return cep;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public void setComplement(String complement) {
        this.complement = complement;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    
}
