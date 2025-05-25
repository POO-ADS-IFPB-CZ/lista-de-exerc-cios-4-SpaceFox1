import java.util.Scanner;

public class Questao5 {
    private static boolean temInimigoVivo(Personagem[] personagem) {
        boolean temInimigoVivo = false;
        for (Personagem value : personagem) {
            if (value.isVivo()) {
                temInimigoVivo = true;
                break;
            }
        }
        return temInimigoVivo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do jogador: ");
        String nome = sc.nextLine();

        System.out.println("Selecione uma classe:");
        System.out.println("1 - Guerreiro");
        System.out.println("2 - Mago");
        System.out.println("3 - Arqueiro");

        int classe = sc.nextInt();

        if (classe < 1 || classe > 3) { throw new RuntimeException("Classe invalida!"); }

        Personagem jogador;

        if (classe == 1) { jogador = new Guerreiro(nome); }
        else if (classe == 2) { jogador = new Mago(nome); }
        else { jogador = new Arqueiro(nome); }

        int numeroInimigos = 4;
        String[] nomeInimigos = new String[]{"Robson", "O deus da morte", "Vitor", "Dextror", "Pablo", "Francisco"};
        Personagem[] inimigos = new Personagem[numeroInimigos];

        for (int i = 0; i < numeroInimigos; i++) {
            String nomeInimigo = nomeInimigos[(int) Math.floor(Math.random() * nomeInimigos.length)];
            int classeInimigo = (int) Math.floor(Math.random() * 3);
            if (classeInimigo == 1) { inimigos[i] = new Guerreiro(nomeInimigo); }
            else if (classeInimigo == 2) { inimigos[i] = new Mago(nomeInimigo); }
            else { inimigos[i] = new Arqueiro(nomeInimigo); }
        }

        do {
            int inimigoAtual = (int) Math.floor(Math.random() * numeroInimigos);
            if (!inimigos[inimigoAtual].isVivo()) continue;
            System.out.println(jogador.getClasse() + " " + jogador.getNome() + ": " + jogador.getVida());
            System.out.println("Inimigo atual: " + inimigos[inimigoAtual].getClasse() + " " +  inimigos[inimigoAtual].getNome() + " vida: " + inimigos[inimigoAtual].getVida());
            System.out.println("Ação:");
            System.out.println("1 - Atacar");
            System.out.println("2 - Tomar Poção");
            int acao = sc.nextInt();

            if (acao == 1) {
                jogador.atacar(inimigos[inimigoAtual]);
            } else if (acao == 2) {
                jogador.tomarPocao();
            }

            if (inimigos[inimigoAtual].isVivo()) {
                System.out.println("Vez do inimigo.");

                int acaoInimigo = (int) Math.floor(Math.random() * 3);
                if (acaoInimigo == 1) { inimigos[inimigoAtual].atacar(jogador); }
                else if (acaoInimigo == 2) { inimigos[inimigoAtual].tomarPocao(); }
                else { System.out.println(inimigos[inimigoAtual].getNome() + " se prepara!"); }
            }


            System.out.println();

            if (!jogador.isVivo()) break;
        } while (temInimigoVivo(inimigos));

        if (!temInimigoVivo(inimigos)) {
            System.out.println("Parabens! " + jogador.getNome() + " você ganhou de todos os inimigos!");
        } else if (!jogador.isVivo()) {
            System.out.println("Que pena! " + jogador.getNome() + " morreu antes de conseguir vencer a batalha!");
        }
    }
}
