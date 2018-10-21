package android.support.v7.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.v4.p017g.C0227p;
import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.C0238b;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.widget.aj.C0366a;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import java.lang.ref.WeakReference;

class AlertController {
    /* renamed from: A */
    private int f909A;
    /* renamed from: B */
    private boolean f910B = false;
    /* renamed from: C */
    private CharSequence f911C;
    /* renamed from: D */
    private Drawable f912D;
    /* renamed from: E */
    private CharSequence f913E;
    /* renamed from: F */
    private Drawable f914F;
    /* renamed from: G */
    private CharSequence f915G;
    /* renamed from: H */
    private Drawable f916H;
    /* renamed from: I */
    private int f917I = 0;
    /* renamed from: J */
    private Drawable f918J;
    /* renamed from: K */
    private ImageView f919K;
    /* renamed from: L */
    private TextView f920L;
    /* renamed from: M */
    private TextView f921M;
    /* renamed from: N */
    private View f922N;
    /* renamed from: O */
    private int f923O;
    /* renamed from: P */
    private int f924P;
    /* renamed from: Q */
    private boolean f925Q;
    /* renamed from: R */
    private int f926R = 0;
    /* renamed from: S */
    private final OnClickListener f927S = new C02711(this);
    /* renamed from: a */
    final C0583k f928a;
    /* renamed from: b */
    ListView f929b;
    /* renamed from: c */
    Button f930c;
    /* renamed from: d */
    Message f931d;
    /* renamed from: e */
    Button f932e;
    /* renamed from: f */
    Message f933f;
    /* renamed from: g */
    Button f934g;
    /* renamed from: h */
    Message f935h;
    /* renamed from: i */
    NestedScrollView f936i;
    /* renamed from: j */
    ListAdapter f937j;
    /* renamed from: k */
    int f938k = -1;
    /* renamed from: l */
    int f939l;
    /* renamed from: m */
    int f940m;
    /* renamed from: n */
    int f941n;
    /* renamed from: o */
    int f942o;
    /* renamed from: p */
    Handler f943p;
    /* renamed from: q */
    private final Context f944q;
    /* renamed from: r */
    private final Window f945r;
    /* renamed from: s */
    private final int f946s;
    /* renamed from: t */
    private CharSequence f947t;
    /* renamed from: u */
    private CharSequence f948u;
    /* renamed from: v */
    private View f949v;
    /* renamed from: w */
    private int f950w;
    /* renamed from: x */
    private int f951x;
    /* renamed from: y */
    private int f952y;
    /* renamed from: z */
    private int f953z;

    /* renamed from: android.support.v7.app.AlertController$1 */
    class C02711 implements OnClickListener {
        /* renamed from: a */
        final /* synthetic */ AlertController f842a;

        C02711(AlertController alertController) {
            this.f842a = alertController;
        }

        public void onClick(View view) {
            Message message;
            if (view == this.f842a.f930c && this.f842a.f931d != null) {
                message = this.f842a.f931d;
            } else if (view == this.f842a.f932e && this.f842a.f933f != null) {
                message = this.f842a.f933f;
            } else if (view != this.f842a.f934g || this.f842a.f935h == null) {
                message = null;
                if (message != null) {
                    message.sendToTarget();
                }
                this.f842a.f943p.obtainMessage(1, this.f842a.f928a).sendToTarget();
            } else {
                message = this.f842a.f935h;
            }
            message = Message.obtain(message);
            if (message != null) {
                message.sendToTarget();
            }
            this.f842a.f943p.obtainMessage(1, this.f842a.f928a).sendToTarget();
        }
    }

