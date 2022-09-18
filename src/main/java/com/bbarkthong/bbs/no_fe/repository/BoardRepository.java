package com.bbarkthong.bbs.no_fe.repository;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.bbarkthong.bbs.no_fe.model.VO.ArticleVO;
import com.bbarkthong.bbs.no_fe.model.VO.BoardVO;

@Repository
public interface BoardRepository {
    List<BoardVO> getAllBoards();

    List<ArticleVO> getAllArticles(String board_id);

    void registArticle(Map<String, Object> params);

    // INSERT INTO BOARD VALUES (3, '세번째 게시판');
}
