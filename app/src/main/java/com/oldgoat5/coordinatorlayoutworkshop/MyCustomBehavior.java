package com.oldgoat5.coordinatorlayoutworkshop;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/*********************************************************************
 * Override both of these constructors to prevent errors.
 *
 * @author Michael Evans 
 * @since 1/28/19
 *********************************************************************/
public class MyCustomBehavior
        extends CoordinatorLayout.Behavior<MyView> {

    /**
     * This is used when the layout has a behavior attached using the annotation.
     */
    public MyCustomBehavior() {
        super();
    }

    /**
     * This is used when the layout has a behavior attached using the xml app:layout_behavior.
     */
    public MyCustomBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /**
     * @param parent     - The CoordinatorLayout
     * @param child      - Your view
     * @param dependency - The view to check for a dependency
     * @return Returns true if dependency matches the view your child depends on.
     */
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, MyView child, View dependency) {
        return false; //todo
    }

    //region Layout Behaviors

    /**
     * @param parent     - The CoordinatorLayout
     * @param child      - Your view
     * @param dependency - The view your view depends on
     * @return Returns true if you have done something, false if not.
     */
    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, MyView child, View dependency) {
        return false; //todo
    }


    /**
     * Respond to a child's dependent view being removed.
     *
     * <p>This method is called after a dependent view has been removed from the parent.
     * A Behavior may use this method to appropriately update the child view in response.</p>
     *
     * <p>A view's dependency is determined by
     * {@link #layoutDependsOn(CoordinatorLayout, View, View)} or
     * if {@code child} has set another view as it's anchor.</p>
     *
     * @param parent     the parent view of the given child
     * @param child      the child view to manipulate
     * @param dependency the dependent view that has been removed
     */
    @Override
    public void onDependentViewRemoved(CoordinatorLayout parent, MyView child, View dependency) {
        super.onDependentViewRemoved(parent, child, dependency);
        //todo
    }

    //endregion

    //region Nested Scrolling Behaviors

    /**
     * Called when a nested scroll in progress is about to update,
     * before the target has consumed any of the scrolled distance.
     *
     * @param coordinatorLayout - The CoordinatorLayout parent of the view this Behavior is
     *                          associated with.
     * @param child      - The child view of the CoordinatorLayout this Behavior is associated with.
     * @param target            - The descendant view of the CoordinatorLayout performing the nested scroll.
     * @param dx                - The raw horizontal number of pixels that the user attempted to scroll.
     * @param dy                - The raw vertical number of pixels that the user attempted to scroll.
     * @param consumed          - out parameter.
     *                          consumed[0] should be set to the distance of dx that was consumed,
     *                          consumed[1] should be set to the distance of dy that was consumed.
     * @param type              - The type of input which cause this scroll event.
     */
    @Override
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout,
                                  MyView child,
                                  View target,
                                  int dx,
                                  int dy,
                                  int[] consumed,
                                  int type) {
        //set up your own scrolling view if you want to use this, our pre-made example is set up for
        //Layout Behaviors.  See the Layout Behaviors region.
    }

    /**
     * Called when a nested scroll in progress has updated and the target has scrolled or
     * attempted to scroll.
     */
    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout,
                               MyView child,
                               View target,
                               int dxConsumed,
                               int dyConsumed,
                               int dxUnconsumed,
                               int dyUnconsumed,
                               int type) {
        //set up your own scrolling view if you want to use this, our pre-made example is set up for
        //Layout Behaviors.  See the Layout Behaviors region.
    }

    /**
     * Called when a nested scroll has ended.
     */
    @Override
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout,
                                   MyView child,
                                   View target,
                                   int type) {

    }

    //there is also onNestedPreFling(), onNestedFling() and onStopNestedScroll() you can override.

    //endregion

    //region Touch Behaviors

    @Override
    public boolean onInterceptTouchEvent(CoordinatorLayout parent,
                                         MyView child,
                                         MotionEvent ev) {

        return super.onInterceptTouchEvent(parent, child, ev);
    }

    //endregion


}
