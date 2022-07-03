package com.example.examplemod;

import net.minecraftforge.fml.common.Mod;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleModWrapper.MODID)
public class ExampleModWrapper {
    public static final String MODID = "examplemod";
    public ExampleModWrapper() {
        new ExampleMod();
    }
}
