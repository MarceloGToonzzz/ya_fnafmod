package net.mcreator.yafnafmod.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.yafnafmod.configuration.YafnafmodConfigConfiguration;

import java.util.regex.Pattern;
import java.util.List;
import java.util.ArrayList;

public class ChooseNamesProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		List<Object> firstnames = new ArrayList<>();
		List<Object> lastnames = new ArrayList<>();
		String nameresult = "";
		if (entity.getPersistentData().getDouble("gender") == 1) {
			if (entity.getPersistentData().getDouble("nameorigin") == 0) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_MALEAMERICAN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIAMERICAN.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_MALEAMERICAN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIAMERICAN.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("nameorigin") == 1) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_MALELATIN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNILATIN.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_MALELATIN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNILATIN.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("nameorigin") == 2) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_MALEASIAN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIASIAN.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_MALEASIAN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIASIAN.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("nameorigin") == 3) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_MALEEUROPE.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIEUROPE.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_MALEEUROPE.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIEUROPE.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("gender") == 2) {
			if (entity.getPersistentData().getDouble("nameorigin") == 0) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_FEMALEAMERICAN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIAMERICAN.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_FEMALEAMERICAN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIAMERICAN.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("nameorigin") == 1) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_FEMALELATIN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNILATIN.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_FEMALELATIN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNILATIN.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("nameorigin") == 2) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_FEMALEASIAN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIASIAN.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_FEMALEASIAN.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIASIAN.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("nameorigin") == 3) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_FEMALEEUROPE.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIEUROPE.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_FEMALEEUROPE.get() + "," + YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIEUROPE.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("gender") == 0) {
			if (entity.getPersistentData().getDouble("nameorigin") == 0) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIAMERICAN.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIAMERICAN.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("nameorigin") == 1) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNILATIN.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNILATIN.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("nameorigin") == 2) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIASIAN.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIASIAN.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			} else if (entity.getPersistentData().getDouble("nameorigin") == 3) {
				{
					String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIEUROPE.get()).split(Pattern.quote(","));
					if (_array.length != 0) {
						for (String stringiterator : _array) {
							firstnames.add(stringiterator);
						}
					} else {
						String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_NAMES_UNIEUROPE.get());
						for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
							firstnames.add(stringiterator);
						}
					}
				}
			}
		}
		if (entity.getPersistentData().getDouble("namelastorigin") == 0) {
			{
				String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_LASTNAMES_AMERICAN.get()).split(Pattern.quote(","));
				if (_array.length != 0) {
					for (String stringiterator : _array) {
						lastnames.add(stringiterator);
					}
				} else {
					String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_LASTNAMES_AMERICAN.get());
					for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
						lastnames.add(stringiterator);
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("namelastorigin") == 1) {
			{
				String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_LASTNAMES_LATIN.get()).split(Pattern.quote(","));
				if (_array.length != 0) {
					for (String stringiterator : _array) {
						lastnames.add(stringiterator);
					}
				} else {
					String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_LASTNAMES_LATIN.get());
					for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
						lastnames.add(stringiterator);
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("namelastorigin") == 2) {
			{
				String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_LASTNAMES_ASIAN.get()).split(Pattern.quote(","));
				if (_array.length != 0) {
					for (String stringiterator : _array) {
						lastnames.add(stringiterator);
					}
				} else {
					String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_LASTNAMES_ASIAN.get());
					for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
						lastnames.add(stringiterator);
					}
				}
			}
		} else if (entity.getPersistentData().getDouble("namelastorigin") == 3) {
			{
				String[] _array = (YafnafmodConfigConfiguration.POSSIBLE_LASTNAMES_EUROPE.get()).split(Pattern.quote(","));
				if (_array.length != 0) {
					for (String stringiterator : _array) {
						lastnames.add(stringiterator);
					}
				} else {
					String stringiterator = (YafnafmodConfigConfiguration.POSSIBLE_LASTNAMES_EUROPE.get());
					for (int _yourmother = 0; _yourmother < 1; _yourmother++) {
						lastnames.add(stringiterator);
					}
				}
			}
		}
		nameresult = firstnames.get(Mth.nextInt(RandomSource.create(), 0, (int) (firstnames.size() - 1))) + " " + lastnames.get(Mth.nextInt(RandomSource.create(), 0, (int) (lastnames.size() - 1)));
		return nameresult;
	}
}
