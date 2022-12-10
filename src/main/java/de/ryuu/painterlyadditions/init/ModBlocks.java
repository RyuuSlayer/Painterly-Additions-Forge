package de.ryuu.painterlyadditions.init;

import de.ryuu.painterlyadditions.PainterlyAdditions;
import de.ryuu.painterlyadditions.block.blocks.*;
import de.ryuu.painterlyadditions.block.plants.flower.*;
import de.ryuu.painterlyadditions.block.plants.mushroom.*;
import de.ryuu.painterlyadditions.block.plants.netherwart.*;
import de.ryuu.painterlyadditions.block.plants.sapling.*;
import de.ryuu.painterlyadditions.block.plants.tallflower.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, PainterlyAdditions.MOD_ID);
    public static final RegistryObject<Block> A1_PLANK_AGEDCLASSIC = REGISTRY.register("a1_plank_agedclassic", () -> new A1plankagedclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_AGEDCRATE = REGISTRY.register("a1_plank_agedcrate", () -> new A1plankagedcrateBlock());
    public static final RegistryObject<Block> A1_PLANK_AGEDCRATEFANCY = REGISTRY.register("a1_plank_agedcratefancy",
            () -> new A1plankagedcratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_AGEDFLAT = REGISTRY.register("a1_plank_agedflat", () -> new A1plankagedflatBlock());
    public static final RegistryObject<Block> A1_PLANK_AGEDLARGEPLANKFANCY = REGISTRY.register("a1_plank_agedlargeplankfancy",
            () -> new A1plankagedlargeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_AGEDPANEL = REGISTRY.register("a1_plank_agedpanel", () -> new A1plankagedpanelBlock());
    public static final RegistryObject<Block> A1_PLANK_AGEDPLANK = REGISTRY.register("a1_plank_agedplank", () -> new A1plankagedplankBlock());
    public static final RegistryObject<Block> A1_PLANK_AGEDPLANKFANCY = REGISTRY.register("a1_plank_agedplankfancy",
            () -> new A1plankagedplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_AGEDPLANKSMALL = REGISTRY.register("a1_plank_agedplanksmall",
            () -> new A1plankagedplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_AGEDSLAT = REGISTRY.register("a1_plank_agedslat", () -> new A1plankagedslatBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTCLASSIC = REGISTRY.register("a1_plank_chestnutclassic",
            () -> new A1plankchestnutclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTCRATE = REGISTRY.register("a1_plank_chestnutcrate",
            () -> new A1plankchestnutcrateBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTCRATEFANCY = REGISTRY.register("a1_plank_chestnutcratefancy",
            () -> new A1plankchestnutcratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTFLAT = REGISTRY.register("a1_plank_chestnutflat",
            () -> new A1plankchestnutflatBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTLARGEPLANKFANCY = REGISTRY.register("a1_plank_chestnutlargeplankfancy",
            () -> new A1plankchestnutlargeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTPANEL = REGISTRY.register("a1_plank_chestnutpanel",
            () -> new A1plankchestnutpanelBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTPLANK = REGISTRY.register("a1_plank_chestnutplank",
            () -> new A1plankchestnutplankBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTPLANKFANCY = REGISTRY.register("a1_plank_chestnutplankfancy",
            () -> new A1plankchestnutplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTPLANKSMALL = REGISTRY.register("a1_plank_chestnutplanksmall",
            () -> new A1plankchestnutplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_CHESTNUTSLAT = REGISTRY.register("a1_plank_chestnutslat",
            () -> new A1plankchestnutslatBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKCLASSIC = REGISTRY.register("a1_plank_darkclassic", () -> new A1plankdarkclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKCRATE = REGISTRY.register("a1_plank_darkcrate", () -> new A1plankdarkcrateBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKCRATEFANCY = REGISTRY.register("a1_plank_darkcratefancy",
            () -> new A1plankdarkcratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKFLAT = REGISTRY.register("a1_plank_darkflat", () -> new A1plankdarkflatBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKLARGEPLANKFANCY = REGISTRY.register("a1_plank_darklargeplankfancy",
            () -> new A1plankdarklargeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKPANEL = REGISTRY.register("a1_plank_darkpanel", () -> new A1plankdarkpanelBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKPLANK = REGISTRY.register("a1_plank_darkplank", () -> new A1plankdarkplankBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKPLANKFANCY = REGISTRY.register("a1_plank_darkplankfancy",
            () -> new A1plankdarkplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKPLANKSMALL = REGISTRY.register("a1_plank_darkplanksmall",
            () -> new A1plankdarkplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_DARKSLAT = REGISTRY.register("a1_plank_darkslat", () -> new A1plankdarkslatBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPCLASSIC = REGISTRY.register("a1_plank_deepclassic", () -> new A1plankdeepclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPCRATE = REGISTRY.register("a1_plank_deepcrate", () -> new A1plankdeepcrateBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPCRATEFANCY = REGISTRY.register("a1_plank_deepcratefancy",
            () -> new A1plankdeepcratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPFLAT = REGISTRY.register("a1_plank_deepflat", () -> new A1plankdeepflatBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPLARGEPLANKFANCY = REGISTRY.register("a1_plank_deeplargeplankfancy",
            () -> new A1plankdeeplargeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPPANEL = REGISTRY.register("a1_plank_deeppanel", () -> new A1plankdeeppanelBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPPLANK = REGISTRY.register("a1_plank_deepplank", () -> new A1plankdeepplankBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPPLANKFANCY = REGISTRY.register("a1_plank_deepplankfancy",
            () -> new A1plankdeepplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPPLANKSMALL = REGISTRY.register("a1_plank_deepplanksmall",
            () -> new A1plankdeepplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_DEEPSLAT = REGISTRY.register("a1_plank_deepslat", () -> new A1plankdeepslatBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTCLASSIC = REGISTRY.register("a1_plank_hazelnutclassic",
            () -> new A1plankhazelnutclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTCRATE = REGISTRY.register("a1_plank_hazelnutcrate",
            () -> new A1plankhazelnutcrateBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTCRATEFANCY = REGISTRY.register("a1_plank_hazelnutcratefancy",
            () -> new A1plankhazelnutcratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTFLAT = REGISTRY.register("a1_plank_hazelnutflat",
            () -> new A1plankhazelnutflatBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTLARGEPLANKFANCY = REGISTRY.register("a1_plank_hazelnutlargeplankfancy",
            () -> new A1plankhazelnutlargeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTPANEL = REGISTRY.register("a1_plank_hazelnutpanel",
            () -> new A1plankhazelnutpanelBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTPLANK = REGISTRY.register("a1_plank_hazelnutplank",
            () -> new A1plankhazelnutplankBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTPLANKFANCY = REGISTRY.register("a1_plank_hazelnutplankfancy",
            () -> new A1plankhazelnutplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTPLANKSMALL = REGISTRY.register("a1_plank_hazelnutplanksmall",
            () -> new A1plankhazelnutplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_HAZELNUTSLAT = REGISTRY.register("a1_plank_hazelnutslat",
            () -> new A1plankhazelnutslatBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTCLASSIC = REGISTRY.register("a1_plank_lightclassic",
            () -> new A1planklightclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTCRATE = REGISTRY.register("a1_plank_lightcrate", () -> new A1planklightcrateBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTCRATEFANCY = REGISTRY.register("a1_plank_lightcratefancy",
            () -> new A1planklightcratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTFLAT = REGISTRY.register("a1_plank_lightflat", () -> new A1planklightflatBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTLARGEPLANKFANCY = REGISTRY.register("a1_plank_lightlargeplankfancy",
            () -> new A1planklightlargeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTPANEL = REGISTRY.register("a1_plank_lightpanel", () -> new A1planklightpanelBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTPLANK = REGISTRY.register("a1_plank_lightplank", () -> new A1planklightplankBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTPLANKFANCY = REGISTRY.register("a1_plank_lightplankfancy",
            () -> new A1planklightplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTPLANKSMALL = REGISTRY.register("a1_plank_lightplanksmall",
            () -> new A1planklightplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_LIGHTSLAT = REGISTRY.register("a1_plank_lightslat", () -> new A1planklightslatBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGECLASSIC = REGISTRY.register("a1_plank_orangeclassic",
            () -> new A1plankorangeclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGECRATE = REGISTRY.register("a1_plank_orangecrate", () -> new A1plankorangecrateBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGECRATEFANCY = REGISTRY.register("a1_plank_orangecratefancy",
            () -> new A1plankorangecratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGEFLAT = REGISTRY.register("a1_plank_orangeflat", () -> new A1plankorangeflatBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGELARGEPLANKFANCY = REGISTRY.register("a1_plank_orangelargeplankfancy",
            () -> new A1plankorangelargeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGEPANEL = REGISTRY.register("a1_plank_orangepanel", () -> new A1plankorangepanelBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGEPLANK = REGISTRY.register("a1_plank_orangeplank", () -> new A1plankorangeplankBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGEPLANKFANCY = REGISTRY.register("a1_plank_orangeplankfancy",
            () -> new A1plankorangeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGEPLANKSMALL = REGISTRY.register("a1_plank_orangeplanksmall",
            () -> new A1plankorangeplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_ORANGESLAT = REGISTRY.register("a1_plank_orangeslat", () -> new A1plankorangeslatBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANCLASSIC = REGISTRY.register("a1_plank_pecanclassic",
            () -> new A1plankpecanclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANCRATE = REGISTRY.register("a1_plank_pecancrate", () -> new A1plankpecancrateBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANCRATEFANCY = REGISTRY.register("a1_plank_pecancratefancy",
            () -> new A1plankpecancratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANFLAT = REGISTRY.register("a1_plank_pecanflat", () -> new A1plankpecanflatBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANLARGEPLANKFANCY = REGISTRY.register("a1_plank_pecanlargeplankfancy",
            () -> new A1plankpecanlargeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANPANEL = REGISTRY.register("a1_plank_pecanpanel", () -> new A1plankpecanpanelBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANPLANK = REGISTRY.register("a1_plank_pecanplank", () -> new A1plankpecanplankBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANPLANKFANCY = REGISTRY.register("a1_plank_pecanplankfancy",
            () -> new A1plankpecanplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANPLANKSMALL = REGISTRY.register("a1_plank_pecanplanksmall",
            () -> new A1plankpecanplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_PECANSLAT = REGISTRY.register("a1_plank_pecanslat", () -> new A1plankpecanslatBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWCLASSIC = REGISTRY.register("a1_plank_rawclassic", () -> new A1plankrawclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWCRATE = REGISTRY.register("a1_plank_rawcrate", () -> new A1plankrawcrateBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWCRATEFANCY = REGISTRY.register("a1_plank_rawcratefancy",
            () -> new A1plankrawcratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWFLAT = REGISTRY.register("a1_plank_rawflat", () -> new A1plankrawflatBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWLAGEPLANKFANCY = REGISTRY.register("a1_plank_rawlageplankfancy",
            () -> new A1plankrawlageplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWPANEL = REGISTRY.register("a1_plank_rawpanel", () -> new A1plankrawpanelBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWPLANK = REGISTRY.register("a1_plank_rawplank", () -> new A1plankrawplankBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWPLANKFANCY = REGISTRY.register("a1_plank_rawplankfancy",
            () -> new A1plankrawplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWPLANKSMALL = REGISTRY.register("a1_plank_rawplanksmall",
            () -> new A1plankrawplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_RAWSLAT = REGISTRY.register("a1_plank_rawslat", () -> new A1plankrawslatBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITECLASSIC = REGISTRY.register("a1_plank_whiteclassic",
            () -> new A1plankwhiteclassicBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITECRATE = REGISTRY.register("a1_plank_whitecrate", () -> new A1plankwhitecrateBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITECRATEFANCY = REGISTRY.register("a1_plank_whitecratefancy",
            () -> new A1plankwhitecratefancyBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITEFLAT = REGISTRY.register("a1_plank_whiteflat", () -> new A1plankwhiteflatBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITELARGEPLANKFANCY = REGISTRY.register("a1_plank_whitelargeplankfancy",
            () -> new A1plankwhitelargeplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITEPANEL = REGISTRY.register("a1_plank_whitepanel", () -> new A1plankwhitepanelBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITEPLANK = REGISTRY.register("a1_plank_whiteplank", () -> new A1plankwhiteplankBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITEPLANKFANCY = REGISTRY.register("a1_plank_whiteplankfancy",
            () -> new A1plankwhiteplankfancyBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITEPLANKSMALL = REGISTRY.register("a1_plank_whiteplanksmall",
            () -> new A1plankwhiteplanksmallBlock());
    public static final RegistryObject<Block> A1_PLANK_WHITESLAT = REGISTRY.register("a1_plank_whiteslat", () -> new A1plankwhiteslatBlock());
    public static final RegistryObject<Block> A1_FLOWER_ALLIUM = REGISTRY.register("a1_flower_allium", () -> new A1floweralliumBlock());
    public static final RegistryObject<Block> A1_FLOWER_BABYSBREATH = REGISTRY.register("a1_flower_babysbreath",
            () -> new A1flowerbabysbreathBlock());
    public static final RegistryObject<Block> A1_FLOWER_BAMBOOSHOOT = REGISTRY.register("a1_flower_bambooshoot",
            () -> new A1flowerbambooshootBlock());
    public static final RegistryObject<Block> A1_FLOWER_BEET = REGISTRY.register("a1_flower_beet", () -> new A1flowerbeetBlock());
    public static final RegistryObject<Block> A1_FLOWER_BELLFLOWER = REGISTRY.register("a1_flower_bellflower", () -> new A1flowerbellflowerBlock());
    public static final RegistryObject<Block> A1_FLOWER_CARROT = REGISTRY.register("a1_flower_carrot", () -> new A1flowercarrotBlock());
    public static final RegistryObject<Block> A1_FLOWER_CATTAIL = REGISTRY.register("a1_flower_cattail", () -> new A1flowercattailBlock());
    public static final RegistryObject<Block> A1_FLOWER_CATTAILPATCH = REGISTRY.register("a1_flower_cattailpatch",
            () -> new A1flowercattailpatchBlock());
    public static final RegistryObject<Block> A1_FLOWER_CHRYSANTHEMUM = REGISTRY.register("a1_flower_chrysanthemum",
            () -> new A1flowerchrysanthemumBlock());
    public static final RegistryObject<Block> A1_FLOWER_CREEPERSTATUEDARKCLASSIC = REGISTRY.register("a1_flower_creeperstatuedarkclassic",
            () -> new A1flowercreeperstatuedarkclassicBlock());
    public static final RegistryObject<Block> A1_FLOWER_CREEPERSTATUEDARKDEMI = REGISTRY.register("a1_flower_creeperstatuedarkdemi",
            () -> new A1flowercreeperstatuedarkdemiBlock());
    public static final RegistryObject<Block> A1_FLOWER_CREEPERSTATUEDARKORIGINAL = REGISTRY.register("a1_flower_creeperstatuedarkoriginal",
            () -> new A1flowercreeperstatuedarkoriginalBlock());
    public static final RegistryObject<Block> A1_FLOWER_CREEPERSTATUEGREENCLASSIC = REGISTRY.register("a1_flower_creeperstatuegreenclassic",
            () -> new A1flowercreeperstatuegreenclassicBlock());
    public static final RegistryObject<Block> A1_FLOWER_CREEPERSTATUEGREENDEMI = REGISTRY.register("a1_flower_creeperstatuegreendemi",
            () -> new A1flowercreeperstatuegreendemiBlock());
    public static final RegistryObject<Block> A1_FLOWER_CREEPERSTATUEGREENORIGINAL = REGISTRY.register("a1_flower_creeperstatuegreenoriginal",
            () -> new A1flowercreeperstatuegreenoriginalBlock());
    public static final RegistryObject<Block> A1_FLOWER_CREEPERSTATUELIGHTCLASSIC = REGISTRY.register("a1_flower_creeperstatuelightclassic",
            () -> new A1flowercreeperstatuelightclassicBlock());
    public static final RegistryObject<Block> A1_FLOWER_CREEPERSTATUELIGHTDEMI = REGISTRY.register("a1_flower_creeperstatuelightdemi",
            () -> new A1flowercreeperstatuelightdemiBlock());
    public static final RegistryObject<Block> A1_FLOWER_CREEPERSTATUELIGHTORIGINAL = REGISTRY.register("a1_flower_creeperstatuelightoriginal",
            () -> new A1flowercreeperstatuelightoriginalBlock());
    public static final RegistryObject<Block> A1_FLOWER_DAISY = REGISTRY.register("a1_flower_daisy", () -> new A1flowerdaisyBlock());
    public static final RegistryObject<Block> A1_FLOWER_ECHINACEACLUSTER = REGISTRY.register("a1_flower_echinaceacluster",
            () -> new A1flowerechinaceaclusterBlock());
    public static final RegistryObject<Block> A1_FLOWER_ECHINACEAFIELD = REGISTRY.register("a1_flower_echinaceafield",
            () -> new A1flowerechinaceafieldBlock());
    public static final RegistryObject<Block> A1_FLOWER_ECHINACEAGROUND = REGISTRY.register("a1_flower_echinaceaground",
            () -> new A1flowerechinaceagroundBlock());
    public static final RegistryObject<Block> A1_FLOWER_FLAX = REGISTRY.register("a1_flower_flax", () -> new A1flowerflaxBlock());
    public static final RegistryObject<Block> A1_FLOWER_GINGERRED = REGISTRY.register("a1_flower_gingerred", () -> new A1flowergingerredBlock());
    public static final RegistryObject<Block> A1_FLOWER_GINGERREDPATCH = REGISTRY.register("a1_flower_gingerredpatch",
            () -> new A1flowergingerredpatchBlock());
    public static final RegistryObject<Block> A1_FLOWER_GRASSTUFTDEAD = REGISTRY.register("a1_flower_grasstuftdead",
            () -> new A1flowergrasstuftdeadBlock());
    public static final RegistryObject<Block> A1_FLOWER_GRASSTUFTGREEN = REGISTRY.register("a1_flower_grasstuftgreen",
            () -> new A1flowergrasstuftgreenBlock());
    public static final RegistryObject<Block> A1_FLOWER_GRASSTUFTRED = REGISTRY.register("a1_flower_grasstuftred",
            () -> new A1flowergrasstuftredBlock());
    public static final RegistryObject<Block> A1_FLOWER_HIBISCUS = REGISTRY.register("a1_flower_hibiscus", () -> new A1flowerhibiscusBlock());
    public static final RegistryObject<Block> A1_FLOWER_HOUSTONIA = REGISTRY.register("a1_flower_houstonia", () -> new A1flowerhoustoniaBlock());
    public static final RegistryObject<Block> A1_FLOWER_HYBRIDREDBLUE = REGISTRY.register("a1_flower_hybridredblue",
            () -> new A1flowerhybridredblueBlock());
    public static final RegistryObject<Block> A1_FLOWER_HYBRIDREDYELLOW = REGISTRY.register("a1_flower_hybridredyellow",
            () -> new A1flowerhybridredyellowBlock());
    public static final RegistryObject<Block> A1_FLOWER_HYBRIDTRILARGE = REGISTRY.register("a1_flower_hybridtrilarge",
            () -> new A1flowerhybridtrilargeBlock());
    public static final RegistryObject<Block> A1_FLOWER_HYBRIDTRIMEDIUM = REGISTRY.register("a1_flower_hybridtrimedium",
            () -> new A1flowerhybridtrimediumBlock());
    public static final RegistryObject<Block> A1_FLOWER_HYBRIDTRISMALL = REGISTRY.register("a1_flower_hybridtrismall",
            () -> new A1flowerhybridtrismallBlock());
    public static final RegistryObject<Block> A1_FLOWER_HYBRIDTRITALL = REGISTRY.register("a1_flower_hybridtritall",
            () -> new A1flowerhybridtritallBlock());
    public static final RegistryObject<Block> A1_FLOWER_HYBRIDYELLOWBLUE = REGISTRY.register("a1_flower_hybridyellowblue",
            () -> new A1flowerhybridyellowblueBlock());
    public static final RegistryObject<Block> A1_FLOWER_HYDRANGEA = REGISTRY.register("a1_flower_hydrangea", () -> new A1flowerhydrangeaBlock());
    public static final RegistryObject<Block> A1_FLOWER_LEAVES = REGISTRY.register("a1_flower_leaves", () -> new A1flowerleavesBlock());
    public static final RegistryObject<Block> A1_FLOWER_MARIGOLD = REGISTRY.register("a1_flower_marigold", () -> new A1flowermarigoldBlock());
    public static final RegistryObject<Block> A1_FLOWER_MARIOFIRE = REGISTRY.register("a1_flower_mariofire", () -> new A1flowermariofireBlock());
    public static final RegistryObject<Block> A1_FLOWER_MARIOSTAR = REGISTRY.register("a1_flower_mariostar", () -> new A1flowermariostarBlock());
    public static final RegistryObject<Block> A1_FLOWER_MORNINGGLORYCLUSTER = REGISTRY.register("a1_flower_morningglorycluster",
            () -> new A1flowermorninggloryclusterBlock());
    public static final RegistryObject<Block> A1_FLOWER_MORNINGGLORYFIELD = REGISTRY.register("a1_flower_morninggloryfield",
            () -> new A1flowermorninggloryfieldBlock());
    public static final RegistryObject<Block> A1_FLOWER_MORNINGGLORYGROUND = REGISTRY.register("a1_flower_morninggloryground",
            () -> new A1flowermorningglorygroundBlock());
    public static final RegistryObject<Block> A1_FLOWER_NASTURTIUM = REGISTRY.register("a1_flower_nasturtium", () -> new A1flowernasturtiumBlock());
    public static final RegistryObject<Block> A1_FLOWER_NASTURTIUMCLASSIC = REGISTRY.register("a1_flower_nasturtiumclassic",
            () -> new A1flowernasturtiumclassicBlock());
    public static final RegistryObject<Block> A1_FLOWER_NASTURTIUMCLUSTER = REGISTRY.register("a1_flower_nasturtiumcluster",
            () -> new A1flowernasturtiumclusterBlock());
    public static final RegistryObject<Block> A1_FLOWER_NASTURTIUMGROUND = REGISTRY.register("a1_flower_nasturtiumground",
            () -> new A1flowernasturtiumgroundBlock());
    public static final RegistryObject<Block> A1_FLOWER_NETHERLEAF = REGISTRY.register("a1_flower_netherleaf", () -> new A1flowernetherleafBlock());
    public static final RegistryObject<Block> A1_FLOWER_NETHERLEAFBIG = REGISTRY.register("a1_flower_netherleafbig",
            () -> new A1flowernetherleafbigBlock());
    public static final RegistryObject<Block> A1_FLOWER_ORCHID = REGISTRY.register("a1_flower_orchid", () -> new A1flowerorchidBlock());
    public static final RegistryObject<Block> A1_FLOWER_OXEYEDAISY = REGISTRY.register("a1_flower_oxeyedaisy", () -> new A1floweroxeyedaisyBlock());
    public static final RegistryObject<Block> A1_FLOWER_PAEONIA = REGISTRY.register("a1_flower_paeonia", () -> new A1flowerpaeoniaBlock());
    public static final RegistryObject<Block> A1_FLOWER_PAEONIAWILD = REGISTRY.register("a1_flower_paeoniawild",
            () -> new A1flowerpaeoniawildBlock());
    public static final RegistryObject<Block> A1_FLOWER_PARSLEY = REGISTRY.register("a1_flower_parsley", () -> new A1flowerparsleyBlock());
    public static final RegistryObject<Block> A1_FLOWER_PEONY = REGISTRY.register("a1_flower_peony", () -> new A1flowerpeonyBlock());
    public static final RegistryObject<Block> A1_FLOWER_POINSETTIA = REGISTRY.register("a1_flower_poinsettia", () -> new A1flowerpoinsettiaBlock());
    public static final RegistryObject<Block> A1_FLOWER_POPPYPATCH = REGISTRY.register("a1_flower_poppypatch", () -> new A1flowerpoppypatchBlock());
    public static final RegistryObject<Block> A1_FLOWER_POPPYSIMPLE = REGISTRY.register("a1_flower_poppysimple",
            () -> new A1flowerpoppysimpleBlock());
    public static final RegistryObject<Block> A1_FLOWER_POPPYWILD = REGISTRY.register("a1_flower_poppywild", () -> new A1flowerpoppywildBlock());
    public static final RegistryObject<Block> A1_FLOWER_ROAMIN = REGISTRY.register("a1_flower_roamin", () -> new A1flowerroaminBlock());
    public static final RegistryObject<Block> A1_FLOWER_ROSE = REGISTRY.register("a1_flower_rose", () -> new A1flowerroseBlock());
    public static final RegistryObject<Block> A1_FLOWER_ROSECLASSIC = REGISTRY.register("a1_flower_roseclassic",
            () -> new A1flowerroseclassicBlock());
    public static final RegistryObject<Block> A1_FLOWER_ROSECLUSTER = REGISTRY.register("a1_flower_rosecluster",
            () -> new A1flowerroseclusterBlock());
    public static final RegistryObject<Block> A1_FLOWER_ROSEGOLD = REGISTRY.register("a1_flower_rosegold", () -> new A1flowerrosegoldBlock());
    public static final RegistryObject<Block> A1_FLOWER_ROSEGOLDDARK = REGISTRY.register("a1_flower_rosegolddark",
            () -> new A1flowerrosegolddarkBlock());
    public static final RegistryObject<Block> A1_FLOWER_ROSEGROUND = REGISTRY.register("a1_flower_roseground", () -> new A1flowerrosegroundBlock());
    public static final RegistryObject<Block> A1_FLOWER_ROSEWHITE = REGISTRY.register("a1_flower_rosewhite", () -> new A1flowerrosewhiteBlock());
    public static final RegistryObject<Block> A1_FLOWER_SHRUB = REGISTRY.register("a1_flower_shrub", () -> new A1flowershrubBlock());
    public static final RegistryObject<Block> A1_FLOWER_SHRUBDARK = REGISTRY.register("a1_flower_shrubdark", () -> new A1flowershrubdarkBlock());
    public static final RegistryObject<Block> A1_FLOWER_SHRUBDEAD = REGISTRY.register("a1_flower_shrubdead", () -> new A1flowershrubdeadBlock());
    public static final RegistryObject<Block> A1_FLOWER_SHRUBGREEN = REGISTRY.register("a1_flower_shrubgreen", () -> new A1flowershrubgreenBlock());
    public static final RegistryObject<Block> A1_FLOWER_SHRUBORANGE = REGISTRY.register("a1_flower_shruborange",
            () -> new A1flowershruborangeBlock());
    public static final RegistryObject<Block> A1_FLOWER_SHRUBPINEBLUE = REGISTRY.register("a1_flower_shrubpineblue",
            () -> new A1flowershrubpineblueBlock());
    public static final RegistryObject<Block> A1_FLOWER_SHRUBPINEGREEN = REGISTRY.register("a1_flower_shrubpinegreen",
            () -> new A1flowershrubpinegreenBlock());
    public static final RegistryObject<Block> A1_FLOWER_SHRUBRED = REGISTRY.register("a1_flower_shrubred", () -> new A1flowershrubredBlock());
    public static final RegistryObject<Block> A1_FLOWER_SHRUBWOODY = REGISTRY.register("a1_flower_shrubwoody", () -> new A1flowershrubwoodyBlock());
    public static final RegistryObject<Block> A1_FLOWER_SWAMPROOTS = REGISTRY.register("a1_flower_swamproots", () -> new A1flowerswamprootsBlock());
    public static final RegistryObject<Block> A1_FLOWER_SYRINGA = REGISTRY.register("a1_flower_syringa", () -> new A1flowersyringaBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIP = REGISTRY.register("a1_flower_tulip", () -> new A1flowertulipBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPGROUPORANGE = REGISTRY.register("a1_flower_tulipgrouporange",
            () -> new A1flowertulipgrouporangeBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPGROUPPINK = REGISTRY.register("a1_flower_tulipgrouppink",
            () -> new A1flowertulipgrouppinkBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPGROUPPURPLE = REGISTRY.register("a1_flower_tulipgrouppurple",
            () -> new A1flowertulipgrouppurpleBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPGROUPRED = REGISTRY.register("a1_flower_tulipgroupred",
            () -> new A1flowertulipgroupredBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPGROUPWHITE = REGISTRY.register("a1_flower_tulipgroupwhite",
            () -> new A1flowertulipgroupwhiteBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPGROUPYELLOW = REGISTRY.register("a1_flower_tulipgroupyellow",
            () -> new A1flowertulipgroupyellowBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPSIMPLEORANGE = REGISTRY.register("a1_flower_tulipsimpleorange",
            () -> new A1flowertulipsimpleorangeBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPSIMPLEPINK = REGISTRY.register("a1_flower_tulipsimplepink",
            () -> new A1flowertulipsimplepinkBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPSIMPLEPURPLE = REGISTRY.register("a1_flower_tulipsimplepurple",
            () -> new A1flowertulipsimplepurpleBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPSIMPLERED = REGISTRY.register("a1_flower_tulipsimplered",
            () -> new A1flowertulipsimpleredBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPSIMPLEWHITE = REGISTRY.register("a1_flower_tulipsimplewhite",
            () -> new A1flowertulipsimplewhiteBlock());
    public static final RegistryObject<Block> A1_FLOWER_TULIPSIMPLEYELLOW = REGISTRY.register("a1_flower_tulipsimpleyellow",
            () -> new A1flowertulipsimpleyellowBlock());
    public static final RegistryObject<Block> A1_FLOWER_TURNIP = REGISTRY.register("a1_flower_turnip", () -> new A1flowerturnipBlock());
    public static final RegistryObject<Block> A1_FLOWER_VIOLET = REGISTRY.register("a1_flower_violet", () -> new A1flowervioletBlock());
    public static final RegistryObject<Block> A1_FLOWER_VIOLETFIELD = REGISTRY.register("a1_flower_violetfield",
            () -> new A1flowervioletfieldBlock());
    public static final RegistryObject<Block> A1_FLOWER_VIOLETGROUND = REGISTRY.register("a1_flower_violetground",
            () -> new A1flowervioletgroundBlock());
    public static final RegistryObject<Block> A1_FLOWER_WHITEANEMONEFIELD = REGISTRY.register("a1_flower_whiteanemonefield",
            () -> new A1flowerwhiteanemonefieldBlock());
    public static final RegistryObject<Block> A1_FLOWER_WHITEANEMONEGROUND = REGISTRY.register("a1_flower_whiteanemoneground",
            () -> new A1flowerwhiteanemonegroundBlock());
    public static final RegistryObject<Block> A1_FLOWER_WILDFLOWERGROUND = REGISTRY.register("a1_flower_wildflowerground",
            () -> new A1flowerwildflowergroundBlock());
    public static final RegistryObject<Block> A1_FLOWER_WILDFLOWERLARGE = REGISTRY.register("a1_flower_wildflowerlarge",
            () -> new A1flowerwildflowerlargeBlock());
    public static final RegistryObject<Block> A1_FLOWER_WILDFLOWERSIMPLE = REGISTRY.register("a1_flower_wildflowersimple",
            () -> new A1flowerwildflowersimpleBlock());
    public static final RegistryObject<Block> A1_FLOWER_WILDFLOWERSMALL = REGISTRY.register("a1_flower_wildflowersmall",
            () -> new A1flowerwildflowersmallBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_AUTUMN = REGISTRY.register("a1_mushroom_autumn", () -> new A1mushroomautumnBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_AUTUMNTALL = REGISTRY.register("a1_mushroom_autumntall",
            () -> new A1mushroomautumntallBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_BUTTON = REGISTRY.register("a1_mushroom_button", () -> new A1mushroombuttonBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_BUTTONCLUSTER = REGISTRY.register("a1_mushroom_buttoncluster",
            () -> new A1mushroombuttonclusterBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_BUTTONSMALL = REGISTRY.register("a1_mushroom_buttonsmall",
            () -> new A1mushroombuttonsmallBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_BUTTONTALL = REGISTRY.register("a1_mushroom_buttontall",
            () -> new A1mushroombuttontallBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_BUTTONTOADSTOOL = REGISTRY.register("a1_mushroom_buttontoadstool",
            () -> new A1mushroombuttontoadstoolBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_DEATHCAP = REGISTRY.register("a1_mushroom_deathcap", () -> new A1mushroomdeathcapBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_DEATHCAPCLUSTER = REGISTRY.register("a1_mushroom_deathcapcluster",
            () -> new A1mushroomdeathcapclusterBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_DEATHCAPTALL = REGISTRY.register("a1_mushroom_deathcaptall",
            () -> new A1mushroomdeathcaptallBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_GOLD = REGISTRY.register("a1_mushroom_gold", () -> new A1mushroomgoldBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_GOLDTOADSTOOL = REGISTRY.register("a1_mushroom_goldtoadstool",
            () -> new A1mushroomgoldtoadstoolBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_MIXEDBUTTON = REGISTRY.register("a1_mushroom_mixedbutton",
            () -> new A1mushroommixedbuttonBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_MIXEDBUTTONTALL = REGISTRY.register("a1_mushroom_mixedbuttontall",
            () -> new A1mushroommixedbuttontallBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_MIXEDTOADSTOOL = REGISTRY.register("a1_mushroom_mixedtoadstool",
            () -> new A1mushroommixedtoadstoolBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_MIXEDTOADSTOOLTALL = REGISTRY.register("a1_mushroom_mixedtoadstooltall",
            () -> new A1mushroommixedtoadstooltallBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_POISON = REGISTRY.register("a1_mushroom_poison", () -> new A1mushroompoisonBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_RED = REGISTRY.register("a1_mushroom_red", () -> new A1mushroomredBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_REDMARIO = REGISTRY.register("a1_mushroom_redmario", () -> new A1mushroomredmarioBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_SLIME = REGISTRY.register("a1_mushroom_slime", () -> new A1mushroomslimeBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_TOADSTOOL = REGISTRY.register("a1_mushroom_toadstool",
            () -> new A1mushroomtoadstoolBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_TOADSTOOLSMALL = REGISTRY.register("a1_mushroom_toadstoolsmall",
            () -> new A1mushroomtoadstoolsmallBlock());
    public static final RegistryObject<Block> A1_MUSHROOM_TOADSTOOLTALL = REGISTRY.register("a1_mushroom_toadstooltall",
            () -> new A1mushroomtoadstooltallBlock());
    public static final RegistryObject<Block> A1_NETHERWART1_BEE = REGISTRY.register("a1_netherwart1_bee", () -> new A1netherwart1beeBlock());
    public static final RegistryObject<Block> A1_NETHERWART1_EYES = REGISTRY.register("a1_netherwart1_eyes", () -> new A1netherwart1eyesBlock());
    public static final RegistryObject<Block> A1_NETHERWART1_LEAVESGREEN = REGISTRY.register("a1_netherwart1_leavesgreen",
            () -> new A1netherwart1leavesgreenBlock());
    public static final RegistryObject<Block> A1_NETHERWART1_LEAVESRED = REGISTRY.register("a1_netherwart1_leavesred",
            () -> new A1netherwart1leavesredBlock());
    public static final RegistryObject<Block> A1_NETHERWART1_MUSHROOM = REGISTRY.register("a1_netherwart1_mushroom",
            () -> new A1netherwart1mushroomBlock());
    public static final RegistryObject<Block> A1_NETHERWART1_TENDRIL = REGISTRY.register("a1_netherwart1_tendril",
            () -> new A1netherwart1tendrilBlock());
    public static final RegistryObject<Block> A1_NETHERWART2_BEE = REGISTRY.register("a1_netherwart2_bee", () -> new A1netherwart2beeBlock());
    public static final RegistryObject<Block> A1_NETHERWART2_EYES = REGISTRY.register("a1_netherwart2_eyes", () -> new A1netherwart2eyesBlock());
    public static final RegistryObject<Block> A1_NETHERWART2_LEAVESGREEN = REGISTRY.register("a1_netherwart2_leavesgreen",
            () -> new A1netherwart2leavesgreenBlock());
    public static final RegistryObject<Block> A1_NETHERWART2_LEAVESRED = REGISTRY.register("a1_netherwart2_leavesred",
            () -> new A1netherwart2leavesredBlock());
    public static final RegistryObject<Block> A1_NETHERWART2_MUSHROOM = REGISTRY.register("a1_netherwart2_mushroom",
            () -> new A1netherwart2mushroomBlock());
    public static final RegistryObject<Block> A1_NETHERWART2_TENDRIL = REGISTRY.register("a1_netherwart2_tendril",
            () -> new A1netherwart2tendrilBlock());
    public static final RegistryObject<Block> A1_NETHERWART3_BEE = REGISTRY.register("a1_netherwart3_bee", () -> new A1netherwart3beeBlock());
    public static final RegistryObject<Block> A1_NETHERWART3_EYES = REGISTRY.register("a1_netherwart3_eyes", () -> new A1netherwart3eyesBlock());
    public static final RegistryObject<Block> A1_NETHERWART3_LEAVESGREEN = REGISTRY.register("a1_netherwart3_leavesgreen",
            () -> new A1netherwart3leavesgreenBlock());
    public static final RegistryObject<Block> A1_NETHERWART3_LEAVESRED = REGISTRY.register("a1_netherwart3_leavesred",
            () -> new A1netherwart3leavesredBlock());
    public static final RegistryObject<Block> A1_NETHERWART3_MUSHROOM = REGISTRY.register("a1_netherwart3_mushroom",
            () -> new A1netherwart3mushroomBlock());
    public static final RegistryObject<Block> A1_NETHERWART3_TENDRIL = REGISTRY.register("a1_netherwart3_tendril",
            () -> new A1netherwart3tendrilBlock());
    public static final RegistryObject<Block> A1_SAPLING_ACACIAGREEN = REGISTRY.register("a1_sapling_acaciagreen",
            () -> new A1saplingacaciagreenBlock());
    public static final RegistryObject<Block> A1_SAPLING_ACACIAYELLOW = REGISTRY.register("a1_sapling_acaciayellow",
            () -> new A1saplingacaciayellowBlock());
    public static final RegistryObject<Block> A1_SAPLING_AUTUMNBROWN = REGISTRY.register("a1_sapling_autumnbrown",
            () -> new A1saplingautumnbrownBlock());
    public static final RegistryObject<Block> A1_SAPLING_AUTUMNDARKORANGE = REGISTRY.register("a1_sapling_autumndarkorange",
            () -> new A1saplingautumndarkorangeBlock());
    public static final RegistryObject<Block> A1_SAPLING_AUTUMNORANGE = REGISTRY.register("a1_sapling_autumnorange",
            () -> new A1saplingautumnorangeBlock());
    public static final RegistryObject<Block> A1_SAPLING_AUTUMNPINK = REGISTRY.register("a1_sapling_autumnpink",
            () -> new A1saplingautumnpinkBlock());
    public static final RegistryObject<Block> A1_SAPLING_AUTUMNRED = REGISTRY.register("a1_sapling_autumnred", () -> new A1saplingautumnredBlock());
    public static final RegistryObject<Block> A1_SAPLING_AUTUMNYELLOW = REGISTRY.register("a1_sapling_autumnyellow",
            () -> new A1saplingautumnyellowBlock());
    public static final RegistryObject<Block> A1_SAPLING_BIRCH = REGISTRY.register("a1_sapling_birch", () -> new A1saplingbirchBlock());
    public static final RegistryObject<Block> A1_SAPLING_BIRCHAUTUMN = REGISTRY.register("a1_sapling_birchautumn",
            () -> new A1saplingbirchautumnBlock());
    public static final RegistryObject<Block> A1_SAPLING_BIRCHDARK = REGISTRY.register("a1_sapling_birchdark", () -> new A1saplingbirchdarkBlock());
    public static final RegistryObject<Block> A1_SAPLING_BIRCHDARKAUTUMN = REGISTRY.register("a1_sapling_birchdarkautumn",
            () -> new A1saplingbirchdarkautumnBlock());
    public static final RegistryObject<Block> A1_SAPLING_BIRCHDARKWILD = REGISTRY.register("a1_sapling_birchdarkwild",
            () -> new A1saplingbirchdarkwildBlock());
    public static final RegistryObject<Block> A1_SAPLING_BIRCHWILD = REGISTRY.register("a1_sapling_birchwild", () -> new A1saplingbirchwildBlock());
    public static final RegistryObject<Block> A1_SAPLING_BONSAI = REGISTRY.register("a1_sapling_bonsai", () -> new A1saplingbonsaiBlock());
    public static final RegistryObject<Block> A1_SAPLING_BONSAICEDAR = REGISTRY.register("a1_sapling_bonsaicedar",
            () -> new A1saplingbonsaicedarBlock());
    public static final RegistryObject<Block> A1_SAPLING_FIR = REGISTRY.register("a1_sapling_fir", () -> new A1saplingfirBlock());
    public static final RegistryObject<Block> A1_SAPLING_JUNGLE = REGISTRY.register("a1_sapling_jungle", () -> new A1saplingjungleBlock());
    public static final RegistryObject<Block> A1_SAPLING_JUNGLECOCOA = REGISTRY.register("a1_sapling_junglecocoa",
            () -> new A1saplingjunglecocoaBlock());
    public static final RegistryObject<Block> A1_SAPLING_JUNGLEYELLOW = REGISTRY.register("a1_sapling_jungleyellow",
            () -> new A1saplingjungleyellowBlock());
    public static final RegistryObject<Block> A1_SAPLING_LEAFYSHRUB = REGISTRY.register("a1_sapling_leafyshrub",
            () -> new A1saplingleafyshrubBlock());
    public static final RegistryObject<Block> A1_SAPLING_OAKAUTUMN = REGISTRY.register("a1_sapling_oakautumn", () -> new A1saplingoakautumnBlock());
    public static final RegistryObject<Block> A1_SAPLING_OAKDEAD = REGISTRY.register("a1_sapling_oakdead", () -> new A1saplingoakdeadBlock());
    public static final RegistryObject<Block> A1_SAPLING_OAKGREEN = REGISTRY.register("a1_sapling_oakgreen", () -> new A1saplingoakgreenBlock());
    public static final RegistryObject<Block> A1_SAPLING_OAKGREENDARK = REGISTRY.register("a1_sapling_oakgreendark",
            () -> new A1saplingoakgreendarkBlock());
    public static final RegistryObject<Block> A1_SAPLING_OAKOLIVE = REGISTRY.register("a1_sapling_oakolive", () -> new A1saplingoakoliveBlock());
    public static final RegistryObject<Block> A1_SAPLING_OAKROBUST = REGISTRY.register("a1_sapling_oakrobust", () -> new A1saplingoakrobustBlock());
    public static final RegistryObject<Block> A1_SAPLING_OAKWILD = REGISTRY.register("a1_sapling_oakwild", () -> new A1saplingoakwildBlock());
    public static final RegistryObject<Block> A1_SAPLING_PALM = REGISTRY.register("a1_sapling_palm", () -> new A1saplingpalmBlock());
    public static final RegistryObject<Block> A1_SAPLING_PINE = REGISTRY.register("a1_sapling_pine", () -> new A1saplingpineBlock());
    public static final RegistryObject<Block> A1_SAPLING_PINEBRANCHING = REGISTRY.register("a1_sapling_pinebranching",
            () -> new A1saplingpinebranchingBlock());
    public static final RegistryObject<Block> A1_SAPLING_PINEDARK = REGISTRY.register("a1_sapling_pinedark", () -> new A1saplingpinedarkBlock());
    public static final RegistryObject<Block> A1_SAPLING_PINESPRUCE = REGISTRY.register("a1_sapling_pinespruce",
            () -> new A1saplingpinespruceBlock());
    public static final RegistryObject<Block> A1_SAPLING_REDWOOD = REGISTRY.register("a1_sapling_redwood", () -> new A1saplingredwoodBlock());
    public static final RegistryObject<Block> A1_SAPLING_REDWOODUPPER = REGISTRY.register("a1_sapling_redwoodupper",
            () -> new A1saplingredwoodupperBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTAUTUMNBROWN = REGISTRY.register("a1_sapling_robustautumnbrown",
            () -> new A1saplingrobustautumnbrownBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTAUTUMNDARKORANGE = REGISTRY.register("a1_sapling_robustautumndarkorange",
            () -> new A1saplingrobustautumndarkorangeBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTAUTUMNORANGE = REGISTRY.register("a1_sapling_robustautumnorange",
            () -> new A1saplingrobustautumnorangeBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTAUTUMNPINK = REGISTRY.register("a1_sapling_robustautumnpink",
            () -> new A1saplingrobustautumnpinkBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTAUTUMNRED = REGISTRY.register("a1_sapling_robustautumnred",
            () -> new A1saplingrobustautumnredBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTAUTUMNYELLOW = REGISTRY.register("a1_sapling_robustautumnyellow",
            () -> new A1saplingrobustautumnyellowBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTDEAD = REGISTRY.register("a1_sapling_robustdead",
            () -> new A1saplingrobustdeadBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTORANGE = REGISTRY.register("a1_sapling_robustorange",
            () -> new A1saplingrobustorangeBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTPINKPETALS = REGISTRY.register("a1_sapling_robustpinkpetals",
            () -> new A1saplingrobustpinkpetalsBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTRED = REGISTRY.register("a1_sapling_robustred", () -> new A1saplingrobustredBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTSILVER = REGISTRY.register("a1_sapling_robustsilver",
            () -> new A1saplingrobustsilverBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTSILVERMARCHES = REGISTRY.register("a1_sapling_robustsilvermarches",
            () -> new A1saplingrobustsilvermarchesBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTWHITEPETALS = REGISTRY.register("a1_sapling_robustwhitepetals",
            () -> new A1saplingrobustwhitepetalsBlock());
    public static final RegistryObject<Block> A1_SAPLING_ROBUSTYELLOW = REGISTRY.register("a1_sapling_robustyellow",
            () -> new A1saplingrobustyellowBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_BAMBOO = REGISTRY.register("a1_tallflower_bamboo", () -> new A1tallflowerbambooBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_BUSHAUTUMN = REGISTRY.register("a1_tallflower_bushautumn",
            () -> new A1tallflowerbushautumnBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_BUSHPLAIN = REGISTRY.register("a1_tallflower_bushplain",
            () -> new A1tallflowerbushplainBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CACTUSBROWN = REGISTRY.register("a1_tallflower_cactusbrown",
            () -> new A1tallflowercactusbrownBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CACTUSGREEN = REGISTRY.register("a1_tallflower_cactusgreen",
            () -> new A1tallflowercactusgreenBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CACTUSOLIVE = REGISTRY.register("a1_tallflower_cactusolive",
            () -> new A1tallflowercactusoliveBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CATTAIL = REGISTRY.register("a1_tallflower_cattail",
            () -> new A1tallflowercattailBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CORNSTALKS = REGISTRY.register("a1_tallflower_cornstalks",
            () -> new A1tallflowercornstalksBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CREEPERSTATUEDARKCLASSIC = REGISTRY.register("a1_tallflower_creeperstatuedarkclassic",
            () -> new A1tallflowercreeperstatuedarkclassicBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CREEPERSTATUEDARKDEMI = REGISTRY.register("a1_tallflower_creeperstatuedarkdemi",
            () -> new A1tallflowercreeperstatuedarkdemiBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CREEPERSTATUEDARKORIGINAL = REGISTRY.register("a1_tallflower_creeperstatuedarkoriginal",
            () -> new A1tallflowercreeperstatuedarkoriginalBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CREEPERSTATUEGREENCLASSIC = REGISTRY.register("a1_tallflower_creeperstatuegreenclassic",
            () -> new A1tallflowercreeperstatuegreenclassicBlock());
    public static final RegistryObject<Block> A1_TALLFLOWER_CREEPERSTATUEGREENDEMI = REGISTRY.register("a1_tallflower_creeperstatuegreendemi",
            () -> new A1tallflowercreeperstatuegreendemiBlock());
    public static final RegistryObject<Block> A_1TALLFLOWERCREEPERSTATUEGREENORIGINAL = REGISTRY.register("a_1tallflowercreeperstatuegreenoriginal",
            () -> new A1tallflowercreeperstatuegreenoriginalBlock());
}