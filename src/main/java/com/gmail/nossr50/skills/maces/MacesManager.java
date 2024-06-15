package com.gmail.nossr50.skills.maces;

import com.gmail.nossr50.datatypes.player.McMMOPlayer;
import com.gmail.nossr50.datatypes.skills.PrimarySkillType;
import com.gmail.nossr50.skills.SkillManager;

public class MacesManager extends SkillManager {
    public MacesManager(McMMOPlayer mmoPlayer) {
        super(mmoPlayer, PrimarySkillType.MACES);
    }
}
