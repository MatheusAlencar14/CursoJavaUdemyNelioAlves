package entities;

public class Hotel {
    String nome;
    String email;
    int quarto;

    public Hotel(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getQuarto() {
        return quarto;
    }

    @Override
    public String toString() {
        return " " + nome + ", " + email;
    }
}
