package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * PADRÃO GOF: OBSERVER (Comportamental) — Subject Concreto
 *
 * Gerencia a lista de observers e dispara as notificações.
 * Implementado como Singleton para garantir que todos os módulos
 * do sistema compartilhem o mesmo canal de notificações.
 *
 * Uso nas Views:
 *   GerenciadorNotificacoes.getInstance().notificarObservers("Serviço agendado: Limpeza");
 *
 * @author Sistema Cemitério
 */
public class GerenciadorNotificacoes implements NotificacaoSubject {

    // Instância única (Singleton)
    private static GerenciadorNotificacoes instancia;

    // Lista de todos os observers registrados
    private final List<NotificacaoObserver> observers = new ArrayList<>();

    // Construtor privado — impede instanciação externa
    private GerenciadorNotificacoes() {}

    /**
     * Retorna a única instância do gerenciador.
     */
    public static GerenciadorNotificacoes getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorNotificacoes();
        }
        return instancia;
    }

    @Override
    public void registrarObserver(NotificacaoObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removerObserver(NotificacaoObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notificarObservers(String mensagem) {
        for (NotificacaoObserver observer : observers) {
            observer.receberNotificacao(mensagem);
        }
    }
}
