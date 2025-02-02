package com.daijun.weblog.module.admin.service;

import com.daijun.weblog.module.admin.model.vo.blogsettings.UpdateBlogSettingsReqVO;
import com.daijun.weblog.module.common.utils.Response;

public interface AdminBlogSettingsService {
    /**
     * 更新博客设置信息
     * @param updateBlogSettingsReqVO
     * @return
     */
    Response updateBlogSettings(UpdateBlogSettingsReqVO updateBlogSettingsReqVO);
    Response findDetail();
}

