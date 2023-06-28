package org.example.untitled1.domain.service.impl;

import org.example.untitled1.acl.mapper.NftUserPoMapper;
import org.example.untitled1.domain.manager.BalanceManager;
import org.example.untitled1.domain.service.BuyNftService;

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
