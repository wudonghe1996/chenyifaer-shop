package com.chenyifaer.web.entity.vo;
/**
 *     _____ _            __     ___ ______                ________ ____ ______ ____
 *	  / ____| |           \ \   / (_)  ____|              / /____  |___ \____  |___ \
 *	 | |    | |__   ___ _ _\ \_/ / _| |__ __ _  ___ _ __ / /_   / /  __) |  / /  __) |
 *	 | |    | '_ \ / _ \ '_ \   / | |  __/ _` |/ _ \ '__| '_ \ / /  |__ <  / /  |__ <
 *	 | |____| | | |  __/ | | | |  | | | | (_| |  __/ |  | (_) / /   ___) |/ /   ___) |
 *	  \_____|_| |_|\___|_| |_|_|  |_|_|  \__,_|\___|_|   \___/_/   |____//_/   |____/
 *
 */

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 用户信息 - VO
 * @Author:wudh
 * @Date: 2019/5/21 11:22
 */
@Data
@Accessors(chain = true)
public class UserVO {

    /** 账号 */
    private String userAccount;

    /** 昵称 */
    private String userNickName;

    /** 姓名 */
    private String userName;

    /** 性别 */
    private Integer userSex;

    /** 手机号 */
    private String userPhone;

    /** 邮箱 */
    private String userEmail;

    /** 头像 */
    private String userHeadImage;

    /** 角色名 */
    private String roleName;

}
