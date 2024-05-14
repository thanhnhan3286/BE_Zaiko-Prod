package org.api.services.impl;

import org.api.bean.dto.OutputListDto;
import org.api.bean.dto.SearchOutputListDto;
import org.api.repository.IInventoryOutputRepository;
import org.api.services.IInventoryOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryOutputServiceImpl implements IInventoryOutputService {
    @Autowired
    private IInventoryOutputRepository inventoryOutputRepository;

    @Override
    public List<OutputListDto> getAll() {
        return inventoryOutputRepository.getAll();
    }

    //ver using id
//    @Override
//    public Page<SearchOutputListDto> getListOutputWithPagination(String orderDateFrom, String orderDateTo, String planOutputDateFrom, String planOutputDateTo, String planWorkingDayFrom, String planWorkingDayTo, String planDeliverDateFrom, String planDeliverDateTo, String slipNoFrom, String slipNoTo, Integer customerIdFrom, Integer customerIdTo, String customerName, Integer destinationIdFrom, Integer destinationIdTo, String departmentName, Integer supplierIdFrom, Integer supplierIdTo, String supplierName, Integer productIdFrom, Integer productIdTo, String productName, Integer repositoryIdFrom, Integer repositoryIdTo, String batchNo, String deliveryType, String deliveryStatus, String isClosed, Pageable pageable, Integer ownerIdFrom, Integer ownerIdTo, String ownerName) {
//        return inventoryOutputRepository.getNewSearchList(orderDateFrom, orderDateTo, planOutputDateFrom, planOutputDateTo, planWorkingDayFrom, planWorkingDayTo, planDeliverDateFrom, planDeliverDateTo, slipNoFrom, slipNoTo, customerIdFrom, customerIdTo, customerName, destinationIdFrom, destinationIdTo, departmentName, supplierIdFrom, supplierIdTo, supplierName, productIdFrom, productIdTo, productName, repositoryIdFrom, repositoryIdTo, batchNo, deliveryType, deliveryStatus, isClosed, pageable, ownerIdFrom, ownerIdTo, ownerName);
//    }

// Ver dùng code
    @Override
    public Page<SearchOutputListDto> getListOutputWithPagination(String orderDateFrom,
                                                                 String orderDateTo,
                                                                 String planOutputDateFrom,
                                                                 String planOutputDateTo,
                                                                 String planWorkingDayFrom,
                                                                 String planWorkingDayTo,
                                                                 String planDeliverDateFrom,
                                                                 String planDeliverDateTo,
                                                                 String slipNoFrom,
                                                                 String slipNoTo,
                                                                 String customerCodeFrom,
                                                                 String customerCodeTo,
                                                                 String customerName,
                                                                 String destinationCodeFrom,
                                                                 String destinationCodeTo,
                                                                 String departmentName,
                                                                 String supplierCodeFrom,
                                                                 String supplierCodeTo,
                                                                 String supplierName,
                                                                 String productCodeFrom,
                                                                 String productCodeTo,
                                                                 String productName,
                                                                 Integer repositoryCodeFrom,
                                                                 Integer repositoryCodeTo,
                                                                 String batchNo,
                                                                 String deliveryType,
                                                                 String deliveryStatus,
                                                                 String isClosed,
                                                                 String ownerCodeFrom,
                                                                 String ownerCodeTo,
                                                                 String ownerName,
                                                                 Pageable pageable) {
        return inventoryOutputRepository.getNewSearchList(
                orderDateFrom,
                orderDateTo,
                planOutputDateFrom,
                planOutputDateTo,
                planWorkingDayFrom,
                planWorkingDayTo,
                planDeliverDateFrom,
                planDeliverDateTo,
                slipNoFrom,
                slipNoTo,
                customerCodeFrom,
                customerCodeTo,
                customerName,
                destinationCodeFrom,
                destinationCodeTo,
                departmentName,
                supplierCodeFrom,
                supplierCodeTo,
                supplierName,
                productCodeFrom,
                productCodeTo,
                productName,
                repositoryCodeFrom,
                repositoryCodeTo,
                batchNo,
                deliveryType,
                deliveryStatus,
                isClosed,
                ownerCodeFrom,
                ownerCodeTo,
                ownerName,
                pageable);
    }


}
