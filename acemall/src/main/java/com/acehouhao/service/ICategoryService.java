package com.acehouhao.service;

import com.acehouhao.common.ServerResponse;
import com.acehouhao.pojo.Category;

import java.util.List;

/**
 * Created by Hao HOU on 2017/8/3.
 */
public interface ICategoryService {

    ServerResponse addCategory(String categoryName, Integer parentId);
    ServerResponse updateCategoryName(Integer categoryId, String categoryName);
    ServerResponse<List<Category>> getChildrenParallelCategory(Integer categoryId);
    ServerResponse selectCategoryAndChildrenById(Integer categoryId);
}
