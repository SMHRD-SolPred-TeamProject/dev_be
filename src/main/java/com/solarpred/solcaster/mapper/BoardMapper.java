package com.solarpred.solcaster.mapper;

import com.solarpred.solcaster.domain.Board;
import com.solarpred.solcaster.domain.Criteria;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@MapperScan
public interface BoardMapper {

    // 게시글 전체 조회
    public List<Map<String, Object>> boardList(Criteria cri);

    // 전체 게시물 개수 조회
    public int boardListCnt();

    // 글 작성 기능
    public void boardWriteForm(Board vo);

    // 특정 게시물 조회
    public Board boardView(int seq);

    // 게시물 수정 페이지
    public void boardUpdate(Board vo);

    // 특정 게시물 삭제
    public void boardDelete(int seq);
    
    // 특정 게시물 댓글 전부 삭제
    public void boardDeleteReply(int seq);


    // 선택된 카테고리 게시글 보기
    //@Select("select * from s_qna where qna_cat = #{qna_cat} order by qna_date desc limit #{pageStart}, #{perPageNum}")
    public List<Map<String, Object>> category(Criteria cri, String qna_cat);

    // 카테고리 게시글 개수 조회
    public int boardListCategoryCnt(String qna_cat);

}
