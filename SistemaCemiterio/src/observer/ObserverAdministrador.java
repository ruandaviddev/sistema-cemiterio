package observer;

import javax.swing.JOptionPane;

/**
 * PADRÃO GOF: OBSERVER (Comportamental) — Observer Concreto
 *
 * O Administrador recebe TODAS as notificações do sistema
 * via pop-up de alerta, pois precisa ter visibilidade total.
 *
 * @author Sistema Cemitério
 */
public class ObserverAdministrador implements NotificacaoObserver {

    private final String nomeUsuario;

    public ObserverAdministrador(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void receberNotificacao(String mensagem) {
        // Administrador vê tudo com um pop-up de aviso
        JOptionPane.showMessageDialog(
            null,
            "[ADMIN] " + nomeUsuario + " — " + mensagem,
            "Notificação do Sistema",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
