package observer;

/**
 * PADRÃO GOF: OBSERVER (Comportamental) — Interface Observer
 *
 * Define o contrato que todo perfil de usuário deve implementar
 * para receber notificações automáticas do sistema.
 *
 * Cada perfil (Administrador, Atendente, Manutenção, Financeiro)
 * implementa esta interface e decide como exibir a notificação.
 *
 * @author Sistema Cemitério
 */
public interface NotificacaoObserver {

    /**
     * Método chamado automaticamente quando um evento ocorre no sistema.
     *
     * @param mensagem texto da notificação gerada pelo evento
     */
    void receberNotificacao(String mensagem);
}
