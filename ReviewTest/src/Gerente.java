
public class Gerente extends Funcionario {
    private double salario;
    private double bonificacao;

    public Gerente (int cod, String nome, String cpf, double salario, double bonificacao){
        super(cod,nome,cpf);
        this.salario = salario;
        this.bonificacao = bonificacao;
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        return (salario + bonificacao);
    }

    @Override
    public boolean tirarFerias() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @return double return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @return double return the bonificacao
     */
    public double getBonificacao() {
        return bonificacao;
    }
    
    

}
