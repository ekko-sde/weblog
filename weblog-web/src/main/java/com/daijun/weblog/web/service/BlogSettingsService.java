package com.daijun.weblog.web.service;

import com.daijun.weblog.module.common.utils.Response;

public interface BlogSettingsService {
    /**
     * 获取博客设置信息
     * @return
     */
    Response findDetail();
}
