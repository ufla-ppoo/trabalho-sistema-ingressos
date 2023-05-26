package br.ufla.gac106.s2023_1.base.relatorios;

public interface ContabilizadorIngressos {
    /**
     * Identificador que indica a que se refere a estatística. A quantidade de ingressos vendidos é de que?
     * 
     * Exemplos:
     * - Se for um evento: o identificador poderia ser nome de um filme ou de um campeonato.
     * - Se for uma atividade: o identificador poderia ser a sessão de um filme ou o nome da partida de um campeonato.
     */
    String identificador();

    /**
     * Quantidade de ingressos vendidos
     */
    int ingressosVendidos();

    /**
     * Valor total arrecadado com a venda de ingressos
     */
    double valorArrecadado();
}
