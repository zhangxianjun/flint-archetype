package org.example.domain.service.impl;

import org.example.acl.mapper.NftUserPoMapper;
import org.example.domain.manager.BalanceManager;
import org.example.domain.service.BuyNftService;

/**
 * 用户操作
 */
public class BuyNftServiceImpl implements BuyNftService {

//    @Resource
    private NftUserPoMapper nftUserPoMapper;
    private BalanceManager balanceManager;

    @Override
    public void buyNft() {
        // 库存扣减
        subtractNft();
        // 资金扣减
        balanceManager.saveBalance();
    }

    /**
     * 扣减库存
     */
    private void subtractNft() {}
}
