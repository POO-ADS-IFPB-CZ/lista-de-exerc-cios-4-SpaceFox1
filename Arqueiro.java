public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super("Arqueiro", nome, 110, new String[]{"Flecha de Fogo", "Lança de Gelo", "Flecha de Confusão", "Flecha de Pedra", "Lança de Veneno"});
        this.danoAtaque = 50;
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println(this.getNome() + " carrega seu arco...");
        this.atacarBase(personagem);
        String[] emocoes = new String[]{"Um mestre da pontaria", "Vitorioso", "O Robin Wood em pessoa", "Poderoso"};
        String emocao = emocoes[(int) (Math.random() * emocoes.length)];
        System.out.println(this.getNome() + " se sente " + emocao + " após o ataque.");
    }
}
