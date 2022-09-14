package com.bbarkthong.bbs.no_fe.model.VO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class ArticleVO {
    private String id;
    private String title;
    private String content;
}