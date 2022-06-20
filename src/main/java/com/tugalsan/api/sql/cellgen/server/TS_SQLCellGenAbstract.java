package com.tugalsan.api.sql.cellgen.server;

import com.tugalsan.api.executable.client.*;
import com.tugalsan.api.pack.client.*;

abstract public class TS_SQLCellGenAbstract<E, V> implements TGS_ExecutableType1<TGS_Pack1<V>> {

    public TS_SQLCellGenAbstract(E executor, int colIdx) {
        this.executor = executor;
        this.colIdx = colIdx;
    }
    final protected E executor;
    final protected int colIdx;

    @Override
    public void execute(TGS_Pack1<V> generatedValue) {
        generatedValue.value0 = val();
    }

    abstract public V val();
}
