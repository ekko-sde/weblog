package com.daijun.weblog.module.admin.controller;

import com.daijun.weblog.module.admin.model.vo.category.AddCategoryReqVO;
import com.daijun.weblog.module.admin.model.vo.category.DeleteCategoryReqVO;
import com.daijun.weblog.module.admin.model.vo.category.FindCategoryPageListReqVO;
import com.daijun.weblog.module.admin.model.vo.tag.AddTagReqVO;
import com.daijun.weblog.module.admin.model.vo.tag.DeleteTagReqVO;
import com.daijun.weblog.module.admin.model.vo.tag.FindTagPageListReqVO;
import com.daijun.weblog.module.admin.model.vo.tag.SearchTagReqVO;
import com.daijun.weblog.module.admin.service.AdminCategoryService;
import com.daijun.weblog.module.admin.service.AdminTagService;
import com.daijun.weblog.module.common.aspect.ApiOperationLog;
import com.daijun.weblog.module.common.utils.PageResponse;
import com.daijun.weblog.module.common.utils.Response;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/tag")
@Api(tags = "Admin 标签模块")
public class AdminTagController {

    @Autowired
    private AdminTagService tagService;

    @PostMapping("/add")
    @ApiOperation(value = "添加标签")
    @ApiOperationLog(description = "添加标签")
    public Response addTag(@RequestBody @Validated AddTagReqVO addtagReqVO) {
        return tagService.addTag(addtagReqVO);
    }
    @PostMapping("/list")
    @ApiOperation(value = "标签分页数据获取")
    @ApiOperationLog(description = "标签分页数据获取")
    public PageResponse findTagPageList(@RequestBody @Validated FindTagPageListReqVO findTagPageListReqVO) {
        return tagService.findTagPageList(findTagPageListReqVO);
    }
    @PostMapping("/delete")
    @ApiOperation(value = "删除标签")
    @ApiOperationLog(description = "删除标签")
    public Response deleteTag(@RequestBody @Validated DeleteTagReqVO deleteTagReqVO) {
        return tagService.deleteTag(deleteTagReqVO);
    }
    @PostMapping("/search")
    @ApiOperation(value = "标签模糊查询")
    @ApiOperationLog(description = "标签模糊查询")
    public Response searchTag(@RequestBody @Validated SearchTagReqVO searchTagReqVO) {
        return tagService.searchTag(searchTagReqVO);
    }
//    @PostMapping("/category/select/list")
//    @ApiOperation(value = "分类 Select 下拉列表数据获取")
//    @ApiOperationLog(description = "分类 Select 下拉列表数据获取")
//    public Response findCategorySelectList() {
//        return categoryService.findCategorySelectList();
//    }
    @PostMapping("/select/list")
    @ApiOperation(value = "查询标签 Select 列表数据")
    @ApiOperationLog(description = "查询标签 Select 列表数据")
    public Response findTagSelectList() {
        return tagService.findTagSelectList();
    }
}