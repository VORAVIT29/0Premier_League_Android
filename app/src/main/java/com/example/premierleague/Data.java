package com.example.premierleague;

import android.graphics.Color;

// เก็บข้อมูลตำแหน่ง ทีม
class index_team {
    static long value;
    // set index
    public void setValue(long value)
    { this.value = value; }
    // get index
    public long getValue()
    { return value; }
}


// ข้อมูลนักเตะทั้งทีม
class Data {
    String [] items = {
            "Arsenal", "Chelsea", "Liverpool","Man City","Man U",
            "Spur","Leicester", "Aston Villa", "Brentford", "Brighton",
            "Burnley", "Palace","Everton", "Leeds", "Newcastle",
            "Norwich","Southampton","Watford","WestHam", "Wolve"
    };

    // ใส่ ตราทีมให้ครบ
    Integer [] logo = {
            R.drawable.arsenal_logo,R.drawable.chelsea_logo,R.drawable.liverpool_logo,R.drawable.manchester_city_fc_badge,
            R.drawable.manchester_united_logo,R.drawable.tottenham_hotspur,R.drawable.leicester02,R.drawable.aston_villa_logo,
            R.drawable.brentford_fc_logo,R.drawable.brighton_hove_albion_logo,R.drawable.burnley_fc_logo,
            R.drawable.crystal_palace_fc_logo,R.drawable.everton_fc_2014,R.drawable.leeds_united_fc_logo,
            R.drawable.newcastle_united_logo,R.drawable.norwich_city,R.drawable.fc_southampton,R.drawable.watford,
            R.drawable.west_ham_united_fc_logo,R.drawable.wolverhampton_wanderers
    };
    Integer [] gifbg = {
            R.drawable.arsenal,R.drawable.chelsea,R.drawable.liverpool,R.drawable.manchestercity
            ,R.drawable.manu,R.drawable.tottenham,R.drawable.leicester,R.drawable.astonvilla,R.drawable.brentfordfc
            ,R.drawable.brightonhove,R.drawable.burnley,R.drawable.crystalpalace,R.drawable.everton,
            R.drawable.leedsunited,R.drawable.newcastleunited,R.drawable.norwichcity,R.drawable.southampton,
            R.drawable.watford1,R.drawable.westham,R.drawable.wolverhampton
    };
    Integer [] color_bg = {
            R.color.red,R.color.blue,R.color.red,R.color.blue_sky,
            R.color.red,R.color.gray,R.color.blue_sky,R.color.crimson_red,
            R.color.crimson_red,R.color.blue_sky,R.color.crimson_red,
            R.color.blue,R.color.blue_sky,R.color.gray,
            R.color.black,R.color.yellow,R.color.crimson_red,R.color.yellow,
            R.color.crimson_red,R.color.yellow
    };
}

// team 1
class player_man_u {
    String [] names = {
            "David De Gea","Victor Lindelof","Harry Maguire","Paul Pogba",
            "Cristiano Ronaldo","Marcus Rashford","Fred","Bruno Fernandes",
            "Diogo Dalot","Jadon Sancho","Alex Telles" };

    Integer [] numbers = { 1,2,5,6,7,10,17,18,20,25,27 };

    Integer [] player = {
            R.drawable.david_de_gea_1,R.drawable.victor_lindelof_2,R.drawable.harry_maguire_5,
            R.drawable.paul_pogba_6,R.drawable.cristiano_ronaldo_7,R.drawable.marcus_rashford_10,
            R.drawable.fred_17,R.drawable.bruno_fernandes_18,R.drawable.diogo_dalot_20,
            R.drawable.jadon_sancho_25,R.drawable.alex_telles_27 };
}

// team 2
class player_chelsea {
    String[] names = {
            "Edouard Mendy", "Antonio Rudiger", "Andreas Christensen", "Jorginho", "Thiago Silva",
            "N'Golo Kante", "Christian Pulisic", "Mason Mount",
            "Reece James", "Cesar Azpilicueta", "Kai Havertz" };

    Integer[] numbers = { 16, 2, 4, 5, 6, 7, 10, 19, 24, 28, 29 };

