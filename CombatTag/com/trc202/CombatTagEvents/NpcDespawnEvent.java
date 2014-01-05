package com.trc202.CombatTagEvents;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.trc202.CombatTag.CombatTag;
import com.trc202.CombatTagEvents.NpcDespawnReason;
import com.topcat.npclib.entity.NPC;

public class NpcDespawnEvent extends Event {
        private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    private final CombatTag plugin_;
    private final NpcDespawnReason reason_;
    private final NPC npc_;

    public NpcDespawnEvent(
            final CombatTag plugin,
            final NpcDespawnReason reason,
            final NPC npc) {
        plugin_ = plugin;
        reason_ = reason;
        npc_ = npc;
    }

    public HandlerList getHandlers() {
        return NpcDespawnEvent.getHandlerList();
    }

    public CombatTag getPlugin() {
        return plugin_;
    }

    public NpcDespawnReason getReason() {
        return reason_;
    }

    public NPC getNpc() {
        return npc_;
    }
}