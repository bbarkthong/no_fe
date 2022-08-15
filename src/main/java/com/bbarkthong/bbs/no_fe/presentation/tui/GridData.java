package com.bbarkthong.bbs.no_fe.presentation.tui;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GridData {
    private List<?> contents;
    private Pagination pagination;
}
