// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modeldavaros<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "davaros"), "main");
	private final ModelPart Torso;
	private final ModelPart head;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart body;
	private final ModelPart Skirt;
	private final ModelPart bulbs;

	public Modeldavaros(ModelPart root) {
		this.Torso = root.getChild("Torso");
		this.head = this.Torso.getChild("head");
		this.right_arm = this.Torso.getChild("right_arm");
		this.left_arm = this.Torso.getChild("left_arm");
		this.body = this.Torso.getChild("body");
		this.Skirt = root.getChild("Skirt");
		this.bulbs = this.Skirt.getChild("bulbs");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Torso = partdefinition.addOrReplaceChild("Torso", CubeListBuilder.create(),
				PartPose.offset(0.0F, 13.0F, 1.0F));

		PartDefinition head = Torso.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(53, 2)
						.addBox(-4.0F, -8.0F, -5.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 21)
						.addBox(-6.0F, -10.0F, -1.0F, 12.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 2.0F));

		PartDefinition right_arm = Torso.addOrReplaceChild("right_arm",
				CubeListBuilder.create().texOffs(95, 47).mirror()
						.addBox(-3.0F, -3.0F, -1.5F, 3.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-4.0F, -9.0F, 1.0F, -1.0908F, 0.0F, 0.0F));

		PartDefinition left_arm = Torso.addOrReplaceChild("left_arm",
				CubeListBuilder.create().texOffs(108, 47).mirror()
						.addBox(1.0F, -3.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(2.0F, -9.0F, 1.0F));

		PartDefinition body = Torso.addOrReplaceChild("body",
				CubeListBuilder.create().texOffs(69, 20)
						.addBox(-4.0F, -3.0F, -4.0F, 8.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(53, 43)
						.addBox(-4.0F, -3.0F, -4.0F, 8.0F, 9.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offset(0.0F, -9.0F, 2.0F));

		PartDefinition Skirt = partdefinition.addOrReplaceChild("Skirt",
				CubeListBuilder.create().texOffs(-1, 18)
						.addBox(3.0F, -2.1F, -5.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(-1, 20)
						.addBox(5.0F, -2.1F, -6.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-6.0F, -4.0F, -6.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-3.0F, -4.0F, -6.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 9)
						.addBox(-1.0F, -3.0F, -6.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 81)
						.addBox(-6.5F, 11.0F, -8.0F, 13.0F, 1.0F, 15.0F, new CubeDeformation(0.0F)).texOffs(0, 62)
						.addBox(-5.5F, 5.0F, -7.0F, 11.0F, 6.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(0, 45)
						.addBox(-5.5F, 0.0F, -6.0F, 11.0F, 5.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-6.5F, -2.0F, -7.0F, 13.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(12, 0)
						.addBox(-6.0F, -21.0F, 6.0F, 12.0F, 19.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 12.0F, 1.0F));

		PartDefinition bulbs = Skirt.addOrReplaceChild("bulbs",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-6.0F, 7.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 7.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 7.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 7.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 2.0F, -5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 2.0F, -2.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 2.0F, 1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, 2.0F, 4.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = bulbs.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, 1.5F, -5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.5F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.5F, 3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.5F, 3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.5F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.5F, -5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.5F, 5.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r2 = bulbs.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -6.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r3 = bulbs.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -1.0F, 3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 3.0F, -5.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r4 = bulbs.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-1.0F, 1.5F, -5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.5F, -5.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.5F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.5F, -2.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.5F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.5F, 0.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, -3.5F, 3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-1.0F, 1.5F, 3.5F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, 5.5F, 0.5F, 0.0F, 3.1416F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Skirt.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
		this.right_arm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.left_arm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}