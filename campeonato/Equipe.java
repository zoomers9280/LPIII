import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nomeeq;
    private List<Jogador> jogadores;
    private String tecnico;

    public Equipe(String nomeeq, String tecnico) {
        this.nomeeq = nomeeq;
        this.tecnico = tecnico;
        this.jogadores = new ArrayList<>();
    }

    public void cadastrarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void editarJogador(int indice, Jogador novoJogador) {
        if (indice >= 0 && indice < jogadores.size()) {
            jogadores.set(indice, novoJogador);
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido!");
        }
    }

    public void removerJogador(int indice){
        if(indice >=0 &)
    }



    public String getNome() {
        return nomeeq;
    }

    public void setNome(String nomeeq) {
        this.nomeeq = nomeeq;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }
}
