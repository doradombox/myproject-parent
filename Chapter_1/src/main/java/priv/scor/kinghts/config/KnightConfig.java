package priv.scor.kinghts.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import priv.scor.kinghts.BraveKnight;
import priv.scor.kinghts.Knight;
import priv.scor.kinghts.Quest;
import priv.scor.kinghts.SlayDragonQuest;

@Configuration
public class KnightConfig {
    
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());
    }
    
    @Bean
    public Quest quest() {
        return new SlayDragonQuest(System.out);
    }
}
