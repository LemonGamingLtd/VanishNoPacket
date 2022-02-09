/*
 * VanishNoPacket
 * Copyright (C) 2011-2021 Matt Baxter
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
package org.kitteh.vanish.nms;

import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

public class ModernEntityCollideAlterer extends EntityCollideAlterer {

	private final NamespacedKey vanishCollideState;

	public ModernEntityCollideAlterer(Plugin plugin) {
		super(plugin);
		this.vanishCollideState = new NamespacedKey(plugin, "collidable");
	}

	public void setCollidable(Player entity, boolean collidable) {
		if (collidable) {
			byte coll = entity.getPersistentDataContainer().getOrDefault(this.vanishCollideState, PersistentDataType.BYTE, (byte) 0x00);
			if (coll == 0x01) {
				entity.setCollidable(true);
			}
		} else {
			entity.getPersistentDataContainer().set(this.vanishCollideState, PersistentDataType.BYTE, (byte) (entity.isCollidable() ? 0x01 : 0x00));
			if (entity.isCollidable() != collidable) {
				entity.setCollidable(collidable);
			}
		}
	}

}
