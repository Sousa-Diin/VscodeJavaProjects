import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Empresa {
    private String nome;
    private String cnpj;
    private String categoria;
    private ArrayList<Funcionario> funcionarios;
    
    public Empresa (String nome, String cnpj,String categoria){
        this.nome = nome;
        this.cnpj = cnpj;
        this.categoria = categoria;
        funcionarios = new ArrayList<>();
    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return String return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @return String return the categoria
     */
    protected String getCategoria() {
        return categoria;
    }

    /**
     * @return List<Funcionario> return the funcionarios
     */
    protected List<Funcionario> getListaFuncionarios() {
        return Collections.unmodifiableList(funcionarios);
    }

    protected boolean admitirFuncionario(Funcionario f){
        if(!funcionarioEstaAdmitido(f.getCpf())){
            funcionarios.add(f);
            return true;
        }
        return false;
    }

    private boolean funcionarioEstaAdmitido(String cpf){

        for(Funcionario f : funcionarios){
            if(f.getCpf().equals(cpf))
               return  true;
        }
       return false;
    }

    @Override
    public String toString() {
        return "Nome da empresa: " + getNome() + "\nCNPJ: " + getCnpj() + "\n Categoria: " + getCategoria() + "\nFuncionario: " + getListaFuncionarios() ;
    }

}