    public static class RecycleListView extends ListView {
        /* renamed from: a */
        private final int f852a;
        /* renamed from: b */
        private final int f853b;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0269j.RecycleListView);
            this.f853b = obtainStyledAttributes.getDimensionPixelOffset(C0269j.RecycleListView_paddingBottomNoButtons, -1);
            this.f852a = obtainStyledAttributes.getDimensionPixelOffset(C0269j.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void m992a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f852a, getPaddingRight(), z2 ? getPaddingBottom() : this.f853b);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$a */
    public static class C0280a {
        /* renamed from: A */
        public int f866A;
        /* renamed from: B */
        public int f867B;
        /* renamed from: C */
        public int f868C;
        /* renamed from: D */
        public int f869D;
        /* renamed from: E */
        public boolean f870E = false;
        /* renamed from: F */
        public boolean[] f871F;
        /* renamed from: G */
        public boolean f872G;
        /* renamed from: H */
        public boolean f873H;
        /* renamed from: I */
        public int f874I = -1;
        /* renamed from: J */
        public OnMultiChoiceClickListener f875J;
        /* renamed from: K */
        public Cursor f876K;
        /* renamed from: L */
        public String f877L;
        /* renamed from: M */
        public String f878M;
        /* renamed from: N */
        public OnItemSelectedListener f879N;
        /* renamed from: O */
        public C0279a f880O;
        /* renamed from: P */
        public boolean f881P = true;
        /* renamed from: a */
        public final Context f882a;
        /* renamed from: b */
        public final LayoutInflater f883b;
        /* renamed from: c */
        public int f884c = 0;
        /* renamed from: d */
        public Drawable f885d;
        /* renamed from: e */
        public int f886e = 0;
        /* renamed from: f */
        public CharSequence f887f;
        /* renamed from: g */
        public View f888g;
        /* renamed from: h */
        public CharSequence f889h;
        /* renamed from: i */
        public CharSequence f890i;
        /* renamed from: j */
        public Drawable f891j;
        /* renamed from: k */
        public DialogInterface.OnClickListener f892k;
        /* renamed from: l */
        public CharSequence f893l;
        /* renamed from: m */
        public Drawable f894m;
        /* renamed from: n */
        public DialogInterface.OnClickListener f895n;
        /* renamed from: o */
        public CharSequence f896o;
        /* renamed from: p */
        public Drawable f897p;
        /* renamed from: q */
        public DialogInterface.OnClickListener f898q;
        /* renamed from: r */
        public boolean f899r;
        /* renamed from: s */
        public OnCancelListener f900s;
        /* renamed from: t */
        public OnDismissListener f901t;
        /* renamed from: u */
        public OnKeyListener f902u;
        /* renamed from: v */
        public CharSequence[] f903v;
        /* renamed from: w */
        public ListAdapter f904w;
        /* renamed from: x */
        public DialogInterface.OnClickListener f905x;
        /* renamed from: y */
        public int f906y;
        /* renamed from: z */
        public View f907z;

        /* renamed from: android.support.v7.app.AlertController$a$a */
        public interface C0279a {
            /* renamed from: a */
            void m993a(ListView listView);
        }

