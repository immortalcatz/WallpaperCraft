package com.Aarron.WallpaperCraft.Blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.Aarron.WallpaperCraft.Blocks.Clay.ClayBlue;
import com.Aarron.WallpaperCraft.Blocks.Clay.ClayBrown;
import com.Aarron.WallpaperCraft.Blocks.Clay.ClayCyan;
import com.Aarron.WallpaperCraft.Blocks.Clay.ClayGray;
import com.Aarron.WallpaperCraft.Blocks.Clay.ClayGreen;
import com.Aarron.WallpaperCraft.Blocks.Clay.ClayPurple;
import com.Aarron.WallpaperCraft.Blocks.Clay.ClayRed;
import com.Aarron.WallpaperCraft.Blocks.Clay.ClayYellow;
import com.Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedBlue;
import com.Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedBrown;
import com.Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedCyan;
import com.Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedGray;
import com.Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedGreen;
import com.Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedPurple;
import com.Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedRed;
import com.Aarron.WallpaperCraft.Blocks.Dotted.DiagonallyDottedYellow;
import com.Aarron.WallpaperCraft.Blocks.Floral.FloralBlue;
import com.Aarron.WallpaperCraft.Blocks.Floral.FloralBrown;
import com.Aarron.WallpaperCraft.Blocks.Floral.FloralCyan;
import com.Aarron.WallpaperCraft.Blocks.Floral.FloralGray;
import com.Aarron.WallpaperCraft.Blocks.Floral.FloralGreen;
import com.Aarron.WallpaperCraft.Blocks.Floral.FloralPurple;
import com.Aarron.WallpaperCraft.Blocks.Floral.FloralRed;
import com.Aarron.WallpaperCraft.Blocks.Floral.FloralYellow;
import com.Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassBlue;
import com.Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassBrown;
import com.Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassCyan;
import com.Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassGray;
import com.Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassGreen;
import com.Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassPurple;
import com.Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassRed;
import com.Aarron.WallpaperCraft.Blocks.Glass.FrostedGlassYellow;
import com.Aarron.WallpaperCraft.Blocks.Glass.TintedGlassBlue;
import com.Aarron.WallpaperCraft.Blocks.Glass.TintedGlassBrown;
import com.Aarron.WallpaperCraft.Blocks.Glass.TintedGlassCyan;
import com.Aarron.WallpaperCraft.Blocks.Glass.TintedGlassGray;
import com.Aarron.WallpaperCraft.Blocks.Glass.TintedGlassGreen;
import com.Aarron.WallpaperCraft.Blocks.Glass.TintedGlassPurple;
import com.Aarron.WallpaperCraft.Blocks.Glass.TintedGlassRed;
import com.Aarron.WallpaperCraft.Blocks.Glass.TintedGlassYellow;
import com.Aarron.WallpaperCraft.Blocks.Glass.TexGlassBlue;
import com.Aarron.WallpaperCraft.Blocks.Glass.TexGlassBrown;
import com.Aarron.WallpaperCraft.Blocks.Glass.TexGlassCyan;
import com.Aarron.WallpaperCraft.Blocks.Glass.TexGlassGray;
import com.Aarron.WallpaperCraft.Blocks.Glass.TexGlassGreen;
import com.Aarron.WallpaperCraft.Blocks.Glass.TexGlassPurple;
import com.Aarron.WallpaperCraft.Blocks.Glass.TexGlassRed;
import com.Aarron.WallpaperCraft.Blocks.Glass.TexGlassYellow;
import com.Aarron.WallpaperCraft.Blocks.Solid.SolidBlueBlocks;
import com.Aarron.WallpaperCraft.Blocks.Solid.SolidBrownBlocks;
import com.Aarron.WallpaperCraft.Blocks.Solid.SolidCyanBlocks;
import com.Aarron.WallpaperCraft.Blocks.Solid.SolidGrayBlocks;
import com.Aarron.WallpaperCraft.Blocks.Solid.SolidGreenBlocks;
import com.Aarron.WallpaperCraft.Blocks.Solid.SolidPurpleBlocks;
import com.Aarron.WallpaperCraft.Blocks.Solid.SolidRedBlocks;
import com.Aarron.WallpaperCraft.Blocks.Solid.SolidYellowBlocks;
import com.Aarron.WallpaperCraft.Blocks.Striped.StripedBlue;
import com.Aarron.WallpaperCraft.Blocks.Striped.StripedBrown;
import com.Aarron.WallpaperCraft.Blocks.Striped.StripedCyan;
import com.Aarron.WallpaperCraft.Blocks.Striped.StripedGray;
import com.Aarron.WallpaperCraft.Blocks.Striped.StripedGreen;
import com.Aarron.WallpaperCraft.Blocks.Striped.StripedPurple;
import com.Aarron.WallpaperCraft.Blocks.Striped.StripedRed;
import com.Aarron.WallpaperCraft.Blocks.Striped.StripedYellow;
import com.Aarron.WallpaperCraft.Items.ItemSolidBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public final class CoreBlock {

	
	//Creating The Solid Coloured Blocks
    public static SolidRedBlocks SolidRed;
    public static SolidPurpleBlocks SolidPurple;
    public static SolidBlueBlocks SolidBlue;
    public static SolidCyanBlocks SolidCyan;
    public static SolidGreenBlocks SolidGreen;
    public static SolidYellowBlocks SolidYellow;
    public static SolidBrownBlocks SolidBrown;
    public static SolidGrayBlocks SolidGray;
    
    //Creating The Diagonally Dotted Coloured Blocks
    public static DiagonallyDottedRed DiagonallyDottedRed;
    public static DiagonallyDottedPurple DiagonallyDottedPurple;
    public static DiagonallyDottedBlue DiagonallyDottedBlue;
    public static DiagonallyDottedCyan DiagonallyDottedCyan;
    public static DiagonallyDottedGreen DiagonallyDottedGreen;
    public static DiagonallyDottedYellow DiagonallyDottedYellow;
    public static DiagonallyDottedBrown DiagonallyDottedBrown;
    public static DiagonallyDottedGray DiagonallyDottedGray;

    //Creating The Stripes Coloured Blocks
    public static StripedRed StripedRed;
    public static StripedPurple StripedPurple;
    public static StripedBlue StripedBlue;
    public static StripedCyan StripedCyan;
    public static StripedGreen StripedGreen;
    public static StripedYellow StripedYellow;
    public static StripedBrown StripedBrown;
    public static StripedGray StripedGray;
    
    //Creating The Floral Coloured Blocks
    public static FloralRed FloralRed;
    public static FloralPurple FloralPurple;
    public static FloralBlue FloralBlue;
    public static FloralCyan FloralCyan;
    public static FloralGreen FloralGreen;
    public static FloralYellow FloralYellow;
    public static FloralBrown FloralBrown;
    public static FloralGray FloralGray;
    
    //Creating The Clay Coloured Blocks
    public static ClayRed ClayRed;
    public static ClayPurple ClayPurple;
    public static ClayBlue ClayBlue;
    public static ClayCyan ClayCyan;
    public static ClayGreen ClayGreen;
    public static ClayYellow ClayYellow;
    public static ClayBrown ClayBrown;
    public static ClayGray ClayGray;
    
    //Creating The Tinted Glass Coloured Blocks
    public static TintedGlassRed TintedGlassRed;
    public static TintedGlassPurple TintedGlassPurple;
    public static TintedGlassBlue TintedGlassBlue;
    public static TintedGlassCyan TintedGlassCyan;
    public static TintedGlassGreen TintedGlassGreen;
    public static TintedGlassYellow TintedGlassYellow;
    public static TintedGlassBrown TintedGlassBrown;
    public static TintedGlassGray TintedGlassGray;
    
    //Creating The Textured Coloured Blocks
    public static TexGlassRed TexGlassRed;
    public static TexGlassPurple TexGlassPurple;
    public static TexGlassBlue TexGlassBlue;
    public static TexGlassCyan TexGlassCyan;
    public static TexGlassGreen TexGlassGreen;
    public static TexGlassYellow TexGlassYellow;
    public static TexGlassBrown TexGlassBrown;
    public static TexGlassGray TexGlassGray;
    
    //Creating The Frosted Coloured Blocks
    public static FrostedGlassRed FrostedGlassRed;
    public static FrostedGlassPurple FrostedGlassPurple;
    public static FrostedGlassBlue FrostedGlassBlue;
    public static FrostedGlassCyan FrostedGlassCyan;
    public static FrostedGlassGreen FrostedGlassGreen;
    public static FrostedGlassYellow FrostedGlassYellow;
    public static FrostedGlassBrown FrostedGlassBrown;
    public static FrostedGlassGray FrostedGlassGray;
    
    
    
    
    
    
    

    //Registering The Solid Coloured Blocks
    public static final void init() {
        GameRegistry.registerBlock(SolidRed = new SolidRedBlocks("SolidRedBlocks", Material.cloth), ItemSolidBlock.class, "SolidRedBlocks");
        GameRegistry.registerBlock(SolidPurple = new SolidPurpleBlocks("SolidPurpleBlocks", Material.cloth), ItemSolidBlock.class, "SolidPurpleBlocks");
        GameRegistry.registerBlock(SolidBlue = new SolidBlueBlocks("SolidBlueBlocks", Material.cloth), ItemSolidBlock.class, "SolidBlueBlocks");
        GameRegistry.registerBlock(SolidCyan = new SolidCyanBlocks("SolidCyanBlocks", Material.cloth), ItemSolidBlock.class, "SolidCyanBlocks");
        GameRegistry.registerBlock(SolidGreen = new SolidGreenBlocks("SolidGreenBlocks", Material.cloth), ItemSolidBlock.class, "SolidGreenBlocks");
        GameRegistry.registerBlock(SolidYellow = new SolidYellowBlocks("SolidYellowBlocks", Material.cloth), ItemSolidBlock.class, "SolidYellowBlocks");
        GameRegistry.registerBlock(SolidBrown = new SolidBrownBlocks("SolidBrownBlocks", Material.cloth), ItemSolidBlock.class, "SolidBrownBlocks");
        GameRegistry.registerBlock(SolidGray = new SolidGrayBlocks("SolidGrayBlocks", Material.cloth), ItemSolidBlock.class, "SolidGrayBlocks");
        
        
        
    //Registering The Diagonally Dotted Coloured Blocks
        GameRegistry.registerBlock(DiagonallyDottedRed = new DiagonallyDottedRed("DiagonallyDottedRed", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedRed");
        GameRegistry.registerBlock(DiagonallyDottedPurple = new DiagonallyDottedPurple("DiagonallyDottedPurple", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedPurple");
        GameRegistry.registerBlock(DiagonallyDottedBlue = new DiagonallyDottedBlue("DiagonallyDottedBlue", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedBlue");
        GameRegistry.registerBlock(DiagonallyDottedCyan = new DiagonallyDottedCyan("DiagonallyDottedCyan", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedCyan");
        GameRegistry.registerBlock(DiagonallyDottedGreen = new DiagonallyDottedGreen("DiagonallyDottedGreen", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedGreen");
        GameRegistry.registerBlock(DiagonallyDottedYellow = new DiagonallyDottedYellow("DiagonallyDottedYellow", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedYellow");
        GameRegistry.registerBlock(DiagonallyDottedBrown = new DiagonallyDottedBrown("DiagonallyDottedBrown", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedBrown");
        GameRegistry.registerBlock(DiagonallyDottedGray = new DiagonallyDottedGray("DiagonallyDottedGray", Material.cloth), ItemSolidBlock.class, "DiagonallyDottedGray");
        
        
        
      //Registering The Striped  Coloured Blocks
        GameRegistry.registerBlock(StripedRed = new StripedRed("StripedRed", Material.cloth), ItemSolidBlock.class, "StripedRed");
        GameRegistry.registerBlock(StripedPurple = new StripedPurple("StripedPurple", Material.cloth), ItemSolidBlock.class, "StripedPurple");
        GameRegistry.registerBlock(StripedBlue = new StripedBlue("StripedBlue", Material.cloth), ItemSolidBlock.class, "StripedBlue");
        GameRegistry.registerBlock(StripedCyan = new StripedCyan("StripedCyan", Material.cloth), ItemSolidBlock.class, "StripedCyan");
        GameRegistry.registerBlock(StripedGreen = new StripedGreen("StripedGreen", Material.cloth), ItemSolidBlock.class, "StripedGreen");
        GameRegistry.registerBlock(StripedYellow = new StripedYellow("StripedYellow", Material.cloth), ItemSolidBlock.class, "StripedYellow");
        GameRegistry.registerBlock(StripedBrown = new StripedBrown("StripedBrown", Material.cloth), ItemSolidBlock.class, "StripedBrown");
        GameRegistry.registerBlock(StripedGray = new StripedGray("StripedGray", Material.cloth), ItemSolidBlock.class, "StripedGray");
        
        
        
		// Registering The Floral  Coloured Blocks
        GameRegistry.registerBlock(FloralRed = new FloralRed("FloralRed", Material.cloth), ItemSolidBlock.class, "FloralRed");
        GameRegistry.registerBlock(FloralPurple = new FloralPurple("FloralPurple", Material.cloth), ItemSolidBlock.class, "FloralPurple");
        GameRegistry.registerBlock(FloralBlue = new FloralBlue("FloralBlue", Material.cloth), ItemSolidBlock.class, "FloralBlue");
        GameRegistry.registerBlock(FloralCyan = new FloralCyan("FloralCyan", Material.cloth), ItemSolidBlock.class, "FloralCyan");
        GameRegistry.registerBlock(FloralGreen = new FloralGreen("FloralGreen", Material.cloth), ItemSolidBlock.class, "FloralGreen");
        GameRegistry.registerBlock(FloralYellow = new FloralYellow("FloralYellow", Material.cloth), ItemSolidBlock.class, "FloralYellow");
        GameRegistry.registerBlock(FloralBrown = new FloralBrown("FloralBrown", Material.cloth), ItemSolidBlock.class, "FloralBrown");
        GameRegistry.registerBlock(FloralGray = new FloralGray("FloralGray", Material.cloth), ItemSolidBlock.class, "FloralGray");
        
        
        
		// Registering The Clay  Coloured Blocks
        GameRegistry.registerBlock(ClayRed = new ClayRed("ClayRed", Material.cloth), ItemSolidBlock.class, "ClayRed");
        GameRegistry.registerBlock(ClayPurple = new ClayPurple("ClayPurple", Material.cloth), ItemSolidBlock.class, "ClayPurple");
        GameRegistry.registerBlock(ClayBlue = new ClayBlue("ClayBlue", Material.cloth), ItemSolidBlock.class, "ClayBlue");
        GameRegistry.registerBlock(ClayCyan = new ClayCyan("ClayCyan", Material.cloth), ItemSolidBlock.class, "ClayCyan");
        GameRegistry.registerBlock(ClayGreen = new ClayGreen("ClayGreen", Material.cloth), ItemSolidBlock.class, "ClayGreen");
        GameRegistry.registerBlock(ClayYellow = new ClayYellow("ClayYellow", Material.cloth), ItemSolidBlock.class, "ClayYellow");
        GameRegistry.registerBlock(ClayBrown = new ClayBrown("ClayBrown", Material.cloth), ItemSolidBlock.class, "ClayBrown");
        GameRegistry.registerBlock(ClayGray = new ClayGray("ClayGray", Material.cloth), ItemSolidBlock.class, "ClayGray");
        
        
        
        // Registering The Tinted Glass Coloured Blocks
        GameRegistry.registerBlock(TintedGlassRed = new TintedGlassRed("TintedGlassRed", Material.glass), ItemSolidBlock.class, "TintedGlassRed");
        GameRegistry.registerBlock(TintedGlassPurple = new TintedGlassPurple("TintedGlassPurple", Material.glass), ItemSolidBlock.class, "TintedGlassPurple");
        GameRegistry.registerBlock(TintedGlassBlue = new TintedGlassBlue("TintedGlassBlue", Material.glass), ItemSolidBlock.class, "TintedGlassBlue");
        GameRegistry.registerBlock(TintedGlassCyan = new TintedGlassCyan("TintedGlassCyan", Material.glass), ItemSolidBlock.class, "TintedGlassCyan");
        GameRegistry.registerBlock(TintedGlassGreen = new TintedGlassGreen("TintedGlassGreen", Material.glass), ItemSolidBlock.class, "TintedGlassGreen");
        GameRegistry.registerBlock(TintedGlassYellow = new TintedGlassYellow("TintedGlassYellow", Material.glass), ItemSolidBlock.class, "TintedGlassYellow");
        GameRegistry.registerBlock(TintedGlassBrown = new TintedGlassBrown("TintedGlassBrown", Material.glass), ItemSolidBlock.class, "TintedGlassBrown");
        GameRegistry.registerBlock(TintedGlassGray = new TintedGlassGray("TintedGlassGray", Material.glass), ItemSolidBlock.class, "TintedGlassGray");
        
        
        
        // Registering The Textured Glass Coloured Blocks
        GameRegistry.registerBlock(TexGlassRed = new TexGlassRed("TexGlassRed", Material.glass), ItemSolidBlock.class, "TexGlassRed");
        GameRegistry.registerBlock(TexGlassPurple = new TexGlassPurple("TexGlassPurple", Material.glass), ItemSolidBlock.class, "TexGlassPurple");
        GameRegistry.registerBlock(TexGlassBlue = new TexGlassBlue("TexGlassBlue", Material.glass), ItemSolidBlock.class, "TexGlassBlue");
        GameRegistry.registerBlock(TexGlassCyan = new TexGlassCyan("TexGlassCyan", Material.glass), ItemSolidBlock.class, "TexGlassCyan");
        GameRegistry.registerBlock(TexGlassGreen = new TexGlassGreen("TexGlassGreen", Material.glass), ItemSolidBlock.class, "TexGlassGreen");
        GameRegistry.registerBlock(TexGlassYellow = new TexGlassYellow("TexGlassYellow", Material.glass), ItemSolidBlock.class, "TexGlassYellow");
        GameRegistry.registerBlock(TexGlassBrown = new TexGlassBrown("TexGlassBrown", Material.glass), ItemSolidBlock.class, "TexGlassBrown");
        GameRegistry.registerBlock(TexGlassGray = new TexGlassGray("TexGlassGray", Material.glass), ItemSolidBlock.class, "TexGlassGray");
        
        
        
        // Registering The FrostedGlass Coloured Blocks
        GameRegistry.registerBlock(FrostedGlassRed = new FrostedGlassRed("FrostedGlassRed", Material.glass), ItemSolidBlock.class, "FrostedGlassRed");
        GameRegistry.registerBlock(FrostedGlassPurple = new FrostedGlassPurple("FrostedGlassPurple", Material.glass), ItemSolidBlock.class, "FrostedGlassPurple");
        GameRegistry.registerBlock(FrostedGlassBlue = new FrostedGlassBlue("FrostedGlassBlue", Material.glass), ItemSolidBlock.class, "FrostedGlassBlue");
        GameRegistry.registerBlock(FrostedGlassCyan = new FrostedGlassCyan("FrostedGlassCyan", Material.glass), ItemSolidBlock.class, "FrostedGlassCyan");
        GameRegistry.registerBlock(FrostedGlassGreen = new FrostedGlassGreen("FrostedGlassGreen", Material.glass), ItemSolidBlock.class, "FrostedGlassGreen");
        GameRegistry.registerBlock(FrostedGlassYellow = new FrostedGlassYellow("FrostedGlassYellow", Material.glass), ItemSolidBlock.class, "FrostedGlassYellow");
        GameRegistry.registerBlock(FrostedGlassBrown = new FrostedGlassBrown("FrostedGlassBrown", Material.glass), ItemSolidBlock.class, "FrostedGlassBrown");
        GameRegistry.registerBlock(FrostedGlassGray = new FrostedGlassGray("FrostedGlassGray", Material.glass), ItemSolidBlock.class, "FrostedGlassGray");


      
    }
}