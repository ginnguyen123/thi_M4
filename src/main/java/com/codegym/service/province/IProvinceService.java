package com.codegym.service.province;

import com.codegym.model.Province;
import com.codegym.service.IGeneralService;

import java.util.List;

public interface IProvinceService extends IGeneralService<Province> {
    List<Province> findAllByDeletedIsFalse();
}
