import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Simulador {

    private Queue<Cliente> filaClientes;
    private ArrayList<Atendente> atendentes;
    private int numeroAtendentes;
    private  int duracaoSimulacao;
    private static int contaCaixa = 0;
   

    public Simulador(int numeroAtendentes, int duracaoSimulacao){
        filaClientes = new LinkedList<>();
        atendentes = new ArrayList<>();
        this.numeroAtendentes = numeroAtendentes;
        this.duracaoSimulacao = duracaoSimulacao;
        criaFilaCliente();
        criaListaAtendente();
        
    }
    
    public  int getDuracaoSimulacao() {
        return duracaoSimulacao;
        
    }

    private void criaFilaCliente(){
        int duracao_atendimento; 
        int tempo_chegada_cliete  = 0;
        //Random numero_gerado = new Random();

        for(int c = 0; c < 1000;c++)  {
            Random numero_gerado = new Random();
            tempo_chegada_cliete += numero_gerado.nextInt(4);
            duracao_atendimento = numero_gerado.nextInt(7)+1;

            if ((tempo_chegada_cliete + duracao_atendimento) <= duracaoSimulacao)
            filaClientes.offer(new Cliente(tempo_chegada_cliete, duracao_atendimento));
            else{
                c = 1000;
            }
        }  
        
    }

    private void criaListaAtendente(){
        for(int i = 0; i < numeroAtendentes; i++){
            Atendente a = new Atendente();
            atendentes.add(a);
            
        }

    }

    public static int contaAtendente(){
        return contaCaixa;
    }
    

    @Override
    public String toString() {
        return "\nDuracao da Simulacao = " + duracaoSimulacao + "\n";
    }

    public void simular(){

        System.out.printf("\n\nTamanho inicial da fila: %d\n\n", filaClientes.size());
        //Loop da Interacão da simulacão - INICIO
        for(int t_atual = 0; t_atual < duracaoSimulacao; t_atual++){
            int atd;
            for(/*Atendente atd : atendentes*/atd = 0; atd < atendentes.size();atd++){
               //Consulta se a fila esta vazia
                if(!filaClientes.isEmpty()){
                //Consulta se o atendente esta disponivel
                    if(atendentes.get(atd).estaDisponivel(t_atual)){
                    //Consulta na Fila Cliente se duracao do Atendimento é menor que a duracão da simulacão
                        if(filaClientes.peek().getTempoChegada() <= t_atual){
                            atendentes.get(atd).atenderCliente(filaClientes.poll().getDuracaoAtendimento());
                            System.out.println("Atendente: " + atd);    
                        }
                    } 
                }                                                        
            }
            if(!filaClientes.isEmpty()){
                System.out.printf("\nTempo atual: %d minutos\nDuracão do atendimento: %d \nTamanho atual da fila: %d clientes\n\n", t_atual, filaClientes.peek().getDuracaoAtendimento(),filaClientes.size());
                
            }else{
                System.out.printf("\nTempo atual: %d minutos\nFim - a fila esta vazia parabéns atendentes.\n", t_atual,filaClientes.size());
                t_atual = duracaoSimulacao;
            }
            
           /* 
            if(!filaClientes.isEmpty())
                System.out.printf("Tempo atual: %d minutos;\nTamanho atual da fila: %d clientes\n\n",t_atual,filaClientes.size());  
            else{
                System.out.printf("Tempo atual: %d minutos;\nA fila de clientes esta vazia.\nFIM DA SIMULACAO\n", t_atual);  
                t_atual = duracaoSimulacao;
            }*/
            
        }
        // FIM - da interacão
        
    }
}
