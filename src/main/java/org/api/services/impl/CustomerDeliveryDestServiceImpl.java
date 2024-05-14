package org.api.services.impl;

import org.api.bean.ResultBean;
import org.api.dto.CustomerDeliveryDestDto;
import org.api.dto.CustomerDto;
import org.api.repository.customerDeliveryDest.CustomerDeliveryDestRepository;
import org.api.services.CustomerDeliveryDestService;
import org.api.utils.ApiValidateException;
import org.api.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerDeliveryDestServiceImpl implements CustomerDeliveryDestService {
    @Autowired
    private CustomerDeliveryDestRepository customerDeliveryDestRepository;
    @Override
    public ResultBean getAll(String deliveryName) throws ApiValidateException {
        List<CustomerDeliveryDestDto> customerDtoList =  customerDeliveryDestRepository.getAll(deliveryName);

        if (!customerDtoList.isEmpty()) {
            return new ResultBean(customerDtoList, Constants.STATUS_OK, Constants.MESSAGE_OK);
        } else {
            return new ResultBean(new ArrayList<>(), Constants.STATUS_OK, Constants.MESSAGE_OK);
        }
    }
}
