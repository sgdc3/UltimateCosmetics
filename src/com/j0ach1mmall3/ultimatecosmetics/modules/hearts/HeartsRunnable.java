package com.j0ach1mmall3.ultimatecosmetics.modules.hearts;

import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

/**
 * @author j0ach1mmall3 (business.j0ach1mmall3@gmail.com)
 * @since 4/03/2016
 */
public final class HeartsRunnable extends BukkitRunnable {
    private final HeartsModule module;

    public HeartsRunnable(HeartsModule module) {
        this.module = module;
    }

    @Override
    public void run() {
        for (Heart cosmetic : this.module.getParent().getApi().getAllCosmetics(Heart.class)) {
            Player p = cosmetic.getPlayer();
            Heart heart = cosmetic;
            if (heart.getColorEffect() != null && !p.hasPotionEffect(heart.getColorEffect().getType()) || heart.getEffectsEffect() != null && !p.hasPotionEffect(heart.getEffectsEffect().getType())) heart.regive();
        }
    }
}
