package net.kzeroko.ktmresource.init;

import net.kzeroko.ktmresource.KTMResource;
import net.kzeroko.ktmresource.recipes.ForgingRecipe;
import net.minecraft.world.inventory.RecipeBookType;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KTMPRRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, KTMResource.MOD_ID);

    public static final RegistryObject<RecipeSerializer<ForgingRecipe>> FORGING_RECIPE = RECIPE_SERIALIZERS.register("forging_recipe", ForgingRecipe.ForgingRecipeSerializer::new);

    public static RecipeType<ForgingRecipe> FORGING_RECIPE_TYPE = new ForgingRecipe.ForgingRecipeType();
    public static RecipeBookType ALLOY_FURNACE = RecipeBookType.create("ALLOY_FURNACE");

    public static void register(IEventBus eventBus) {
        RECIPE_SERIALIZERS.register(eventBus);

        KTMResource.LOGGER.info("KTMResource: Recipes Registered!");
    }
}
