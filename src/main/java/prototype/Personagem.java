package prototype;

public class Personagem implements Cloneable {

    private int id;
    private String nome;
    private String classe;
    private Equipamento equipamento;

    public Personagem(int id, String nome, String classe, Equipamento equipamento) {
        this.id = id;
        this.nome = nome;
        this.classe = classe;
        this.equipamento = equipamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    @Override
    public Personagem clone() throws CloneNotSupportedException {
        Personagem personagemClone = (Personagem) super.clone();
        personagemClone.equipamento =
                (Equipamento) personagemClone.equipamento.clone();

        return personagemClone;
    }

    @Override
    public String toString() {
        return "Personagem{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", classe='" + classe + '\'' +
                ", equipamento=" + equipamento +
                '}';
    }
}