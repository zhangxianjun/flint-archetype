package it.pkg.domain.service.impl;


import it.pkg.domain.manager.BalanceManager;
import it.pkg.domain.service.PublishNftService;

public class PublishNftServiceImpl implements PublishNftService {

    private BalanceManager balanceManager;

    @Override
    public void publishNft() {
        // 修改发布状态

        // 扣减发布费用
        balanceManager.saveBalance();
    }
}
