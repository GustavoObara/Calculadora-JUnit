/**
 * Classe: Dividir
 * Descrição: Representa a operação de divisão em uma calculadora.
 * Autor: Luiz Obara
 * Data de Criação: 15/11/2023
 */

package calculadora;

/**
 * Classe que implementa a operação de divisão.
 */
public class Dividir {

    /**
     * Realiza a operação de divisão entre dois números inteiros.
     *
     * @param num1 O numerador (dividendo) da operação.
     * @param num2 O denominador (divisor) da operação.
     * @return O resultado da divisão entre num1 e num2.
     * @throws ArithmeticException Se o denominador (num2) for igual a zero, uma exceção será lançada,
     * indicando que a divisão por zero não é permitida na matemática.
     */
    public int dividir(int num1, int num2) {
        return num1 / num2;
    }
}