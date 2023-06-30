package entities;

public class ExercicioFuncionario {
    private Integer id;
    private String nome;
    private Double salario;

    public ExercicioFuncionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void aumentoSalario (double porcentagem) {
        salario += salario * porcentagem / 100;
    }

    @Override
    public String toString() {
        return id + ", " + nome + ", R$ " + String.format("%.2f%n", salario);
    }
}
