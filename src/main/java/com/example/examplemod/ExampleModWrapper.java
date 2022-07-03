package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleModWrapper {
    public ExampleModWrapper() {
        new ExampleMod();
    }
}
