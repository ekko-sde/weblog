package com.daijun.weblog.web.service;

import com.daijun.weblog.module.common.utils.Response;
import com.daijun.weblog.web.model.vo.article.FindArticleDetailReqVO;
import com.daijun.weblog.web.model.vo.article.FindIndexArticlePageListReqVO;



public interface ArticleService {
    Response findArticlePageList(FindIndexArticlePageListReqVO findIndexArticlePageListReqVO);
    /**
     * 获取文章详情
     * @param findArticleDetailReqVO
     * @return
     */
    Response findArticleDetail(FindArticleDetailReqVO findArticleDetailReqVO);
}
