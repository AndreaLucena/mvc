package m02aula06.model;

import m02aula06.basica.Cliente;
import m02aula06.repository.ConexaoException;
import m02aula06.repository.DAOCliente;
import m02aula06.repository.RepositoryException;

public class RNClienteSalvar {

	public void salvar(Cliente cliente) throws Exception {
		validarDados(cliente);
		verificar(cliente);
		inserir(cliente);
	}
	/**
	 * @param cliente
	 * @throws Exception
	 */
	private void validarDados(Cliente cliente) throws Exception {
		if ((cliente.getNome() == null) || cliente.getNome().isEmpty()) {
			throw new Exception("Nome inválido");
		}
		if ((cliente.getCpf() == null) || cliente.getCpf().isEmpty()) {
			throw new Exception("CPF inválido");
		}
		if ((cliente.getEmail() == null) || cliente.getEmail().isEmpty()) {
			throw new Exception("E-mail inválido");
		}
		if ((cliente.getDataNascimento() == null) || cliente.getDataNascimento().isEmpty()) {
			throw new Exception("Data de nascimento inválida");
		}
		if ((cliente.getSexo() == null) || cliente.getSexo().isEmpty()) {
			throw new Exception("Sexo inválido");
		}
		if ((cliente.getNomeSocial() == null) || cliente.getNomeSocial().isEmpty()) {
			throw new Exception("Nome social inválido");
		}
		if ((cliente.getApelido() == null) || cliente.getApelido().isEmpty()) {
			throw new Exception("Apelido inválido");
		}
		if ((cliente.getTelefone() == null) || cliente.getTelefone().isEmpty()) {
			throw new Exception("Telefone inválido");
		}
		if ((cliente.getEndereco() == null) || cliente.getEndereco().isEmpty()) {
			throw new Exception("Endereço inválido");
		}
	}
	/**
	 * @param cliente
	 */
	private void verificar(Cliente cliente) throws Exception {
		DAOCliente dao = new DAOCliente();
		try {
			Cliente aux = dao.consulta(cliente);
			if (aux != null) {
				throw new Exception("CPF duplicado");
			}
		} catch (ConexaoException e) {
			throw new Exception(
					"Estamos atualizando o Sistema. Tente novamente em algumas horas.<br/>" + e.getMessage());
		} catch (RepositoryException e) {
			throw new Exception("Erro. Por gentileza, tente novamente.<br/>" + e.getMessage());
		}
	}
	/**
	 * @param cliente
	 * @throws Exception
	 */
	private void inserir(Cliente cliente) throws Exception {
		DAOCliente dao = new DAOCliente();
		try {
			dao.inserir(cliente);
		} catch (ConexaoException e) {
			throw new Exception(
					"Estamos atualizando o Sistema. Tente novamente em algumas horas.<br/>" + e.getMessage());
		} catch (RepositoryException e) {
			throw new Exception("Erro. Por gentileza, tente novamente.<br/>" + e.getMessage());
		}

	}
}
