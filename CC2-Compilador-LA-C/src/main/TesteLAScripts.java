/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Lucas
 */
public class TesteLAScripts {

    public static String algoritimo_1
            = "{ dado o comprimento de um arco, calcular seu cosseno pela soma \n"
            + "cos(x) = S x^i/i! para um dado numero de termos } \n"
            + "algoritmo \n"
            + "declare i, termo, baseFatorial, fatorial, numeroTermos: inteiro \n"
            + "declare cosseno, angulo: real \n"
            + "{ leitura do arco e do numero de termos } \n"
            + "leia(angulo, numeroTermos) { angulo em radianos } \n"
            + "{ calculo da aproximacao do cosseno } \n"
            + "cosseno <- 0 { acumulador do resultado } \n"
            + "baseFatorial <- 1 \n"
            + "fatorial <- 1 \n"
            + "termo <- 1 \n"
            + "para i <- 1 ate numeroTermos faca \n"
            + "{ faz o somatorio } \n"
            + "se i % 2 = 1 entao \n"
            + "cosseno <- cosseno + termo { soma termos impares } \n"
            + "senao \n"
            + "cosseno <- cosseno - termo { subtrai termos pares } \n"
            + "fim_se \n"
            + "{ calcula o proximo termo } \n"
            + "fatorial <- fatorial * baseFatorial * (baseFatorial + 1) \n"
            + "baseFatorial <- baseFatorial + 2 \n"
            + "termo <- pot(x, i + 1)/fatorial \n"
            + "fim_para \n"
            + "{ resultado calculado } \n"
            + "escreva(\"cos(\", angulo, \") = \", cosseno) \n"
            + "fim_algoritmo";

    public static String algoritimo_2
            = "{ exemplificacao de sub-rotinas na forma de funcao e seu uso } \n"
            + "funcao menorInteiro(valor1: inteiro, valor2: inteiro): inteiro \n"
            + "{ retorna o menor entre valor1 e valor2; se iguais retorna um deles } \n"
            + "se valor1 < valor2 entao \n"
            + "retorne valor1 \n"
            + "senao \n"
            + "retorne valor2 \n"
            + "fim_se \n"
            + "fim_funcao \n"
            + "funcao menorReal(valor1: real, valor2: real): real \n"
            + "{ retorna o menor entre valor1 e valor2; se iguais, retorna um deles } \n"
            + "se valor1 < valor2 entao \n"
            + "retorne valor1 \n"
            + "senao \n"
            + "retorne valor2 \n"
            + "fim_se \n"
            + "fim_funcao \n"
            + "funcao modulo(valor: real): real \n"
            + "{ retorna o valor absoluto do valor } \n"
            + "se valor < 0 entao \n"
            + "valor <- -valor \n"
            + "fim_se \n"
            + "retorne valor \n"
            + "fim_funcao \n"
            + "{ parte principal } \n"
            + "algoritmo \n"
            + "declare \n"
            + "primeiroInt, segundoInt: inteiro \n"
            + "declare \n"
            + "primeiroReal, segundoReal: real \n"
            + "{ entrada de dados } \n"
            + "leia(primeiroInt, segundoInt, primeiroReal, segundoReal) \n"
            + "{ algumas saidas e manipulacoes } \n"
            + "escreva(\"O menor inteiro entre\", primeiroInt, \"e\", \n"
            + "segundoInt, \"eh\", menor(primeiroInt, segundoInt)) \n"
            + "se menorReal(primeiroReal, segundoReal) <> primeiroReal entao \n"
            + "escreva(segundoReal, \"eh menor que\", primeiroReal) \n"
            + "fim_se \n"
            + "se modulo(primeiroReal) = primeiroReal e primeiroReal <> 0 entao \n"
            + "escreva(\"O valor\", primeiroReal, \"eh positivo\") \n"
            + "senao \n"
            + "escreva(\"O valor\", primeiroReal, \"nao eh positivo\") \n"
            + "fim_se \n"
            + "escreva(\"Considerando-se o modulo, tem-se que o menor entre\", \n"
            + "primeiroReal, \"e\", segundoReal, \"eh\", \n"
            + "menorReal(modulo(primeiroReal), modulo(segundoReal))) \n"
            + "fim_algoritmo";
    
    public static String algoritimo_1_erro_semantico
            = "{ dado o comprimento de um arco, calcular seu cosseno pela soma \n"
            + "cos(x) = S x^i/i! para um dado numero de termos } \n"
            + "algoritmo \n"
            + "declare i, baseFatorial, fatorial, numeroTermos: inteiro \n"
            + "declare cosseno, angulo: real \n"
            + "{ leitura do arco e do numero de termos } \n"
            + "leia(angulo, numeroTermos) { angulo em radianos } \n"
            + "{ calculo da aproximacao do cosseno } \n"
            + "cosseno <- 0 { acumulador do resultado } \n"
            + "baseFatorial <- 1 \n"
            + "fatorial <- 1 \n"
            + "termo <- 1 \n"
            + "para i <- 1 ate numeroTermos faca \n"
            + "{ faz o somatorio } \n"
            + "se i % 2 = 1 entao \n"
            + "cosseno <- cosseno + termo { soma termos impares } \n"
            + "senao \n"
            + "cosseno <- cosseno - termo { subtrai termos pares } \n"
            + "fim_se \n"
            + "{ calcula o proximo termo } \n"
            + "fatorial <- fatorial * baseFatorial * (baseFatorial + 1) \n"
            + "baseFatorial <- baseFatorial + 2 \n"
            + "termo <- pot(x, i + 1)/fatorial \n"
            + "fim_para \n"
            + "{ resultado calculado } \n"
            + "escreva(\"cos(\", angulo, \") = \", cosseno) \n"
            + "fim_algoritmo";

}
