package io.singularitynet.mixin;

import net.minecraft.world.entity.ClientEntityManager;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(ClientWorld.class)
public interface ClientWorldMixinAccess {

    @Accessor("entityManager")
    ClientEntityManager<Entity> getEntityManager();

}
