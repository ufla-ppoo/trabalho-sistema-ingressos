package br.ufla.gac106.s2023_1.base.relatorios;

public interface ContabilizadorIngressos {
    /**
     * Identificador que indica a que se refere a contabilização. 
     * Ou seja, a quantidade de ingressos vendidos/comprados é de que?
     * 
     * Exemplos:
     * - Se for de um evento: o identificador poderia ser nome de um filme ou de um campeonato, por exemplo.
     * - Se for de um comprador: o identificador seria o nome do comprador
     */
    String identificador();

    /**
     * Quantidade de ingressos vendidos/comprados
     */
    int quantidadeIngressos();

    /**
     * Valor total arrecadado com a venda de ingressos
     */
    double valorTotal();
}
