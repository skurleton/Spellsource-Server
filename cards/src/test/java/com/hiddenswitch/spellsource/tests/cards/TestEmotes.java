package com.hiddenswitch.spellsource.tests.cards;
import net.demilich.metastone.game.cards.Card;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestEmotes extends TestBase {


    @Test
    public void testParsingEmotes() {
        runGym((context, player, opponent) -> {
            Card baron = context.getCardById("hero_baron_aldus");

        });
    }
}
