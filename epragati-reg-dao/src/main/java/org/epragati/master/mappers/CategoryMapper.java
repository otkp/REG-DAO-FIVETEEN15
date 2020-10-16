package org.epragati.master.mappers;

import org.springframework.stereotype.Component;

import org.epragati.common.mappers.BaseMapper;
import org.epragati.master.dto.CategoryDTO;
import org.epragati.master.vo.CategoryVO;

/**
 * @author sairam.cheruku
 *
 */
@Component
public class CategoryMapper extends BaseMapper<CategoryDTO, CategoryVO> {

	@Override
	public CategoryVO convertEntity(CategoryDTO dto) {
		CategoryVO masterCategoryVo = new CategoryVO();
		funPoint(dto.getCotegoryid(), masterCategoryVo::setCotegoryid);
		funPoint(dto.getCategorycode(), masterCategoryVo::setCategorycode);
		funPoint(dto.getCategorydescription(), masterCategoryVo::setCategorydescription);
		funPoint(dto.getStatus(), masterCategoryVo::setStatus);
		return masterCategoryVo;
	}

	@Override
	public CategoryDTO convertVO(CategoryVO vo) {
		CategoryDTO masterCategorydto = new CategoryDTO();
		funPoint(vo.getCotegoryid(), masterCategorydto::setCotegoryid);
		funPoint(vo.getCategorycode(), masterCategorydto::setCategorycode);
		funPoint(vo.getCategorydescription(), masterCategorydto::setCategorydescription);
		funPoint(vo.getStatus(), masterCategorydto::setStatus);
		return masterCategorydto;

	}

}
