package com.alexanderarend.character.manage;

import com.alexanderarend.dto.CharSelectResponse;

public interface SelectCharacter {
    public CharSelectResponse makeCharacterSelection(final String userId,final String charId, final String charType ,CharSelectResponse response);
}
