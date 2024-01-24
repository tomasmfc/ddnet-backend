package com.rockus.ddnetbackend.model.mappers;

import java.util.ArrayList;
import java.util.List;

import com.rockus.ddnetbackend.model.MapInfo;
import com.rockus.ddnetbackend.model.dtos.MapInfoDto;

public class MapInfoMapper {
    public static MapInfoDto toDto(MapInfo mapInfo) {
        return new MapInfoDto(mapInfo.getMap(), mapInfo.getWidth(), mapInfo.getHeight(), mapInfo.isDeath(),
                mapInfo.isThrough(), mapInfo.isJump(), mapInfo.isDfreeze(), mapInfo.isEhook_start(),
                mapInfo.isHit_end(), mapInfo.isSolo_start(), mapInfo.isTele_gun(), mapInfo.isTele_grenade(),
                mapInfo.isTele_laser(), mapInfo.isNpc_start(), mapInfo.isSuper_start(), mapInfo.isJetpack_start(),
                mapInfo.isWalljump(), mapInfo.isNph_start(), mapInfo.isWeapon_shotgun(), mapInfo.isWeapon_grenade(),
                mapInfo.isPowerup_ninja(), mapInfo.isWeapon_rifle(), mapInfo.isLaser_stop(), mapInfo.isCrazy_shotgun(),
                mapInfo.isDragger(), mapInfo.isDoor(), mapInfo.isSwitch_timed(), mapInfo.is_switch(), mapInfo.isStop(),
                mapInfo.isThrough_all(), mapInfo.isTune(), mapInfo.isOldlaser(), mapInfo.isTeleinevil(),
                mapInfo.isTelein(), mapInfo.isTelecheck(), mapInfo.isTeleinweapon(), mapInfo.isTeleinhook(),
                mapInfo.isCheckpoint_first(), mapInfo.isBonus(), mapInfo.isBoost(), mapInfo.isPlasmaf(),
                mapInfo.isPlasmae(), mapInfo.isPlasmau());
    }

    public static List<MapInfoDto> toDtoList(List<MapInfo> mapInfoList) {
        List<MapInfoDto> mapInfoListDto = new ArrayList<>();
        for (MapInfo mapInfo : mapInfoList) {
            mapInfoListDto.add(toDto(mapInfo));
        }
        return mapInfoListDto;
    }
}
