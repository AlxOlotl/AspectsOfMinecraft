package com.alxolotl.aspect.entity.client;


import com.alxolotl.aspect.entity.custom.MammotitanEntity;
import com.alxolotl.aspect.entity.animations.MammotitanAnimationsDefinitions;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;


import net.minecraft.client.model.HierarchicalModel;

import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;



public class MammotitanModel<T extends MammotitanEntity> extends HierarchicalModel<T> {



	private final ModelPart mammotitan;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart right_leg;
	private final ModelPart left_leg;
	private final ModelPart right_arm;
	private final ModelPart left_arm;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart head;
	private final ModelPart brow;
	private final ModelPart trunk;
	private final ModelPart bunk;
	private final ModelPart trunk2;
	private final ModelPart bunk2;
	private final ModelPart trunk3;
	private final ModelPart bunk3;
	private final ModelPart trunk4;
	private final ModelPart bunk4;
	private final ModelPart right_ear;
	private final ModelPart left_ear;
	private final ModelPart left_tusk;
	private final ModelPart left_iciclet;
	private final ModelPart left_icicleb;
	private final ModelPart right_tusk;
	private final ModelPart right_iciclet;
	private final ModelPart right_icicleb;

	public MammotitanModel(ModelPart root) {
		this.mammotitan = root.getChild("mammotitan");
		this.body = this.mammotitan.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body.getChild("body3");
		this.right_leg = this.body.getChild("right_leg");
		this.left_leg = this.body.getChild("left_leg");
		this.right_arm = this.body.getChild("right_arm");
		this.left_arm = this.body.getChild("left_arm");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.head = this.mammotitan.getChild("head");
		this.brow = this.head.getChild("brow");
		this.trunk = this.head.getChild("trunk");
		this.bunk = this.trunk.getChild("bunk");
		this.trunk2 = this.trunk.getChild("trunk2");
		this.bunk2 = this.trunk2.getChild("bunk2");
		this.trunk3 = this.trunk2.getChild("trunk3");
		this.bunk3 = this.trunk3.getChild("bunk3");
		this.trunk4 = this.trunk3.getChild("trunk4");
		this.bunk4 = this.trunk4.getChild("bunk4");
		this.right_ear = this.head.getChild("right_ear");
		this.left_ear = this.head.getChild("left_ear");
		this.left_tusk = this.head.getChild("left_tusk");
		this.left_iciclet = this.left_tusk.getChild("left_iciclet");
		this.left_icicleb = this.left_tusk.getChild("left_icicleb");
		this.right_tusk = this.head.getChild("right_tusk");
		this.right_iciclet = this.right_tusk.getChild("right_iciclet");
		this.right_icicleb = this.right_tusk.getChild("right_icicleb");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition mammotitan = partdefinition.addOrReplaceChild("mammotitan", CubeListBuilder.create(), PartPose.offset(0.0F, -49.0F, 0.0F));

		PartDefinition body = mammotitan.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 72.5833F, 3.1667F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(0, 0).addBox(-31.0F, -37.1667F, -54.0F, 62.0F, 72.0F, 54.0F, new CubeDeformation(0.0F))
		.texOffs(0, 127).addBox(-32.0F, 18.8333F, -55.0F, 64.0F, 27.0F, 56.0F, new CubeDeformation(0.0F))
		.texOffs(0, 211).addBox(-32.0F, -38.1667F, -55.0F, 64.0F, 24.0F, 56.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -69.4167F, -0.1667F));

