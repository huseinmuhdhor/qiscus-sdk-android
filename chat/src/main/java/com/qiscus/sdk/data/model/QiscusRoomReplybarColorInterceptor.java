package com.qiscus.sdk.data.model;

import android.support.annotation.ColorRes;

/**
 * @author yuana <andhikayuana@gmail.com>
 * @since 1/10/18
 */

public interface QiscusRoomReplybarColorInterceptor {
    @ColorRes
    int getColor(QiscusComment qiscusComment);
}
