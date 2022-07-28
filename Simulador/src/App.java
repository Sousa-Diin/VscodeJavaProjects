public class App {

    public static void main(String[] args) throws Exception {
        
        //Inicia a Simulacão
        int numeroAtendentes = 3;
        
        Simulador simulacao = new Simulador(numeroAtendentes,100);
        
        
        System.out.println("\n\n\tIniciando simulacão!!!");
    
        System.out.println(simulacao.toString());
        simulacao.simular();
              
        
    }
 
}