package com.yuanno.oniclawaddon.models;// Made with Blockbench 4.2.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.HandSide;
import xyz.pixelatedw.mineminenomi.api.morph.MorphModel;

public class HornModel<T extends LivingEntity> extends MorphModel<T> {
	private final ModelRenderer Head;
	private final ModelRenderer bone2;
	private final ModelRenderer Head_r1;
	private final ModelRenderer Head_r2;
	private final ModelRenderer Head_r3;
	private final ModelRenderer Head_r4;
	private final ModelRenderer Head_r5;
	private final ModelRenderer Head_r6;
	private final ModelRenderer Head_r7;
	private final ModelRenderer Head_r8;
	private final ModelRenderer Head_r9;
	private final ModelRenderer Head_r10;
	private final ModelRenderer Head_r11;
	private final ModelRenderer Head_r12;
	private final ModelRenderer bone;
	private final ModelRenderer Head_r13;
	private final ModelRenderer Head_r14;
	private final ModelRenderer Head_r15;
	private final ModelRenderer Head_r16;
	private final ModelRenderer Head_r17;
	private final ModelRenderer Head_r18;
	private final ModelRenderer Head_r19;
	private final ModelRenderer Head_r20;
	private final ModelRenderer Head_r21;
	private final ModelRenderer Head_r22;
	private final ModelRenderer Head_r23;
	private final ModelRenderer Head_r24;

	public HornModel() {
		textureWidth = 32;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-8.7023F, -7.9677F, -1.533F);
		Head.addChild(bone2);
		setRotationAngle(bone2, 0.0F, 2.4784F, 0.0F);
		

