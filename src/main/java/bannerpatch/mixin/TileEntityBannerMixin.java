package bannerpatch.mixin;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.util.math.AxisAlignedBB;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(TileEntityBanner.class)
public abstract class TileEntityBannerMixin extends TileEntity {

    @Override
    public AxisAlignedBB getRenderBoundingBox() {
        //3 block tall bounding box, since getPos() changes depending on placed on wall or floor
        return new net.minecraft.util.math.AxisAlignedBB(getPos().add(0, -1, 0), getPos().add(1, 2, 1));
    }
}