    Integer[] player = {
            R.drawable.edouard_mendy_16, R.drawable.antonio_rudiger_2, R.drawable.andreas_christensen_4,
            R.drawable.jorginho_5, R.drawable.thiago_silva_6,R.drawable.ngolo_kante_7,
            R.drawable.christian_pulisic_10, R.drawable.mason_mount_19, R.drawable.reece_james_24,
            R.drawable.cesar_azpilicueta_28, R.drawable.kai_havertz_29 };
}

// team 3
class player_Arsenal {
    String [] names = {
            "Aaron Ramsdale","Kieran Tierney","Benjamin White","Thomas Partey","Gabriel MagalHaes",
            "Bukayo Saka","Martin Odegaard","Alexandre Lacazette","Takehiro Tomiyasu",
            "Granit Xhaka","Gabriel Martinelli" };

    Integer [] numbers = {32,3,4,5,6,7,8,9,18,34,35};

    Integer [] player = {
            R.drawable.aron_ramsdale_32,R.drawable.kieran_tierney_3,R.drawable.benjamin_white_4,
            R.drawable.thomas_partey_5,R.drawable.gabriel_magalhaes_6,R.drawable.bukayo_saka_7,
            R.drawable.martin_odegaard_8,R.drawable.alexandre_lacazette_9,R.drawable.takehiro_tomiyasu_18,
            R.drawable.granit_xhaka_34,R.drawable.gabriel_martinelli_35 };
}

// team 4
class player_man_city {
    String [] names = {
            "Ederson","Kyle Walker","Ruben Dias","John Stones","Raheem Sterling",
            "llkay Gundogan","Rodri","Kevin de Bruyne","Riyad Mahrez",
            "Joao Cancelo","Phil Foden" };

    Integer [] numbers = { 31,2,3,5,7,8,16,17,26,27,47 };

    Integer [] player = {
            R.drawable.ederson_31,R.drawable.kyle_walker_2,R.drawable.ruben_dias_3,R.drawable.john_stones_5,
            R.drawable.raheem_sterling_7,R.drawable.ilkay_gundogan_8,R.drawable.rodri_16,
            R.drawable.kevin_de_bruyne_17,R.drawable.riyad_mahrez_26,R.drawable.joao_cancelo_27,
            R.drawable.phil_foden_47 };
}


// team 5
class player_liverpool {
    String [] names = {
            "Alisson","Fabinho","Virgil Van Dijk","Thiago",
            "Sadio Mane","Mohamed Salah","Jordan Henderson","Diogo Jota",
            "Andrew Robertson","Joel Matip","Trent Alexander Arnold" };

    Integer [] numbers = { 1,3,4,6,10,11,14,20,26,32,66 };

    Integer [] player = {
            R.drawable.alisson_1,R.drawable.fabinho_3,R.drawable.virgil_van_dijk_4,
            R.drawable.thiago_6,R.drawable.sadio_mane_10,R.drawable.mohamed_salah_11,
            R.drawable.jordan_henderson_14,R.drawable.diogo_jota_20,R.drawable.andrew_robertson_26,
            R.drawable.joel_matip_32,R.drawable.trent_alexander_arnold_66 };
}


// team 6
class player_newcastleunited {
    String [] names = {
            "Martin Dubravka","Fabian Schar","Joelinton","Jonjo Shelvey",
            "Allan Sain Maximin","Matt Targett","Emil Krafth","Chris Wood",
            "Miguel Almiron","Dan Burn","Bruno Guimaraes" };

    Integer [] numbers = { 1,5,7,8,10,13,17,20,24,33,39 };

    Integer [] player = {
            R.drawable.martin_dubravka_1,R.drawable.fabian_schar_5, R.drawable.joelinton_7,
            R.drawable.jonjo_shelvey_8,R.drawable.allan_saint_maximin_10,
            R.drawable.matt_targett_13,R.drawable.emil_krafth_17,R.drawable.chris_wood_20,R.drawable.miguel_almiron_24,
            R.drawable.dan_burn_33,R.drawable.bruno_guimaraes_39 };
}

