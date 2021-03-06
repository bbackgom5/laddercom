<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" pageEncoding="utf-8"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<c:set var="goods" value="${goodsMap.goodsVO}" />
<c:set var="imageList" value="${goodsMap.imageList}" />
<!-- header -->
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/resources/css/mypage.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
	<!-- contents -->
	<div id="contents">
		<!-- 관리자 페이지 -->
		<section class="flex-center3">
			<div>
				<div class="myP_left">
					<ul class="my_gnb">
						<li class="depth1"><a class="depth1_b_m"
							href="${contextPath}/admin_main.do">관리자 페이지</a>
							<ul>
								<li><a href="${contextPath}/admin_member.do">회원 관리</a></li>
									<li><a href="${contextPath}/admin_order.do">주문 관리</a></li>
									<li><a href="${contextPath}/admin_prod.do">상품 관리</a></li>
									<li><a href="${contextPath}/admin_review.do">후기 관리</a></li>
									<li><a href="${contextPath}/admin_board_main.do">게시판 관리</a></li>
							</ul></li>
					</ul>
				</div>
				<main>
					<div class="title_wrap">
						<h2 class="tit_txt">관리자 페이지</h2>
					</div>
					<hr>

					<div class="order_list21">

						<div class="title_wrap">
							<h2 class="tit_txt" style="text-align: center">후기 관리</h2>
						</div>
						<div class="listTable21">
							<table border="0" cellspacing="0" cellpadding="0" width="100%"
								class="myP_Ttype1">
								<colgroup>
									<col width="30%">
									<col width="40%">
									<col width="30%">									
								</colgroup>
								<thead>
									<tr>
										<th>상품명</th>
										<th>내용</th>
										<th>작성자</th>										
									</tr>
								</thead>
								<c:forEach items="${list}" var="list">
									<c:choose>
										<c:when test="${empty list}">
											<tr height="10">
												<td colspan="4">
													<p align="center">
														<b><span style="font-size: 9pt;">등록된 후기가 없습니다.</span></b>
													</p>
												</td>
											</tr>
										</c:when>



										<c:when test="${list!=null}">



											<tbody>
												<tr>
													<td><c:out value="${list.productName}"></c:out></td>
													<td><a class='cls1'
														href="${contextPath}/admin_review_re.do?re_num=${list.re_num}">${list.re_content}</a></td>
													<td><c:out value="${list.user_id}"></c:out></td>													
												</tr>
											</tbody>
										</c:when>
									</c:choose>
								</c:forEach>
							</table>
						</div>

						<form role="form" method="get">

							<div class="review_page">

								<ul class="paging">

									<c:if test="${paging.prev}">

										<span><a
											href="${contextPath}/admin_review.do?page=${paging.startPage-1}">이전</a></span>

									</c:if>
									<c:forEach begin="${paging.startPage}" end="${paging.endPage}"
										var="num">

										<span><a
											href="${contextPath}/admin_review.do?page=${num}">${num}</a></span>

									</c:forEach>
									<c:if test="${paging.next && paging.endPage>0}">

										<span><a
											href="${contextPath}/admin_review.do?page=${paging.endPage+1}">다음</a></span>

									</c:if>
								</ul>
							</div>
						</form>
					</div>
				</main>
			</div>
		</section>
	</div>
</body>
</html>

