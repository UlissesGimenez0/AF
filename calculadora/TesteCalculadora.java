package calculadora;

/**
 * @author Ulisses Gimenez 
 * 
 * Classe responsável por testar o funcionamento da {@link Calculadora}.
 *
 * <p>Este arquivo executa várias operações matemáticas para verificar
 * se os métodos da calculadora retornam os resultados esperados e
 * se as exceções são tratadas corretamente.</p>
 */

public class TesteCalculadora {

    /**
     * Método principal do programa. Aqui são feitas chamadas para a calculadora
     * utilizando diferentes operadores e valores. Também são realizados testes
     * para situações que provocam erros, como divisão por zero e operador inválido.
     *
     * @param args parâmetros da linha de comando (não utilizados neste programa)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Operações básicas válidas:
        System.out.println(calc.calcular(2, 3, "+"));   // Soma
        System.out.println(calc.calcular(10, 4, "-"));  // Subtração
        System.out.println(calc.calcular(3, 5, "*"));   // Multiplicação
        System.out.println(calc.calcular(8, 2, "/"));   // Divisão

        // Teste para verificar o comportamento ao tentar dividir por zero
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste para verificar como a calculadora reage a um operador que não existe
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
