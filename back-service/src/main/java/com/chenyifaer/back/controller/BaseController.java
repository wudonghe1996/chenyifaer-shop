package com.chenyifaer.back.controller;
/**
 *     _____ _            __     ___ ______                ________ ____ ______ ____
 *	  / ____| |           \ \   / (_)  ____|              / /____  |___ \____  |___ \
 *	 | |    | |__   ___ _ _\ \_/ / _| |__ __ _  ___ _ __ / /_   / /  __) |  / /  __) |
 *	 | |    | '_ \ / _ \ '_ \   / | |  __/ _` |/ _ \ '__| '_ \ / /  |__ <  / /  |__ <
 *	 | |____| | | |  __/ | | | |  | | | | (_| |  __/ |  | (_) / /   ___) |/ /   ___) |
 *	  \_____|_| |_|\___|_| |_|_|  |_|_|  \__,_|\___|_|   \___/_/   |____//_/   |____/
 *
 */

import com.chenyifaer.basic.common.entity.LoginAppUser;
import com.chenyifaer.basic.common.util.SystemUserUtil;

/**
 * 全局公用controller
 * @Author:wudh
 * @Date: 2019/4/7 19:50
 */
public class BaseController {

    /**
     * 获取userId
     * @Author:wudh
     * @Date: 2019/4/7 19:51
     */
    public Integer getUserId() {
        LoginAppUser loginAppUser = SystemUserUtil.getLoginAppUser();
        int userId = loginAppUser.getAdminUserId();
        return userId;
    }
}
