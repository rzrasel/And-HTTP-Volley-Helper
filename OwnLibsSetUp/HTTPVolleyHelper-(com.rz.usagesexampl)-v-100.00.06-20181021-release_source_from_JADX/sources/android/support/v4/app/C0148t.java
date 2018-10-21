package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.p017g.C0227p;
import android.support.v4.p017g.C0229q;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: android.support.v4.app.t */
public abstract class C0148t {
    /* renamed from: a */
    static String m517a(Map<String, String> map, String str) {
        for (Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    /* renamed from: a */
    protected static void m518a(List<View> list, View view) {
        int size = list.size();
        if (!C0148t.m520a((List) list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = (View) list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!C0148t.m520a((List) list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    protected static boolean m519a(List list) {
        if (list != null) {
            if (!list.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m520a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public abstract Object mo50a(Object obj, Object obj2, Object obj3);

    /* renamed from: a */
    ArrayList<String> m522a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
            arrayList2.add(C0227p.m879e(view));
            C0227p.m875a(view, null);
        }
        return arrayList2;
    }

    /* renamed from: a */
    protected void m523a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    void m524a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        final int size = arrayList2.size();
        final ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = (View) arrayList.get(i);
            String e = C0227p.m879e(view2);
            arrayList4.add(e);
            if (e != null) {
                C0227p.m875a(view2, null);
                String str = (String) map.get(e);
                for (int i2 = 0; i2 < size; i2++) {
                    if (str.equals(arrayList3.get(i2))) {
                        C0227p.m875a((View) arrayList2.get(i2), e);
                        break;
                    }
                }
            }
        }
        final ArrayList<View> arrayList5 = arrayList2;
        final ArrayList<String> arrayList6 = arrayList3;
        final ArrayList<View> arrayList7 = arrayList;
        C0152w.m553a(view, new Runnable(this) {
            /* renamed from: f */
            final /* synthetic */ C0148t f619f;

            public void run() {
                for (int i = 0; i < size; i++) {
                    C0227p.m875a((View) arrayList5.get(i), (String) arrayList6.get(i));
                    C0227p.m875a((View) arrayList7.get(i), (String) arrayList4.get(i));
                }
            }
        });
    }

    /* renamed from: a */
    void m525a(View view, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0152w.m553a(view, new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C0148t f622c;

            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    String e = C0227p.m879e(view);
                    if (e != null) {
                        C0227p.m875a(view, C0148t.m517a(map, e));
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public abstract void mo51a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    void m527a(ViewGroup viewGroup, final ArrayList<View> arrayList, final Map<String, String> map) {
        C0152w.m553a(viewGroup, new Runnable(this) {
            /* renamed from: c */
            final /* synthetic */ C0148t f625c;

            public void run() {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    View view = (View) arrayList.get(i);
                    C0227p.m875a(view, (String) map.get(C0227p.m879e(view)));
                }
            }
        });
    }

    /* renamed from: a */
    public abstract void mo52a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo53a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo54a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo55a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo56a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo57a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    void m534a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() == 0) {
            Object obj;
            if (view instanceof ViewGroup) {
                obj = (ViewGroup) view;
                if (!C0229q.m890a(obj)) {
                    int childCount = obj.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        m534a((ArrayList) arrayList, obj.getChildAt(i));
                    }
                    return;
                }
            }
            arrayList.add(obj);
        }
    }

    /* renamed from: a */
    void m535a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String e = C0227p.m879e(view);
            if (e != null) {
                map.put(e, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    m535a((Map) map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* renamed from: a */
    public abstract boolean mo58a(Object obj);

    /* renamed from: b */
    public abstract Object mo59b(Object obj);

    /* renamed from: b */
    public abstract Object mo60b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo61b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo62b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo63b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo64c(Object obj);

    /* renamed from: c */
    public abstract void mo65c(Object obj, View view);
}
