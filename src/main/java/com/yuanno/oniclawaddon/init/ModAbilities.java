package com.yuanno.oniclawaddon.init;

import com.yuanno.oniclawaddon.abilities.dragonclaw.FlamingSlashAbility;
import com.yuanno.oniclawaddon.abilities.dragonclaw.GrabAbility;
import com.yuanno.oniclawaddon.abilities.dragonclaw.RisingSunAbility;
import com.yuanno.oniclawaddon.abilities.dragonclaw.TalonsAbility;
import net.minecraftforge.eventbus.api.IEventBus;
import xyz.pixelatedw.mineminenomi.api.abilities.AbilityCore;
import xyz.pixelatedw.mineminenomi.api.enums.AbilityCommandGroup;
import xyz.pixelatedw.mineminenomi.wypi.WyRegistry;

import java.util.Arrays;
import java.util.Objects;

public class ModAbilities {

    public static final AbilityCore[] DRAGONCLAW_ABILITIES = new AbilityCore[] {TalonsAbility.INSTANCE, GrabAbility.INSTANCE, RisingSunAbility.INSTANCE, FlamingSlashAbility.INSTANCE};

    private static void registerAbilities(AbilityCore[] abilities)
    {
        Arrays.stream(abilities).filter(Objects::nonNull).forEach(abl -> WyRegistry.registerAbility(abl));
    }

    public static void register(IEventBus eventBus)
    {
        registerAbilities(DRAGONCLAW_ABILITIES);
        AbilityCommandGroup.create("DRAGONCLAW", () -> {
            return DRAGONCLAW_ABILITIES;
        });
    }
}
