package cn.lzgabel.converter.bean.task;

import cn.lzgabel.converter.bean.BaseDefinition;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * 〈功能简述〉<br>
 * 〈JobWorker定义〉
 *
 * @author lizhi
 * @date 2021-10-30
 * @since 1.0.0
 */

@Data
@SuperBuilder
public abstract class JobWorkerDefinition extends BaseDefinition {

  private String jobType;

  private String jobRetries = "3";

  public JSONObject taskHeaders;

}