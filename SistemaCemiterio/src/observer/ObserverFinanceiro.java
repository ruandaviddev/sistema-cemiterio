package observer;

import javax.swing.JOptionPane;

/**
 * PADRÃO GOF: OBSERVER (Comportamental) — Observer Concreto
 *
 * O perfil Financeiro recebe notificações sobre serviços concluídos,
 * pois são eventos que geram movimentação financeira.
 *
 * @author Sistema Cemitério
 */
public class ObserverFinanceiro implements NotificacaoObserver {

    private final String nomeUsuario;

    public ObserverFinanceiro(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @Override
    public void receberNotificacao(String mensagem) {
        // Financeiro é notificado sobre serviços concluídos (geram cobrança)
        if (mensagem.toLowerCase().contains("concluído")
                || mensagem.toLowerCase().contains("concluido")) {
            JOptionPane.showMessageDialog(
                null,
                "[FINANCEIRO] " + nomeUsuario + " — " + mensagem,
                "Serviço concluído — verificar cobrança",
                JOptionPane.INFORMATION_MESSAGE
            );
        }
    }
}
