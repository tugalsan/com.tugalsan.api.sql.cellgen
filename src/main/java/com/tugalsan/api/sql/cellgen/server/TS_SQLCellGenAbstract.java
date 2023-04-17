package com.tugalsan.api.sql.cellgen.server;

import com.tugalsan.api.runnable.client.*;
import com.tugalsan.api.pack.client.*;

abstract public class TS_SQLCellGenAbstract<E, V> implements TGS_RunnableType1<TGS_Pack1<V>> {

    public TS_SQLCellGenAbstract(E executor, int colIdx) {
        this.executor = executor;
        this.colIdx = colIdx;
    }
    final protected E executor;
    final protected int colIdx;

    @Override
    public void run(TGS_Pack1<V> generatedValue) {
        generatedValue.value0 = val();
    }

    abstract public V val();
}
