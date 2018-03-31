package priv.scor.kinghts;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "spring/knight.xml");
        Knight kinght = context.getBean(Knight.class);
        kinght.embarkOnQuest();
        context.close();
    }

}
