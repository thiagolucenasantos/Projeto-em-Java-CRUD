package pacoteDao;

import domain.Cliente;

public interface IClienteDao {
    public Integer cadastrar(Cliente cliente) throws Exception;

    Cliente consultar(String codigo) throws Exception;

    Integer excluir(Cliente clienteBD)throws Exception;
}
