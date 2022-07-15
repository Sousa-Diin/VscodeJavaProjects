public class App {
    public static void main(String[] args) throws Exception {

        //Inicia a Simulacão
        Simulador simulacao = new Simulador(3,1440);
        
        System.out.println("\n\n\tIniciando simulacão!!!");

        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();

        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
        simulacao.criaFilaCliente();
    
        System.out.println(simulacao.toString());
        simulacao.simular();
        //System.out.println(Simulador.getDuracaoSimulacao());
       
        
    }
}
