package com.example.rpggame.character.job;

import com.example.rpggame.character.Character;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Created by marathoner on 2021/08/11
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Wizard  extends Character {
    private String job;

    Wizard() {
        setJob("마법사");
    }

    public Wizard(String name) {
        this.id = 1;
        this.name = name;
        this.exp  = 0;
        this.level = 1;
        this.job = "마법사";
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", exp=" + exp +
                ", job='" + job + '\'' +
                '}';
    }
}
