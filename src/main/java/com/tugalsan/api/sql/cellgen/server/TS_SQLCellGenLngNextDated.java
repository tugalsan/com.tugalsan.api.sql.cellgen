package com.tugalsan.api.sql.cellgen.server;

import java.util.*;
import com.tugalsan.api.sql.conn.server.*;
import com.tugalsan.api.sql.max.server.*;
import com.tugalsan.api.union.client.TGS_UnionExcuse;

public class TS_SQLCellGenLngNextDated<E> extends TS_SQLCellGenAbstract<E, Long> {

    public TS_SQLCellGenLngNextDated(E executor, int colIdx, TS_SQLConnAnchor anchor, CharSequence tableName, List<String> colNames) {
        super(executor, colIdx);
        this.anchor = anchor;
        this.tableName = tableName.toString();
        this.colNames = colNames;
    }
    final private TS_SQLConnAnchor anchor;
    final private String tableName;
    final private List<String> colNames;

    @Override
    public TGS_UnionExcuse<Long> val() {
        return TS_SQLMaxUtils.max(anchor, tableName, colNames.get(colIdx)).whereConditionNone().nextIdDated();
    }
}