// team 7
class player_norwichcity {
    String [] names = {
            "Tim Krul","Sam Byram","Ben Gibson","Grant Hanley",
            "Kieran Dowell","Mathias Normann","Milot Rashica","Pierre Lees Melou",
            "Teemu Pukki","Kenny McLean","Dimitris Giannoulis" };

    Integer [] numbers = { 1,3,4,5,10,16,17,20,22,23,30 };

    Integer [] player = {
            R.drawable.tim_krul_1,R.drawable.sam_byram_3,R.drawable.ben_gibson_4,
            R.drawable.grant_hanley_5,R.drawable.kieran_dowell_10,R.drawable.mathias_normann_16,
            R.drawable.milot_rashica_17,R.drawable.pierre_lees_melou_20,R.drawable.teemu_pukki_22,
            R.drawable.kenny_mclean_23,R.drawable.dimitris_giannoulis_30 };
}

// team 8
class player_southampton {
    String [] names = {
            "Fraser Forster","Kyle Walker Peters","Lyanco","Oriol Romeu",
            "James Ward Prowse","Romain Perraud","Stuart Armstrong","Armando Broja",
            "Mohamed Elyounoussi","Jan Bednarek","Yan Valery" };

    Integer [] numbers = { 44,2,4,6,8,15,17,18,24,35,43 };

    Integer [] player = {
            R.drawable.fraser_forster_44,R.drawable.kyle_walker_peters_2,R.drawable.lyanco_4,
            R.drawable.oriol_romeu_6,R.drawable.james_ward_prowse_8,R.drawable.romain_perraud_15,
            R.drawable.stuart_armstrong_17,R.drawable.armando_broja_18,R.drawable.mohamed_elyounoussi_24,
            R.drawable.jan_bednarek_35,R.drawable.yan_valery_43 };
}

// team 9
class player_spur {
    String [] names = {
            "Hugo Lioris","Sergio Reguilon","Cristian Romero","PierreEmile Hojberg","Son HeungMin",
            "Harry Kane","Emerson Royal","Eric Dier","Dejan Kulusevski","Rodigo Bentancur",
            "Ben Davies" };

    Integer [] numbers = { 1,3,4,5,7,10,12,15,21,30,33 };

    Integer [] player = {
            R.drawable.hugo_lioris_1,R.drawable.sergio_reguilon_3,R.drawable.cristian_romero_4,
            R.drawable.pierreemile_hojberg_5,R.drawable.son_heungmin_7,R.drawable.harry_kane_10,
            R.drawable.emerson_royal_12,R.drawable.eric_dier_15,R.drawable.dejan_kulusevski_21,
            R.drawable.rodigo_bentancur_30,R.drawable.ben_davies_33 };
}


// team 10
class player_watford {
    String [] names = {
            "Ben Foster","Imran Louza","Joao Pedro","Hassane Kamara",
            "Moussa Sissoko","Kiko Femenia","Samir","Ismaila Sarr",
            "Emmanuel Dennis","Christian Kabasele","Juraj Kucka" };

    Integer [] numbers = { 1,6,10,14,19,21,22,23,25,27,33 };

    Integer [] player = {
            R.drawable.ben_foster_1,R.drawable.imran_louza_6,R.drawable.joao_pedro_10,
            R.drawable.hassane_kamara_14,R.drawable.moussa_sissoko_19,R.drawable.kiko_femenia_21,
            R.drawable.samir_22,R.drawable.ismaila_sarr_23,R.drawable.emmanuel_dennis_25,
            R.drawable.christian_kabasele_27,R.drawable.juraj_kucka_33 };
}


// team 11
class player_westhamunited{
    String [] names = {
            "Lukasz Fabianski","Aaron Cresswell","Michail Antonio","Manuel Lanzini",
            "Nikola Vlasic","Craig Dawson","Jarrod Bowen","Issa Diop",
            "Tomas Soucek","Ben_Johnson","Declan Rice" };

    Integer [] numbers = { 1,3,9,10,11,15,20,23,28,31,41 };

