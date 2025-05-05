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

		service.postPrestamo(1,"2-05-2025");


		/// libros GET, POST 

		System.out.println(" ### Obtener listado libros ### ");
		service.getLibros(); 
		System.out.println();

		System.out.println(" ### Obtener listado libros paginado ### ");
		service.getLibros(0,3,"",""); 
		System.out.println();


		System.out.println(" ### Añadir libro ### ");
		service.postLibro("1234512345123", "Caperucita morena", "Jimmy","Segunda" , "Disney island");
		System.out.println();



		// /libros/{libro-id} - PUT, DELETE 

		System.out.println(" ### Modificar libro ### ");
		service.putLibro(0, "9788437640099", "20000 de viaje submarino", "Julio Verne", "ES 16/05/2019", "Editorial Catedra");
		service.putLibro(1, "9788437640099", "20000 de viaje submarino", "Julio Verne", "ES 16/05/2019", "Editorial Catedra");
		service.putLibro(1, "9788420674179", "El señor de las moscas", "William Golding", "ES 13/05/2010", "Alianza Editorial");
		System.out.println();

		System.out.println(" ### Modificar libro ### ");
		service.deleteLibro(0);
		System.out.println();



		// /libros/{libro-id}/ejemplares -  POST 

		System.out.println(" ### Añadir ejemplar ### ");
		service.postEjemplar(1, "disponible");
		service.postEjemplar(1, "disponible");
		service.postEjemplar(0, "disponible");
		System.out.println();


		// /libros/{libro-id}/ejemplares/{ejemplar-id} - DELETE 

		System.out.println(" ### eliminar ejemplar ### ");
		service.deleteEjemplar(1, 0);


		// /usuarios - GET, POST 

		System.out.println(" ### Obtener listado Usuarios ### ");
		service.getUsuarios();
		System.out.println();

		System.out.println(" ### Añadir Usuario ### ");
		service.postUsuario("Miguel", "01/01/2020", "miguel@mail.com", null);
		service.postUsuario("Pablo", "13/02/2004", "pablo@mail.com", "4/5/2025");
		service.postUsuario("Ana", "23/03/2000", "ana@mail.com", "");
		System.out.println();

		// /usuarios/{matricula} - GET, PUT, DELETE 

		System.out.println(" ### Obtener Usuario ### ");
		service.getUsuario(0);
		System.out.println();

		System.out.println(" ### Obtener Usuario ### ");
		service.putUsuario(1, "Iván", "06/03/2004", "ivan.alvarez@mail.com", "05/05/2025");
		service.putUsuario(0, "Pablo", "13/02/2004", "pablo@mail.com", "4/5/2025");
		service.putUsuario(0, "Iván", "06/03/2004", "ivan.alvarez@mail.com", "05/05/2025");
		System.out.println();

		System.out.println(" ### Eliminar Usuario ### ");
		service.deleteUsuario(1);
		System.out.println();

		// /usuarios/{matricula}/prestamos  - GET, POST 

		System.out.println(" ### Obtener Prestamos ### ");
		service.getPrestamos(0);
		System.out.println();

		System.out.println(" ### Añadir Prestamo ### ");
		service.postPrestamo(0, "05/05/2025");
		service.postPrestamo(1, "01/05/2025");
		service.postPrestamo(0, "05/05/2025");
		System.out.println();

		// /usuarios/{matricula}/prestamos/{pretamo-id} -PUT 

		System.out.println(" ### Obtener Prestamo ### ");
		service.putPrestamo(0, 1, "05/05/2025", "12/05/2025", false);
		service.putPrestamo(1, 0, "01/05/2025", "6/05/2025", false);
		service.putPrestamo(0, 0, "05/05/2025", "12/05/2025", true);
		System.out.println();

		System.out.println("Fin de las pruebas");

	}

}
