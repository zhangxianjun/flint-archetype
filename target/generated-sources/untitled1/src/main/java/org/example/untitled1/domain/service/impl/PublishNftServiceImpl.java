package org.example.untitled1.domain.service.impl;


import org.example.untitled1.domain.manager.BalanceManager;
import org.example.untitled1.domain.service.PublishNftService;

public class PublishNftServiceImpl implements PublishNftService {

    private BalanceManager balanceManager;

    @Override
    public void publishNft() {
        // 修改发布状态

        // 扣减发布费用
        balanceManager.saveBalance();
    }
}
