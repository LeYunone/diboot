package com.leyuna.diboot.control;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.diboot.core.binding.Binder;
import com.diboot.core.binding.annotation.BindField;
import com.leyuna.diboot.dao.BlogService;
import com.leyuna.diboot.dto.BlogDTO;
import com.leyuna.diboot.entry.Blog;
import com.leyuna.diboot.entry.Type;
import com.leyuna.util.TransformationUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pengli
 * @date 2021-09-27
 */
@RestController
public class DemoControl {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/text")
    public BlogDTO getBlog(){
        Blog entity = blogService.getBlog();
//        BlogDTO blogDTO = TransformationUtil.copyToDTO(entity, BlogDTO.class);
        BlogDTO blogDTO = Binder.convertAndBindRelations(entity, BlogDTO.class);
//        BlogDTO blogDTO = Binder.joinQueryOne(new QueryWrapper<Blog>().
//                                                eq("id", 1), BlogDTO.class);
        return blogDTO;
    }
}
