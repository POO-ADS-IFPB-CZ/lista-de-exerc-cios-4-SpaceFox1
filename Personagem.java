public abstract class Personagem {
    private int vida = 100;
    private String nome;
    protected int danoAtaque = 15;
    private boolean vivo = true;
    private String[] ataques;
    private String classe = "Generic";

    public String getClasse() {
        return classe;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public boolean isVivo() {
        return vivo;
    }

    public String getNome() {
        return nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Personagem(String classe, String nome, int vida, String[] ataques) {
        this.nome = nome;
        this.vida = vida;
        this.ataques = ataques;
        this.classe = classe;
    }

    public int getVida() {
        return vida;
    }

    protected void atacarBase(Personagem personagem) {
        boolean sucesso = Math.random() > 0.15;
        if (!sucesso) {
            System.out.println("Falha no ataque");
            return;
        }
        int randomDoAtaque = (int) (Math.random() * (0.25 * danoAtaque));
        int danoDoAtaque = Math.random() > 0.5 ? danoAtaque + randomDoAtaque : danoAtaque - randomDoAtaque;
        personagem.setVida(personagem.getVida() - danoDoAtaque);
        String ataque = this.ataques[(int) (Math.random() * this.ataques.length)];
        if (personagem.getVida() <= 0) {
            personagem.setVivo(false);
            System.out.println(this.nome + " Usou " + ataque + " em " + personagem.getNome() + " que não resistiu e não está mais em combate!");
        } else {
            System.out.println(this.nome + " Usou " + ataque + " em " + personagem.getNome() + " que perdeu " + danoDoAtaque + " e agora tem " + personagem.getVida() + " pontos de vida.");
        }
    }

    public abstract void atacar(Personagem personagem);

    public void tomarPocao() {
        int pontosAleatorios = (int) (Math.random() * 30);
        System.out.println(this.nome + " tomou uma poção e regenerou " + pontosAleatorios + " pontos de vida!");
        this.vida += pontosAleatorios;
    }
}