    Integer [] player = {
            R.drawable.lukasz_fabianski_1,R.drawable.aaron_cresswell_3,R.drawable.michail_antonio_9,
            R.drawable.manuel_lanzini_10,R.drawable.nikola_vlasic_11,R.drawable.craig_dawson_15,
            R.drawable.jarrod_bowen_20,R.drawable.issa_diop_23,R.drawable.tomas_soucek_28,
            R.drawable.ben_johnson_31,R.drawable.declan_rice_41 };
}

// team 12
class player_wolverhamptonwanderers{
    String [] names = {
            "Jose Sa","Rayan Ait Nouri","Ruben Neves","Raul Jimenez",
            "Daniel Podence","Trincao","Conor Coady","Nelson Semedo",
            "Maximilian Kilman","Romain Saiss","Leander Dendoncker" };

    Integer [] numbers = { 1,3,8,9,10,11,16,22,23,27,32 };

    Integer [] player = {
            R.drawable.jose_sa_1,R.drawable.rayan_ait_nouri_3,R.drawable.ruben_neves_8,
            R.drawable.raul_jimenez_9,R.drawable.daniel_podence_10,R.drawable.trincao_11,
            R.drawable.conor_coady_16,R.drawable.nelson_semedo_22,R.drawable.maximilian_kilman_23,
            R.drawable.romain_saiss_27,R.drawable.leander_dendoncker_32 };
}

// team 13
class player_leicestercity {
    String [] names = {
            "Kasper Schmeichel","Caglar Soyuncu","Jonny Evans","Harvet Barnes",
            "Yuri Tielemans","Jamie Vardy","James Maddiison","Marc Albrighton",
            "Hamza Choudhury","Kiernan Dewsbusy Hall","Luke Thomas" };

    Integer [] numbers = { 1,4,6,7,8,9,10,11,20,22,33 };

    Integer [] player = {
            R.drawable.kasper_schmeichel_1,R.drawable.caglar_soyuncu_4,R.drawable.jonny_evans_6,
            R.drawable.harvet_barnes_7,R.drawable.yuri_tielemans_8,R.drawable.jamie_vardy_9,
            R.drawable.james_maddiison_10,R.drawable.marc_albrighton_11,R.drawable.hamza_choudhury_20,
            R.drawable.kiernan_dewsbusy_hall_22,R.drawable.luke_thomas_33 };
}

// team 14
class player_aston_villa {
    String [] names = {
            "emiliano martinez","matthew cash","ezri konsa","tyrone mings",
            "douglas_luiz","john_mcginn","yoane wissa","danny lngs","philippe coutinho",
            "lucas digne","jacob ramsey"};

    Integer [] numbers = { 1,2,4,5,6,7,11,20,23,27,41 };

    Integer [] player = {
            R.drawable.emiliano_martinez_1,R.drawable.matthew_cash_2,R.drawable.ezri_konsa_4,
            R.drawable.tyrone_mings_5,R.drawable.douglas_luiz_6,R.drawable.john_mcginn_7,
            R.drawable.yoane_wissa_11,R.drawable.danny_lngs_20,R.drawable.philippe_coutinho_23,
            R.drawable.lucas_digne_27,R.drawable.jacob_ramsey_41
    };
}

// team 15
class player_brenford {
    String [] names = {
            "david raya","ricco henry","ethan pinnock","christian norgaard","yoane wissa",
            "ivan toney","pontus jansson","bryan mbeumo","kristoffer ajer",
            "christian eriksen","vitaly janelt" };

    Integer [] numbers = { 1,3,5,6,11,17,18,19,20,21,27 };

    Integer [] player = {
            R.drawable.david_raya_1,R.drawable.ricco_henry_3,R.drawable.ethan_pinnock_5,
            R.drawable.christian_norgaard_6,R.drawable.yoane_wissa_11,R.drawable.ivan_toney_17,
            R.drawable.pontus_jansson_18,R.drawable.bryan_mbeumo_19,R.drawable.kristoffer_ajer_20,
            R.drawable.christian_eriksen_21,R.drawable.vitaly_janelt_27
    };
}

// team 16
class player_burnley {
    String [] names = { "kick pope","matthew lowton","charlie taylor","jack cork",
            "james tarkowski","wout weghorst","dwight mcNeil","ashley westwood",
            "jay rodriguez","maxwel cornet","nathan collins" };

