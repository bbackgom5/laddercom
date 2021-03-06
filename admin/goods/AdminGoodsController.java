package com.mycompany.teamproject.admin.goods.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.mycompany.teamproject.board.vo.SearchCriteriaVO;
import com.mycompany.teamproject.goods.vo.GoodsVO;
import com.mycompany.teamproject.goods.vo.ImageFileVO;

public interface AdminGoodsController {
	
	public ModelAndView AllGoods(SearchCriteriaVO scri,HttpServletRequest request, HttpServletResponse response) throws Exception;   // 상품 리스트
	public ModelAndView GoodsDetail(@RequestParam("productNum") int productNum, HttpServletRequest request,HttpServletResponse response)throws Exception; //상세
	public String add_newGoods(HttpServletRequest request,HttpServletResponse response) throws Exception;   // 상품 등록
	public ResponseEntity addNewGoods(@RequestParam("category")String category,
			MultipartHttpServletRequest multipartRequest, HttpServletResponse response)  throws Exception;
	
	public ModelAndView Allreview(SearchCriteriaVO scri,HttpServletRequest request, HttpServletResponse response) throws Exception; //후기 리스트
	public ModelAndView Reviewdetail(@RequestParam("re_num") int re_num, HttpServletRequest request,HttpServletResponse response)throws Exception; // 후기 상세보기
	public ModelAndView reviewupdate(@RequestParam("re_num") int re_num,HttpServletRequest request,HttpServletResponse response)throws Exception; //후기 답변하기
	public String review_action(GoodsVO vo, HttpServletRequest request, HttpServletResponse response)throws Exception;
	public String reviewdelete(@RequestParam("re_num")int re_num,HttpServletRequest request, HttpServletResponse response)throws Exception; //후기 삭제
	

}
