package com.daijun.weblog.module.admin.service;

import com.daijun.weblog.module.admin.model.vo.category.AddCategoryReqVO;
import com.daijun.weblog.module.admin.model.vo.category.DeleteCategoryReqVO;
import com.daijun.weblog.module.admin.model.vo.category.FindCategoryPageListReqVO;
import com.daijun.weblog.module.common.utils.PageResponse;
import com.daijun.weblog.module.common.utils.Response;

public interface AdminCategoryService {
    /**
     * 添加分类
     * @param addCategoryReqVO
     * @return
     */
    Response addCategory(AddCategoryReqVO addCategoryReqVO);
    PageResponse findCategoryList(FindCategoryPageListReqVO findCategoryPageListReqVO);
    Response deleteCategory(DeleteCategoryReqVO deleteCategoryReqVO);
    Response findCategorySelectList();
}