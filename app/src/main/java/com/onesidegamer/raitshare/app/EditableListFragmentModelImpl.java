package com.onesidegamer.raitshare.app;

import com.onesidegamer.raitshare.widget.EditableListAdapter;

/**
 * created by:kailas_rathod
* date: 8/24/18 1:36 PM
 */
public interface EditableListFragmentModelImpl<V extends EditableListAdapter.EditableViewHolder>
{
    void setLayoutClickListener(EditableListFragment.LayoutClickListener<V> clickListener);
}
