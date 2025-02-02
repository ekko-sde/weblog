package com.daijun.weblog.module.admin.service;

import com.daijun.weblog.module.admin.model.vo.user.UpdateAdminUserPasswordReqVO;
import com.daijun.weblog.module.common.utils.Response;

public interface AdminUserService {
    /**
     * 修改密码
     * @param updateAdminUserPasswordReqVO
     * @return
     */
    Response updatePassword(UpdateAdminUserPasswordReqVO updateAdminUserPasswordReqVO);
    Response findUserInfo();
}
