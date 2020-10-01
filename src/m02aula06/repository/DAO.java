package m02aula06.repository;

import java.util.List;

public interface DAO<T> {
	
	/**
	 * @param Usuário
	 * @throws ConexaoException
	 * @throws RepositoryException
	 */
	public void inserir(T obj)throws ConexaoException, RepositoryException;
	/**
	 * @param Usuário
	 * @return
	 * @throws ConexaoException
	 * @throws RepositoryException
	 */
	public T consulta(T obj)throws ConexaoException, RepositoryException;
	
	public void excluir(T obj)throws ConexaoException, RepositoryException;
	
	public void alterar(T obj)throws ConexaoException, RepositoryException;
	
	public List<T> listarTudo()throws ConexaoException, RepositoryException;
}
