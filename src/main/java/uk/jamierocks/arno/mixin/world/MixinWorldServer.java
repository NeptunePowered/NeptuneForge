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
package uk.jamierocks.arno.mixin.world;

import net.canarymod.api.EntityTracker;
import net.canarymod.api.GameMode;
import net.canarymod.api.PlayerManager;
import net.canarymod.api.chat.ChatComponent;
import net.canarymod.api.entity.Entity;
import net.canarymod.api.entity.EntityItem;
import net.canarymod.api.entity.living.EntityLiving;
import net.canarymod.api.entity.living.animal.EntityAnimal;
import net.canarymod.api.entity.living.humanoid.Player;
import net.canarymod.api.entity.living.monster.EntityMob;
import net.canarymod.api.entity.vehicle.Boat;
import net.canarymod.api.entity.vehicle.Minecart;
import net.canarymod.api.entity.vehicle.Vehicle;
import net.canarymod.api.inventory.Item;
import net.canarymod.api.world.Biome;
import net.canarymod.api.world.BiomeType;
import net.canarymod.api.world.Chunk;
import net.canarymod.api.world.ChunkProvider;
import net.canarymod.api.world.DimensionType;
import net.canarymod.api.world.TreeType;
import net.canarymod.api.world.Village;
import net.canarymod.api.world.World;
import net.canarymod.api.world.WorldType;
import net.canarymod.api.world.blocks.Block;
import net.canarymod.api.world.blocks.BlockType;
import net.canarymod.api.world.blocks.TileEntity;
import net.canarymod.api.world.effects.AuxiliarySoundEffect;
import net.canarymod.api.world.effects.Particle;
import net.canarymod.api.world.effects.SoundEffect;
import net.canarymod.api.world.position.Location;
import net.canarymod.api.world.position.Position;
import net.minecraft.profiler.Profiler;
import net.minecraft.util.BlockPos;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.WorldSettings;
import net.minecraft.world.storage.ISaveHandler;
import net.minecraft.world.storage.WorldInfo;
import org.spongepowered.asm.mixin.Implements;
import org.spongepowered.asm.mixin.Interface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.List;

@Mixin(WorldServer.class)
@Implements(@Interface(iface = World.class, prefix = "world$"))
public abstract class MixinWorldServer extends net.minecraft.world.World {

    protected MixinWorldServer(ISaveHandler saveHandlerIn, WorldInfo info, WorldProvider providerIn,
            Profiler profilerIn, boolean client) {
        super(saveHandlerIn, info, providerIn, profilerIn, client);
    }

    @Shadow
    private net.minecraft.entity.EntityTracker theEntityTracker;

    public void world$setNanoTick(int tickIndex, long tick) {

    }

    public long world$getNanoTick(int tickIndex) {
        return 0;
    }

    public EntityTracker world$getEntityTracker() {
        return (EntityTracker) theEntityTracker;
    }

    public DimensionType world$getType() {
        return DimensionType.fromId(provider.getDimensionId());
    }

    public EntityItem world$dropItem(int x, int y, int z, int itemId, int amount, int damage) {
        return null;
    }

    public EntityItem world$dropItem(int x, int y, int z, Item item) {
        return null;
    }

    public EntityItem world$dropItem(Position position, Item item) {
        return null;
    }

    public List<EntityAnimal> world$getAnimalList() {
        return null;
    }

    public List<EntityMob> world$getMobList() {
        return null;
    }

    public List<EntityLiving> world$getEntityLivingList() {
        return null;
    }

    public List<Entity> world$getTrackedEntities() {
        return null;
    }

    public List<Player> world$getPlayerList() {
        return null;
    }

    public List<Boat> world$getBoatList() {
        return null;
    }

    public List<Minecart> world$getMinecartList() {
        return null;
    }

    public List<Vehicle> world$getVehicleList() {
        return null;
    }

    public List<EntityItem> world$getItemList() {
        return null;
    }

    public Block world$getBlockAt(int x, int y, int z) {
        return null;
    }

    public Block world$getBlockAt(Position position) {
        return null;
    }

    public short world$getDataAt(int x, int y, int z) {
        return 0;
    }

    public short world$getDataAt(Position position) {
        return 0;
    }

    public Location world$getSpawnLocation() {
        return null;
    }

    public void world$setSpawnLocation(Location position) {

    }

    public int world$getLightLevelAt(int x, int y, int z) {
        return 0;
    }

    public void world$setLightLevelOnBlockMap(int x, int y, int z, int newLevel) {

    }

    public void world$setLightLevelOnSkyMap(int x, int y, int z, int newLevel) {

    }

    public void world$setBlock(Block block) {

    }

    public void world$setBlockAt(int x, int y, int z, short type) {

    }

    public void world$setBlockAt(Position vector, Block block) {

    }

    public void world$setBlockAt(Position position, short type) {

    }

    public void world$setBlockAt(Position position, short type, short data) {

    }

    public void world$setBlockAt(Position position, BlockType type) {

    }

    public void world$setBlockAt(int x, int y, int z, short type, short data) {

    }

    public void world$setBlockAt(int x, int y, int z, BlockType type) {

    }

    public void world$setDataAt(int x, int y, int z, short data) {

    }

    public void world$markBlockNeedsUpdate(int x, int y, int z) {

    }

    public Player world$getClosestPlayer(double x, double y, double z, double distance) {
        return null;
    }

