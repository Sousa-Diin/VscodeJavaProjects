public abstract class Funcionario {
    private int cod;
    private String nome;
    private String cpf;
    
    public Funcionario(int cod, String  nome, String cpf){
        this.cod = cod;
        this.nome = nome;
        this.cpf = cpf;
    }

    /**
     * @return String return the nome
     */
    protected int getCod() {
        return cod;
    }

    /**
     * @return String return the nome
     */
    protected String getNome() {
        return nome;
    }

    /**
     * @return String return the cpf
     */
    protected String getCpf() {
        return cpf;
    }

    protected abstract double calcularSalario();   
    
    protected abstract boolean tirarFerias();

    @Override
    public String toString() {
        return "codFuncionario: " + getCod() + "\nNome: " + getNome() + "\nCPF: " + getCpf() +"\nSalario: " + calcularSalario();
    }

}
