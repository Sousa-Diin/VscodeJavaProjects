
public class Estagiario extends Funcionario {
    private double salario;
    private int cargaHoraria;

    public Estagiario(int cod, String nome, String cpf, double salario, int cargaHoraria){
        super (cod, nome, cpf);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularSalario() {
        // TODO Auto-generated method stub
        double resul = 0;
        int cargaHorariaDefault = 26;
        int subtrai = cargaHorariaDefault - cargaHoraria;

        if(cargaHoraria < cargaHorariaDefault){
            resul = (salario *= 0.02);
            
            salario -= (subtrai * resul);

        }else{
             salario *= 1.05;
        }

        return salario ;
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
     * @return int return the cargaHoraria
     */
    public int getCargaHoraria() {
        return cargaHoraria;
    }

   

}
