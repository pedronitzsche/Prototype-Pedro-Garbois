package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonagemTest {

    @Test
    void deveClonarPersonagem() throws CloneNotSupportedException {

        Personagem personagem = new Personagem(
                1,
                "Guerreiro Original",
                "Guerreiro",
                new Equipamento("Espada", 20)
        );

        Personagem personagemClone = personagem.clone();

        personagemClone.setId(2);
        personagemClone.setNome("Guerreiro Clonado");
        personagemClone.getEquipamento().setDano(35);

        assertEquals(
                "Personagem{id=1, nome='Guerreiro Original', classe='Guerreiro', equipamento=Equipamento{nome='Espada', dano=20}}",
                personagem.toString()
        );

        assertEquals(
                "Personagem{id=2, nome='Guerreiro Clonado', classe='Guerreiro', equipamento=Equipamento{nome='Espada', dano=35}}",
                personagemClone.toString()
        );
    }
}