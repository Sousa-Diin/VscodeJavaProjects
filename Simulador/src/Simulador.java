import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Simulador {

    private Queue<Cliente> clientes;
    private ArrayList<Atendente> atendentes;
    private int numeroAtendentes;
    private static int duracaoSimulacao;
    private static Random numero_gerado = new Random();// VAR da class

    public Simulador(int numeroAtendentes, int duracaoSimulacao){
        clientes = new LinkedList<>();
        atendentes = new ArrayList<>();
        this.numeroAtendentes = numeroAtendentes;
        this.duracaoSimulacao = duracaoSimulacao;
        criaFilaCliente();
        criaListaAtendente();
        
    }
    /*  //contrutor padrao
    public Simulador() {
    }*/
    public static int getDuracaoSimulacao() {
        return duracaoSimulacao;
        
    }

    protected void criaFilaCliente(){
        int duracao_atendimento = sorteioDAC();
        int tempo_chegada_cliete = sorteioTCC();
            
        clientes.offer(new Cliente(tempo_chegada_cliete, duracao_atendimento));

        /*//Atualiza variaveis
        duracao_atendimento = sorteioDA();
        tempo_chegada_cliete = sorteioTCC();*/
    
    }

    private void criaListaAtendente(){
        for(int i = 0; i < numeroAtendentes; i++){
            Atendente a = new Atendente();
            atendentes.add(a);
        }

    }
    //Metodo da classe 
    private int sorteioTCC (){
        //tempo_chegada_cliete
        return numero_gerado.nextInt(4);       
    }

    //Metodo da classe 
    private int sorteioDAC(){
        //duracao_atendimento_cliente
        return  numero_gerado.nextInt(7) + 1;
    }

    

    @Override
    public String toString() {
        return "\nDuracao da Simulacao = " + duracaoSimulacao + "\n";
    }

    public void simular(){
        //Loop da Interacão da simulacão - INICIO
        for(int t_atual = 0; t_atual < duracaoSimulacao; t_atual+=3){
            for(Atendente atd : atendentes){
                //Consulta se o atendente esta disponivel
                if(atd.estaDisponivel(t_atual))
                //Consulta se a fila esta vazia
                    if(!clientes.isEmpty()){
                    //Consulta na Fila Cliente se duracao do Atendimento é menor que a duracão da simulacão
                    
                        atd.atenderCliente(clientes.peek().getDuracaoAtendimento());
                        System.out.printf("\n\nTamanho da fila: %d\n", clientes.size());
                        System.out.printf("Tempo de chegada do clienta: %d\n", clientes.poll().getTempoChegada());
                        System.out.println("Duracão do atendimento: " + atendentes.get(t_atual).getProximo_atendimento());
                        System.out.println("Duracão da simulacão: " + t_atual);
                        System.out.println("TempoSimulacao - TempoAtual = : " + (t_atual));
                    }        
                            
                        
            }
        }
        // FIM - da interacão
        
    }
}
