public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super("Guerreiro", nome, 170, new String[]{"Golpear", "Ataque de Espada", "Ataque de Machado", "Ataque de Lança", "Ataque de Escudo"});
        this.danoAtaque = 70;
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println(this.getNome() + " se prepara para atacar...");
        this.atacarBase(personagem);
        String[] emocoes = new String[]{"Cansado", "Vitorioso", "Feliz", "Irritado"};
        String emocao = emocoes[(int) (Math.random() * emocoes.length)];
        System.out.println(this.getNome() + " se sente " + emocao + " após o ataque.");
    }
}
