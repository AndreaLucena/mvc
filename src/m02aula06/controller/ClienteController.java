package m02aula06.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import m02aula06.basica.Cliente;
import m02aula06.model.RNClienteListar;
import m02aula06.model.RNClienteSalvar;

@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at GET: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if(request.getParameter("action").equals("salvar")) {
			Cliente cliente = new Cliente();
			cliente.setNome(request.getParameter("nome"));
			cliente.setCpf(request.getParameter("cpf"));
			cliente.setEmail(request.getParameter("email"));

			try {
				RNClienteSalvar rnSalva = new RNClienteSalvar();
				rnSalva.salvar(cliente);
				
				RNClienteListar rnLista = new RNClienteListar();
				ArrayList<Cliente> lista = (ArrayList<Cliente>)rnLista.listar();
				request.setAttribute("clientes", lista);

				RequestDispatcher view = request.getRequestDispatcher("lista_clientes.jsp");
				view.forward(request, response);
			} catch (Exception e) {
				response.getWriter().append("Erro: " + e.getMessage());
			}
		}
	}

}
