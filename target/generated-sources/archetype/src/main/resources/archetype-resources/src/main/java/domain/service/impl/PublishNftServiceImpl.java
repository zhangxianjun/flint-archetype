#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.domain.service.impl;


import ${package}.domain.manager.BalanceManager;
import ${package}.domain.service.PublishNftService;

public class PublishNftServiceImpl implements PublishNftService {

    private BalanceManager balanceManager;

    @Override
    public void publishNft() {
        // 修改发布状态

        // 扣减发布费用
        balanceManager.saveBalance();
    }
}
