#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${artifactId}.domain.service.impl;

import ${package}.${artifactId}.acl.mapper.NftUserPoMapper;
import ${package}.${artifactId}.domain.manager.BalanceManager;
import ${package}.${artifactId}.domain.service.BuyNftService;

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