		PartDefinition body3 = body.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(241, 113).addBox(-26.0F, -26.0F, -1.0F, 50.0F, 20.0F, 56.0F, new CubeDeformation(0.0F))
		.texOffs(241, 190).addBox(-26.0F, 20.0F, 1.0F, 50.0F, 24.0F, 54.0F, new CubeDeformation(0.0F))
		.texOffs(233, 0).addBox(-25.0F, -25.0F, 0.0F, 48.0F, 58.0F, 54.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, -67.5833F, -0.1667F));

		PartDefinition right_leg = body.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(101, 374).addBox(-11.0F, 0.0F, -12.0F, 22.0F, 45.0F, 24.0F, new CubeDeformation(0.0F))
		.texOffs(53, 471).addBox(-13.0F, 35.0F, -14.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(210, 316).addBox(-4.0F, 33.0F, -15.0F, 8.0F, 12.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(472, 358).addBox(5.0F, 35.0F, -14.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(360, 474).addBox(-12.0F, 37.0F, -5.0F, 1.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(377, 474).addBox(11.0F, 37.0F, -5.0F, 1.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 384).addBox(-12.0F, -1.0F, -13.0F, 24.0F, 19.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offset(-19.0F, -44.5833F, 40.8333F));

		PartDefinition left_leg = body.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(101, 374).mirror().addBox(-11.0F, 0.0F, -12.0F, 22.0F, 45.0F, 24.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(53, 471).mirror().addBox(5.0F, 35.0F, -14.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(210, 316).mirror().addBox(-4.0F, 33.0F, -15.0F, 8.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(472, 358).mirror().addBox(-13.0F, 35.0F, -14.0F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(360, 474).mirror().addBox(11.0F, 37.0F, -5.0F, 1.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(377, 474).mirror().addBox(-12.0F, 37.0F, -5.0F, 1.0F, 8.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(0, 384).mirror().addBox(-12.0F, -1.0F, -13.0F, 24.0F, 19.0F, 26.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(19.0F, -44.5833F, 40.8333F));

		PartDefinition right_arm = body.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(0, 292).addBox(-12.0F, 0.0F, -13.0F, 24.0F, 65.0F, 26.0F, new CubeDeformation(0.0F))
		.texOffs(454, 163).addBox(-14.0F, 54.0F, -15.0F, 9.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(162, 468).addBox(-4.0F, 52.0F, -16.0F, 8.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(471, 303).addBox(5.0F, 54.0F, -15.0F, 9.0F, 11.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(322, 473).addBox(12.0F, 56.0F, -5.0F, 1.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(341, 473).addBox(-13.0F, 56.0F, -5.0F, 1.0F, 9.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(363, 332).addBox(-13.0F, -1.0F, -14.0F, 26.0F, 27.0F, 28.0F, new CubeDeformation(0.0F)), PartPose.offset(-26.0F, -64.5833F, -38.1667F));

		PartDefinition left_arm = body.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(0, 292).mirror().addBox(-12.0F, 0.0F, -13.0F, 24.0F, 65.0F, 26.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(454, 163).mirror().addBox(5.0F, 54.0F, -15.0F, 9.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(162, 468).mirror().addBox(-4.0F, 52.0F, -16.0F, 8.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(471, 303).mirror().addBox(-14.0F, 54.0F, -15.0F, 9.0F, 11.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(322, 473).mirror().addBox(-13.0F, 56.0F, -5.0F, 1.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(341, 473).mirror().addBox(12.0F, 56.0F, -5.0F, 1.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(363, 332).mirror().addBox(-13.0F, -1.0F, -14.0F, 26.0F, 27.0F, 28.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(26.0F, -64.5833F, -38.1667F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(194, 395).addBox(-7.0F, -6.0F, 0.0F, 14.0F, 18.0F, 27.0F, new CubeDeformation(0.0F))
		.texOffs(0, 430).addBox(-8.0F, 4.0F, 0.0F, 16.0F, 13.0F, 27.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -79.5833F, 53.8333F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(245, 441).addBox(-9.0F, -7.0F, 0.0F, 18.0F, 20.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(0, 471).addBox(-9.0F, -7.0F, 20.0F, 18.0F, 20.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 27.0F));

		PartDefinition head = mammotitan.addOrReplaceChild("head", CubeListBuilder.create().texOffs(101, 332).addBox(-21.0F, -19.0F, -31.0F, 42.0F, 9.0F, 32.0F, new CubeDeformation(0.0F))
		.texOffs(101, 292).addBox(-17.0F, -29.0F, -23.0F, 34.0F, 7.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(438, 49).addBox(-15.0F, -29.0F, -21.0F, 30.0F, 13.0F, 16.0F, new CubeDeformation(0.0F))
		.texOffs(241, 269).addBox(-20.0F, -18.0F, -26.0F, 40.0F, 36.0F, 26.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -14.0F, -51.0F));

		PartDefinition brow = head.addOrReplaceChild("brow", CubeListBuilder.create().texOffs(194, 374).mirror().addBox(1.0F, -5.0F, -4.0F, 19.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(194, 374).addBox(-20.0F, -5.0F, -4.0F, 19.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -12.0F, -26.0F));

		PartDefinition trunk = head.addOrReplaceChild("trunk", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, -28.0F));

		PartDefinition bunk = trunk.addOrReplaceChild("bunk", CubeListBuilder.create().texOffs(450, 190).addBox(-8.0F, -10.0F, -8.0F, 16.0F, 21.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 4.0F));

		PartDefinition trunk2 = trunk.addOrReplaceChild("trunk2", CubeListBuilder.create(), PartPose.offset(0.0F, 18.0F, 2.5F));

		PartDefinition bunk2 = trunk2.addOrReplaceChild("bunk2", CubeListBuilder.create().texOffs(451, 228).addBox(-7.5F, -10.0F, -8.0F, 15.0F, 21.0F, 15.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 2.0F));

		PartDefinition trunk3 = trunk2.addOrReplaceChild("trunk3", CubeListBuilder.create(), PartPose.offset(0.0F, 19.0F, 2.5F));

		PartDefinition bunk3 = trunk3.addOrReplaceChild("bunk3", CubeListBuilder.create().texOffs(455, 390).addBox(-7.0F, -10.0F, -8.0F, 14.0F, 21.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 0.0F));

		PartDefinition trunk4 = trunk3.addOrReplaceChild("trunk4", CubeListBuilder.create(), PartPose.offset(0.0F, 17.0F, -3.0F));

		PartDefinition bunk4 = trunk4.addOrReplaceChild("bunk4", CubeListBuilder.create().texOffs(210, 292).addBox(4.0F, 1.0F, -11.0F, 6.0F, 15.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(322, 441).addBox(-3.0F, -3.0F, -12.0F, 6.0F, 20.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(162, 444).addBox(-10.0F, 1.0F, -11.0F, 6.0F, 15.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(438, 0).addBox(-9.0F, -14.0F, -10.0F, 18.0F, 28.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(131, 320).addBox(5.0F, 9.0F, 10.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(142, 320).addBox(-7.0F, 9.0F, 10.0F, 2.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(411, 474).addBox(-7.0F, 0.0F, 10.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(394, 474).addBox(5.0F, 0.0F, 10.0F, 2.0F, 7.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(116, 320).addBox(-7.0F, -8.0F, 10.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(101, 320).addBox(5.0F, -8.0F, 10.0F, 2.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(164, 320).addBox(-7.0F, -14.0F, 10.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(153, 320).addBox(5.0F, -14.0F, 10.0F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, 3.0F));

		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(447, 433).addBox(-30.0F, -1.0F, -4.0F, 30.0F, 30.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(454, 105).addBox(-29.0F, 0.0F, -3.0F, 30.0F, 24.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-20.0F, -16.0F, -10.0F));

		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(447, 433).mirror().addBox(0.0F, -1.0F, -4.0F, 30.0F, 30.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(454, 105).mirror().addBox(-1.0F, 0.0F, -3.0F, 30.0F, 24.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(20.0F, -16.0F, -10.0F));

		PartDefinition left_tusk = head.addOrReplaceChild("left_tusk", CubeListBuilder.create().texOffs(454, 134).mirror().addBox(-6.0F, 0.0F, -5.5F, 12.0F, 11.0F, 17.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(194, 441).mirror().addBox(-5.0F, 11.0F, -4.5F, 10.0F, 55.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(438, 79).mirror().addBox(5.0F, 29.0F, -4.5F, 22.0F, 10.0F, 15.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(363, 388).mirror().addBox(27.0F, 29.0F, -23.5F, 10.0F, 10.0F, 34.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(471, 264).mirror().addBox(27.0F, 11.0F, -33.5F, 10.0F, 28.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(87, 444).mirror().addBox(-5.0F, 52.0F, -31.5F, 10.0F, 14.0F, 27.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(447, 470).mirror().addBox(-5.0F, 34.0F, -41.5F, 10.0F, 32.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(472, 341).mirror().addBox(27.0F, 11.0F, -23.5F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(472, 324).mirror().addBox(-5.0F, 34.0F, -31.5F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(15.0F, 8.0F, -22.5F, -0.1745F, -0.1309F, -0.4363F));

		PartDefinition left_iciclet = left_tusk.addOrReplaceChild("left_iciclet", CubeListBuilder.create(), PartPose.offset(29.75F, 36.0F, -11.0F));

		PartDefinition cube_r1 = left_iciclet.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(374, 269).mirror().addBox(-4.0F, 0.0F, -22.0F, 4.0F, 10.0F, 44.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition left_icicleb = left_tusk.addOrReplaceChild("left_icicleb", CubeListBuilder.create(), PartPose.offset(-2.25F, 63.0F, -15.0F));

		PartDefinition cube_r2 = left_icicleb.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(250, 332).mirror().addBox(-4.0F, 0.0F, -26.0F, 4.0F, 10.0F, 52.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition right_tusk = head.addOrReplaceChild("right_tusk", CubeListBuilder.create().texOffs(454, 134).addBox(-6.0F, 0.0F, -5.5F, 12.0F, 11.0F, 17.0F, new CubeDeformation(0.0F))
		.texOffs(194, 441).addBox(-5.0F, 11.0F, -4.5F, 10.0F, 55.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(438, 79).addBox(-27.0F, 29.0F, -4.5F, 22.0F, 10.0F, 15.0F, new CubeDeformation(0.0F))
		.texOffs(363, 388).addBox(-37.0F, 29.0F, -23.5F, 10.0F, 10.0F, 34.0F, new CubeDeformation(0.0F))
		.texOffs(471, 264).addBox(-37.0F, 11.0F, -33.5F, 10.0F, 28.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(87, 444).addBox(-5.0F, 52.0F, -31.5F, 10.0F, 14.0F, 27.0F, new CubeDeformation(0.0F))
		.texOffs(447, 470).addBox(-5.0F, 34.0F, -41.5F, 10.0F, 32.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(472, 341).addBox(-37.0F, 11.0F, -23.5F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(472, 324).addBox(-5.0F, 34.0F, -31.5F, 10.0F, 6.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0F, 8.0F, -22.5F, -0.1745F, 0.1309F, 0.4363F));

		PartDefinition right_iciclet = right_tusk.addOrReplaceChild("right_iciclet", CubeListBuilder.create(), PartPose.offset(-29.75F, 36.0F, -11.5F));

		PartDefinition cube_r3 = right_iciclet.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(374, 269).addBox(0.0F, 0.0F, -22.0F, 4.0F, 10.0F, 44.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.0F, 0.5F, 0.0F, 0.0F, -0.4363F));

		PartDefinition right_icicleb = right_tusk.addOrReplaceChild("right_icicleb", CubeListBuilder.create(), PartPose.offset(2.25F, 63.0F, -15.5F));

		PartDefinition cube_r4 = right_icicleb.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(250, 332).addBox(0.0F, 0.0F, -26.0F, 4.0F, 10.0F, 52.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 3.0F, 0.5F, 0.0F, 0.0F, -0.4363F));

		return LayerDefinition.create(meshdefinition, 544, 544);
	}


	@Override
	public void setupAnim(MammotitanEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	this.root().getAllParts().forEach(ModelPart::resetPose);
		this.animateWalk(MammotitanAnimationsDefinitions.MAMMOTITAN_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, MammotitanAnimationsDefinitions.MAMMOTITAN_IDLE,ageInTicks, 1.0f);

	}



	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		mammotitan.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return mammotitan;
	}



}