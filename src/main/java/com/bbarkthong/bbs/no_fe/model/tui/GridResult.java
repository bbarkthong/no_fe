package com.bbarkthong.bbs.no_fe.model.tui;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GridResult {
    private boolean result;
    private GridData data;
}
