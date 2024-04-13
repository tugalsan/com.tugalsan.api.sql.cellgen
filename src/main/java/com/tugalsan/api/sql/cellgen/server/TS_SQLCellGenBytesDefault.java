package com.tugalsan.api.sql.cellgen.server;

import com.tugalsan.api.union.client.TGS_UnionExcuse;

public class TS_SQLCellGenBytesDefault<E> extends TS_SQLCellGenAbstract<E, byte[]> {

    public TS_SQLCellGenBytesDefault(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public TGS_UnionExcuse<byte[]> val() {
        return TGS_UnionExcuse.of(new byte[0]);
    }
}
