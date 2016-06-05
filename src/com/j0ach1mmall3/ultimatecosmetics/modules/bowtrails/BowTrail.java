package com.j0ach1mmall3.ultimatecosmetics.modules.bowtrails;

import com.j0ach1mmall3.ultimatecosmetics.api.Cosmetic;
import com.j0ach1mmall3.ultimatecosmetics.api.storage.ParticleCosmeticStorage;
import org.bukkit.entity.Player;

/**
 * @author j0ach1mmall3 (business.j0ach1mmall3@gmail.com)
 * @since 9/03/2016
 */
public final class BowTrail extends Cosmetic<BowTrails, ParticleCosmeticStorage> {
    public BowTrail(BowTrails cosmeticConfig, Player player, ParticleCosmeticStorage cosmeticStorage) {
        super(cosmeticConfig, player, cosmeticStorage);
    }

    @Override
    protected boolean giveInternal() {
        return true;
    }

    @Override
    protected void removeInternal() {
        // NOP
    }
}
