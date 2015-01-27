package assets.cyborgs.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

/**
 * ModelZombie - Either Mojang or a mod author
 * Created using Tabula 4.0.2
 */
public class ModelCyborg extends ModelBase {
    public ModelRenderer bipedHeadwear;
    public ModelRenderer bipedLeftLeg;
    public ModelRenderer bipedEars;
    public ModelRenderer bipedRightLeg;
    public ModelRenderer bipedLeftArm;
    public ModelRenderer bipedRightArm;
    public ModelRenderer bipedBody;
    public ModelRenderer bipedHead;

    public ModelCyborg() {
        this.textureWidth = 64;
        this.textureHeight = 64;
        this.bipedRightArm = new ModelRenderer(this, 40, 16);
        this.bipedRightArm.setRotationPoint(-6.0F, -2.4F, 0.0F);
        this.bipedRightArm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
        this.setRotateAngle(bipedRightArm, -1.5707963267948966F, -0.10000736613927509F, 0.10000736613927509F);
        this.bipedRightLeg = new ModelRenderer(this, 0, 16);
        this.bipedRightLeg.setRotationPoint(-2.4F, 9.5F, 0.0F);
        this.bipedRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.bipedLeftLeg = new ModelRenderer(this, 0, 16);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.setRotationPoint(2.4F, 9.5F, 0.0F);
        this.bipedLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
        this.bipedBody = new ModelRenderer(this, 16, 16);
        this.bipedBody.setRotationPoint(0.0F, -4.9F, 0.0F);
        this.bipedBody.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
        this.bipedEars = new ModelRenderer(this, 24, 0);
        this.bipedEars.setRotationPoint(0.0F, -4.9F, 0.0F);
        this.bipedEars.addBox(-3.0F, -6.0F, -1.0F, 6, 6, 1);
        this.bipedLeftArm = new ModelRenderer(this, 40, 16);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.setRotationPoint(6.0F, -2.4F, -0.0F);
        this.bipedLeftArm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
        this.setRotateAngle(bipedLeftArm, -1.5707963267948966F, 0.10000736613927509F, -0.10000736613927509F);
        this.bipedHead = new ModelRenderer(this, 0, 0);
        this.bipedHead.setRotationPoint(0.0F, -4.9F, 0.0F);
        this.bipedHead.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
        this.bipedHeadwear = new ModelRenderer(this, 32, 0);
        this.bipedHeadwear.setRotationPoint(0.0F, -4.9F, 0.0F);
        this.bipedHeadwear.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bipedRightArm.offsetX, this.bipedRightArm.offsetY, this.bipedRightArm.offsetZ);
        GL11.glTranslatef(this.bipedRightArm.rotationPointX * f5, this.bipedRightArm.rotationPointY * f5, this.bipedRightArm.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.bipedRightArm.offsetX, -this.bipedRightArm.offsetY, -this.bipedRightArm.offsetZ);
        GL11.glTranslatef(-this.bipedRightArm.rotationPointX * f5, -this.bipedRightArm.rotationPointY * f5, -this.bipedRightArm.rotationPointZ * f5);
        this.bipedRightArm.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bipedRightLeg.offsetX, this.bipedRightLeg.offsetY, this.bipedRightLeg.offsetZ);
        GL11.glTranslatef(this.bipedRightLeg.rotationPointX * f5, this.bipedRightLeg.rotationPointY * f5, this.bipedRightLeg.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.bipedRightLeg.offsetX, -this.bipedRightLeg.offsetY, -this.bipedRightLeg.offsetZ);
        GL11.glTranslatef(-this.bipedRightLeg.rotationPointX * f5, -this.bipedRightLeg.rotationPointY * f5, -this.bipedRightLeg.rotationPointZ * f5);
        this.bipedRightLeg.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bipedLeftLeg.offsetX, this.bipedLeftLeg.offsetY, this.bipedLeftLeg.offsetZ);
        GL11.glTranslatef(this.bipedLeftLeg.rotationPointX * f5, this.bipedLeftLeg.rotationPointY * f5, this.bipedLeftLeg.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.bipedLeftLeg.offsetX, -this.bipedLeftLeg.offsetY, -this.bipedLeftLeg.offsetZ);
        GL11.glTranslatef(-this.bipedLeftLeg.rotationPointX * f5, -this.bipedLeftLeg.rotationPointY * f5, -this.bipedLeftLeg.rotationPointZ * f5);
        this.bipedLeftLeg.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bipedBody.offsetX, this.bipedBody.offsetY, this.bipedBody.offsetZ);
        GL11.glTranslatef(this.bipedBody.rotationPointX * f5, this.bipedBody.rotationPointY * f5, this.bipedBody.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.bipedBody.offsetX, -this.bipedBody.offsetY, -this.bipedBody.offsetZ);
        GL11.glTranslatef(-this.bipedBody.rotationPointX * f5, -this.bipedBody.rotationPointY * f5, -this.bipedBody.rotationPointZ * f5);
        this.bipedBody.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bipedEars.offsetX, this.bipedEars.offsetY, this.bipedEars.offsetZ);
        GL11.glTranslatef(this.bipedEars.rotationPointX * f5, this.bipedEars.rotationPointY * f5, this.bipedEars.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.bipedEars.offsetX, -this.bipedEars.offsetY, -this.bipedEars.offsetZ);
        GL11.glTranslatef(-this.bipedEars.rotationPointX * f5, -this.bipedEars.rotationPointY * f5, -this.bipedEars.rotationPointZ * f5);
        this.bipedEars.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bipedLeftArm.offsetX, this.bipedLeftArm.offsetY, this.bipedLeftArm.offsetZ);
        GL11.glTranslatef(this.bipedLeftArm.rotationPointX * f5, this.bipedLeftArm.rotationPointY * f5, this.bipedLeftArm.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.bipedLeftArm.offsetX, -this.bipedLeftArm.offsetY, -this.bipedLeftArm.offsetZ);
        GL11.glTranslatef(-this.bipedLeftArm.rotationPointX * f5, -this.bipedLeftArm.rotationPointY * f5, -this.bipedLeftArm.rotationPointZ * f5);
        this.bipedLeftArm.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bipedHead.offsetX, this.bipedHead.offsetY, this.bipedHead.offsetZ);
        GL11.glTranslatef(this.bipedHead.rotationPointX * f5, this.bipedHead.rotationPointY * f5, this.bipedHead.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.bipedHead.offsetX, -this.bipedHead.offsetY, -this.bipedHead.offsetZ);
        GL11.glTranslatef(-this.bipedHead.rotationPointX * f5, -this.bipedHead.rotationPointY * f5, -this.bipedHead.rotationPointZ * f5);
        this.bipedHead.render(f5);
        GL11.glPopMatrix();
        GL11.glPushMatrix();
        GL11.glTranslatef(this.bipedHeadwear.offsetX, this.bipedHeadwear.offsetY, this.bipedHeadwear.offsetZ);
        GL11.glTranslatef(this.bipedHeadwear.rotationPointX * f5, this.bipedHeadwear.rotationPointY * f5, this.bipedHeadwear.rotationPointZ * f5);
        GL11.glScaled(1.2D, 1.2D, 1.2D);
        GL11.glTranslatef(-this.bipedHeadwear.offsetX, -this.bipedHeadwear.offsetY, -this.bipedHeadwear.offsetZ);
        GL11.glTranslatef(-this.bipedHeadwear.rotationPointX * f5, -this.bipedHeadwear.rotationPointY * f5, -this.bipedHeadwear.rotationPointZ * f5);
        this.bipedHeadwear.render(f5);
        GL11.glPopMatrix();
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
