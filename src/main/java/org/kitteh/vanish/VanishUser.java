/*
 * VanishNoPacket
 * Copyright (C) 2011-2022 Matt Baxter
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.kitteh.vanish;

import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

public final class VanishUser {
    private boolean seeAll;
    private boolean noPickup;
    private boolean noFollow;
    private boolean preventIncomingDamage;
    private boolean preventOutgoingDamage;
    private boolean noInteract;
    private boolean noHunger;
    private boolean noChat;
    private boolean silentChestReads;
    private boolean smoke;
    private boolean flames;
    private boolean explode;
    private boolean lightning;
    private boolean bats;

    public VanishUser(@NonNull Player player) {
        this.seeAll = player.hasPermission("vanish.see");
        this.noPickup = player.hasPermission("vanish.nopickup");
        this.noFollow = player.hasPermission("vanish.nofollow");
        this.preventIncomingDamage = player.hasPermission("vanish.preventincomingdamage");
        this.preventOutgoingDamage = player.hasPermission("vanish.preventoutgoingdamage");
        this.noInteract = player.hasPermission("vanish.nointeract");
        this.noHunger = player.hasPermission("vanish.nohunger");
        this.noChat = player.hasPermission("vanish.nochat");
        this.silentChestReads = player.hasPermission("vanish.silentchests");

        // force disable annoying effects
        // this.smoke = player.hasPermission("vanish.effects.smoke");
        // this.flames = player.hasPermission("vanish.effects.flames");
        // this.explode = player.hasPermission("vanish.effects.explode");
        // this.lightning = player.hasPermission("vanish.effects.lightning");
        // this.bats = player.hasPermission("vanish.effects.bats");
    }

    public boolean getEffectBats() {
        return this.bats;
    }

    public boolean getEffectExplode() {
        return this.explode;
    }

    public boolean getEffectFlames() {
        return this.flames;
    }

    public boolean getEffectLightning() {
        return this.lightning;
    }

    public boolean getEffectSmoke() {
        return this.smoke;
    }

    public boolean getNoChat() {
        return this.noChat;
    }

    public boolean getNoFollow() {
        return this.noFollow;
    }

    public boolean getNoHunger() {
        return this.noHunger;
    }

    public boolean getNoInteract() {
        return this.noInteract;
    }

    public boolean getNoPickup() {
        return this.noPickup;
    }

    public boolean getPreventIncomingDamage() {
        return this.preventIncomingDamage;
    }

    public boolean getPreventOutgoingDamage() {
        return this.preventOutgoingDamage;
    }

    public boolean getReadChestsSilently() {
        return this.silentChestReads;
    }

    public boolean getSeeAll() {
        return this.seeAll;
    }

    public boolean toggleEffectBats() {
        this.bats = !this.bats;
        return this.bats;
    }

    public boolean toggleEffectExplode() {
        this.explode = !this.explode;
        return this.explode;
    }

    public boolean toggleEffectFlames() {
        this.flames = !this.flames;
        return this.flames;
    }

    public boolean toggleEffectLightning() {
        this.lightning = !this.lightning;
        return this.lightning;
    }

    public boolean toggleEffectSmoke() {
        this.smoke = !this.smoke;
        return this.smoke;
    }

    public boolean toggleIncomingDamage() {
        this.preventIncomingDamage = !this.preventIncomingDamage;
        return this.preventIncomingDamage;
    }

    public boolean toggleNoChat() {
        this.noChat = !this.noChat;
        return this.noChat;
    }

    public boolean toggleNoFollow() {
        this.noFollow = !this.noFollow;
        return this.noFollow;
    }

    public boolean toggleNoHunger() {
        this.noHunger = !this.noHunger;
        return this.noHunger;
    }

    public boolean toggleNoInteract() {
        this.noInteract = !this.noInteract;
        return this.noInteract;
    }

    public boolean toggleNoPickup() {
        this.noPickup = !this.noPickup;
        return this.noPickup;
    }

    public boolean toggleOutgoingDamage() {
        this.preventOutgoingDamage = !this.preventOutgoingDamage;
        return this.preventOutgoingDamage;
    }

    public boolean toggleSeeAll() {
        this.seeAll = !this.seeAll;
        return this.seeAll;
    }

    public boolean toggleSilentChestReads() {
        this.silentChestReads = !this.silentChestReads;
        return this.silentChestReads;
    }
}
