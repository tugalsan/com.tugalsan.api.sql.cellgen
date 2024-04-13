package com.tugalsan.api.sql.cellgen.server;

import com.tugalsan.api.string.server.*;
import com.tugalsan.api.union.client.TGS_UnionExcuse;

public class TS_SQLCellGenBytesStrDefault<E> extends TS_SQLCellGenAbstract<E, byte[]> {

    public TS_SQLCellGenBytesStrDefault(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public TGS_UnionExcuse<byte[]> val() {
        return TGS_UnionExcuse.of(TS_StringUtils.toByte(""));
    }
}
