package alcoholmod.Mathioks.Jutsu;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class JutsuLogic {
  public static void makeBlockWall(World world, EntityLivingBase entity, Block block, int height) {
    if (!world.isRemote) {
      int dir0 = MathHelper.floor_double((entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 0x3;
      int x = MathHelper.floor_double(entity.posX);
      int y = MathHelper.floor_double(entity.posY);
      int z = MathHelper.floor_double(entity.posZ);
      for (int i = 0; i <= 10; i++) {
        switch (dir0) {
          case 0:
            if (world.getBlock(x - 5 + i, y + height, z + 2) == Blocks.air)
              world.setBlock(x - 5 + i, y + height, z + 2, block, 0, 2); 
            break;
          case 1:
            if (world.getBlock(x - 2, y + height, z - 5 + i) == Blocks.air)
              world.setBlock(x - 2, y + height, z - 5 + i, block, 0, 2); 
            break;
          case 2:
            if (world.getBlock(x - 5 + i, y + height, z - 2) == Blocks.air)
              world.setBlock(x - 5 + i, y + height, z - 2, block, 0, 2); 
            break;
          case 3:
            if (world.getBlock(x + 2, y + height, z - 5 + i) == Blocks.air)
              world.setBlock(x + 2, y + height, z - 5 + i, block, 0, 2); 
            break;
        } 
      } 
    } 
  }
  
  public static void makeWindingWood(World world, EntityLiving entity, int count) {
    int[][] blockPos = new int[10][3];
    for (int i = 0; i < 10; i++) {
      if (count == 0) {
        int x = MathHelper.floor_double(entity.posX);
        int y = MathHelper.floor_double(entity.posY);
        int z = MathHelper.floor_double(entity.posZ);
        blockPos[i][0] = x - 15 + world.rand.nextInt(15);
        blockPos[i][1] = y;
        blockPos[i][2] = z - 15 + world.rand.nextInt(15);
      } else {
        int x = blockPos[i][0];
        int y = blockPos[i][1];
        int z = blockPos[i][2];
        switch (world.rand.nextInt(10)) {
          case 0:
            y--;
          case 1:
            x++;
          case 2:
            x--;
          case 3:
            z++;
          case 4:
            z--;
          case 5:
            y++;
          case 6:
            y++;
          case 7:
            y++;
          case 8:
            y++;
          case 9:
            y++;
            break;
        } 
      } 
    } 
  }
}
