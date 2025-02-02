package com.daijun.weblog.module.common.domain.mapper;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.daijun.weblog.module.common.domain.dos.TagDO;
import kotlin.jvm.internal.Lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public interface TagMapper extends BaseMapper<TagDO> {
    default Page<TagDO> selectPageList(long current,String name, long size, LocalDate startDate,LocalDate endDate){
        //分页对象
        Page<TagDO> page = new Page<>(current,size);
        //构建查询条件
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();
        wrapper
                .like(Objects.nonNull(name),TagDO::getName,name)
                .ge(Objects.nonNull(startDate),TagDO::getCreateTime,startDate)
                .le(Objects.nonNull(startDate),TagDO::getCreateTime,startDate)
                .orderByDesc(TagDO::getCreateTime);
        return selectPage(page,wrapper);
    }
    default List<TagDO> selectByKey(String key){
        LambdaQueryWrapper<TagDO> wrapper = new LambdaQueryWrapper<>();
        wrapper.like(TagDO::getName,key).orderByDesc(TagDO::getCreateTime);
        return selectList(wrapper);

    }
    // 省略...

    /**
     * 根据标签 ID 批量查询
     * @param tagIds
     * @return
     */
    default List<TagDO> selectByIds(List<Long> tagIds) {
        return selectList(Wrappers.<TagDO>lambdaQuery()
                .in(TagDO::getId, tagIds));
    }
}
