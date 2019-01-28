package com.oldgoat5.coordinatorlayoutworkshop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.widget.TextView;

/*********************************************************************
 * @author Michael Evans 
 * @since 1/28/19
 *********************************************************************/
public class MyView
        extends android.support.v7.widget.AppCompatTextView
        implements CoordinatorLayout.AttachedBehavior {

    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyView(Context context, AttributeSet attributeSet, int defStyleAttr) {
        super(context, attributeSet, defStyleAttr);
    }

    /**
     * Implement this interface to add a behavior to your custom view.
     * @return Returns the behavior you want this view to have.
     */
    @NonNull
    @Override
    public CoordinatorLayout.Behavior getBehavior() {
        return null; //todo
    }
}