    public Player world$getClosestPlayer(Entity entity, int distance) {
        return null;
    }

    public ChunkProvider world$getChunkProvider() {
        return null;
    }

    public boolean world$isChunkLoaded(Block block) {
        return false;
    }

    public boolean world$isChunkLoaded(int x, int y, int z) {
        return false;
    }

    public boolean world$isChunkLoaded(int x, int z) {
        return false;
    }

    public Chunk world$loadChunk(int x, int z) {
        return null;
    }

    public Chunk world$loadChunk(Location location) {
        return null;
    }

    public Chunk world$loadChunk(Position vec3d) {
        return null;
    }

    public Chunk world$getChunk(int x, int z) {
        return null;
    }

    public List<Chunk> world$getLoadedChunks() {
        return null;
    }

    public BiomeType world$getBiomeType(int x, int z) {
        return world$getBiome(x, z).getBiomeType();
    }

    public Biome world$getBiome(int x, int z) {
        return (Biome) getBiomeGenForCoords(new BlockPos(x, 0, z));
    }

    public void world$setBiome(int x, int z, BiomeType biome) {

    }

    public int world$getHeight() {
        return getHeight();
    }

    public int world$getHighestBlockAt(int x, int z) {
        return 0;
    }

    public void world$playNoteAt(int x, int y, int z, int instrument, byte notePitch) {

    }

    public void world$setTime(long time) {
        setWorldTime(time);
    }

    public long world$getRelativeTime() {
        return 0;
    }

    public long world$getRawTime() {
        return 0;
    }

    public long world$getTotalTime() {
        return 0;
    }

    public World.Difficulty world$getDifficulty() {
        return null;
    }

    public void world$setDifficulty(World.Difficulty difficulty) {

    }

    public WorldType world$getWorldType() {
        return null;
    }

    public void world$spawnParticle(Particle particle) {

    }

    public void world$playSound(SoundEffect effect) {

    }

    public void world$playAUXEffect(AuxiliarySoundEffect effect) {

    }

    public void world$playAUXEffectAt(Player player, AuxiliarySoundEffect effect) {

    }

    public String world$getName() {
        return worldInfo.getWorldName();
    }

    public String world$getFqName() {
        return null;
    }

    public PlayerManager world$getPlayerManager() {
        return null;
    }

    public int world$getBlockPower(Block block) {
        return 0;
    }

    public int world$getBlockPower(Position position) {
        return 0;
    }

    public int world$getBlockPower(int x, int y, int z) {
        return 0;
    }

    public boolean world$isBlockPowered(Block block) {
        return false;
    }

    public boolean world$isBlockPowered(Position position) {
        return false;
    }

    public boolean world$isBlockPowered(int x, int y, int z) {
        return false;
    }

    public boolean world$isBlockIndirectlyPowered(Block block) {
        return false;
    }

    public boolean world$isBlockIndirectlyPowered(Position position) {
        return false;
    }

    public boolean world$isBlockIndirectlyPowered(int x, int y, int z) {
        return false;
    }

    public void world$setThundering(boolean thundering) {
        worldInfo.setThundering(thundering);
    }

    public float world$getThunderStrength() {
        return 0;
    }

    public void world$setThunderTime(int ticks) {
        worldInfo.setThunderTime(ticks);
    }

    public void world$setRaining(boolean downfall) {
        worldInfo.setRaining(downfall);
    }

    public float world$getRainStrength() {
        return 0;
    }

    public void world$setRainTime(int ticks) {
        worldInfo.setRainTime(ticks);
    }

    public void world$makeLightningBolt(int x, int y, int z) {

    }

    public void world$makeLightningBolt(Position position) {

    }

    public void world$makeExplosion(Entity exploder, double x, double y, double z, float power, boolean smoke) {

    }

    public void world$makeExplosion(Entity exploder, Position position, float power, boolean smoke) {

    }

    public int world$getRainTicks() {
        return worldInfo.getRainTime();
    }

    public int world$getThunderTicks() {
        return worldInfo.getThunderTime();
    }

    public long world$getWorldSeed() {
        return worldInfo.getSeed();
    }

    public void world$removePlayerFromWorld(Player player) {

    }

    public void world$addPlayerToWorld(Player player) {

    }

    public TileEntity world$getTileEntity(Block block) {
        return null;
    }

    public TileEntity world$getTileEntityAt(int x, int y, int z) {
        return null;
    }

    public TileEntity world$getOnlyTileEntity(Block block) {
        return null;
    }

    public TileEntity world$getOnlyTileEntityAt(int x, int y, int z) {
        return null;
    }

    public GameMode world$getGameMode() {
        return GameMode.fromId(worldInfo.getGameType().getID());
    }

    public void world$setGameMode(GameMode mode) {
        worldInfo.setGameType(WorldSettings.GameType.getByID(mode.getId()));
    }

    public void world$save() {

    }

    public void world$broadcastMessage(String msg) {

    }

    public List<Village> world$getVillages() {
        return null;
    }

    public Village world$getNearestVillage(Position position, int radius) {
        return null;
    }

    public Village world$getNearestVillage(Location location, int radius) {
        return null;
    }

    public Village world$getNearestVillage(int x, int y, int z, int radius) {
        return null;
    }

    public boolean world$generateTree(Position pos, TreeType type) {
        return false;
    }

    public void world$showTitle(ChatComponent title) {

    }

    public void world$showTitle(ChatComponent title, ChatComponent subtitle) {

    }
}
