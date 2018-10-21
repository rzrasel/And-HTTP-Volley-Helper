package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p017g.C0227p;
import android.support.v7.p020a.C0270a.C0260a;
import android.support.v7.p020a.C0270a.C0265f;
import android.support.v7.p020a.C0270a.C0266g;
import android.support.v7.p020a.C0270a.C0269j;
import android.support.v7.view.menu.C0332p.C0331a;
import android.support.v7.widget.aw;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

public class ListMenuItemView extends LinearLayout implements C0331a {
    /* renamed from: a */
    private C0601j f2078a;
    /* renamed from: b */
    private ImageView f2079b;
    /* renamed from: c */
    private RadioButton f2080c;
    /* renamed from: d */
    private TextView f2081d;
    /* renamed from: e */
    private CheckBox f2082e;
    /* renamed from: f */
    private TextView f2083f;
    /* renamed from: g */
    private ImageView f2084g;
    /* renamed from: h */
    private Drawable f2085h;
    /* renamed from: i */
    private int f2086i;
    /* renamed from: j */
    private Context f2087j;
    /* renamed from: k */
    private boolean f2088k;
    /* renamed from: l */
    private Drawable f2089l;
    /* renamed from: m */
    private int f2090m;
    /* renamed from: n */
    private LayoutInflater f2091n;
    /* renamed from: o */
    private boolean f2092o;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0260a.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        aw a = aw.m1478a(getContext(), attributeSet, C0269j.MenuView, i, 0);
        this.f2085h = a.m1482a(C0269j.MenuView_android_itemBackground);
        this.f2086i = a.m1495g(C0269j.MenuView_android_itemTextAppearance, -1);
        this.f2088k = a.m1484a(C0269j.MenuView_preserveIconSpacing, false);
        this.f2087j = context;
        this.f2089l = a.m1482a(C0269j.MenuView_subMenuArrow);
        a.m1483a();
    }

    /* renamed from: b */
    private void m2590b() {
        this.f2079b = (ImageView) getInflater().inflate(C0266g.abc_list_menu_item_icon, this, false);
        addView(this.f2079b, 0);
    }

    /* renamed from: c */
    private void m2591c() {
        this.f2080c = (RadioButton) getInflater().inflate(C0266g.abc_list_menu_item_radio, this, false);
        addView(this.f2080c);
    }

    /* renamed from: d */
    private void m2592d() {
        this.f2082e = (CheckBox) getInflater().inflate(C0266g.abc_list_menu_item_checkbox, this, false);
        addView(this.f2082e);
    }

    private LayoutInflater getInflater() {
        if (this.f2091n == null) {
            this.f2091n = LayoutInflater.from(getContext());
        }
        return this.f2091n;
    }

    private void setSubMenuArrowVisible(boolean z) {
        if (this.f2084g != null) {
            this.f2084g.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo194a(C0601j c0601j, int i) {
        this.f2078a = c0601j;
        this.f2090m = i;
        setVisibility(c0601j.isVisible() ? 0 : 8);
        setTitle(c0601j.m2704a((C0331a) this));
        setCheckable(c0601j.isCheckable());
        m2594a(c0601j.m2718f(), c0601j.m2714d());
        setIcon(c0601j.getIcon());
        setEnabled(c0601j.isEnabled());
        setSubMenuArrowVisible(c0601j.hasSubMenu());
        setContentDescription(c0601j.getContentDescription());
    }

    /* renamed from: a */
    public void m2594a(boolean z, char c) {
        int i = (z && this.f2078a.m2718f()) ? 0 : 8;
        if (i == 0) {
            this.f2083f.setText(this.f2078a.m2716e());
        }
        if (this.f2083f.getVisibility() != i) {
            this.f2083f.setVisibility(i);
        }
    }

    /* renamed from: a */
    public boolean mo195a() {
        return false;
    }

    public C0601j getItemData() {
        return this.f2078a;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        C0227p.m870a((View) this, this.f2085h);
        this.f2081d = (TextView) findViewById(C0265f.title);
        if (this.f2086i != -1) {
            this.f2081d.setTextAppearance(this.f2087j, this.f2086i);
        }
        this.f2083f = (TextView) findViewById(C0265f.shortcut);
        this.f2084g = (ImageView) findViewById(C0265f.submenuarrow);
        if (this.f2084g != null) {
            this.f2084g.setImageDrawable(this.f2089l);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f2079b != null && this.f2088k) {
            LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f2079b.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        if (z || this.f2080c != null || this.f2082e != null) {
            CompoundButton compoundButton;
            CompoundButton compoundButton2;
            if (this.f2078a.m2719g()) {
                if (this.f2080c == null) {
                    m2591c();
                }
                compoundButton = this.f2080c;
                compoundButton2 = this.f2082e;
            } else {
                if (this.f2082e == null) {
                    m2592d();
                }
                compoundButton = this.f2082e;
                compoundButton2 = this.f2080c;
            }
            if (z) {
                compoundButton.setChecked(this.f2078a.isChecked());
                int i = z ? 0 : 8;
                if (compoundButton.getVisibility() != i) {
                    compoundButton.setVisibility(i);
                }
                if (!(compoundButton2 == null || compoundButton2.getVisibility() == 8)) {
                    compoundButton2.setVisibility(8);
                }
            } else {
                if (this.f2082e != null) {
                    this.f2082e.setVisibility(8);
                }
                if (this.f2080c != null) {
                    this.f2080c.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f2078a.m2719g()) {
            if (this.f2080c == null) {
                m2591c();
            }
            compoundButton = this.f2080c;
        } else {
            if (this.f2082e == null) {
                m2592d();
            }
            compoundButton = this.f2082e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f2092o = z;
        this.f2088k = z;
    }

    public void setIcon(Drawable drawable) {
        Object obj;
        ImageView imageView;
        if (!this.f2078a.m2721i()) {
            if (!this.f2092o) {
                obj = null;
                if (obj != null && !this.f2088k) {
                    return;
                }
                if (this.f2079b == null || drawable != null || this.f2088k) {
                    if (this.f2079b == null) {
                        m2590b();
                    }
                    if (drawable == null) {
                        if (this.f2088k) {
                            this.f2079b.setVisibility(8);
                        }
                    }
                    imageView = this.f2079b;
                    if (obj != null) {
                        drawable = null;
                    }
                    imageView.setImageDrawable(drawable);
                    if (this.f2079b.getVisibility() != 0) {
                        this.f2079b.setVisibility(0);
                    }
                }
                return;
            }
        }
        obj = 1;
        if (obj != null) {
        }
        if (this.f2079b == null) {
        }
        if (this.f2079b == null) {
            m2590b();
        }
        if (drawable == null) {
            if (this.f2088k) {
                this.f2079b.setVisibility(8);
            }
        }
        imageView = this.f2079b;
        if (obj != null) {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        if (this.f2079b.getVisibility() != 0) {
            this.f2079b.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f2081d.setText(charSequence);
            if (this.f2081d.getVisibility() != 0) {
                textView = this.f2081d;
                i = 0;
            } else {
                return;
            }
        }
        i = 8;
        if (this.f2081d.getVisibility() != 8) {
            textView = this.f2081d;
        } else {
            return;
        }
        textView.setVisibility(i);
    }
}
