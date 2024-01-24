package com.rockus.ddnetbackend.model.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MapInfoDTO {
    private String map;
    private int width;
    private int height;
    private boolean death;
    private boolean through;
    private boolean jump;
    private boolean dfreeze;
    private boolean ehook_start;
    private boolean hit_end;
    private boolean solo_start;
    private boolean tele_gun;
    private boolean tele_grenade;
    private boolean tele_laser;
    private boolean npc_start;
    private boolean super_start;
    private boolean jetpack_start;
    private boolean walljump;
    private boolean nph_start;
    private boolean weapon_shotgun;
    private boolean weapon_grenade;
    private boolean powerup_ninja;
    private boolean weapon_rifle;
    private boolean laser_stop;
    private boolean crazy_shotgun;
    private boolean dragger;
    private boolean door;
    private boolean switch_timed;
    private boolean _switch;
    private boolean stop;
    private boolean through_all;
    private boolean tune;
    private boolean oldlaser;
    private boolean teleinevil;
    private boolean telein;
    private boolean telecheck;
    private boolean teleinweapon;
    private boolean teleinhook;
    private boolean checkpoint_first;
    private boolean bonus;
    private boolean boost;
    private boolean plasmaf;
    private boolean plasmae;
    private boolean plasmau;
}
