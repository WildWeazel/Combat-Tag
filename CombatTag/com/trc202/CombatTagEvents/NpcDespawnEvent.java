package com.trc202.CombatTagEvents;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import com.trc202.CombatTag.CombatTag;
import com.trc202.CombatTagEvents.NpcDespawnReason;
import com.trc202.Containers.PlayerDataContainer;
import com.topcat.npclib.entity.NPC;

public class NpcDespawnEvent extends Event {
	private static final HandlerList handlers = new HandlerList();

    public static HandlerList getHandlerList() {
        return handlers;
    }

    private final CombatTag plugin_;
    private final NpcDespawnReason reason_;
    private final PlayerDataContainer player_data_;
    private final NPC npc_;

    public NpcDespawnEvent(
            final CombatTag plugin,
            final NpcDespawnReason reason,
            final PlayerDataContainer player_data,
            final NPC npc) {
        plugin_ = plugin;
        reason_ = reason;
        player_data_ = player_data;
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

    public PlayerDataContainer getPlayerData() {
        return player_data_;
    }

    public NPC getNpc() {
        return npc_;
    }
}
