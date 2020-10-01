package m02aula06.repository;

public class ConexaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public ConexaoException(String x) {
		super(x);
	}
	
	public ConexaoException(Exception x) {
		super(x);
	}
}
