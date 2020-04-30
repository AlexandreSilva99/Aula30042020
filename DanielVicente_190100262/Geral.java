package com.danielvicente.calculadora;

/**
 * 
 * <b><i>Calculadora</i></b> <br>
 * 
 * @author Daniel Vicente
 * @version 1.0
 * @since 30/4/20
 * 
 * @see #soma(int, int)
 * @see #subtracao(int, int)
 * @see #divisao(int, int)
 * @see #multiplicacao(int, int)
 */
public class Geral {

	/**
	 * Fun��o que devolve o resultado da soma de 2 n�meros inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da soma
	 * @param y (int) parametro inteiro que vai ser um dos elementos da soma
	 * @return (int) resultado da soma dos parametros x e y
	 * <br>
	 * {@link com.danielvicente.calculadora.Geral#soma(int x, int y)}
	 */
	public static int soma(int x, int y) {
		// Retorno � feito por usar uma fun��o de somat�rio que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.soma(x, y);
	}

	/**
	 * Fun��o que devolve o resultado da subtra��o de 2 n�meros inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da subtra��o
	 * @param y (int) parametro inteiro que vai ser um dos elementos da subtra��o
	 * @return (int) resultado da subtra��o dos parametros x e y
	 * <br>
	 * {@link com.danielvicente.calculadora.Geral#subtracao(int x, int y)}
	 */
	public static int subtracao(int x, int y) {
		// Retorno � feito por usar uma fun��o de subtra��o que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.subtracao(x, y);
	}

	// Deixou de ser utilizada
	/**
	 * Fun��o que devolve o resultado da subtra��o de 2 n�meros inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da subtra��o
	 * @param y (int) parametro inteiro que vai ser um dos elementos da subtra��o
	 * @return (int) resultado da subtra��o dos parametros x e y
	 * @deprecated
	 * @since 1.0
	 * 
	 */
	public static int inversaoDaSoma(int x, int y) {
		// Retorno � feito por usar uma fun��o de subtra��o que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.subtracao(x, y);
	}

	/**
	 * Fun��o que devolve o resultado da multiplica��o de 2 n�meros inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da
	 *          multiplica��o
	 * @param y (int) parametro inteiro que vai ser um dos elementos da
	 *          multiplica��o
	 * @return (int) resultado da subtra��o dos parametros x e y
	 * <br>
	 * {@link com.danielvicente.calculadora.Geral#multiplicacao(int x, int y)}
	 */
	public static int multiplicacao(int x, int y) {
		// Retorno � feito por usar uma fun��o de multiplica��o que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.multiplicacao(x, y);
	}

	/**
	 * Fun��o que devolve o resultado da divis�o de 2 n�meros inteiros
	 * 
	 * @param x (int) parametro inteiro que vai ser um dos elementos da divis�o
	 * @param y (int) parametro inteiro que vai ser um dos elementos da divis�o
	 * @return (int) resultado da divis�o dos parametros x e y
	 * <br>
	 * {@link com.danielvicente.calculadora.Geral#divisao(int x, int y)}
	 */
	public static double divisao(int x, int y) {
		// Retorno � feito por usar uma fun��o de divis�o que se encontra na API
		// CalculadoraAPI
		return CalculadoraAPI.divisao(x, y);
	}
}
