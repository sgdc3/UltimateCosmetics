package com.j0ach1mmall3.ultimatecosmetics.modules.cloaks;

import com.j0ach1mmall3.ultimatecosmetics.api.Cosmetic;
import com.j0ach1mmall3.ultimatecosmetics.api.storage.ParticleCosmeticStorage;
import org.bukkit.entity.Player;

/**
 * @author j0ach1mmall3 (business.j0ach1mmall3@gmail.com)
 * @since 9/03/2016
 */
public final class Cloak extends Cosmetic<Cloaks, ParticleCosmeticStorage> {
    public Cloak(Cloaks cosmeticConfig, Player player, ParticleCosmeticStorage cosmeticStorage) {
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
