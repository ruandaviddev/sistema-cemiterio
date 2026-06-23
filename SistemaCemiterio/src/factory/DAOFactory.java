package factory;

import dao.FalecidoDao;
import dao.SepulturaDao;
import dao.ServicoDao;
import dao.UsuarioDao;

/**
 * PADRÃO GOF: FACTORY METHOD (Criacional)
 *
 * Define a interface para criação dos objetos DAO.
 * Cada subclasse decide qual implementação concreta instanciar.
 * Isso desacopla as Views da criação direta dos DAOs,
 * e facilita a troca de banco de dados sem alterar o restante do sistema.
 *
 * @author Sistema Cemitério
 */
public abstract class DAOFactory {

    /**
     * Factory Method para FalecidoDao
     */
    public abstract FalecidoDao criarFalecidoDao();

    /**
     * Factory Method para SepulturaDao
     */
    public abstract SepulturaDao criarSepulturaDao();

    /**
     * Factory Method para ServicoDao
     */
    public abstract ServicoDao criarServicoDao();

    /**
     * Factory Method para UsuarioDao
     */
    public abstract UsuarioDao criarUsuarioDao();

    /**
     * Método estático que retorna a fábrica padrão do sistema (MySQL).
     * Se no futuro o banco mudar, basta trocar aqui.
     */
    public static DAOFactory getFactory() {
        return new MySQLDAOFactory();
    }
}
