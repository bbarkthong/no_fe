package com.bbarkthong.bbs.no_fe.model.tui;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Pagination {
    private int page;
    private long totalCount;
}
