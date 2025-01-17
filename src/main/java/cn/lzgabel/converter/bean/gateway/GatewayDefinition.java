package cn.lzgabel.converter.bean.gateway;

import cn.lzgabel.converter.bean.BaseDefinition;
import com.google.common.collect.Lists;
import lombok.experimental.SuperBuilder;

import java.util.List;

/**
 * 〈功能简述〉<br>
 * 〈网关数据定义〉
 *
 * @author lizhi
 * @since 1.0.0
 */

@SuperBuilder
public abstract class GatewayDefinition extends BaseDefinition {

    /**
     * 分支节点
     */
    private List<BranchNode> branchNodes;

    public List<BranchNode> getBranchNodes() {
        return branchNodes;
    }

    public abstract static class GatewayDefinitionBuilder<C extends GatewayDefinition, B extends GatewayDefinition.GatewayDefinitionBuilder<C, B>>
            extends BaseDefinitionBuilder<C, B> {

        public GatewayDefinitionBuilder() {
            branchNodes = Lists.newArrayList();
        }

        public B branchNode(BranchNode branchNode) {
            branchNodes.add(branchNode);
            return self();
        }
    }
}
