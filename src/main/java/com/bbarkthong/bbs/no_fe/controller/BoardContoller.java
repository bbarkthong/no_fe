package com.bbarkthong.bbs.no_fe.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bbarkthong.bbs.no_fe.model.VO.ArticleVO;
import com.bbarkthong.bbs.no_fe.model.VO.BoardVO;
import com.bbarkthong.bbs.no_fe.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/Board")
public class BoardContoller {

    private final BoardService boardService;

    @GetMapping("/all")
    public List<BoardVO> getAllBoards(
            @RequestParam Map<String, Object> params) {
        return boardService.getAllBoards(params);
    }

    @GetMapping("/{board_id}/all")
    public List<ArticleVO> getAllArticles(
            @RequestParam Map<String, Object> params,
            @PathVariable("board_id") String board_id) {
        return boardService.getAllArticles(board_id, params);
    }

    @PostMapping("/{board_id}/regist")
    public void registArticles(
            @RequestParam Map<String, Object> params,
            @PathVariable("board_id") String board_id) {
        log.debug(params.toString());
        boardService.registArticle(board_id, params);
    }

}