    Integer [] numbers = { 1,2,3,4,5,9,11,18,19,20,22 };

    Integer [] player = {
            R.drawable.kick_pope_1,R.drawable.matthew_lowton_2,R.drawable.charlie_taylor_3,
            R.drawable.jack_cork_4,R.drawable.james_tarkowski_5,R.drawable.wout_weghorst_9,
            R.drawable.dwight_mcneil_11,R.drawable.ashley_westwood_18,R.drawable.jay_rodriguez_19,
            R.drawable.maxwel_cornet_20,R.drawable.nathan_collins_22 };
}

// team 17
class player_leeds {
    String [] names = { "illan meslier","luke ayling","adam forshaw","robin koch",
            "robin koch","raphinha","tyler roberts","stusrt dallas","pascal struijk",
            "jackHarrison","joe gelhardt","mateusz klich" };

    Integer [] numbers = { 1,2,4,5,10,11,15,21,22,30,43 };

    Integer [] player = {
            R.drawable.illan_meslier_1,R.drawable.luke_ayling_2,R.drawable.adam_forshaw_4,
            R.drawable.robin_koch_5,R.drawable.raphinha_10,R.drawable.tyler_roberts_11,
            R.drawable.stusrt_dallas_15,R.drawable.pascal_struijk_21,R.drawable.jackharrison_22,
            R.drawable.joe_gelhardt_30,R.drawable.mateusz_klich_43 };
}

// team 18
class player_everton {
    String [] names = {
            "jordan pickford","michael keane","allan","richarlison","fabian delph",
            "dominic calvert Lewin","alexander lwobi","vitalii mykolenko","ben godfrey",
            "seamus coleman","anthony gordon" };

    Integer [] numbers = { 1,5,6,7,8,9,17,19,22,23,24 };

    Integer [] player = {
            R.drawable.jordan_pickford_1,R.drawable.michael_keane_5,R.drawable.allan_6,R.drawable.richarlison_7,
            R.drawable.fabian_delph_8,R.drawable.dominic_calvert_lewin_9,R.drawable.alexander_lwobi_17,
            R.drawable.vitalii_mykolenko_19,R.drawable.ben_godfrey_22,R.drawable.seamus_coleman_23,
            R.drawable.anthony_gordon_24 };
}

// team 19
class player_crystalPalace {
    String [] names = {
            "vicente guaita","tyrick mitchell","marc guéhi","michael olise",
            "cheikhou kouyaté","jordan ayew","eberechi eze","wilfried zaha",
            "joachim andersen","nathaniel clyne","conor gallagher" };

    Integer [] numbers = { 13,3,6,7,8,9,10,11,16,17,23 };

    Integer [] player = {
            R.drawable.vicente_guaita_13,R.drawable.tyrick_mitchell_3,R.drawable.marc_guehi_6,
            R.drawable.michael_olise_7,R.drawable.cheikhou_kouyate_8,R.drawable.jordan_ayew_9,
            R.drawable.eberechi_eze_10,R.drawable.wilfried_zaha_11,R.drawable.joachim_andersen_16,
            R.drawable.nathaniel_clyne_17,R.drawable.conor_gallagher_23 };
}

// team 20
class player_Brighton_and_Hove_Albion {
    String [] names = {
            "robert sanchez","tariq lamptey","marc cucurella","lewis dunk","yves bissouma",
            "alexis mac allister","leandro trossard","enock mwepu","pascal grob ",
            "moises caicedo","joel veltman"
    };

    Integer [] numbers = { 1,2,3,5,8,10,11,12,13,25,34 };

    Integer [] player = {
            R.drawable.robert_sanchez_1,R.drawable.tariq_lamptey_2,R.drawable.marc_cucurella_3,
            R.drawable.lewis_dunk_5,R.drawable.yves_bissouma_8,R.drawable.alexis_mac_allister_10,
            R.drawable.leandro_trossard_11,R.drawable.enock_mwepu_12,R.drawable.pascal_grob_13,
            R.drawable.moises_caicedo_25,R.drawable.joel_veltman_34 };
}


