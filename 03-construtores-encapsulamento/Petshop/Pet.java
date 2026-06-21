package Petshop;

public class Pet {
    private String nome;
    private String raca;
    private String grupo;
    private String porte;
    private double altura;
    private double peso;
    private String temperamento;

    public Pet(String nome, String raca, String grupo, String porte, double altura, double peso, String temperamento) {
        this.nome = nome;
        this.raca = raca;
        this.grupo = grupo;
        this.porte = porte;
        this.altura = altura;
        this.peso = peso;
        this.temperamento = temperamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(String temperamento) {
        this.temperamento = temperamento;
    }

    public String toString() {
        return "Nome: " + nome + "\n"
                + "Raça: " + raca + "\n"
                + "Grupo: " + grupo + "\n"
                + "Porte: " + porte + "\n"
                + "Altura: " + altura + "\n"
                + "Peso: " + peso + "\n"
                + "Temperamento: " + temperamento;
    }
}
