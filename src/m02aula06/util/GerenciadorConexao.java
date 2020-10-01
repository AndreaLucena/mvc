package m02aula06.util;

import java.sql.Connection;

import m02aula06.repository.ConexaoException;

public interface GerenciadorConexao {
	/**
	 * @return Conexao
	 * @throws ConexaoException
	 */
	public Connection conectar()throws ConexaoException;
	/**
	 * Encerra a conexao
	 * @param Conexao
	 * @throws ConexaoException
	 */
	public void desconectar(Connection c)throws ConexaoException;
}
