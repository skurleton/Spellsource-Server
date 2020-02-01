package net.demilich.metastone.game.cards;

import net.demilich.metastone.game.cards.desc.HasEntrySet;
import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public class EmoteMap extends BaseMap<Emote, String> implements Serializable, Cloneable, HasEntrySet<Emote, String> {

    public EmoteMap() {
        super(Emote.class);
    }

    public EmoteMap(Map<Emote, String> emotes) {
        super(emotes);
    }

    @Override
    public String put(@NotNull Emote key, String value) {
        if (value == null && this.containsKey(key)) {
            throw new IllegalStateException("Cannot clear a key with a null value");
        }
        if (value == null) {
            return null;
        }
        return super.put(key, value);
    }

    @Override
    public Set<Entry<Emote, String>> entrySet() {
        return super.entrySet();
    }
}
