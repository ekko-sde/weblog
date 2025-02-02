package com.daijun.weblog.module.admin.service;

import com.daijun.weblog.module.admin.model.vo.category.AddCategoryReqVO;
import com.daijun.weblog.module.admin.model.vo.category.DeleteCategoryReqVO;
import com.daijun.weblog.module.admin.model.vo.category.FindCategoryPageListReqVO;
import com.daijun.weblog.module.admin.model.vo.tag.AddTagReqVO;
import com.daijun.weblog.module.admin.model.vo.tag.DeleteTagReqVO;
import com.daijun.weblog.module.admin.model.vo.tag.FindTagPageListReqVO;
import com.daijun.weblog.module.admin.model.vo.tag.SearchTagReqVO;
import com.daijun.weblog.module.common.utils.PageResponse;
import com.daijun.weblog.module.common.utils.Response;

public interface AdminTagService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addTag(AddTagReqVO addtagReqVO);

    PageResponse findTagPageList(FindTagPageListReqVO findTagPageListReqVO);

    Response deleteTag(DeleteTagReqVO deleteTagReqVO);
    Response searchTag(SearchTagReqVO searchTagReqVO);
    Response findTagSelectList();
}