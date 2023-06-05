package net.mcreator.cbrmodschallenges.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.cbrmodschallenges.init.CbrmodsChallengesModItems;
import net.mcreator.cbrmodschallenges.CbrmodsChallengesMod;

import java.util.ArrayList;

public class ShotonphoneProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cbrmods_challenges:shotoniphone")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("cbrmods_challenges:shotoniphone")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("\"Shot on iPhone\" challenge has been summoned! Kill everyone with the iPhone given to you within 1 minutes!"), false);
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (entityiterator instanceof Player _player) {
				ItemStack _setstack = new ItemStack(CbrmodsChallengesModItems.IPHONE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		CbrmodsChallengesMod.queueServerWork(20, () -> {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (entityiterator instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("01:00"), true);
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			CbrmodsChallengesMod.queueServerWork(20, () -> {
				for (Entity entityiterator : new ArrayList<>(world.players())) {
					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("59"), true);
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				CbrmodsChallengesMod.queueServerWork(20, () -> {
					for (Entity entityiterator : new ArrayList<>(world.players())) {
						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("58"), true);
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					CbrmodsChallengesMod.queueServerWork(20, () -> {
						for (Entity entityiterator : new ArrayList<>(world.players())) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("57"), true);
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						CbrmodsChallengesMod.queueServerWork(20, () -> {
							for (Entity entityiterator : new ArrayList<>(world.players())) {
								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
									_player.displayClientMessage(Component.literal("56"), true);
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							CbrmodsChallengesMod.queueServerWork(20, () -> {
								for (Entity entityiterator : new ArrayList<>(world.players())) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("55"), true);
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								CbrmodsChallengesMod.queueServerWork(20, () -> {
									for (Entity entityiterator : new ArrayList<>(world.players())) {
										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
											_player.displayClientMessage(Component.literal("54"), true);
									}
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
										}
									}
									CbrmodsChallengesMod.queueServerWork(20, () -> {
										for (Entity entityiterator : new ArrayList<>(world.players())) {
											if (entityiterator instanceof Player _player && !_player.level.isClientSide())
												_player.displayClientMessage(Component.literal("53"), true);
										}
										if (world instanceof Level _level) {
											if (!_level.isClientSide()) {
												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
											} else {
												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
											}
										}
										CbrmodsChallengesMod.queueServerWork(20, () -> {
											for (Entity entityiterator : new ArrayList<>(world.players())) {
												if (entityiterator instanceof Player _player && !_player.level.isClientSide())
													_player.displayClientMessage(Component.literal("52"), true);
											}
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
												}
											}
											CbrmodsChallengesMod.queueServerWork(20, () -> {
												for (Entity entityiterator : new ArrayList<>(world.players())) {
													if (entityiterator instanceof Player _player && !_player.level.isClientSide())
														_player.displayClientMessage(Component.literal("51"), true);
												}
												if (world instanceof Level _level) {
													if (!_level.isClientSide()) {
														_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
													} else {
														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
													}
												}
												CbrmodsChallengesMod.queueServerWork(20, () -> {
													for (Entity entityiterator : new ArrayList<>(world.players())) {
														if (entityiterator instanceof Player _player && !_player.level.isClientSide())
															_player.displayClientMessage(Component.literal("50"), true);
													}
													if (world instanceof Level _level) {
														if (!_level.isClientSide()) {
															_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
														} else {
															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
														}
													}
													CbrmodsChallengesMod.queueServerWork(20, () -> {
														for (Entity entityiterator : new ArrayList<>(world.players())) {
															if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																_player.displayClientMessage(Component.literal("49"), true);
														}
														if (world instanceof Level _level) {
															if (!_level.isClientSide()) {
																_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
															} else {
																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
															}
														}
														CbrmodsChallengesMod.queueServerWork(20, () -> {
															for (Entity entityiterator : new ArrayList<>(world.players())) {
																if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																	_player.displayClientMessage(Component.literal("48"), true);
															}
															if (world instanceof Level _level) {
																if (!_level.isClientSide()) {
																	_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																} else {
																	_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																}
															}
															CbrmodsChallengesMod.queueServerWork(20, () -> {
																for (Entity entityiterator : new ArrayList<>(world.players())) {
																	if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																		_player.displayClientMessage(Component.literal("47"), true);
																}
																if (world instanceof Level _level) {
																	if (!_level.isClientSide()) {
																		_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																	} else {
																		_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																	}
																}
																CbrmodsChallengesMod.queueServerWork(20, () -> {
																	for (Entity entityiterator : new ArrayList<>(world.players())) {
																		if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																			_player.displayClientMessage(Component.literal("46"), true);
																	}
																	if (world instanceof Level _level) {
																		if (!_level.isClientSide()) {
																			_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																		} else {
																			_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																		}
																	}
																	CbrmodsChallengesMod.queueServerWork(20, () -> {
																		for (Entity entityiterator : new ArrayList<>(world.players())) {
																			if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																				_player.displayClientMessage(Component.literal("45"), true);
																		}
																		if (world instanceof Level _level) {
																			if (!_level.isClientSide()) {
																				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																			} else {
																				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																			}
																		}
																		CbrmodsChallengesMod.queueServerWork(20, () -> {
																			for (Entity entityiterator : new ArrayList<>(world.players())) {
																				if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																					_player.displayClientMessage(Component.literal("44"), true);
																			}
																			if (world instanceof Level _level) {
																				if (!_level.isClientSide()) {
																					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																				} else {
																					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																				}
																			}
																			CbrmodsChallengesMod.queueServerWork(20, () -> {
																				for (Entity entityiterator : new ArrayList<>(world.players())) {
																					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																						_player.displayClientMessage(Component.literal("43"), true);
																				}
																				if (world instanceof Level _level) {
																					if (!_level.isClientSide()) {
																						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																					} else {
																						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																					}
																				}
																				CbrmodsChallengesMod.queueServerWork(20, () -> {
																					for (Entity entityiterator : new ArrayList<>(world.players())) {
																						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																							_player.displayClientMessage(Component.literal("42"), true);
																					}
																					if (world instanceof Level _level) {
																						if (!_level.isClientSide()) {
																							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1,
																									1);
																						} else {
																							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																						}
																					}
																					CbrmodsChallengesMod.queueServerWork(20, () -> {
																						for (Entity entityiterator : new ArrayList<>(world.players())) {
																							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																								_player.displayClientMessage(Component.literal("41"), true);
																						}
																						if (world instanceof Level _level) {
																							if (!_level.isClientSide()) {
																								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL,
																										1, 1);
																							} else {
																								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																							}
																						}
																						CbrmodsChallengesMod.queueServerWork(20, () -> {
																							for (Entity entityiterator : new ArrayList<>(world.players())) {
																								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																									_player.displayClientMessage(Component.literal("40"), true);
																							}
																							if (world instanceof Level _level) {
																								if (!_level.isClientSide()) {
																									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																											SoundSource.NEUTRAL, 1, 1);
																								} else {
																									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																								}
																							}
																							CbrmodsChallengesMod.queueServerWork(20, () -> {
																								for (Entity entityiterator : new ArrayList<>(world.players())) {
																									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																										_player.displayClientMessage(Component.literal("39"), true);
																								}
																								if (world instanceof Level _level) {
																									if (!_level.isClientSide()) {
																										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																												SoundSource.NEUTRAL, 1, 1);
																									} else {
																										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1, false);
																									}
																								}
																								CbrmodsChallengesMod.queueServerWork(20, () -> {
																									for (Entity entityiterator : new ArrayList<>(world.players())) {
																										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																											_player.displayClientMessage(Component.literal("38"), true);
																									}
																									if (world instanceof Level _level) {
																										if (!_level.isClientSide()) {
																											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																													SoundSource.NEUTRAL, 1, 1);
																										} else {
																											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1,
																													false);
																										}
																									}
																									CbrmodsChallengesMod.queueServerWork(20, () -> {
																										for (Entity entityiterator : new ArrayList<>(world.players())) {
																											if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																												_player.displayClientMessage(Component.literal("37"), true);
																										}
																										if (world instanceof Level _level) {
																											if (!_level.isClientSide()) {
																												_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																														SoundSource.NEUTRAL, 1, 1);
																											} else {
																												_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1,
																														false);
																											}
																										}
																										CbrmodsChallengesMod.queueServerWork(20, () -> {
																											for (Entity entityiterator : new ArrayList<>(world.players())) {
																												if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																													_player.displayClientMessage(Component.literal("36"), true);
																											}
																											if (world instanceof Level _level) {
																												if (!_level.isClientSide()) {
																													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																															SoundSource.NEUTRAL, 1, 1);
																												} else {
																													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1,
																															1, false);
																												}
																											}
																											CbrmodsChallengesMod.queueServerWork(20, () -> {
																												for (Entity entityiterator : new ArrayList<>(world.players())) {
																													if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																														_player.displayClientMessage(Component.literal("35"), true);
																												}
																												if (world instanceof Level _level) {
																													if (!_level.isClientSide()) {
																														_level.playSound(null, BlockPos.containing(x, y, z),
																																ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																													} else {
																														_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																SoundSource.NEUTRAL, 1, 1, false);
																													}
																												}
																												CbrmodsChallengesMod.queueServerWork(20, () -> {
																													for (Entity entityiterator : new ArrayList<>(world.players())) {
																														if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																															_player.displayClientMessage(Component.literal("34"), true);
																													}
																													if (world instanceof Level _level) {
																														if (!_level.isClientSide()) {
																															_level.playSound(null, BlockPos.containing(x, y, z),
																																	ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																														} else {
																															_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																	SoundSource.NEUTRAL, 1, 1, false);
																														}
																													}
																													CbrmodsChallengesMod.queueServerWork(20, () -> {
																														for (Entity entityiterator : new ArrayList<>(world.players())) {
																															if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																_player.displayClientMessage(Component.literal("33"), true);
																														}
																														if (world instanceof Level _level) {
																															if (!_level.isClientSide()) {
																																_level.playSound(null, BlockPos.containing(x, y, z),
																																		ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																															} else {
																																_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																		SoundSource.NEUTRAL, 1, 1, false);
																															}
																														}
																														CbrmodsChallengesMod.queueServerWork(20, () -> {
																															for (Entity entityiterator : new ArrayList<>(world.players())) {
																																if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																	_player.displayClientMessage(Component.literal("32"), true);
																															}
																															if (world instanceof Level _level) {
																																if (!_level.isClientSide()) {
																																	_level.playSound(null, BlockPos.containing(x, y, z),
																																			ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1, 1);
																																} else {
																																	_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																			SoundSource.NEUTRAL, 1, 1, false);
																																}
																															}
																															CbrmodsChallengesMod.queueServerWork(20, () -> {
																																for (Entity entityiterator : new ArrayList<>(world.players())) {
																																	if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																		_player.displayClientMessage(Component.literal("31"), true);
																																}
																																if (world instanceof Level _level) {
																																	if (!_level.isClientSide()) {
																																		_level.playSound(null, BlockPos.containing(x, y, z),
																																				ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1,
																																				1);
																																	} else {
																																		_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																				SoundSource.NEUTRAL, 1, 1, false);
																																	}
																																}
																																CbrmodsChallengesMod.queueServerWork(20, () -> {
																																	for (Entity entityiterator : new ArrayList<>(world.players())) {
																																		if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																			_player.displayClientMessage(Component.literal("30"), true);
																																	}
																																	if (world instanceof Level _level) {
																																		if (!_level.isClientSide()) {
																																			_level.playSound(null, BlockPos.containing(x, y, z),
																																					ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL,
																																					1, 1);
																																		} else {
																																			_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																					SoundSource.NEUTRAL, 1, 1, false);
																																		}
																																	}
																																	CbrmodsChallengesMod.queueServerWork(20, () -> {
																																		for (Entity entityiterator : new ArrayList<>(world.players())) {
																																			if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																				_player.displayClientMessage(Component.literal("29"), true);
																																		}
																																		if (!world.isClientSide() && world.getServer() != null)
																																			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("30 seconds remaining!"), false);
																																		if (world instanceof Level _level) {
																																			if (!_level.isClientSide()) {
																																				_level.playSound(null, BlockPos.containing(x, y, z),
																																						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																						SoundSource.NEUTRAL, 1, 1);
																																			} else {
																																				_level.playLocalSound(x, y, z,
																																						ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																						SoundSource.NEUTRAL, 1, 1, false);
																																			}
																																		}
																																		CbrmodsChallengesMod.queueServerWork(20, () -> {
																																			for (Entity entityiterator : new ArrayList<>(world.players())) {
																																				if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																					_player.displayClientMessage(Component.literal("28"), true);
																																			}
																																			if (world instanceof Level _level) {
																																				if (!_level.isClientSide()) {
																																					_level.playSound(null, BlockPos.containing(x, y, z),
																																							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																							SoundSource.NEUTRAL, 1, 1);
																																				} else {
																																					_level.playLocalSound(x, y, z,
																																							ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																							SoundSource.NEUTRAL, 1, 1, false);
																																				}
																																			}
																																			CbrmodsChallengesMod.queueServerWork(20, () -> {
																																				for (Entity entityiterator : new ArrayList<>(world.players())) {
																																					if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																						_player.displayClientMessage(Component.literal("27"), true);
																																				}
																																				if (world instanceof Level _level) {
																																					if (!_level.isClientSide()) {
																																						_level.playSound(null, BlockPos.containing(x, y, z),
																																								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																								SoundSource.NEUTRAL, 1, 1);
																																					} else {
																																						_level.playLocalSound(x, y, z,
																																								ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																								SoundSource.NEUTRAL, 1, 1, false);
																																					}
																																				}
																																				CbrmodsChallengesMod.queueServerWork(20, () -> {
																																					for (Entity entityiterator : new ArrayList<>(world.players())) {
																																						if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																							_player.displayClientMessage(Component.literal("26"), true);
																																					}
																																					if (world instanceof Level _level) {
																																						if (!_level.isClientSide()) {
																																							_level.playSound(null, BlockPos.containing(x, y, z),
																																									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																									SoundSource.NEUTRAL, 1, 1);
																																						} else {
																																							_level.playLocalSound(x, y, z,
																																									ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																									SoundSource.NEUTRAL, 1, 1, false);
																																						}
																																					}
																																					CbrmodsChallengesMod.queueServerWork(20, () -> {
																																						for (Entity entityiterator : new ArrayList<>(world.players())) {
																																							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																								_player.displayClientMessage(Component.literal("25"), true);
																																						}
																																						if (world instanceof Level _level) {
																																							if (!_level.isClientSide()) {
																																								_level.playSound(null, BlockPos.containing(x, y, z),
																																										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																										SoundSource.NEUTRAL, 1, 1);
																																							} else {
																																								_level.playLocalSound(x, y, z,
																																										ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("ui.button.click")),
																																										SoundSource.NEUTRAL, 1, 1, false);
																																							}
																																						}
																																						CbrmodsChallengesMod.queueServerWork(20, () -> {
																																							for (Entity entityiterator : new ArrayList<>(world.players())) {
																																								if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																									_player.displayClientMessage(Component.literal("24"), true);
																																							}
																																							if (world instanceof Level _level) {
																																								if (!_level.isClientSide()) {
																																									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS
																																											.getValue(new ResourceLocation("ui.button.click")), SoundSource.NEUTRAL, 1,
																																											1);
																																								} else {
																																									_level.playLocalSound(x, y, z,
																																											ForgeRegistries.SOUND_EVENTS
																																													.getValue(new ResourceLocation("ui.button.click")),
																																											SoundSource.NEUTRAL, 1, 1, false);
																																								}
																																							}
																																							CbrmodsChallengesMod.queueServerWork(20, () -> {
																																								for (Entity entityiterator : new ArrayList<>(world.players())) {
																																									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																										_player.displayClientMessage(Component.literal("23"), true);
																																								}
																																								if (world instanceof Level _level) {
																																									if (!_level.isClientSide()) {
																																										_level.playSound(null, BlockPos.containing(x, y, z),
																																												ForgeRegistries.SOUND_EVENTS
																																														.getValue(new ResourceLocation("ui.button.click")),
																																												SoundSource.NEUTRAL, 1, 1);
																																									} else {
																																										_level.playLocalSound(x, y, z,
																																												ForgeRegistries.SOUND_EVENTS
																																														.getValue(new ResourceLocation("ui.button.click")),
																																												SoundSource.NEUTRAL, 1, 1, false);
																																									}
																																								}
																																								CbrmodsChallengesMod.queueServerWork(20, () -> {
																																									for (Entity entityiterator : new ArrayList<>(world.players())) {
																																										if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																											_player.displayClientMessage(Component.literal("22"), true);
																																									}
																																									if (world instanceof Level _level) {
																																										if (!_level.isClientSide()) {
																																											_level.playSound(null, BlockPos.containing(x, y, z),
																																													ForgeRegistries.SOUND_EVENTS
																																															.getValue(new ResourceLocation("ui.button.click")),
																																													SoundSource.NEUTRAL, 1, 1);
																																										} else {
																																											_level.playLocalSound(x, y, z,
																																													ForgeRegistries.SOUND_EVENTS
																																															.getValue(new ResourceLocation("ui.button.click")),
																																													SoundSource.NEUTRAL, 1, 1, false);
																																										}
																																									}
																																									CbrmodsChallengesMod.queueServerWork(20, () -> {
																																										for (Entity entityiterator : new ArrayList<>(world.players())) {
																																											if (entityiterator instanceof Player _player && !_player.level.isClientSide())
																																												_player.displayClientMessage(Component.literal("21"), true);
																																										}
																																										if (world instanceof Level _level) {
																																											if (!_level.isClientSide()) {
																																												_level.playSound(null, BlockPos.containing(x, y, z),
																																														ForgeRegistries.SOUND_EVENTS
																																																.getValue(new ResourceLocation("ui.button.click")),
																																														SoundSource.NEUTRAL, 1, 1);
																																											} else {
																																												_level.playLocalSound(x, y, z,
																																														ForgeRegistries.SOUND_EVENTS
																																																.getValue(new ResourceLocation("ui.button.click")),
																																														SoundSource.NEUTRAL, 1, 1, false);
																																											}
																																										}
																																										CbrmodsChallengesMod.queueServerWork(20, () -> {
																																											for (Entity entityiterator : new ArrayList<>(world.players())) {
																																												if (entityiterator instanceof Player _player
																																														&& !_player.level.isClientSide())
																																													_player.displayClientMessage(Component.literal("20"), true);
																																											}
																																											if (world instanceof Level _level) {
																																												if (!_level.isClientSide()) {
																																													_level.playSound(null, BlockPos.containing(x, y, z),
																																															ForgeRegistries.SOUND_EVENTS
																																																	.getValue(new ResourceLocation("ui.button.click")),
																																															SoundSource.NEUTRAL, 1, 1);
																																												} else {
																																													_level.playLocalSound(x, y, z,
																																															ForgeRegistries.SOUND_EVENTS
																																																	.getValue(new ResourceLocation("ui.button.click")),
																																															SoundSource.NEUTRAL, 1, 1, false);
																																												}
																																											}
																																											CbrmodsChallengesMod.queueServerWork(20, () -> {
																																												for (Entity entityiterator : new ArrayList<>(world.players())) {
																																													if (entityiterator instanceof Player _player
																																															&& !_player.level.isClientSide())
																																														_player.displayClientMessage(Component.literal("19"), true);
																																												}
																																												if (world instanceof Level _level) {
																																													if (!_level.isClientSide()) {
																																														_level.playSound(null, BlockPos.containing(x, y, z),
																																																ForgeRegistries.SOUND_EVENTS.getValue(
																																																		new ResourceLocation("ui.button.click")),
																																																SoundSource.NEUTRAL, 1, 1);
																																													} else {
																																														_level.playLocalSound(x, y, z,
																																																ForgeRegistries.SOUND_EVENTS.getValue(
																																																		new ResourceLocation("ui.button.click")),
																																																SoundSource.NEUTRAL, 1, 1, false);
																																													}
																																												}
																																												if (!world.isClientSide() && world.getServer() != null)
																																													world.getServer().getPlayerList().broadcastSystemMessage(
																																															Component.literal("20 seconds remaining!"), false);
																																												CbrmodsChallengesMod.queueServerWork(20, () -> {
																																													for (Entity entityiterator : new ArrayList<>(world.players())) {
																																														if (entityiterator instanceof Player _player
																																																&& !_player.level.isClientSide())
																																															_player.displayClientMessage(Component.literal("18"), true);
																																													}
																																													if (world instanceof Level _level) {
																																														if (!_level.isClientSide()) {
																																															_level.playSound(null, BlockPos.containing(x, y, z),
																																																	ForgeRegistries.SOUND_EVENTS.getValue(
																																																			new ResourceLocation("ui.button.click")),
																																																	SoundSource.NEUTRAL, 1, 1);
																																														} else {
																																															_level.playLocalSound(x, y, z,
																																																	ForgeRegistries.SOUND_EVENTS.getValue(
																																																			new ResourceLocation("ui.button.click")),
																																																	SoundSource.NEUTRAL, 1, 1, false);
																																														}
																																													}
																																													CbrmodsChallengesMod.queueServerWork(20, () -> {
																																														for (Entity entityiterator : new ArrayList<>(world.players())) {
																																															if (entityiterator instanceof Player _player
																																																	&& !_player.level.isClientSide())
																																																_player.displayClientMessage(Component.literal("17"),
																																																		true);
																																														}
																																														if (world instanceof Level _level) {
																																															if (!_level.isClientSide()) {
																																																_level.playSound(null, BlockPos.containing(x, y, z),
																																																		ForgeRegistries.SOUND_EVENTS.getValue(
																																																				new ResourceLocation("ui.button.click")),
																																																		SoundSource.NEUTRAL, 1, 1);
																																															} else {
																																																_level.playLocalSound(x, y, z,
																																																		ForgeRegistries.SOUND_EVENTS.getValue(
																																																				new ResourceLocation("ui.button.click")),
																																																		SoundSource.NEUTRAL, 1, 1, false);
																																															}
																																														}
																																														CbrmodsChallengesMod.queueServerWork(20, () -> {
																																															for (Entity entityiterator : new ArrayList<>(
																																																	world.players())) {
																																																if (entityiterator instanceof Player _player
																																																		&& !_player.level.isClientSide())
																																																	_player.displayClientMessage(Component.literal("16"),
																																																			true);
																																															}
																																															if (world instanceof Level _level) {
																																																if (!_level.isClientSide()) {
																																																	_level.playSound(null, BlockPos.containing(x, y, z),
																																																			ForgeRegistries.SOUND_EVENTS
																																																					.getValue(new ResourceLocation(
																																																							"ui.button.click")),
																																																			SoundSource.NEUTRAL, 1, 1);
																																																} else {
																																																	_level.playLocalSound(x, y, z,
																																																			ForgeRegistries.SOUND_EVENTS
																																																					.getValue(new ResourceLocation(
																																																							"ui.button.click")),
																																																			SoundSource.NEUTRAL, 1, 1, false);
																																																}
																																															}
																																															CbrmodsChallengesMod.queueServerWork(20, () -> {
																																																for (Entity entityiterator : new ArrayList<>(
																																																		world.players())) {
																																																	if (entityiterator instanceof Player _player
																																																			&& !_player.level.isClientSide())
																																																		_player.displayClientMessage(
																																																				Component.literal("15"), true);
																																																}
																																																if (world instanceof Level _level) {
																																																	if (!_level.isClientSide()) {
																																																		_level.playSound(null,
																																																				BlockPos.containing(x, y, z),
																																																				ForgeRegistries.SOUND_EVENTS
																																																						.getValue(new ResourceLocation(
																																																								"ui.button.click")),
																																																				SoundSource.NEUTRAL, 1, 1);
																																																	} else {
																																																		_level.playLocalSound(x, y, z,
																																																				ForgeRegistries.SOUND_EVENTS
																																																						.getValue(new ResourceLocation(
																																																								"ui.button.click")),
																																																				SoundSource.NEUTRAL, 1, 1, false);
																																																	}
																																																}
																																																CbrmodsChallengesMod.queueServerWork(20, () -> {
																																																	for (Entity entityiterator : new ArrayList<>(
																																																			world.players())) {
																																																		if (entityiterator instanceof Player _player
																																																				&& !_player.level.isClientSide())
																																																			_player.displayClientMessage(
																																																					Component.literal("14"), true);
																																																	}
																																																	if (world instanceof Level _level) {
																																																		if (!_level.isClientSide()) {
																																																			_level.playSound(null,
																																																					BlockPos.containing(x, y, z),
																																																					ForgeRegistries.SOUND_EVENTS.getValue(
																																																							new ResourceLocation(
																																																									"ui.button.click")),
																																																					SoundSource.NEUTRAL, 1, 1);
																																																		} else {
																																																			_level.playLocalSound(x, y, z,
																																																					ForgeRegistries.SOUND_EVENTS.getValue(
																																																							new ResourceLocation(
																																																									"ui.button.click")),
																																																					SoundSource.NEUTRAL, 1, 1, false);
																																																		}
																																																	}
																																																	CbrmodsChallengesMod.queueServerWork(20, () -> {
																																																		for (Entity entityiterator : new ArrayList<>(
																																																				world.players())) {
																																																			if (entityiterator instanceof Player _player
																																																					&& !_player.level.isClientSide())
																																																				_player.displayClientMessage(
																																																						Component.literal("13"), true);
																																																		}
																																																		if (world instanceof Level _level) {
																																																			if (!_level.isClientSide()) {
																																																				_level.playSound(null,
																																																						BlockPos.containing(x, y, z),
																																																						ForgeRegistries.SOUND_EVENTS
																																																								.getValue(
																																																										new ResourceLocation(
																																																												"ui.button.click")),
																																																						SoundSource.NEUTRAL, 1, 1);
																																																			} else {
																																																				_level.playLocalSound(x, y, z,
																																																						ForgeRegistries.SOUND_EVENTS
																																																								.getValue(
																																																										new ResourceLocation(
																																																												"ui.button.click")),
																																																						SoundSource.NEUTRAL, 1, 1, false);
																																																			}
																																																		}
																																																		CbrmodsChallengesMod.queueServerWork(20, () -> {
																																																			for (Entity entityiterator : new ArrayList<>(
																																																					world.players())) {
																																																				if (entityiterator instanceof Player _player
																																																						&& !_player.level.isClientSide())
																																																					_player.displayClientMessage(
																																																							Component.literal("12"),
																																																							true);
																																																			}
																																																			if (world instanceof Level _level) {
																																																				if (!_level.isClientSide()) {
																																																					_level.playSound(null,
																																																							BlockPos.containing(x, y, z),
																																																							ForgeRegistries.SOUND_EVENTS
																																																									.getValue(
																																																											new ResourceLocation(
																																																													"ui.button.click")),
																																																							SoundSource.NEUTRAL, 1, 1);
																																																				} else {
																																																					_level.playLocalSound(x, y, z,
																																																							ForgeRegistries.SOUND_EVENTS
																																																									.getValue(
																																																											new ResourceLocation(
																																																													"ui.button.click")),
																																																							SoundSource.NEUTRAL, 1, 1,
																																																							false);
																																																				}
																																																			}
																																																			CbrmodsChallengesMod.queueServerWork(20,
																																																					() -> {
																																																						for (Entity entityiterator : new ArrayList<>(
																																																								world.players())) {
																																																							if (entityiterator instanceof Player _player
																																																									&& !_player.level
																																																											.isClientSide())
																																																								_player.displayClientMessage(
																																																										Component.literal(
																																																												"11"),
																																																										true);
																																																						}
																																																						if (world instanceof Level _level) {
																																																							if (!_level.isClientSide()) {
																																																								_level.playSound(null,
																																																										BlockPos.containing(
																																																												x, y, z),
																																																										ForgeRegistries.SOUND_EVENTS
																																																												.getValue(
																																																														new ResourceLocation(
																																																																"ui.button.click")),
																																																										SoundSource.NEUTRAL,
																																																										1, 1);
																																																							} else {
																																																								_level.playLocalSound(x,
																																																										y, z,
																																																										ForgeRegistries.SOUND_EVENTS
																																																												.getValue(
																																																														new ResourceLocation(
																																																																"ui.button.click")),
																																																										SoundSource.NEUTRAL,
																																																										1, 1, false);
																																																							}
																																																						}
																																																						CbrmodsChallengesMod
																																																								.queueServerWork(20,
																																																										() -> {
																																																											for (Entity entityiterator : new ArrayList<>(
																																																													world.players())) {
																																																												if (entityiterator instanceof Player _player
																																																														&& !_player.level
																																																																.isClientSide())
																																																													_player.displayClientMessage(
																																																															Component
																																																																	.literal(
																																																																			"10"),
																																																															true);
																																																											}
																																																											if (world instanceof Level _level) {
																																																												if (!_level
																																																														.isClientSide()) {
																																																													_level.playSound(
																																																															null,
																																																															BlockPos.containing(
																																																																	x,
																																																																	y,
																																																																	z),
																																																															ForgeRegistries.SOUND_EVENTS
																																																																	.getValue(
																																																																			new ResourceLocation(
																																																																					"ui.button.click")),
																																																															SoundSource.NEUTRAL,
																																																															1,
																																																															1);
																																																												} else {
																																																													_level.playLocalSound(
																																																															x,
																																																															y,
																																																															z,
																																																															ForgeRegistries.SOUND_EVENTS
																																																																	.getValue(
																																																																			new ResourceLocation(
																																																																					"ui.button.click")),
																																																															SoundSource.NEUTRAL,
																																																															1,
																																																															1,
																																																															false);
																																																												}
																																																											}
																																																											CbrmodsChallengesMod
																																																													.queueServerWork(
																																																															20,
																																																															() -> {
																																																																for (Entity entityiterator : new ArrayList<>(
																																																																		world.players())) {
																																																																	if (entityiterator instanceof Player _player
																																																																			&& !_player.level
																																																																					.isClientSide())
																																																																		_player.displayClientMessage(
																																																																				Component
																																																																						.literal(
																																																																								"9"),
																																																																				true);
																																																																}
																																																																if (world instanceof Level _level) {
																																																																	if (!_level
																																																																			.isClientSide()) {
																																																																		_level.playSound(
																																																																				null,
																																																																				BlockPos.containing(
																																																																						x,
																																																																						y,
																																																																						z),
																																																																				ForgeRegistries.SOUND_EVENTS
																																																																						.getValue(
																																																																								new ResourceLocation(
																																																																										"ui.button.click")),
																																																																				SoundSource.NEUTRAL,
																																																																				1,
																																																																				1);
																																																																	} else {
																																																																		_level.playLocalSound(
																																																																				x,
																																																																				y,
																																																																				z,
																																																																				ForgeRegistries.SOUND_EVENTS
																																																																						.getValue(
																																																																								new ResourceLocation(
																																																																										"ui.button.click")),
																																																																				SoundSource.NEUTRAL,
																																																																				1,
																																																																				1,
																																																																				false);
																																																																	}
																																																																}
																																																																if (!world
																																																																		.isClientSide()
																																																																		&& world.getServer() != null)
																																																																	world.getServer()
																																																																			.getPlayerList()
																																																																			.broadcastSystemMessage(
																																																																					Component
																																																																							.literal(
																																																																									"10 seconds remaining. The clock is ticking."),
																																																																					false);
																																																																CbrmodsChallengesMod
																																																																		.queueServerWork(
																																																																				20,
																																																																				() -> {
																																																																					for (Entity entityiterator : new ArrayList<>(
																																																																							world.players())) {
																																																																						if (entityiterator instanceof Player _player
																																																																								&& !_player.level
																																																																										.isClientSide())
																																																																							_player.displayClientMessage(
																																																																									Component
																																																																											.literal(
																																																																													"8"),
																																																																									true);
																																																																					}
																																																																					if (world instanceof Level _level) {
																																																																						if (!_level
																																																																								.isClientSide()) {
																																																																							_level.playSound(
																																																																									null,
																																																																									BlockPos.containing(
																																																																											x,
																																																																											y,
																																																																											z),
																																																																									ForgeRegistries.SOUND_EVENTS
																																																																											.getValue(
																																																																													new ResourceLocation(
																																																																															"ui.button.click")),
																																																																									SoundSource.NEUTRAL,
																																																																									1,
																																																																									1);
																																																																						} else {
																																																																							_level.playLocalSound(
																																																																									x,
																																																																									y,
																																																																									z,
																																																																									ForgeRegistries.SOUND_EVENTS
																																																																											.getValue(
																																																																													new ResourceLocation(
																																																																															"ui.button.click")),
																																																																									SoundSource.NEUTRAL,
																																																																									1,
																																																																									1,
																																																																									false);
																																																																						}
																																																																					}
																																																																					CbrmodsChallengesMod
																																																																							.queueServerWork(
																																																																									20,
																																																																									() -> {
																																																																										for (Entity entityiterator : new ArrayList<>(
																																																																												world.players())) {
																																																																											if (entityiterator instanceof Player _player
																																																																													&& !_player.level
																																																																															.isClientSide())
																																																																												_player.displayClientMessage(
																																																																														Component
																																																																																.literal(
																																																																																		"7"),
																																																																														true);
																																																																										}
																																																																										if (world instanceof Level _level) {
																																																																											if (!_level
																																																																													.isClientSide()) {
																																																																												_level.playSound(
																																																																														null,
																																																																														BlockPos.containing(
																																																																																x,
																																																																																y,
																																																																																z),
																																																																														ForgeRegistries.SOUND_EVENTS
																																																																																.getValue(
																																																																																		new ResourceLocation(
																																																																																				"ui.button.click")),
																																																																														SoundSource.NEUTRAL,
																																																																														1,
																																																																														1);
																																																																											} else {
																																																																												_level.playLocalSound(
																																																																														x,
																																																																														y,
																																																																														z,
																																																																														ForgeRegistries.SOUND_EVENTS
																																																																																.getValue(
																																																																																		new ResourceLocation(
																																																																																				"ui.button.click")),
																																																																														SoundSource.NEUTRAL,
																																																																														1,
																																																																														1,
																																																																														false);
																																																																											}
																																																																										}
																																																																										CbrmodsChallengesMod
																																																																												.queueServerWork(
																																																																														20,
																																																																														() -> {
																																																																															for (Entity entityiterator : new ArrayList<>(
																																																																																	world.players())) {
																																																																																if (entityiterator instanceof Player _player
																																																																																		&& !_player.level
																																																																																				.isClientSide())
																																																																																	_player.displayClientMessage(
																																																																																			Component
																																																																																					.literal(
																																																																																							"6"),
																																																																																			true);
																																																																															}
																																																																															if (world instanceof Level _level) {
																																																																																if (!_level
																																																																																		.isClientSide()) {
																																																																																	_level.playSound(
																																																																																			null,
																																																																																			BlockPos.containing(
																																																																																					x,
																																																																																					y,
																																																																																					z),
																																																																																			ForgeRegistries.SOUND_EVENTS
																																																																																					.getValue(
																																																																																							new ResourceLocation(
																																																																																									"ui.button.click")),
																																																																																			SoundSource.NEUTRAL,
																																																																																			1,
																																																																																			1);
																																																																																} else {
																																																																																	_level.playLocalSound(
																																																																																			x,
																																																																																			y,
																																																																																			z,
																																																																																			ForgeRegistries.SOUND_EVENTS
																																																																																					.getValue(
																																																																																							new ResourceLocation(
																																																																																									"ui.button.click")),
																																																																																			SoundSource.NEUTRAL,
																																																																																			1,
																																																																																			1,
																																																																																			false);
																																																																																}
																																																																															}
																																																																															CbrmodsChallengesMod
																																																																																	.queueServerWork(
																																																																																			20,
																																																																																			() -> {
																																																																																				for (Entity entityiterator : new ArrayList<>(
																																																																																						world.players())) {
																																																																																					if (entityiterator instanceof Player _player
																																																																																							&& !_player.level
																																																																																									.isClientSide())
																																																																																						_player.displayClientMessage(
																																																																																								Component
																																																																																										.literal(
																																																																																												"5"),
																																																																																								true);
																																																																																				}
																																																																																				if (world instanceof Level _level) {
																																																																																					if (!_level
																																																																																							.isClientSide()) {
																																																																																						_level.playSound(
																																																																																								null,
																																																																																								BlockPos.containing(
																																																																																										x,
																																																																																										y,
																																																																																										z),
																																																																																								ForgeRegistries.SOUND_EVENTS
																																																																																										.getValue(
																																																																																												new ResourceLocation(
																																																																																														"ui.button.click")),
																																																																																								SoundSource.NEUTRAL,
																																																																																								1,
																																																																																								1);
																																																																																					} else {
																																																																																						_level.playLocalSound(
																																																																																								x,
																																																																																								y,
																																																																																								z,
																																																																																								ForgeRegistries.SOUND_EVENTS
																																																																																										.getValue(
																																																																																												new ResourceLocation(
																																																																																														"ui.button.click")),
																																																																																								SoundSource.NEUTRAL,
																																																																																								1,
																																																																																								1,
																																																																																								false);
																																																																																					}
																																																																																				}
																																																																																				CbrmodsChallengesMod
																																																																																						.queueServerWork(
																																																																																								20,
																																																																																								() -> {
																																																																																									for (Entity entityiterator : new ArrayList<>(
																																																																																											world.players())) {
																																																																																										if (entityiterator instanceof Player _player
																																																																																												&& !_player.level
																																																																																														.isClientSide())
																																																																																											_player.displayClientMessage(
																																																																																													Component
																																																																																															.literal(
																																																																																																	"4"),
																																																																																													true);
																																																																																									}
																																																																																									if (world instanceof Level _level) {
																																																																																										if (!_level
																																																																																												.isClientSide()) {
																																																																																											_level.playSound(
																																																																																													null,
																																																																																													BlockPos.containing(
																																																																																															x,
																																																																																															y,
																																																																																															z),
																																																																																													ForgeRegistries.SOUND_EVENTS
																																																																																															.getValue(
																																																																																																	new ResourceLocation(
																																																																																																			"ui.button.click")),
																																																																																													SoundSource.NEUTRAL,
																																																																																													1,
																																																																																													1);
																																																																																										} else {
																																																																																											_level.playLocalSound(
																																																																																													x,
																																																																																													y,
																																																																																													z,
																																																																																													ForgeRegistries.SOUND_EVENTS
																																																																																															.getValue(
																																																																																																	new ResourceLocation(
																																																																																																			"ui.button.click")),
																																																																																													SoundSource.NEUTRAL,
																																																																																													1,
																																																																																													1,
																																																																																													false);
																																																																																										}
																																																																																									}
																																																																																									CbrmodsChallengesMod
																																																																																											.queueServerWork(
																																																																																													20,
																																																																																													() -> {
																																																																																														for (Entity entityiterator : new ArrayList<>(
																																																																																																world.players())) {
																																																																																															if (entityiterator instanceof Player _player
																																																																																																	&& !_player.level
																																																																																																			.isClientSide())
																																																																																																_player.displayClientMessage(
																																																																																																		Component
																																																																																																				.literal(
																																																																																																						"3"),
																																																																																																		true);
																																																																																														}
																																																																																														if (world instanceof Level _level) {
																																																																																															if (!_level
																																																																																																	.isClientSide()) {
																																																																																																_level.playSound(
																																																																																																		null,
																																																																																																		BlockPos.containing(
																																																																																																				x,
																																																																																																				y,
																																																																																																				z),
																																																																																																		ForgeRegistries.SOUND_EVENTS
																																																																																																				.getValue(
																																																																																																						new ResourceLocation(
																																																																																																								"ui.button.click")),
																																																																																																		SoundSource.NEUTRAL,
																																																																																																		1,
																																																																																																		1);
																																																																																															} else {
																																																																																																_level.playLocalSound(
																																																																																																		x,
																																																																																																		y,
																																																																																																		z,
																																																																																																		ForgeRegistries.SOUND_EVENTS
																																																																																																				.getValue(
																																																																																																						new ResourceLocation(
																																																																																																								"ui.button.click")),
																																																																																																		SoundSource.NEUTRAL,
																																																																																																		1,
																																																																																																		1,
																																																																																																		false);
																																																																																															}
																																																																																														}
																																																																																														CbrmodsChallengesMod
																																																																																																.queueServerWork(
																																																																																																		20,
																																																																																																		() -> {
																																																																																																			for (Entity entityiterator : new ArrayList<>(
																																																																																																					world.players())) {
																																																																																																				if (entityiterator instanceof Player _player
																																																																																																						&& !_player.level
																																																																																																								.isClientSide())
																																																																																																					_player.displayClientMessage(
																																																																																																							Component
																																																																																																									.literal(
																																																																																																											"2"),
																																																																																																							true);
																																																																																																			}
																																																																																																			if (world instanceof Level _level) {
																																																																																																				if (!_level
																																																																																																						.isClientSide()) {
																																																																																																					_level.playSound(
																																																																																																							null,
																																																																																																							BlockPos.containing(
																																																																																																									x,
																																																																																																									y,
																																																																																																									z),
																																																																																																							ForgeRegistries.SOUND_EVENTS
																																																																																																									.getValue(
																																																																																																											new ResourceLocation(
																																																																																																													"ui.button.click")),
																																																																																																							SoundSource.NEUTRAL,
																																																																																																							1,
																																																																																																							1);
																																																																																																				} else {
																																																																																																					_level.playLocalSound(
																																																																																																							x,
																																																																																																							y,
																																																																																																							z,
																																																																																																							ForgeRegistries.SOUND_EVENTS
																																																																																																									.getValue(
																																																																																																											new ResourceLocation(
																																																																																																													"ui.button.click")),
																																																																																																							SoundSource.NEUTRAL,
																																																																																																							1,
																																																																																																							1,
																																																																																																							false);
																																																																																																				}
																																																																																																			}
																																																																																																			CbrmodsChallengesMod
																																																																																																					.queueServerWork(
																																																																																																							20,
																																																																																																							() -> {
																																																																																																								for (Entity entityiterator : new ArrayList<>(
																																																																																																										world.players())) {
																																																																																																									if (entityiterator instanceof Player _player
																																																																																																											&& !_player.level
																																																																																																													.isClientSide())
																																																																																																										_player.displayClientMessage(
																																																																																																												Component
																																																																																																														.literal(
																																																																																																																"1"),
																																																																																																												true);
																																																																																																								}
																																																																																																								if (world instanceof Level _level) {
																																																																																																									if (!_level
																																																																																																											.isClientSide()) {
																																																																																																										_level.playSound(
																																																																																																												null,
																																																																																																												BlockPos.containing(
																																																																																																														x,
																																																																																																														y,
																																																																																																														z),
																																																																																																												ForgeRegistries.SOUND_EVENTS
																																																																																																														.getValue(
																																																																																																																new ResourceLocation(
																																																																																																																		"ui.button.click")),
																																																																																																												SoundSource.NEUTRAL,
																																																																																																												1,
																																																																																																												1);
																																																																																																									} else {
																																																																																																										_level.playLocalSound(
																																																																																																												x,
																																																																																																												y,
																																																																																																												z,
																																																																																																												ForgeRegistries.SOUND_EVENTS
																																																																																																														.getValue(
																																																																																																																new ResourceLocation(
																																																																																																																		"ui.button.click")),
																																																																																																												SoundSource.NEUTRAL,
																																																																																																												1,
																																																																																																												1,
																																																																																																												false);
																																																																																																									}
																																																																																																								}
																																																																																																								CbrmodsChallengesMod
																																																																																																										.queueServerWork(
																																																																																																												20,
																																																																																																												() -> {
																																																																																																													for (Entity entityiterator : new ArrayList<>(
																																																																																																															world.players())) {
																																																																																																														if (entityiterator instanceof Player _player) {
																																																																																																															ItemStack _stktoremove = new ItemStack(
																																																																																																																	CbrmodsChallengesModItems.IPHONE
																																																																																																																			.get());
																																																																																																															_player.getInventory()
																																																																																																																	.clearOrCountMatchingItems(
																																																																																																																			p -> _stktoremove
																																																																																																																					.getItem() == p
																																																																																																																							.getItem(),
																																																																																																																			1,
																																																																																																																			_player.inventoryMenu
																																																																																																																					.getCraftSlots());
																																																																																																														}
																																																																																																													}
																																																																																																													if (world instanceof Level _level) {
																																																																																																														if (!_level
																																																																																																																.isClientSide()) {
																																																																																																															_level.playSound(
																																																																																																																	null,
																																																																																																																	BlockPos.containing(
																																																																																																																			x,
																																																																																																																			y,
																																																																																																																			z),
																																																																																																																	ForgeRegistries.SOUND_EVENTS
																																																																																																																			.getValue(
																																																																																																																					new ResourceLocation(
																																																																																																																							"entity.generic.explode")),
																																																																																																																	SoundSource.NEUTRAL,
																																																																																																																	1,
																																																																																																																	1);
																																																																																																														} else {
																																																																																																															_level.playLocalSound(
																																																																																																																	x,
																																																																																																																	y,
																																																																																																																	z,
																																																																																																																	ForgeRegistries.SOUND_EVENTS
																																																																																																																			.getValue(
																																																																																																																					new ResourceLocation(
																																																																																																																							"entity.generic.explode")),
																																																																																																																	SoundSource.NEUTRAL,
																																																																																																																	1,
																																																																																																																	1,
																																																																																																																	false);
																																																																																																														}
																																																																																																													}
																																																																																																													if (!world
																																																																																																															.isClientSide()
																																																																																																															&& world.getServer() != null)
																																																																																																														world.getServer()
																																																																																																																.getPlayerList()
																																																																																																																.broadcastSystemMessage(
																																																																																																																		Component
																																																																																																																				.literal(
																																																																																																																						"The challenge is over! W for the winner L for who the ones that lost."),
																																																																																																																		false);
																																																																																																												});
																																																																																																							});
																																																																																																		});
																																																																																													});
																																																																																								});
																																																																																			});
																																																																														});
																																																																									});
																																																																				});
																																																															});
																																																										});
																																																					});
																																																		});
																																																	});
																																																});
																																															});
																																														});
																																													});
																																												});
																																											});
																																										});
																																									});
																																								});
																																							});
																																						});
																																					});
																																				});
																																			});
																																		});
																																	});
																																});
																															});
																														});
																													});
																												});
																											});
																										});
																									});
																								});
																							});
																						});
																					});
																				});
																			});
																		});
																	});
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		});
	}
}
