import javax.swing.JOptionPane;

public class principal {
    public static void main(String[] args){
        Campeonato Campeonato = new Campeonato();

        while (true) { String opcao = JOptionPane.showInputDialog("Selecione uma opção:\n" +
        "1. Gerenciamento de Equipes\n" +
        "2. Gerenciamento de Jogadores\n" +
        "3. Registro de Partidas\n" +
        "4. Classificação e Estatísticas\n" +
        "5. Sair");

        switch (opcao) {
            case "1":
            String opcaoEquipes = JOptionPane.showInputDialog("Selecione uma opção:\n" +
            "1. Cadastrar Equipe\n" +
            "2. Editar Equipe\n" +
            "3. Remover Equipe\n" +
            "4. Listar Equipes");
            break;
            case "2":
            String opcaoJogadores = JOptionPane.showInputDialog("Selecione uma opção:\n" +
            "1. Cadastrar Jogador\n" +
            "2. Editar Jogador\n" +
            "3. Remover Jogador");
            break;
            case "3":    
            String opcaoPartidas = JOptionPane.showInputDialog("Seelecione uma opção:\n" +
            "1. Criar Partida\n" +
            "2. Editar Partida\n" +
            "3. Remover Partida");
            break;
            case "4":
            break;

            case "5":
           
            System.exit(0);
            break;
            default:

                JOptionPane.showInputDialog(null,"Sua opção é invalida");
        }

        }
    }
}
