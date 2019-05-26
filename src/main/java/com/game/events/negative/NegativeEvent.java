package com.game.events.negative;

import com.game.events.Event;
import com.game.events.EventType;

public interface NegativeEvent extends Event {
    public static final EventType eventType = EventType.Negative;
}
