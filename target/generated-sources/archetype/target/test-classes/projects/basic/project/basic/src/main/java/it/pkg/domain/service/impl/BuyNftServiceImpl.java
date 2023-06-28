package it.pkg.domain.service.impl;

import it.pkg.acl.mapper.NftUserPoMapper;
import it.pkg.domain.manager.BalanceManager;
import it.pkg.domain.service.BuyNftService;

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
