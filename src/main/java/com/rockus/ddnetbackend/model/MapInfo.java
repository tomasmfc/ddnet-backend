package com.rockus.ddnetbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "mapinfo")
@Getter
public class MapInfo {
    @Id
    private String map;
    @Column
    private int width;
    @Column
    private int height;
    @Column
    private boolean death;
    @Column
    private boolean through;
    @Column
    private boolean jump;
    @Column
    private boolean dfreeze;
    @Column
    private boolean ehook_start;
    @Column
    private boolean hit_end;
    @Column
    private boolean solo_start;
    @Column
    private boolean tele_gun;
    @Column
    private boolean tele_grenade;
    @Column
    private boolean tele_laser;
    @Column
    private boolean npc_start;
    @Column
    private boolean super_start;
    @Column
    private boolean jetpack_start;
    @Column
    private boolean walljump;
    @Column
    private boolean nph_start;
    @Column
    private boolean weapon_shotgun;
    @Column
    private boolean weapon_grenade;
    @Column
    private boolean powerup_ninja;
    @Column
    private boolean weapon_rifle;
    @Column
    private boolean laser_stop;
    @Column
    private boolean crazy_shotgun;
    @Column
    private boolean dragger;
    @Column
    private boolean door;
    @Column
    private boolean switch_timed;
    @Column(name = "switch")
    private boolean _switch;
    @Column
    private boolean stop;
    @Column
    private boolean through_all;
    @Column
    private boolean tune;
    @Column
    private boolean oldlaser;
    @Column
    private boolean teleinevil;
    @Column
    private boolean telein;
    @Column
    private boolean telecheck;
    @Column
    private boolean teleinweapon;
    @Column
    private boolean teleinhook;
    @Column
    private boolean checkpoint_first;
    @Column
    private boolean bonus;
    @Column
    private boolean boost;
    @Column
    private boolean plasmaf;
    @Column
    private boolean plasmae;
    @Column
    private boolean plasmau;
}
