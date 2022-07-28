
public class Colaborador extends Funcionario{
    private double salarioHora;
    private double horasTrabalhadas;

    public Colaborador(int cod, String nome, String cpf, double salarioHora, double horasTrabalhadas){
        super(cod, nome, cpf);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        return (salarioHora * horasTrabalhadas);
    }

    @Override
    public boolean tirarFerias() {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * @return double return the salarioHora
     */
    public double getSalarioHora() {
        return salarioHora;
    }

    /**
     * @return double return the horasTrabalhadas
     */
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }


}
