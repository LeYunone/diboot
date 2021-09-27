package com.leyuna.diboot.dao;

import com.diboot.core.service.impl.BaseServiceImpl;
import com.leyuna.diboot.entry.Blog;
import com.leyuna.diboot.entry.Type;
import com.leyuna.diboot.mapper.BlogMapper;
import com.leyuna.diboot.mapper.TypeMapper;
import jdk.nashorn.internal.codegen.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author pengli
 * @date 2021-09-27
 */
@Service
public class TypeServiceImpl extends BaseServiceImpl<TypeMapper,Type>  implements TypeService{
}
