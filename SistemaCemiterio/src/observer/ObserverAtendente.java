package observer;

import javax.swing.JOptionPane;

/**
 * PADRÃO GOF: OBSERVER (Comportamental) — Observer Concreto
 *
 * O Atendente recebe notificações relacionadas a sepultamentos
 * e cadastros de falecidos — eventos que impactam diretamente
 * o atendimento às famílias.
 *
 * @author Sistema Cemitério
 */
public class ObserverAtendente implements NotificacaoObserver {

    private final String nomeUsuario;

    public ObserverAtendente(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void receberNotificacao(String mensagem) {
        // Atendente é notificado sobre sepultamentos e falecidos cadastrados
        String msgLower = mensagem.toLowerCase();
        if (msgLower.contains("sepultamento") || msgLower.contains("falecido")
                || msgLower.contains("cadastrado")) {
            JOptionPane.showMessageDialog(
                null,
                "[ATENDENTE] " + nomeUsuario + " — " + mensagem,
                "Notificação de Atendimento",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
