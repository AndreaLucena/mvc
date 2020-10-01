package m02aula06.repository;

public class RepositoryException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public RepositoryException(String x) {
		super(x);
	}
	
	public RepositoryException(Exception x) {
		super(x);
	}
}
