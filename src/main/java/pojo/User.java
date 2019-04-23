package pojo;

import java.io.Serializable;

/**
 * 描述
 *
 * @author 三国的包子  testing 分支改变数据
 * @version 1.0
 * @package pojo *
 * @since 1.0
 */
public class User implements Serializable {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
