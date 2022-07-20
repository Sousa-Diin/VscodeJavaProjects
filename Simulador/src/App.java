public class App {
    public static void main(String[] args) throws Exception {

        //Inicia a Simulacão
        Simulador simulacao = new Simulador(4,720);
        
        System.out.println("\n\n\tIniciando simulacão!!!");
    
        System.out.println(simulacao.toString());
        simulacao.simular();
              
        
    }
}
