/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_9_valentin;

        import java.util.LinkedList;
        import java.util.Queue;

public class PROJETO_9_VALENTIN {
            

class Semaforo {
    private int tempoAtual;

    public Semaforo() {
        this.tempoAtual = 0;
    }

    public String getEstado() {
        int ciclo = tempoAtual % 80; // 80 segundos para um ciclo completo
        if (ciclo < 30) {
            return "VERDE";
        } else if (ciclo < 35) {
            return "AMARELO";
        } else {
            return "VERMELHO";
        }
    }

    public void tick() {
        tempoAtual++;
    }
}

class Intersecao {
    private Queue<Integer> filaCarros;
    private Semaforo semaforo;
    private int carrosPassaram;
    private int tempoEsperaTotal;
    private int carrosCongestionados;

    public Intersecao() {
        filaCarros = new LinkedList<>();
        semaforo = new Semaforo();
        carrosPassaram = 0;
        tempoEsperaTotal = 0;
        carrosCongestionados = 0;
    }

    public void adicionarCarro(int tempoAtual) {
        if (filaCarros.size() < 10) {
            filaCarros.add(tempoAtual);
        } else {
            carrosCongestionados++;
        }
    }

    public void simularSegundo(int tempoAtual) {
        semaforo.tick();
        if (!filaCarros.isEmpty() && semaforo.getEstado().equals("VERDE")) {
            int tempoChegada = filaCarros.poll();
            carrosPassaram++;
            tempoEsperaTotal += (tempoAtual - tempoChegada);
        }
    }

    public int getCarrosPassaram() {
        return carrosPassaram;
    }

    public double getTempoEsperaMedio() {
        if (carrosPassaram > 0) {
            return (double) tempoEsperaTotal / carrosPassaram;
        }
        return 0;
    }

    public int getCarrosCongestionados() {
        return carrosCongestionados;
    }
}

public class Simulacao {
    public static void main(String[] args) {
        int tempoTotal = 600; // 10 minutos em segundos

        // Criação de cada interseção como variáveis independentes
        Intersecao intersecao1 = new Intersecao();
        Intersecao intersecao2 = new Intersecao();
        Intersecao intersecao3 = new Intersecao();

        // Loop de simulação
        for (int tempoAtual = 0; tempoAtual < tempoTotal; tempoAtual++) {
            if (tempoAtual % 15 == 0) {
                intersecao1.adicionarCarro(tempoAtual);
                intersecao2.adicionarCarro(tempoAtual);
                intersecao3.adicionarCarro(tempoAtual);
            }
            intersecao1.simularSegundo(tempoAtual);
            intersecao2.simularSegundo(tempoAtual);
            intersecao3.simularSegundo(tempoAtual);
        }

        // Relatório final para cada interseção
        System.out.println("Interseção 1:");
        System.out.println("  Carros que passaram: " + intersecao1.getCarrosPassaram());
        System.out.println("  Tempo médio de espera: " + intersecao1.getTempoEsperaMedio() + " segundos");
        System.out.println("  Carros congestionados: " + intersecao1.getCarrosCongestionados());

        System.out.println("Interseção 2:");
        System.out.println("  Carros que passaram: " + intersecao2.getCarrosPassaram());
        System.out.println("  Tempo médio de espera: " + intersecao2.getTempoEsperaMedio() + " segundos");
        System.out.println("  Carros congestionados: " + intersecao2.getCarrosCongestionados());

        System.out.println("Interseção 3:");
        System.out.println("  Carros que passaram: " + intersecao3.getCarrosPassaram());
        System.out.println("  Tempo médio de espera: " + intersecao3.getTempoEsperaMedio() + " segundos");
        System.out.println("  Carros congestionados: " + intersecao3.getCarrosCongestionados());
    }
}


}
