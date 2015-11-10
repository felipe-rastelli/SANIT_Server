package br.com.lorencity.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.lorencity.bo.BoGestor;

/**
 * Servlet implementation class ServletGestor
 */
@WebServlet("/ServletGestor")
public class ServletGestor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletGestor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		String responseString = null;
		
		BoGestor boGestor;
		
		try{
			boGestor = new BoGestor();
			
			switch (action) {
			case "inserir":
				//
				break;
			case "remover":
				//
				break;
			case "atualizar":
				//
				
				break;
			case "consultarBairros":
				//
				
				//setar no request
				break;
			case "consultarBairrosJson":
				//
				
				break;
			default:
				responseString = "Filter Error";
				break;
			}
			
		}catch(RuntimeException e){
			responseString = e.getMessage();
			e.printStackTrace();
		}
		
		//retorno para a p�gina e setar atributos
		System.out.println("Resposta enviada com sucesso.");
	}

}
