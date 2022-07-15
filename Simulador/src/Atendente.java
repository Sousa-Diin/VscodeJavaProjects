public class Atendente {
    //Var que define a disponibilidade do proximo atendimento
    private int proximo_atendimento;

    
    public int getProximo_atendimento() {
        return proximo_atendimento;
    }
    
    public void atenderCliente(int duracao_atendimento){
        proximo_atendimento += duracao_atendimento;

    }

    public boolean estaDisponivel(int tempo_atual_simulacao){
    
        return proximo_atendimento < tempo_atual_simulacao; 
        
    }



}