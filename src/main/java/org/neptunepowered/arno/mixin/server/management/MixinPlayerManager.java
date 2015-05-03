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
package org.neptunepowered.arno.mixin.server.management;

import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.world.World;
import net.minecraft.server.management.PlayerManager;
import net.minecraft.util.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

@Mixin(PlayerManager.class)
public abstract class MixinPlayerManager implements net.canarymod.api.PlayerManager {

    @Shadow
    private int playerViewRadius;

    @Shadow
    public abstract void markBlockForUpdate(BlockPos p_180244_1_);

    @Override
    public void updateMountedMovingPlayer(Player player) {

    }

    @Override
    public void addPlayer(Player player) {

    }

    @Override
    public void removePlayer(Player player) {

    }

    @Override
    public List<Player> getManagedPlayers() {
        return null;
    }

    @Override
    public void markBlockNeedsUpdate(int x, int y, int z) {
        markBlockForUpdate(new BlockPos(x, y, z));
    }

    @Override
    public int getMaxTrackingDistance() {
        return PlayerManager.getFurthestViewableBlock(playerViewRadius);
    }

    @Override
    public World getAttachedDimension() {
        return null;
    }
}
