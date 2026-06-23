package factory;

import dao.FalecidoDao;
import dao.SepulturaDao;
import dao.ServicoDao;
import dao.UsuarioDao;

/**
 * PADRÃO GOF: FACTORY METHOD (Criacional) — Implementação Concreta
 *
 * Fábrica concreta responsável por criar os DAOs que usam MySQL.
 * Se o projeto migrar para outro banco (ex: PostgreSQL), basta criar
 * uma PostgreSQLDAOFactory sem alterar nenhuma View ou lógica de negócio.
 *
 * @author Sistema Cemitério
 */
public class MySQLDAOFactory extends DAOFactory {

    @Override
    public FalecidoDao criarFalecidoDao() {
        return new FalecidoDao();
    }

    @Override
    public SepulturaDao criarSepulturaDao() {
        return new SepulturaDao();
    }

    @Override
    public ServicoDao criarServicoDao() {
        return new ServicoDao();
    }

    @Override
    public UsuarioDao criarUsuarioDao() {
        return new UsuarioDao();
    }
}
