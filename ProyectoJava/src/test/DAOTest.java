package test;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import Modelo.Articulo;
import Modelo.DAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DAOTest {
	private static final boolean UNICO = true;
	private static final String PRUEBALISTA_TST = "pruebalista.tst";
	DAO instancia = new DAO();
	ArrayList<Articulo> lista = new ArrayList();

	@Before
	public void setUp() throws Exception {
		
		lista.add(new Articulo(1, "a", "A", 12.8f));
		lista.add(new Articulo(1, "b", "B", 12.8f));
	}

	@Test
	public void test01Grabar() {
		assertTrue(instancia.grabar(lista, PRUEBALISTA_TST, UNICO));
	}

	
	@Test
	public void test02Leer() {
		ArrayList listaActual = (ArrayList) instancia.leer(PRUEBALISTA_TST, UNICO);
		// delegar la responsabilidad de la compararcion en el propio objeto que
		// compara
		boolean iguales = true;
		System.out.println();
		for (int i = 0; i <= listaActual.size() && iguales; i++) {
			System.out.println(lista.get(i).equals(listaActual.get(i)));
			iguales = lista.get(i).equals(listaActual.get(i));
		}
		// como no hay un assert para lista delego la compararcion en los
		// elementos de la
		// lista. concretamente en su metodo equals
		assertTrue(iguales);
	}



}
