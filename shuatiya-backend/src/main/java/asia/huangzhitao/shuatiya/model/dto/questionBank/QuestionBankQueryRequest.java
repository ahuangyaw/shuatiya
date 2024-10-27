package asia.huangzhitao.shuatiya.model.dto.questionBank;

import asia.huangzhitao.shuatiya.common.PageRequest;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.List;

/**
 * 查询题库请求
 *
 *
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class QuestionBankQueryRequest extends PageRequest implements Serializable {

    /**
     * id
     */
    private Long id;

    /**
     * id
     */
    private Long notId;

    /**
     * 搜索词
     */
    private String searchText;

    /**
     * 标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签列表（json 数组）
     */
    private List<String> tags;

    /**
     * 创建用户 id
     */
    private Long userId;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片
     */
    private String picture;


    /**
     * 是否需要查询题库
     */
    private boolean needQueryQuestionList;

    private static final long serialVersionUID = 1L;
}