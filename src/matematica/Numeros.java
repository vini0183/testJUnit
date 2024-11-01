package matematica;

public class Numeros {
    
    // Método que verifica se um número é par
    // Retorna true se o número 'n' é par (n % 2 == 0), caso contrário retorna false
    public Boolean numeroPar(int n) {
        return n % 2 == 0; // Retorna verdadeiro se o resto da divisão por 2 for 0
    }
    
    // Método que calcula a área de um quadrado
    // Recebe o comprimento do lado como parâmetro e retorna a área (lado * lado)
    public int areaQuadrado(int lado) {
        return lado * lado; // Calcula e retorna a área do quadrado
    }
    
    // Método que verifica se um número é divisível por outro
    // Recebe dois parâmetros: 'dividendo' e 'divisor'
    // Retorna true se 'dividendo' for divisível por 'divisor' (dividendo % divisor == 0), caso contrário retorna false
    public Boolean numeroDivisivel(int dividendo, int divisor) {
        return dividendo % divisor == 0; // Retorna verdadeiro se o resto da divisão for 0
    }
    
}
