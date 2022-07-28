public class App {
    public static void main(String[] args) throws Exception {
        
        Empresa empresa = new EmpresaME("Utteq","00014567/100","Technologia");

        Funcionario funcGerente = new Gerente(601,"Wildes","11122233344",12000,1699);
        Funcionario funcColaborador = new Colaborador(100,"Eliane","22233344455",305,20);
        Funcionario funcEstagiario = new Estagiario(001,"Sonia","33344455566",4500,21);

        empresa.admitirFuncionario(funcGerente);
        empresa.admitirFuncionario(funcColaborador);
        empresa.admitirFuncionario(funcEstagiario);

        System.out.println("LISTA DE FUNCIONARIOS\n");  
        System.out.println(empresa.getListaFuncionarios()); 
        

    }
}
