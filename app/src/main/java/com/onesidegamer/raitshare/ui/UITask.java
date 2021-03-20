package com.onesidegamer.raitshare.ui;

import com.genonbeta.android.framework.util.Interrupter;

/**
 * created by:kailas_rathod
* date: 16/04/18 22:41
 */
public interface UITask
{
    void updateTaskStarted(final Interrupter interrupter);

    void updateTaskStopped();
}
