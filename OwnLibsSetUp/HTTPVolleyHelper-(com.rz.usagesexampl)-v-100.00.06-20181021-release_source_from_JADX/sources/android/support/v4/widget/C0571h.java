package android.support.v4.widget;

import android.widget.ListView;

/* renamed from: android.support.v4.widget.h */
public class C0571h extends C0243a {
    /* renamed from: f */
    private final ListView f1982f;

    public C0571h(ListView listView) {
        super(listView);
        this.f1982f = listView;
    }

    /* renamed from: a */
    public void mo116a(int i, int i2) {
        C0255i.m985a(this.f1982f, i2);
    }

    /* renamed from: e */
    public boolean mo117e(int i) {
        return false;
    }

    /* renamed from: f */
    public boolean mo118f(int i) {
        ListView listView = this.f1982f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            return i2 < count || listView.getChildAt(childCount - 1).getBottom() > listView.getHeight();
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
    }
}