		Head_r1 = new ModelRenderer(this);
		Head_r1.setRotationPoint(-4.5158F, -1.1264F, 0.0958F);
		bone2.addChild(Head_r1);
		setRotationAngle(Head_r1, -0.5366F, -0.0118F, -1.7893F);
		Head_r1.setTextureOffset(0, 4).addBox(1.952F, 3.6334F, 2.3162F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r2 = new ModelRenderer(this);
		Head_r2.setRotationPoint(-3.1262F, -4.4303F, -1.8267F);
		bone2.addChild(Head_r2);
		setRotationAngle(Head_r2, -0.4899F, -0.2287F, -2.1714F);
		Head_r2.setTextureOffset(16, 22).addBox(-2.2F, 0.4F, 2.9F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r3 = new ModelRenderer(this);
		Head_r3.setRotationPoint(2.3612F, -2.5842F, -0.8125F);
		bone2.addChild(Head_r3);
		setRotationAngle(Head_r3, -0.5718F, -0.4443F, -2.3154F);
		Head_r3.setTextureOffset(0, 16).addBox(-0.3581F, -1.1712F, -0.8832F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r4 = new ModelRenderer(this);
		Head_r4.setRotationPoint(2.3612F, -2.5842F, -0.8125F);
		bone2.addChild(Head_r4);
		setRotationAngle(Head_r4, -0.6829F, -0.2062F, -1.9731F);
		Head_r4.setTextureOffset(0, 24).addBox(-1.0147F, -1.0545F, -0.8827F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r5 = new ModelRenderer(this);
		Head_r5.setRotationPoint(2.3612F, -2.5842F, -0.8125F);
		bone2.addChild(Head_r5);
		setRotationAngle(Head_r5, -0.7081F, -0.0266F, -1.7575F);
		Head_r5.setTextureOffset(22, 22).addBox(-1.5594F, -0.7617F, -0.9168F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r6 = new ModelRenderer(this);
		Head_r6.setRotationPoint(2.4238F, -0.6771F, -2.3575F);
		bone2.addChild(Head_r6);
		setRotationAngle(Head_r6, -0.4308F, 0.111F, -1.2618F);
		Head_r6.setTextureOffset(18, 18).addBox(-1.9F, -1.2F, 0.3F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r7 = new ModelRenderer(this);
		Head_r7.setRotationPoint(0.9135F, 1.2671F, -1.353F);
		bone2.addChild(Head_r7);
		setRotationAngle(Head_r7, -0.2843F, 0.2233F, -0.7229F);
		Head_r7.setTextureOffset(10, 16).addBox(-1.4F, -0.7F, -0.2F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r8 = new ModelRenderer(this);
		Head_r8.setRotationPoint(0.7332F, 2.5166F, -0.4896F);
		bone2.addChild(Head_r8);
		setRotationAngle(Head_r8, -0.2612F, 0.2585F, -0.6849F);
		Head_r8.setTextureOffset(24, 4).addBox(-0.3F, -0.3F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Head_r9 = new ModelRenderer(this);
		Head_r9.setRotationPoint(-0.5385F, 2.5348F, 0.0332F);
		bone2.addChild(Head_r9);
		setRotationAngle(Head_r9, -0.1523F, 0.2776F, -0.3376F);
		Head_r9.setTextureOffset(0, 0).addBox(-0.8F, -0.9F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r10 = new ModelRenderer(this);
		Head_r10.setRotationPoint(-1.7266F, 2.6564F, 0.3373F);
		bone2.addChild(Head_r10);
		setRotationAngle(Head_r10, -0.0217F, 0.3717F, 0.1043F);
		Head_r10.setTextureOffset(10, 20).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r11 = new ModelRenderer(this);
		Head_r11.setRotationPoint(-2.9214F, 2.5518F, 0.7645F);
		bone2.addChild(Head_r11);
		setRotationAngle(Head_r11, 0.0366F, 0.4495F, 0.2238F);
		Head_r11.setTextureOffset(24, 0).addBox(-0.5F, -1.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r12 = new ModelRenderer(this);
		Head_r12.setRotationPoint(-4.2668F, 2.4254F, 1.933F);
		bone2.addChild(Head_r12);
		setRotationAngle(Head_r12, 0.1389F, 0.4821F, 0.2889F);
		Head_r12.setTextureOffset(0, 20).addBox(-1.5F, -1.3F, -1.3F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		bone = new ModelRenderer(this);
		bone.setRotationPoint(10.2285F, -11.9522F, -2.5601F);
		Head.addChild(bone);
		

		Head_r13 = new ModelRenderer(this);
		Head_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(Head_r13);
		setRotationAngle(Head_r13, -0.7498F, -0.0584F, -1.7817F);
		Head_r13.setTextureOffset(0, 4).addBox(0.0F, -1.1F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r14 = new ModelRenderer(this);
		Head_r14.setRotationPoint(0.0F, 0.0F, 0.4F);
		bone.addChild(Head_r14);
		setRotationAngle(Head_r14, -0.681F, -0.3474F, -2.1169F);
		Head_r14.setTextureOffset(16, 22).addBox(-0.5F, -0.8F, -1.3F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r15 = new ModelRenderer(this);
		Head_r15.setRotationPoint(3.6596F, 1.4418F, -3.1841F);
		bone.addChild(Head_r15);
		setRotationAngle(Head_r15, -0.6078F, -0.4736F, -2.2994F);
		Head_r15.setTextureOffset(0, 16).addBox(1.8F, -3.2F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r16 = new ModelRenderer(this);
		Head_r16.setRotationPoint(3.6596F, 1.4418F, -3.1841F);
		bone.addChild(Head_r16);
		setRotationAngle(Head_r16, -0.727F, -0.2115F, -1.9509F);
		Head_r16.setTextureOffset(0, 24).addBox(0.1F, -4.0F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r17 = new ModelRenderer(this);
		Head_r17.setRotationPoint(3.6596F, 1.4418F, -2.7841F);
		bone.addChild(Head_r17);
		setRotationAngle(Head_r17, -0.7516F, -0.0108F, -1.7307F);
		Head_r17.setTextureOffset(22, 22).addBox(-1.5F, -3.7F, -1.3F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r18 = new ModelRenderer(this);
		Head_r18.setRotationPoint(2.9353F, 3.86F, -2.1804F);
		bone.addChild(Head_r18);
		setRotationAngle(Head_r18, -0.6276F, 0.4452F, -1.1834F);
		Head_r18.setTextureOffset(18, 18).addBox(-2.6F, -2.8F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r19 = new ModelRenderer(this);
		Head_r19.setRotationPoint(0.21F, 7.3647F, 1.0969F);
		bone.addChild(Head_r19);
		setRotationAngle(Head_r19, -0.5213F, 0.569F, -0.9656F);
		Head_r19.setTextureOffset(10, 16).addBox(-0.2F, -1.9F, -1.3F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r20 = new ModelRenderer(this);
		Head_r20.setRotationPoint(-0.9112F, 7.4157F, 1.5098F);
		bone.addChild(Head_r20);
		setRotationAngle(Head_r20, -0.1962F, 0.5521F, -0.2826F);
		Head_r20.setTextureOffset(24, 4).addBox(0.1F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, 0.0F, false);

		Head_r21 = new ModelRenderer(this);
		Head_r21.setRotationPoint(0.21F, 7.3647F, 1.4969F);
		bone.addChild(Head_r21);
		setRotationAngle(Head_r21, -0.1548F, 0.4581F, -0.2028F);
		Head_r21.setTextureOffset(0, 0).addBox(-2.5F, -1.6F, -1.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r22 = new ModelRenderer(this);
		Head_r22.setRotationPoint(-2.4853F, 7.1609F, 2.2069F);
		bone.addChild(Head_r22);
		setRotationAngle(Head_r22, -0.0059F, 0.2775F, 0.2589F);
		Head_r22.setTextureOffset(24, 0).addBox(-1.8F, -0.9F, -1.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r23 = new ModelRenderer(this);
		Head_r23.setRotationPoint(-2.4853F, 7.1609F, 2.2069F);
		bone.addChild(Head_r23);
		setRotationAngle(Head_r23, -0.0406F, 0.2747F, 0.1319F);
		Head_r23.setTextureOffset(10, 20).addBox(-1.4F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);

		Head_r24 = new ModelRenderer(this);
		Head_r24.setRotationPoint(-4.9976F, 6.5099F, 2.5601F);
		bone.addChild(Head_r24);
		setRotationAngle(Head_r24, 0.0F, 0.0F, 0.3665F);
		Head_r24.setTextureOffset(0, 20).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 2.0F, 2.0F, 0.0F, false);
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha)
	{
		this.Head.copyFrom(this.head);
		this.Head.render(matrixStack, buffer, packedLight, packedOverlay, 1, 1, 1, 1);

	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch)
	{
		super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
	}

	@Override
	public void renderFirstPersonArm(MatrixStack matrixStack, IVertexBuilder vertex, int packedLight, int overlay, float red, float green, float blue, float alpha, HandSide side) {}

	@Override
	public void renderFirstPersonLeg(MatrixStack matrixStack, IVertexBuilder vertex, int packedLight, int overlay, float red, float green, float blue, float alpha, HandSide side) {}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}
