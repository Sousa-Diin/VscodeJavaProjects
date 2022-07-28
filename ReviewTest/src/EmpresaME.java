import java.util.ArrayList;

public class EmpresaME extends Empresa{

    private ArrayList<Funcionario> funcionarios;
    
    public EmpresaME(String nome, String cnpj, String categoria) {
        super(nome, cnpj, categoria);
        funcionarios = new ArrayList<>();
    }    

}
