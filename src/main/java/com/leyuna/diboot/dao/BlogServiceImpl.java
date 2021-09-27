package com.leyuna.diboot.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leyuna.diboot.entry.Blog;
import com.leyuna.diboot.mapper.BlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pengli
 * @date 2021-09-27
 */
@Service
public class BlogServiceImpl  implements BlogService{

    @Autowired
    private BlogMapper baseMapper;

    @Override
    public Blog getBlog(){
        return baseMapper.selectById(1);
    }
}
