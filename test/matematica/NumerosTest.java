package matematica;

// Importa a anotação para métodos que são executados após cada teste
import org.junit.After;        
// Importa a anotação para métodos que são executados após todos os testes
import org.junit.AfterClass;   
// Importa a anotação para métodos que são executados antes de cada teste
import org.junit.Before;       
// Importa a anotação para métodos que são executados antes de todos os testes
import org.junit.BeforeClass;  
// Importa a anotação que indica que o método é um caso de teste
import org.junit.Test;         
// Importa métodos de asserção para validar os resultados dos testes
import static org.junit.Assert.*; 

public class NumerosTest {
    
    private Numeros n; // Declara uma instância da classe Numeros que será usada nos testes
    private static int contador; // Variável estática para contar quantos testes foram executados

    // Construtor da classe de teste
    public NumerosTest() {
    }
    
    // Método executado uma vez antes de todos os testes
    @BeforeClass
    public static void setUpClass() {
        contador = 0; // Inicializa o contador de testes
        System.out.println("Iniciando os testes..."); // Exibe mensagem ao iniciar os testes
    }
    
    // Método executado uma vez após todos os testes
    @AfterClass
    public static void tearDownClass() {
        // Exibe o total de testes executados após todos os testes
        System.out.println("Total de testes executados: " + contador); 
        System.out.println("Todos os testes concluídos."); // Mensagem de conclusão
    }
    
    // Método executado antes de cada teste para configurar o ambiente
    @Before
    public void setUp() {
        n = new Numeros(); // Instancia a classe Numeros antes de cada teste
    }
    
    // Método executado após cada teste para limpar o ambiente
    @After
    public void tearDown() {
        contador++; // Incrementa o contador após cada teste
    }

    // Testa se o método numeroPar retorna true para o número 10
    @Test
    public void testNumeroPar() { 
        assertTrue(n.numeroPar(10)); // Verifica se 10 é par (deve retornar true)
    }
    
    // Testa se a área de um quadrado com lado 10 é 100
    @Test
    public void testAreaQuadrado() { 
        assertEquals(100, n.areaQuadrado(10)); // Verifica se a área calculada é igual a 100 (10*10)
    }
    
    // Testa se 4 é divisível por 2
    @Test
    public void testNumeroDivisivel() { 
        assertTrue(n.numeroDivisivel(4, 2)); // Verifica se 4 é divisível por 2 (deve retornar true)
    }
    
    // Testa se 5 não é par
    @Test
    public void testNumeroImpar() {
        assertFalse(n.numeroPar(5)); // Verifica se 5 não é par (deve retornar false)
    }
    
    // Testa a área de um quadrado com lado 0 (área deve ser 0)
    @Test
    public void testAreaQuadradoZero() {
        assertEquals(0, n.areaQuadrado(0)); // Verifica se a área calculada é igual a 0 (0*0)
    }

    // Testa se 10 é divisível por 5
    @Test
    public void testNumeroDivisivelPorCinco() { 
        assertTrue(n.numeroDivisivel(10, 5)); // Verifica se 10 é divisível por 5 (deve retornar true)
    }
}
