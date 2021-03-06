package xyz.ajp.makezoomzoom.asm;

import net.minecraft.launchwrapper.IClassTransformer;
import xyz.ajp.makezoomzoom.asm.transformers.cofh.thermalexpansion.TransformTRCF;
import xyz.ajp.makezoomzoom.asm.transformers.forestry.TransformBRM;

public class MZZClassTransformer implements IClassTransformer {
    @Override
    public byte[] transform(String name, String transformedName, byte[] basicClass) {
        switch (transformedName) {
            case "cofh.thermalexpansion.plugins.jei.machine.transposer.TransposerRecipeCategoryFill":
                return new TransformTRCF().transform(name, transformedName, basicClass);
            case "forestry.factory.recipes.jei.bottler.BottlerRecipeMaker":
                return new TransformBRM().transform(name, transformedName, basicClass);
        }

        return basicClass;
    }
}
