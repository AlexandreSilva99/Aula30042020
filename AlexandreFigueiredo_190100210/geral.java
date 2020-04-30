package com.marioduarte.calculadora;
/**
 * A class geral disponibiliza fun��es aritm�ticas basicas:
 * soma, subtra��o, multiplica��o e divisao.
 * 
 * @autor Alexandre Figueiredo
 * @version 1.0
 * @since 30/04/2020
 * 
 */

public class geral 
{
	/**
	 * A fun��o serve para devolver um valor inteiro da soma de dois numeros que � feita na classe calculadoraAPI.
	 * @param x (int) par�metro inteiro que vai ser um dos elementos da soma 
	 * @param y (int) par�metro inteiro que vai ser um dos elementos da soma
	 * @return (int) resultado da soma dos par�metros x e y
	 */
	public static int soma(int x, int y)
	{
		// retorna a soma dos valores inteiros x e y, que � feita na calsse calculadoraAPI
		return calculadoraAPI.soma(x, y);
	}
	
	/**
	 * A fun��o serve para devolver um valor inteiro da subtra��o de dois numeros que � feita na classe calculadoraAPI.
	 * @param x (int) par�metro inteiro que vai ser um dos elementos da subtracao 
	 * @param y (int) par�metro inteiro que vai ser um dos elementos da subtracao
	 * @return (int) resultado da subtracao dos par�metros x e y
	 */
	public static int subtracao(int x, int y)
	{
		// retorna a subtracao dos valores inteiros x e y, que � feita na calsse calculadoraAPI
		return calculadoraAPI.subtracao(x, y);
	}
	
	/**
	 * A fun��o serve para devolver um valor inteiro da soma de dois numeros que � feita na classe calculadoraAPI.
	 * @param x (int) par�metro inteiro que vai ser um dos elementos da soma 
	 * @param y (int) par�metro inteiro que vai ser um dos elementos da soma
	 * @return (int) resultado da soma dos par�metros x e y
	 * 
	 * @deprecated
	 * 
	 * @since @version 0.9
	 * 
	 */
	public static int inversaoDaSoma(int x,int y)
	{
		return calculadoraAPI.subtracao(x, y);
	}
	
	/** A fun��o serve para devolver um valor inteiro da multiplica��o de dois numeros que � feita na classe calculadoraAPI.
	 * @param x (int) par�metro inteiro que vai ser um dos elementos da multiplica��o 
	 * @param y (int) par�metro inteiro que vai ser um dos elementos da multiplica��o
	 * @return (int) resultado da multiplica��o dos par�metros x e y
	 */
	public static int multiplicacao(int x, int y)
	{
		// retorna a multiplica��o dos valores inteiros x e y, que � feita na calsse calculadoraAPI
		return calculadoraAPI.multiplicacao(x, y);
	}
	
	/**
	 * A fun��o serve para devolver um valor double da divisao de dois numeros que � feita na classe calculadoraAPI.
	 * @param x (double) par�metro double que vai ser um dos elementos da divisao 
	 * @param y (double) par�metro double que vai ser um dos elementos da divisao
	 * @return (double) resultado da divisao dos par�metros x e y
	 */
	public static double divisao(double x, double y)
	{
		// retorna a divisao dos valores double x e y, que � feita na calsse calculadoraAPI
		return calculadoraAPI.divisao(x, y);
	}
}
