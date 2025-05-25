public class Mago extends Personagem {
    public Mago(String nome) {
        super("Mago", nome, 75, new String[]{"Feitiço de Fogo", "Feitiço de Gelo", "Feitiço de Confusão", "Feitiço de Pedra", "Feitiço de Água"});
        this.danoAtaque = 100;
    }

    @Override
    public void atacar(Personagem personagem) {
        System.out.println(this.getNome() + " se prepara para lançar um feitiço...");
        this.atacarBase(personagem);
        String[] emocoes = new String[]{"Excelente", "Vitorioso", "Um Mestre", "Intelectual"};
        String emocao = emocoes[(int) (Math.random() * emocoes.length)];
        System.out.println(this.getNome() + " se sente " + emocao + " após o ataque.");
    }
}
