package com.tugalsan.api.sql.cellgen.server;

import com.tugalsan.api.union.client.TGS_UnionExcuse;

public class TS_SQLCellGenStrDefault<E> extends TS_SQLCellGenAbstract<E, String> {

    public TS_SQLCellGenStrDefault(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public TGS_UnionExcuse<String> val() {
        return TGS_UnionExcuse.of("");
    }
}
