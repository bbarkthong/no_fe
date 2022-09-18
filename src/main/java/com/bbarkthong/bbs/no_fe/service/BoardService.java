package com.bbarkthong.bbs.no_fe.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.bbarkthong.bbs.no_fe.model.VO.ArticleVO;
import com.bbarkthong.bbs.no_fe.model.VO.BoardVO;
import com.bbarkthong.bbs.no_fe.repository.BoardRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public List<BoardVO> getAllBoards(Map<String, Object> params) {
        List<BoardVO> boards = new ArrayList<>();
        // boards.add(BoardVO.builder().id("1").title("1번째 게시판").build());
        // boards.add(BoardVO.builder().id("2").title("2번째 게시판").build());
        // boards.add(BoardVO.builder().id("3").title("3번째 게시판").build());

        boards = boardRepository.getAllBoards();
        return boards;
    }

    public List<ArticleVO> getAllArticles(String board_id, Map<String, Object> params) {
        List<ArticleVO> articles = new ArrayList<>();
        // articles.add(ArticleVO.builder().id("a").title(board_id + "번째 게시판의 1번째
        // 글").content("유후").build());
        // articles.add(ArticleVO.builder().id("b").title(board_id + "번째 게시판의 2번째
        // 글").content("아하").build());
        // articles.add(ArticleVO.builder().id("c").title(board_id + "번째 게시판의 3번째
        // 글").content("L 다음에").build());
        // articles.add(ArticleVO.builder().id("d").title(board_id + "번째 게시판의 4번째
        // 글").content("O 다음에").build());

        articles = boardRepository.getAllArticles(board_id);
        return articles;
    }

    public void registArticle(String board_id, Map<String, Object> params) {

        boardRepository.registArticle(params);
    }

}
