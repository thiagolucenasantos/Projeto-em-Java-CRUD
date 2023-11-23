package test;

import domain.Cliente;
import org.junit.Assert;
import org.junit.Test;
import pacoteDao.ClienteDao;
import pacoteDao.IClienteDao;

import static org.junit.Assert.*;

public class ClienteTest {
    @Test
    public void cadastrarTest() throws Exception {
        IClienteDao dao = new ClienteDao();
        Cliente cliente = new Cliente();
        cliente.setCodigo("1");
        cliente.setNome("Catarina");


        Integer qtd = dao.cadastrar(cliente);
        assertTrue(qtd == 1);

        Cliente clienteBD = dao.consultar(cliente.getCodigo());
        assertNotNull(clienteBD);
        assertNotNull(clienteBD.getId());
        assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
        assertEquals(cliente.getNome(), clienteBD.getNome());

        Integer qtdDel = dao.excluir(clienteBD);
        Assert.assertNotNull(qtdDel);
    }
}
