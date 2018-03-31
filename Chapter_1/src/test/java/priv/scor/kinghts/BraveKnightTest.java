package priv.scor.kinghts;
import static org.mockito.Mockito.*;

import org.junit.Test;

import priv.scor.kinghts.BraveKnight;
import priv.scor.kinghts.Quest;

public class BraveKnightTest {

  @Test
  public void knightShouldEmbarkOnQuest() {
    Quest mockQuest = mock(Quest.class);
    BraveKnight knight = new BraveKnight(mockQuest);
    knight.embarkOnQuest();
    verify(mockQuest, times(1)).embark();
  }

}
