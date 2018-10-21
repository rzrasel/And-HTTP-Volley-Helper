package com.p025a.p026a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

/* renamed from: com.a.a.k */
public class C0425k {
    /* renamed from: a */
    public final int f1506a;
    /* renamed from: b */
    public final byte[] f1507b;
    /* renamed from: c */
    public final Map<String, String> f1508c;
    /* renamed from: d */
    public final List<C0422g> f1509d;
    /* renamed from: e */
    public final boolean f1510e;
    /* renamed from: f */
    public final long f1511f;

    private C0425k(int i, byte[] bArr, Map<String, String> map, List<C0422g> list, boolean z, long j) {
        this.f1506a = i;
        this.f1507b = bArr;
        this.f1508c = map;
        this.f1509d = list == null ? null : Collections.unmodifiableList(list);
        this.f1510e = z;
        this.f1511f = j;
    }

    @Deprecated
    public C0425k(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this(i, bArr, map, C0425k.m1667a((Map) map), z, j);
    }

    public C0425k(int i, byte[] bArr, boolean z, long j, List<C0422g> list) {
        this(i, bArr, C0425k.m1668a((List) list), list, z, j);
    }

    @Deprecated
    public C0425k(byte[] bArr, Map<String, String> map) {
        this(200, bArr, (Map) map, false, 0);
    }

    /* renamed from: a */
    private static List<C0422g> m1667a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        List<C0422g> arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(new C0422g((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Map<String, String> m1668a(List<C0422g> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C0422g c0422g : list) {
            treeMap.put(c0422g.m1659a(), c0422g.m1660b());
        }
        return treeMap;
    }
}
