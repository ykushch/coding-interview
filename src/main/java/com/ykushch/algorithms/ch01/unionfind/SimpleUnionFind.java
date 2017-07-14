package com.ykushch.algorithms.ch01.unionfind;

import java.util.List;

public class SimpleUnionFind {
    private int[] id;
    private int count;
    private List<Pair<Integer>> pairs;

    public SimpleUnionFind(List<Pair<Integer>> pairs, int n) {
        count = n;
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
        this.pairs = pairs;
    }

    private SimpleUnionFind() {
    }

    public int count() {
        return count;
    }

    public int find(int p) {
        return id[p];
    }

    public boolean isConnected(int p, int q) {
        return find(p) == find(q);
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);

        if (pId == qId) {
            return;
        }

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) {
                id[i] = qId;
            }
        }
        count--;
    }

    public int findNumberOfComponents() {
        for (Pair<Integer> pair : pairs) {
            int p = pair.first;
            int q = pair.second;
            if (isConnected(p, q)) {
                continue;
            }

            union(p, q);
        }

        return count;
    }
}
