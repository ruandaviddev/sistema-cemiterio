package observer;

/**
 * PADRÃO GOF: OBSERVER (Comportamental) — Interface Subject
 *
 * Define o contrato para qualquer classe que queira publicar
 * notificações para os observers registrados.
 *
 * @author Sistema Cemitério
 */
public interface NotificacaoSubject {

    /**
     * Registra um observer para receber notificações.
     *
     * @param observer o perfil de usuário que deseja ser notificado
     */
    void registrarObserver(NotificacaoObserver observer);

    /**
     * Remove um observer previamente registrado.
     *
     * @param observer o perfil de usuário a ser removido
     */
    void removerObserver(NotificacaoObserver observer);

    /**
     * Notifica todos os observers registrados com uma mensagem.
     *
     * @param mensagem texto do evento ocorrido
     */
    void notificarObservers(String mensagem);
}
