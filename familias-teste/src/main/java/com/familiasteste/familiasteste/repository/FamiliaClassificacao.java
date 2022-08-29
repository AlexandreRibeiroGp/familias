package com.familiasteste.familiasteste.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.familiasteste.familiasteste.vo.FamiliaVO;
import com.familiasteste.familiasteste.vo.params.FamiliaParamVO;

@Repository
public abstract class FamiliaClassificacao {

	public abstract List<FamiliaVO> classificarFamilia(FamiliaParamVO params);

}
