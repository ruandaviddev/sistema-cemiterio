package observer;

import javax.swing.JOptionPane;

/**
 * PADRÃO GOF: OBSERVER (Comportamental) — Observer Concreto
 *
 * O perfil de Manutenção recebe notificações apenas de serviços
 * do tipo Limpeza/Manutenção ou com status Pendente —
 * ou seja, só o que é relevante para o seu trabalho.
 *
 * @author Sistema Cemitério
 */
public class ObserverManutencao implements NotificacaoObserver {

    private final String nomeUsuario;

    public ObserverManutencao(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void receberNotificacao(String mensagem) {
        // Manutenção só é alertada sobre serviços de limpeza ou pendentes
        String msgLower = mensagem.toLowerCase();
        if (msgLower.contains("limpeza") || msgLower.contains("manutenção")
                || msgLower.contains("pendente")) {
            JOptionPane.showMessageDialog(
                null,
                "[MANUTENÇÃO] " + nomeUsuario + " — " + mensagem,
                "Novo serviço para manutenção",
                JOptionPane.WARNING_MESSAGE
            );
        }
    }
}
