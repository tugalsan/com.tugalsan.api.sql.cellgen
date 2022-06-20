package com.tugalsan.api.sql.cellgen.server;

import com.tugalsan.api.string.server.*;

public class TS_SQLCellGenBytesStrDefault<E> extends TS_SQLCellGenAbstract<E, byte[]> {

    public TS_SQLCellGenBytesStrDefault(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public byte[] val() {
        return TS_StringUtils.toByte("");
    }
}
