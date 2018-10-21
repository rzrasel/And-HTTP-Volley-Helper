package android.support.v4.p008a.p009a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p008a.p009a.C0090a.C0088a;
import android.support.v4.p010b.C0164c;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v4.a.a.b */
public final class C0094b {

    /* renamed from: android.support.v4.a.a.b$a */
    public static abstract class C0093a {
        /* renamed from: a */
        public abstract void mo343a(int i);

        /* renamed from: a */
        public final void m369a(final int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0093a f467b;

                public void run() {
                    this.f467b.mo343a(i);
                }
            });
        }

        /* renamed from: a */
        public abstract void mo344a(Typeface typeface);

        /* renamed from: a */
        public final void m371a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(this) {
                /* renamed from: b */
                final /* synthetic */ C0093a f465b;

                public void run() {
                    this.f465b.mo344a(typeface);
                }
            });
        }
    }

    /* renamed from: a */
    public static Typeface m372a(Context context, int i, TypedValue typedValue, int i2, C0093a c0093a) {
        return context.isRestricted() ? null : C0094b.m373a(context, i, typedValue, i2, c0093a, null, true);
    }

    /* renamed from: a */
    private static Typeface m373a(Context context, int i, TypedValue typedValue, int i2, C0093a c0093a, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface a = C0094b.m374a(context, resources, typedValue, i, i2, c0093a, handler, z);
        if (a == null) {
            if (c0093a == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Font resource ID #0x");
                stringBuilder.append(Integer.toHexString(i));
                stringBuilder.append(" could not be retrieved.");
                throw new NotFoundException(stringBuilder.toString());
            }
        }
        return a;
    }

    /* renamed from: a */
    private static Typeface m374a(Context context, Resources resources, TypedValue typedValue, int i, int i2, C0093a c0093a, Handler handler, boolean z) {
        Throwable e;
        String str;
        StringBuilder stringBuilder;
        String str2;
        Resources resources2 = resources;
        TypedValue typedValue2 = typedValue;
        int i3 = i;
        int i4 = i2;
        C0093a c0093a2 = c0093a;
        Handler handler2 = handler;
        if (typedValue2.string != null) {
            String charSequence = typedValue2.string.toString();
            if (charSequence.startsWith("res/")) {
                Typeface a = C0164c.m602a(resources, i3, i4);
                if (a != null) {
                    if (c0093a2 != null) {
                        c0093a2.m371a(a, handler2);
                    }
                    return a;
                }
                try {
                    if (charSequence.toLowerCase().endsWith(".xml")) {
                        C0088a a2 = C0090a.m361a(resources.getXml(i3), resources);
                        if (a2 != null) {
                            return C0164c.m601a(context, a2, resources, i, i2, c0093a, handler, z);
                        }
                        Log.e("ResourcesCompat", "Failed to find font-family tag");
                        if (c0093a2 != null) {
                            c0093a2.m369a(-3, handler2);
                        }
                        return null;
                    }
                    Context context2 = context;
                    Typeface a3 = C0164c.m599a(context, resources, i3, charSequence, i4);
                    if (c0093a2 != null) {
                        if (a3 != null) {
                            c0093a2.m371a(a3, handler2);
                        } else {
                            c0093a2.m369a(-3, handler2);
                        }
                    }
                    return a3;
                } catch (XmlPullParserException e2) {
                    e = e2;
                    str = "ResourcesCompat";
                    stringBuilder = new StringBuilder();
                    str2 = "Failed to parse xml resource ";
                    stringBuilder.append(str2);
                    stringBuilder.append(charSequence);
                    Log.e(str, stringBuilder.toString(), e);
                    if (c0093a2 != null) {
                        c0093a2.m369a(-3, handler2);
                    }
                    return null;
                } catch (IOException e3) {
                    e = e3;
                    str = "ResourcesCompat";
                    stringBuilder = new StringBuilder();
                    str2 = "Failed to read xml resource ";
                    stringBuilder.append(str2);
                    stringBuilder.append(charSequence);
                    Log.e(str, stringBuilder.toString(), e);
                    if (c0093a2 != null) {
                        c0093a2.m369a(-3, handler2);
                    }
                    return null;
                }
            }
            if (c0093a2 != null) {
                c0093a2.m369a(-3, handler2);
            }
            return null;
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Resource \"");
        stringBuilder2.append(resources.getResourceName(i3));
        stringBuilder2.append("\" (");
        stringBuilder2.append(Integer.toHexString(i));
        stringBuilder2.append(") is not a Font: ");
        stringBuilder2.append(typedValue2);
        throw new NotFoundException(stringBuilder2.toString());
    }

    /* renamed from: a */
    public static Drawable m375a(Resources resources, int i, Theme theme) {
        return VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }
}
