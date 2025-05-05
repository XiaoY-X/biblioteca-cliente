package sos.biblioteca.cliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Cliente {

	static BibliotecaService service = new BibliotecaService();


	public static void main(String[] args) {



		System.out.println("Inicio de la ejecución de las pruebas");


		String [] titulos = {"ABC", "DEF", "HIJ"}; 
		String [] autores = {"Pedro", "Juan"}; 


		service.postLibro("1234512345123", "Caperucita morena", "Jimmy","Segunda" , "Disney island");
		service.postLibro("8989898989898", "Caperucita blanca", "Tommy","Primera" , "Telemadrid");
		service.postLibro("0303030303030", "Caperucita amarilla", "Pepe","Aniversario" , "Telecanarias");


		service.postUsuario("Juan", "12-12-2003", "algo@gmail.com", null);
		service.postUsuario("María", "10-01-2006", "entre@gmail.com", null);
		service.postUsuario("Fernando", "20-05-2010", "todos@gmail.com", null);


		service.postEjemplar( 0, "disponible");
		service.postEjemplar( 0, "prestado");
		service.postEjemplar( 1, "prestado");
		service.postEjemplar( 1, "disponible");
		service.postEjemplar( 2, "disponible");

		service.postPrestamo(1,"2-05-2025")


		/// libros GET, POST 

		System.out.println(" ### Obtener listado libros ### ");
		service.getLibros();; 
		System.out.println();

		System.out.println(" ### Obtener listado libros paginado ### ");
		service.getLibros(0,3,"","");; 
		System.out.println();


		System.out.println(" ### Añadir libro ### ");
		service.postLibro("1234512345123", "Caperucita morena", "Jimmy","Segunda" , "Disney island");
		System.out.println();



		// /libros/{libro-id} - PUT, DELETE 



		// /libros/{libro-id}/ejemplares -  POST 


		// /libros/{libro-id}/ejemplares/{ejemplar-id} - DELETE 




		// /usuarios - GET, POST 

		System.out.println(" ### Obtener listado libros ### ");
		service.getUsuarios();
		System.out.println();





		// /usuarios/{matricula} - GET, PUT, DELETE 




		// /usuarios/{matricula}/prestamos  - GET, POST 




		// /usuarios/{matricula}/prestamos/{pretamo-id} -PUT 



		System.out.println("Fin de las pruebas");

	}

}