        public C0280a(Context context) {
            this.f882a = context;
            this.f899r = true;
            this.f883b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m994b(final AlertController alertController) {
            ListAdapter simpleCursorAdapter;
            OnItemClickListener c02773;
            final RecycleListView recycleListView = (RecycleListView) this.f883b.inflate(alertController.f939l, null);
            if (!this.f872G) {
                int i = this.f873H ? alertController.f941n : alertController.f942o;
                simpleCursorAdapter = this.f876K != null ? new SimpleCursorAdapter(this.f882a, i, this.f876K, new String[]{this.f877L}, new int[]{16908308}) : this.f904w != null ? this.f904w : new C0282c(this.f882a, i, 16908308, this.f903v);
            } else if (this.f876K == null) {
                final RecycleListView recycleListView2 = recycleListView;
                r1 = new ArrayAdapter<CharSequence>(this, this.f882a, alertController.f940m, 16908308, this.f903v) {
                    /* renamed from: b */
                    final /* synthetic */ C0280a f855b;

                    public View getView(int i, View view, ViewGroup viewGroup) {
                        view = super.getView(i, view, viewGroup);
                        if (this.f855b.f871F != null && this.f855b.f871F[i]) {
                            recycleListView2.setItemChecked(i, true);
                        }
                        return view;
                    }
                };
            } else {
                final RecycleListView recycleListView3 = recycleListView;
                final AlertController alertController2 = alertController;
                r1 = new CursorAdapter(this, this.f882a, this.f876K, false) {
                    /* renamed from: c */
                    final /* synthetic */ C0280a f858c;
                    /* renamed from: d */
                    private final int f859d;
                    /* renamed from: e */
                    private final int f860e;

                    public void bindView(View view, Context context, Cursor cursor) {
                        ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f859d));
                        RecycleListView recycleListView = recycleListView3;
                        int position = cursor.getPosition();
                        boolean z = true;
                        if (cursor.getInt(this.f860e) != 1) {
                            z = false;
                        }
                        recycleListView.setItemChecked(position, z);
                    }

                    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                        return this.f858c.f883b.inflate(alertController2.f940m, viewGroup, false);
                    }
                };
            }
            if (this.f880O != null) {
                this.f880O.m993a(recycleListView);
            }
            alertController.f937j = simpleCursorAdapter;
            alertController.f938k = this.f874I;
            if (this.f905x != null) {
                c02773 = new OnItemClickListener(this) {
                    /* renamed from: b */
                    final /* synthetic */ C0280a f862b;

                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                        this.f862b.f905x.onClick(alertController.f928a, i);
                        if (!this.f862b.f873H) {
                            alertController.f928a.dismiss();
                        }
                    }
                };
            } else {
                if (this.f875J != null) {
                    c02773 = new OnItemClickListener(this) {
                        /* renamed from: c */
                        final /* synthetic */ C0280a f865c;

                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                            if (this.f865c.f871F != null) {
                                this.f865c.f871F[i] = recycleListView.isItemChecked(i);
                            }
                            this.f865c.f875J.onClick(alertController.f928a, i, recycleListView.isItemChecked(i));
                        }
                    };
                }
                if (this.f879N != null) {
                    recycleListView.setOnItemSelectedListener(this.f879N);
                }
                if (this.f873H) {
                    recycleListView.setChoiceMode(1);
                } else if (this.f872G) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.f929b = recycleListView;
            }
            recycleListView.setOnItemClickListener(c02773);
            if (this.f879N != null) {
                recycleListView.setOnItemSelectedListener(this.f879N);
            }
            if (this.f873H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f872G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f929b = recycleListView;
        }

        /* renamed from: a */
        public void m995a(AlertController alertController) {
            if (this.f888g != null) {
                alertController.m1016b(this.f888g);
            } else {
                if (this.f887f != null) {
                    alertController.m1013a(this.f887f);
                }
                if (this.f885d != null) {
                    alertController.m1011a(this.f885d);
                }
                if (this.f884c != 0) {
                    alertController.m1015b(this.f884c);
                }
                if (this.f886e != 0) {
                    alertController.m1015b(alertController.m1019c(this.f886e));
                }
            }
            if (this.f889h != null) {
                alertController.m1017b(this.f889h);
            }
            if (!(this.f890i == null && this.f891j == null)) {
                alertController.m1010a(-1, this.f890i, this.f892k, null, this.f891j);
            }
            if (!(this.f893l == null && this.f894m == null)) {
                alertController.m1010a(-2, this.f893l, this.f895n, null, this.f894m);
            }
            if (!(this.f896o == null && this.f897p == null)) {
                alertController.m1010a(-3, this.f896o, this.f898q, null, this.f897p);
            }
            if (!(this.f903v == null && this.f876K == null && this.f904w == null)) {
                m994b(alertController);
            }
            if (this.f907z != null) {
                if (this.f870E) {
                    alertController.m1012a(this.f907z, this.f866A, this.f867B, this.f868C, this.f869D);
                    return;
                }
                alertController.m1020c(this.f907z);
            } else if (this.f906y != 0) {
                alertController.m1009a(this.f906y);
            }
        }
    }

    /* renamed from: android.support.v7.app.AlertController$b */
    private static final class C0281b extends Handler {
        /* renamed from: a */
        private WeakReference<DialogInterface> f908a;

        public C0281b(DialogInterface dialogInterface) {
            this.f908a = new WeakReference(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case -3:
                    case -2:
                    case -1:
                        ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f908a.get(), message.what);
                        return;
                    default:
                        return;
                }
            }
            ((DialogInterface) message.obj).dismiss();
        }
    }

    /* renamed from: android.support.v7.app.AlertController$c */
    private static class C0282c extends ArrayAdapter<CharSequence> {
        public C0282c(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0583k c0583k, Window window) {
        this.f944q = context;
        this.f928a = c0583k;
        this.f945r = window;
        this.f943p = new C0281b(c0583k);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C0269j.AlertDialog, C0260a.alertDialogStyle, 0);
        this.f923O = obtainStyledAttributes.getResourceId(C0269j.AlertDialog_android_layout, 0);
        this.f924P = obtainStyledAttributes.getResourceId(C0269j.AlertDialog_buttonPanelSideLayout, 0);
        this.f939l = obtainStyledAttributes.getResourceId(C0269j.AlertDialog_listLayout, 0);
        this.f940m = obtainStyledAttributes.getResourceId(C0269j.AlertDialog_multiChoiceItemLayout, 0);
        this.f941n = obtainStyledAttributes.getResourceId(C0269j.AlertDialog_singleChoiceItemLayout, 0);
        this.f942o = obtainStyledAttributes.getResourceId(C0269j.AlertDialog_listItemLayout, 0);
        this.f925Q = obtainStyledAttributes.getBoolean(C0269j.AlertDialog_showTitle, true);
        this.f946s = obtainStyledAttributes.getDimensionPixelSize(C0269j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        c0583k.m2489a(1);
    }

    /* renamed from: a */
    private ViewGroup m996a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: a */
    static void m997a(View view, View view2, View view3) {
        int i = 4;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i = 0;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m998a(ViewGroup viewGroup) {
        boolean z = false;
        View inflate = this.f949v != null ? this.f949v : this.f950w != 0 ? LayoutInflater.from(this.f944q).inflate(this.f950w, viewGroup, false) : null;
        if (inflate != null) {
            z = true;
        }
        if (!(z && m1002a(inflate))) {
            this.f945r.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f945r.findViewById(C0265f.custom);
            frameLayout.addView(inflate, new LayoutParams(-1, -1));
            if (this.f910B) {
                frameLayout.setPadding(this.f951x, this.f952y, this.f953z, this.f909A);
            }
            if (this.f929b != null) {
                ((C0366a) viewGroup.getLayoutParams()).f1272g = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    private void m999a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f945r.findViewById(C0265f.scrollIndicatorUp);
        View findViewById2 = this.f945r.findViewById(C0265f.scrollIndicatorDown);
        if (VERSION.SDK_INT >= 23) {
            C0227p.m867a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        view = null;
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 == null || (i & 2) != 0) {
            view = findViewById2;
        } else {
            viewGroup.removeView(findViewById2);
        }
        if (findViewById != null || view != null) {
            if (this.f948u != null) {
                this.f936i.setOnScrollChangeListener(new C0238b(this) {
                    /* renamed from: c */
                    final /* synthetic */ AlertController f1985c;

                    /* renamed from: a */
                    public void mo120a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                        AlertController.m997a(nestedScrollView, findViewById, view);
                    }
                });
                this.f936i.post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ AlertController f845c;

                    public void run() {
                        AlertController.m997a(this.f845c.f936i, findViewById, view);
                    }
                });
            } else if (this.f929b != null) {
                this.f929b.setOnScrollListener(new OnScrollListener(this) {
                    /* renamed from: c */
                    final /* synthetic */ AlertController f848c;

                    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
                        AlertController.m997a(absListView, findViewById, view);
                    }

                    public void onScrollStateChanged(AbsListView absListView, int i) {
                    }
                });
                this.f929b.post(new Runnable(this) {
                    /* renamed from: c */
                    final /* synthetic */ AlertController f851c;

                    public void run() {
                        AlertController.m997a(this.f851c.f929b, findViewById, view);
                    }
                });
            } else {
                if (findViewById != null) {
                    viewGroup.removeView(findViewById);
                }
                if (view != null) {
                    viewGroup.removeView(view);
                }
            }
        }
    }

    /* renamed from: a */
    private void m1000a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private static boolean m1001a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0260a.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    /* renamed from: a */
    static boolean m1002a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m1002a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m1003b() {
        return this.f924P == 0 ? this.f923O : this.f926R == 1 ? this.f924P : this.f923O;
    }

    /* renamed from: b */
    private void m1004b(ViewGroup viewGroup) {
        if (this.f922N != null) {
            viewGroup.addView(this.f922N, 0, new LayoutParams(-1, -2));
            this.f945r.findViewById(C0265f.title_template).setVisibility(8);
            return;
        }
        this.f919K = (ImageView) this.f945r.findViewById(16908294);
        if ((TextUtils.isEmpty(this.f947t) ^ 1) == 0 || !this.f925Q) {
            this.f945r.findViewById(C0265f.title_template).setVisibility(8);
            this.f919K.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        this.f920L = (TextView) this.f945r.findViewById(C0265f.alertTitle);
        this.f920L.setText(this.f947t);
        if (this.f917I != 0) {
            this.f919K.setImageResource(this.f917I);
        } else if (this.f918J != null) {
            this.f919K.setImageDrawable(this.f918J);
        } else {
            this.f920L.setPadding(this.f919K.getPaddingLeft(), this.f919K.getPaddingTop(), this.f919K.getPaddingRight(), this.f919K.getPaddingBottom());
            this.f919K.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m1005c() {
        View findViewById = this.f945r.findViewById(C0265f.parentPanel);
        View findViewById2 = findViewById.findViewById(C0265f.topPanel);
        View findViewById3 = findViewById.findViewById(C0265f.contentPanel);
        View findViewById4 = findViewById.findViewById(C0265f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById.findViewById(C0265f.customPanel);
        m998a(viewGroup);
        View findViewById5 = viewGroup.findViewById(C0265f.topPanel);
        View findViewById6 = viewGroup.findViewById(C0265f.contentPanel);
        View findViewById7 = viewGroup.findViewById(C0265f.buttonPanel);
        ViewGroup a = m996a(findViewById5, findViewById2);
        ViewGroup a2 = m996a(findViewById6, findViewById3);
        ViewGroup a3 = m996a(findViewById7, findViewById4);
        m1006c(a2);
        m1007d(a3);
        m1004b(a);
        int i = 0;
        Object obj = (viewGroup == null || viewGroup.getVisibility() == 8) ? null : 1;
        boolean z = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z2 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z2 || a2 == null)) {
            findViewById5 = a2.findViewById(C0265f.textSpacerNoButtons);
            if (findViewById5 != null) {
                findViewById5.setVisibility(0);
            }
        }
        if (z) {
            if (this.f936i != null) {
                this.f936i.setClipToPadding(true);
            }
            findViewById5 = null;
            if (!(this.f948u == null && this.f929b == null)) {
                findViewById5 = a.findViewById(C0265f.titleDividerNoCustom);
            }
            if (findViewById5 != null) {
                findViewById5.setVisibility(0);
            }
        } else if (a2 != null) {
            findViewById2 = a2.findViewById(C0265f.textSpacerNoTitle);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        }
        if (this.f929b instanceof RecycleListView) {
            ((RecycleListView) this.f929b).m992a(z, z2);
        }
        if (obj == null) {
            findViewById = this.f929b != null ? this.f929b : this.f936i;
            if (findViewById != null) {
                if (z2) {
                    i = 2;
                }
                m999a(a2, findViewById, z | i, 3);
            }
        }
        ListView listView = this.f929b;
        if (listView != null && this.f937j != null) {
            listView.setAdapter(this.f937j);
            int i2 = this.f938k;
            if (i2 > -1) {
                listView.setItemChecked(i2, true);
                listView.setSelection(i2);
            }
        }
    }

    /* renamed from: c */
    private void m1006c(ViewGroup viewGroup) {
        this.f936i = (NestedScrollView) this.f945r.findViewById(C0265f.scrollView);
        this.f936i.setFocusable(false);
        this.f936i.setNestedScrollingEnabled(false);
        this.f921M = (TextView) viewGroup.findViewById(16908299);
        if (this.f921M != null) {
            if (this.f948u != null) {
                this.f921M.setText(this.f948u);
            } else {
                this.f921M.setVisibility(8);
                this.f936i.removeView(this.f921M);
                if (this.f929b != null) {
                    viewGroup = (ViewGroup) this.f936i.getParent();
                    int indexOfChild = viewGroup.indexOfChild(this.f936i);
                    viewGroup.removeViewAt(indexOfChild);
                    viewGroup.addView(this.f929b, indexOfChild, new LayoutParams(-1, -1));
                } else {
                    viewGroup.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: d */
    private void m1007d(ViewGroup viewGroup) {
        int i;
        this.f930c = (Button) viewGroup.findViewById(16908313);
        this.f930c.setOnClickListener(this.f927S);
        Object obj = 1;
        if (TextUtils.isEmpty(this.f911C) && this.f912D == null) {
            this.f930c.setVisibility(8);
            i = 0;
        } else {
            this.f930c.setText(this.f911C);
            if (this.f912D != null) {
                this.f912D.setBounds(0, 0, this.f946s, this.f946s);
                this.f930c.setCompoundDrawables(this.f912D, null, null, null);
            }
            this.f930c.setVisibility(0);
            i = 1;
        }
        this.f932e = (Button) viewGroup.findViewById(16908314);
        this.f932e.setOnClickListener(this.f927S);
        if (TextUtils.isEmpty(this.f913E) && this.f914F == null) {
            this.f932e.setVisibility(8);
        } else {
            this.f932e.setText(this.f913E);
            if (this.f914F != null) {
                this.f914F.setBounds(0, 0, this.f946s, this.f946s);
                this.f932e.setCompoundDrawables(this.f914F, null, null, null);
            }
            this.f932e.setVisibility(0);
            i |= 2;
        }
        this.f934g = (Button) viewGroup.findViewById(16908315);
        this.f934g.setOnClickListener(this.f927S);
        if (TextUtils.isEmpty(this.f915G) && this.f916H == null) {
            this.f934g.setVisibility(8);
        } else {
            this.f934g.setText(this.f915G);
            if (this.f912D != null) {
                this.f912D.setBounds(0, 0, this.f946s, this.f946s);
                this.f930c.setCompoundDrawables(this.f912D, null, null, null);
            }
            this.f934g.setVisibility(0);
            i |= 4;
        }
        if (m1001a(this.f944q)) {
            Button button;
            if (i == 1) {
                button = this.f930c;
            } else if (i == 2) {
                button = this.f932e;
            } else if (i == 4) {
                button = this.f934g;
            }
            m1000a(button);
        }
        if (i == 0) {
            obj = null;
        }
        if (obj == null) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void m1008a() {
        this.f928a.setContentView(m1003b());
        m1005c();
    }

    /* renamed from: a */
    public void m1009a(int i) {
        this.f949v = null;
        this.f950w = i;
        this.f910B = false;
    }

    /* renamed from: a */
    public void m1010a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f943p.obtainMessage(i, onClickListener);
        }
        switch (i) {
            case -3:
                this.f915G = charSequence;
                this.f935h = message;
                this.f916H = drawable;
                return;
            case -2:
                this.f913E = charSequence;
                this.f933f = message;
                this.f914F = drawable;
                return;
            case -1:
                this.f911C = charSequence;
                this.f931d = message;
                this.f912D = drawable;
                return;
            default:
                throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: a */
    public void m1011a(Drawable drawable) {
        this.f918J = drawable;
        this.f917I = 0;
        if (this.f919K == null) {
            return;
        }
        if (drawable != null) {
            this.f919K.setVisibility(0);
            this.f919K.setImageDrawable(drawable);
            return;
        }
        this.f919K.setVisibility(8);
    }

    /* renamed from: a */
    public void m1012a(View view, int i, int i2, int i3, int i4) {
        this.f949v = view;
        this.f950w = 0;
        this.f910B = true;
        this.f951x = i;
        this.f952y = i2;
        this.f953z = i3;
        this.f909A = i4;
    }

    /* renamed from: a */
    public void m1013a(CharSequence charSequence) {
        this.f947t = charSequence;
        if (this.f920L != null) {
            this.f920L.setText(charSequence);
        }
    }

    /* renamed from: a */
    public boolean m1014a(int i, KeyEvent keyEvent) {
        return this.f936i != null && this.f936i.m3449a(keyEvent);
    }

    /* renamed from: b */
    public void m1015b(int i) {
        this.f918J = null;
        this.f917I = i;
        if (this.f919K == null) {
            return;
        }
        if (i != 0) {
            this.f919K.setVisibility(0);
            this.f919K.setImageResource(this.f917I);
            return;
        }
        this.f919K.setVisibility(8);
    }

    /* renamed from: b */
    public void m1016b(View view) {
        this.f922N = view;
    }

    /* renamed from: b */
    public void m1017b(CharSequence charSequence) {
        this.f948u = charSequence;
        if (this.f921M != null) {
            this.f921M.setText(charSequence);
        }
    }

    /* renamed from: b */
    public boolean m1018b(int i, KeyEvent keyEvent) {
        return this.f936i != null && this.f936i.m3449a(keyEvent);
    }

    /* renamed from: c */
    public int m1019c(int i) {
        TypedValue typedValue = new TypedValue();
        this.f944q.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: c */
    public void m1020c(View view) {
        this.f949v = view;
        this.f950w = 0;
        this.f910B = false;
    }
}
