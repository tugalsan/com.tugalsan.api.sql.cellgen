package com.tugalsan.api.sql.cellgen.server;

import module com.tugalsan.api.string;

public class TS_SQLCellGenBytesStrDefault<E> extends TS_SQLCellGenAbstract<E, byte[]> {

    public TS_SQLCellGenBytesStrDefault(E executor, int colIdx) {
        super(executor, colIdx);
    }

    @Override
    public byte[] val() {
        return TGS_StringUtils.jre().toByte("");
    }
}
