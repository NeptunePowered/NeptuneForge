/*
 * This file is part of Arno, licensed under the MIT License (MIT).
 *
 * Copyright (c) Jamie Mansfield <https://github.com/jamierocks>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.neptunepowered.forge.mixin.entity;

import net.canarymod.api.entity.Entity;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.packet.Packet;
import net.canarymod.api.world.World;
import net.minecraft.entity.EntityTracker;
import net.minecraft.world.WorldServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

@Mixin(EntityTracker.class)
public abstract class MixinEntityTracker implements net.canarymod.api.EntityTracker {

    @Shadow
    private WorldServer theWorld;

    @Override
    public void trackEntity(Entity entity) {

    }

    @Override
    public void untrackEntity(Entity entity) {

    }

    @Override
    public void hidePlayer(Player player, Player toHide) {

    }

    @Override
    public void hidePlayerGlobal(Player toHide) {

    }

    @Override
    public void showPlayer(Player player, Player toShow) {

    }

    @Override
    public void showPlayerGlobal(Player toShow) {

    }

    @Override
    public void untrackPlayerSymmetrics(Player player) {

    }

    @Shadow
    public abstract void updateTrackedEntities();

    @Override
    public World getAttachedDimension() {
        return (World) theWorld;
    }

    @Override
    public void sendPacketToTrackedPlayer(Player player, Packet packet) {

    }

    @Override
    public List<Entity> getTrackedEntities() {
        return null;
    }

    @Override
    public boolean isPlayerHidden(Player player, Player isHidden) {
        return false;
    }
}
