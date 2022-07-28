public class Contabilidade {
    private String nomeEmpresa;
    private String cnpj;
    private int qtdFuncionario;
    private String porte;
    
    public Contabilidade(String nomeEmpresa,String cnpj ){

        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        qtdFuncionario = 0;
        porte = " ";

    }

    /**
     * @return String return the nomeEmpresa
     */
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    /**
     * @param nomeEmpresa the nomeEmpresa to set
     */
    private void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    /**
     * @return String return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    private void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return int return the qtdFuncionario
     */
    public int getQtdFuncionario() {
        return qtdFuncionario;
    }

    /**
     * @return String return the porte
     */
    public String getPorte() {
        return porte;
    }

    public boolean cadastrarEmpresa(Empresa e){
        return true;
    }

}
