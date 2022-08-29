package com.familiasteste.familiasteste.vo.params;

import java.util.List;

import com.familiasteste.familiasteste.vo.FamiliaVO;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FamiliaParamVO {
	
	@ApiParam(value = "Lista de familia")
	private List<FamiliaVO> listaFamilia;
	
}
