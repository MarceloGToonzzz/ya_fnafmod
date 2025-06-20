package net.mcreator.yafnafmod.configuration;

import net.minecraftforge.common.ForgeConfigSpec;

public class YafnafmodConfigConfiguration {
	public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
	public static final ForgeConfigSpec SPEC;

	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_MALEAMERICAN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_MALELATIN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_MALEASIAN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_MALEEUROPE;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_FEMALEAMERICAN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_FEMALELATIN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_FEMALEASIAN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_FEMALEEUROPE;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_UNIAMERICAN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_UNILATIN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_UNIASIAN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_NAMES_UNIEUROPE;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_LASTNAMES_AMERICAN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_LASTNAMES_LATIN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_LASTNAMES_ASIAN;
	public static final ForgeConfigSpec.ConfigValue<String> POSSIBLE_LASTNAMES_EUROPE;

	public static final ForgeConfigSpec.ConfigValue<Double> AUDIOLURE_BREAKCHANCE;
	static {
		BUILDER.push("Entities");
		BUILDER.push("Humans");
		BUILDER.push("First Names");
		BUILDER.push("Male Names");
		POSSIBLE_NAMES_MALEAMERICAN = BUILDER.comment("- Possible American names for boys").define("American Male Names",
				"Tyler,Brandon,Jake,Austin,Carter,Mason,Ryan,Logan,Kyle,Caleb,Hunter,Blake,Ethan,Noah,Chase,Dylan,Zachary,Luke,Jordan,Travis,Jason,Cole,Levi,Nathan,Gavin,Shane,Eric,Connor,Owen,Jace,Connor,Marcelo,Lewis,Jeremy,Michael,Johnathan,Richard,Steve,Hudson,Gregory,Gabriel,Fritz,Andrew,Stanley,Stanford,Stan,William,Bill,Samuel,Sam,Peter,Freddy,Marty,Dave,David,Edwin,Henry,Oswald,,Curt,Tony,Luke,Emmet,Jake,Finn,Rayson,Terry,Dwight,Ben,Charles");
		POSSIBLE_NAMES_MALELATIN = BUILDER.comment("- Possible latin names for boys").define("Latin Male Names",
				"Mateo,Santiago,Alejandro,Diego,Luis,Javier,Carlos,Juan,Miguel,Antonio,Eduardo,Andrés,Manuel,Fernando,Jorge,Ricardo,César,Marcos,Tomás,Emilio,Rafael,Armando,Bruno,Ernesto,Cristian,Hugo,Esteban,Nico,Raul,Ismael");
		POSSIBLE_NAMES_MALEASIAN = BUILDER.comment("- Possible latin names for boys").define("Asian Male Names",
				"Hiroshi,Kenji,Takeshi,Jun,Sung,Hao,Minh,Arjun,Haruto,Yuki,Jin,Anil,Wei,Hyun,Daiki,Ravi,Kenta,Tien,Akira,Sunil,Nam,Ichiro,Sanjay,Koji,Ryo,Thanh,Kai,Manuel,Hideki,Bao");
		POSSIBLE_NAMES_MALEEUROPE = BUILDER.comment("- Possible latin names for boys").define("European Male Names",
				"Luca,Matteo,Nikolai,Andreas,Leo,Jakub,Oscar,Henrik,Thiago,Filip,Emil,Jan,Tomasz,Fabian,Álvaro,Sebastian,Anton,Milosz,Olivier,Erik,Viktor,Artem,Marco,Ivan,Damien,Kristof,Mario,Laurent,Georg,Ilia");
		BUILDER.pop();
		BUILDER.push("Female Names");
		POSSIBLE_NAMES_FEMALEAMERICAN = BUILDER.comment("- Possible American names for girls").define("American Female Names",
				"Emily,Madison,Brooke,Hailey,Kylie,Jessica,Chloe,Savannah,Taylor,Alexa,Riley,Megan,Kaitlyn,Amber,Skylar,Peyton,Ashley,Lauren,Zoe,Sierra,Bella,Reagan,Lily,Morgan,Avery,Kennedy,Cassidy,Autumn,Paige,Faith,Luna,Veronica,Monika,Monica,Evelyn,Linda,Matilda,Cassidy,Cassie,Susie,Samantha,Sam,Vanessa,Delilah,April,Clara,Melissa,Maggie,Amy,Gina,Maria,Dorothy,Hermione,Ava,Anna,Ana,Victoria,Vivienne,Lilith");
		POSSIBLE_NAMES_FEMALELATIN = BUILDER.comment("- Possible Latin names for girls").define("Latin Female Names",
				"Camila,Isabella,Sofia,Valeria,Mariana,Lucía,Gabriela,Daniela,Elena,Carla,Ana,Rosa,Carmen,Natalia,Julieta,Bianca,Paula,Teresa,Lourdes,Estela,Flor,Josefina,Paloma,Xiomara,Almendra,Renata,Liliana,Inés,Yesenia,Abril,Rosa,Amy");
		POSSIBLE_NAMES_FEMALEASIAN = BUILDER.comment("- Possible Asian names for girls").define("Asian Female Names",
				"Aiko,Yuna,Mei,Leena,Hana,Jiwoo,Sakura,Anika,Suki,Min,Kaori,Rina,Linh,Haruka,Myra,Nari,Tamiko,Thuy,Mika,Priya,Jia,Lani,Yuri,Trang,Satomi,Mina,Indira,Chika,Kumiko,Noor");
		POSSIBLE_NAMES_FEMALEEUROPE = BUILDER.comment("- Possible Europian names for girls").define("European Female Names",
				"Elena,Anya,Sofia,Chiara,Isla,Freya,Lucia,Nina,Amélie,Klara,Greta,Leonie,Catalina,Inga,Zuzanna,Astrid,Eliska,Beatriz,Tereza,Marta,Noemi,Olga,Irina,Rosalie,Petra,Giulia,Alina,Silje,Agata,Raisa");
		BUILDER.pop();
		BUILDER.push("Unisex Names");
		POSSIBLE_NAMES_UNIAMERICAN = BUILDER.comment("- Possible American unisex names").define("American Unisex Names",
				"Alex,Taylor,Jordan,Casey,Riley,Avery,Morgan,Cameron,Quinn,Peyton,Skyler,Dakota,Rowan,Reese,Jamie,Kendall,Drew,Blake,Logan,Hayden,Parker,Emerson,Jesse,Ryan,Finley,Marley,Charlie,Corey,Hunter,Sage");
		POSSIBLE_NAMES_UNILATIN = BUILDER.comment("- Possible latin unisex names").define("Latin Unisex Names",
				"Ángel,Alexis,Cruz,Jaime,Noel,Ariel,René,Luz,Rosario,Milagros,Sol,Mar,Isa,Cielo,Paz,Sam,Dani,Andy,Charly,Toni,Adri,Eli,Max,Cris,Alex,Nico,Joss,Robin,Manu,Rafa");
		POSSIBLE_NAMES_UNIASIAN = BUILDER.comment("- Possible asian unisex names").define("Asian Unisex Names",
				"Ren,Yuki,Min,Jin,Hayun,Akira,Hari,Nari,Dao,Hikaru,Devi,Kai,An,Yan,Sora,Niko,Sage,Kiran,Tae,Rumi,Mei,Tien,Haru,Jaya,Rei,Bo,Linh,Yun,Ari,Noa");
		POSSIBLE_NAMES_UNIEUROPE = BUILDER.comment("- Possible european unisex names").define("European Unisex Names",
				"Alex,Nikola,Emery,Robin,Sasha,Dani,Milan,Noel,Luca,Alix,Misha,Joan,Eli,Andrea,Remi,Sam,René,Jean,Stef,Toni,Maxi,Niki,Val,Chris,Claude,Adrian,Ray,Nikita,Téo,Georgie");
		BUILDER.pop();
		BUILDER.pop();
		BUILDER.push("Last names");
		POSSIBLE_LASTNAMES_AMERICAN = BUILDER.comment("- Possible American last names").define("American Last Names",
				"Johnson,Miller,Anderson,Taylor,Moore,Jackson,Lewis,Walker,Hall,Allen,Young,Hernandez,King,Wright,Scott,Torres,Rivera,Morgan,Cooper,Bailey,Reed,Hughes,Peterson,Simmons,Ward,Fisher,Powell,Griffin,Lawson,Barker,Schmidt,Fitzgerald,Foster");
		POSSIBLE_LASTNAMES_LATIN = BUILDER.comment("- Possible latin last names").define("Latin Last Names",
				"García,Rodríguez,Martínez,Hernández,López,González,Pérez,Sánchez,Ramírez,Torres,Flores,Rivera,Díaz,Morales,Romero,Cruz,Reyes,Mendoza,Castillo,Ortega,Guerrero,Delgado,Vega,Soto,Ríos,Campos,Navarro,Salazar,Espinoza,Fuentes");
		POSSIBLE_LASTNAMES_ASIAN = BUILDER.comment("- Possible latin last names").define("Asian Last Names",
				"Tanaka,Lee,Kim,Wang,Nguyen,Chen,Park,Li,Choi,Yamamoto,Liu,Kumar,Kobayashi,Lam,Hashimoto,Tran,Tsai,Das,Singh,Go,Hashim,Tan,Chang,Murakami,Phan,Zhang,Yeo,Okada,Rahman,Saito");
		POSSIBLE_LASTNAMES_EUROPE = BUILDER.comment("- Possible latin last names").define("European Last Names",
				"Kovács,Fernandez,Novak,Dubois,Moretti,Popescu,Horváth,Smirnov,Andersson,Kowalski,Gruber,Nielsen,Müller,López,Petrov,Silva,Huber,Bianchi,Bernard,Luka,Martins,Sorensen,Volkov,Rossi,Benedek,Varga,Nowak,Dragunov,Costa,Dimitrov,Holmes");
		BUILDER.pop();
		BUILDER.pop();
		BUILDER.pop();
		BUILDER.push("Blocks");
		BUILDER.push("Function Blocks");
		AUDIOLURE_BREAKCHANCE = BUILDER.comment("This is the probability of how much the audio lure breaks, the higher, the rarer.").define("Audio Lure break chance", (double) 0);
		BUILDER.pop();
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}
