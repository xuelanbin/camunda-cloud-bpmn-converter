package cn.lzgabel.converter.bean.event.start;

import cn.lzgabel.converter.bean.event.EventDefinition;
import lombok.experimental.SuperBuilder;

/**
 * 〈功能简述〉<br>
 * 〈〉
 *
 * @author lizhi
 * @date 2021/11/10
 * @since 1.0.0
 */

@SuperBuilder
public abstract class StartEventDefinition extends EventDefinition {

  @Override
  public String getNodeType() {
    return "startEvent";
  }
}